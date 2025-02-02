package za.co.varsitycollege.opsc7312_poe_tactical_trades.View

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.lifecycleScope
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.launch
import za.co.varsitycollege.opsc7312_poe_tactical_trades.Controller.FirebaseHelper
import za.co.varsitycollege.opsc7312_poe_tactical_trades.Controller.NetworkUtils
import za.co.varsitycollege.opsc7312_poe_tactical_trades.Controller.SQLiteHelper
import za.co.varsitycollege.opsc7312_poe_tactical_trades.Model.BiometricPromptManager
import za.co.varsitycollege.opsc7312_poe_tactical_trades.Model.LoggedInUser
import za.co.varsitycollege.opsc7312_poe_tactical_trades.R

class LoginActivity : AppCompatActivity() {

    private val promptManager by lazy {
        BiometricPromptManager(this)
    }
    private lateinit var firebaseAuth: FirebaseAuth
    lateinit var TestfirebaseAuth: FirebaseAuth
    lateinit var Email: String
    lateinit var Password: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val sqliteHelper = SQLiteHelper(this)

        firebaseAuth = FirebaseAuth.getInstance()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

        val emailEditText: EditText = findViewById(R.id.EditTxtEmail)
        val passwordEditText: EditText = findViewById(R.id.EditTxtPassword)
        val loginButton: ImageButton = findViewById(R.id.BtnLogin)
        val registerButton: Button = findViewById(R.id.BtnRegister)
        Password = passwordEditText.text.toString().trim()
        Email = emailEditText.text.toString().trim()

        try{
            lifecycleScope.launch {
                promptManager.promptResults.collect { result ->
                    when (result) {
                        is BiometricPromptManager.BiometricResult.AuthenticationSuccess -> {
                            val email = emailEditText.text.toString().trim()
                            val password = passwordEditText.text.toString().trim()
                            if (email.isNotEmpty() && password.isNotEmpty()) {
                                if (NetworkUtils.isNetworkAvailable(this@LoginActivity)) {
                                    firebaseLogin(email, password)
                                } else {
                                    sqliteLogin(email, password)
                                }
                            } else {
                                Toast.makeText(this@LoginActivity, "Please enter email and password", Toast.LENGTH_SHORT).show()
                            }
                        }
                        is BiometricPromptManager.BiometricResult.AuthenticationFailed -> {
                            Toast.makeText(this@LoginActivity, "Biometric authentication failed", Toast.LENGTH_SHORT).show()
                        }
                        is BiometricPromptManager.BiometricResult.AuthenticationError -> {
                            Toast.makeText(this@LoginActivity, "Error: ${result.error}", Toast.LENGTH_SHORT).show()
                        }
                        // Handle other biometric results...
                        is BiometricPromptManager.BiometricResult.AuthenticationFailed,
                        is BiometricPromptManager.BiometricResult.AuthenticationError,
                        BiometricPromptManager.BiometricResult.AuthenticationNotSet,
                        BiometricPromptManager.BiometricResult.FeatureUnavailable,
                        BiometricPromptManager.BiometricResult.HardwareUnavailable -> {
                            // For any biometric failure or unavailability, attempt email/password login
                            performEmailPasswordLogin(emailEditText, passwordEditText)
                        }
                    }
                }
            }
        }catch( e: Exception){
            if (NetworkUtils.isNetworkAvailable(this@LoginActivity)) {
                firebaseLogin(Email, Password)
            } else {
                sqliteLogin(Email, Password)
            }
        }


        loginButton.setOnClickListener {
            val loginDetail = emailEditText.text.toString().trim()
            val password = passwordEditText.text.toString().trim()

            promptManager.showBiometricPrompt(
                title ="Use finger print to login",
                description = "Please use your fingerprint or pattern to log in"
            )
           /* if (android.util.Patterns.EMAIL_ADDRESS.matcher(loginDetail).matches())
            {
                val email = loginDetail
                if (email.isNotEmpty() && password.isNotEmpty()) {

                    if (NetworkUtils.isNetworkAvailable(this)) {
                        firebaseLogin(email, password)
                    } else {
                        sqliteLogin(email, password)
                    }

                    //loginUser(email, password)
                } else {
                    Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
                }
            }else {
                Toast.makeText(this, "Please enter a valid email address", Toast.LENGTH_SHORT).show()
           */ //}

        }


        registerButton.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
            finish()
        }

        if (NetworkUtils.isNetworkAvailable(this) == true) {
            checkUser()
        } else {
            FirebaseHelper.signOut()
        }
    }
    fun TestloginUser(email: String, password: String) {
        TestfirebaseAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                } else {
                    Toast.makeText(this, "Login failed: ${task.exception?.message}", Toast.LENGTH_LONG).show()
                }
            }
    }
    private fun performEmailPasswordLogin(emailEditText: EditText, passwordEditText: EditText) {
        val email = emailEditText.text.toString().trim()
        val password = passwordEditText.text.toString().trim()

        if (email.isEmpty() || password.isEmpty()) {
            Toast.makeText(this, "Please enter email and password", Toast.LENGTH_SHORT).show()
            return
        }

        if (NetworkUtils.isNetworkAvailable(this)) {
            firebaseLogin(email, password)
        } else {
            sqliteLogin(email, password)
        }
    }

    //old method
    private fun loginUser(email: String, password: String) {
        firebaseAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this) { task ->
                if (task.isSuccessful) {
                    Toast.makeText(this, "Login successful", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(this, MainActivity::class.java))
                    finish()
                } else {
                    Toast.makeText(this, "Login failed: ${task.exception?.message}", Toast.LENGTH_LONG).show()
                }
            }
    }

    private fun firebaseLogin(email: String, password: String) {
        firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                startActivity(Intent(this, MainActivity::class.java))
            } else {
                Toast.makeText(this, "Authentication Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun sqliteLogin(email: String, password: String) {
        val user = SQLiteHelper(this).getUserByEmail(email)
        if (user != null) {
            LoggedInUser.LoggedInUser = user
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        } else {
            Toast.makeText(this, "Offline authentication failed", Toast.LENGTH_SHORT).show()
        }
    }

    private fun checkUser() {
        val currentUser = firebaseAuth.currentUser
        if (currentUser != null) {
            // User is already signed in, navigate to MainActivity
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}
