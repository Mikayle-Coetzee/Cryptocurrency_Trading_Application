package za.co.varsitycollege.opsc7312_poe_tactical_trades.Model

import android.app.Activity
import android.hardware.biometrics.BiometricManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import androidx.biometric.BiometricManager.Authenticators.BIOMETRIC_STRONG
import androidx.biometric.BiometricManager.Authenticators.DEVICE_CREDENTIAL
import androidx.biometric.BiometricPrompt
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow

class BiometricPromptManager(
    private val activity: AppCompatActivity
)

{
    private val resultChannel = Channel <BiometricResult>()
    val promptResults = resultChannel.receiveAsFlow()
    fun showBiometricPrompt(
        title:String,
        description: String
    ){
        val manager = androidx.biometric.BiometricManager.from(activity)
        val authenticators = if(Build.VERSION.SDK_INT >= 30){
           BIOMETRIC_STRONG or DEVICE_CREDENTIAL
        }else BIOMETRIC_STRONG

        val promptInfo = BiometricPrompt.PromptInfo.Builder()
            .setTitle(title)
            .setDescription(description)
            .setAllowedAuthenticators(authenticators)

        if(Build.VERSION.SDK_INT <30){
            promptInfo.setNegativeButtonText("Cancel")
        }

        when(manager.canAuthenticate(authenticators)){
            androidx.biometric.BiometricManager.BIOMETRIC_ERROR_HW_UNAVAILABLE ->{
                resultChannel.trySend(BiometricResult.HardwareUnavailable)
                return
            }
            androidx.biometric.BiometricManager.BIOMETRIC_ERROR_NONE_ENROLLED ->{
                resultChannel.trySend(BiometricResult.AuthenticationNotSet)
                return
            }
            androidx.biometric.BiometricManager.BIOMETRIC_ERROR_NO_HARDWARE ->{
                resultChannel.trySend(BiometricResult.FeatureUnavailable)
                return
            }
            else -> Unit

        }
        val prompt = BiometricPrompt(
            activity,
            object: BiometricPrompt.AuthenticationCallback(){
                override fun onAuthenticationFailed() {
                    super.onAuthenticationFailed()
                    resultChannel.trySend(BiometricResult.AuthenticationFailed)
                }

                override fun onAuthenticationError(errorCode: Int, errString: CharSequence) {
                    super.onAuthenticationError(errorCode, errString)
                    resultChannel.trySend(BiometricResult.AuthenticationError(errString.toString()))
                }

                override fun onAuthenticationSucceeded(result: BiometricPrompt.AuthenticationResult) {
                    super.onAuthenticationSucceeded(result)
                    resultChannel.trySend(BiometricResult.AuthenticationSuccess)
                }
            }


        )
        prompt.authenticate(promptInfo.build())


       // val manager = Bio
    }
    sealed interface BiometricResult{
        data object HardwareUnavailable: BiometricResult
        data object FeatureUnavailable: BiometricResult
        data class AuthenticationError(val error: String): BiometricResult
        data object AuthenticationFailed: BiometricResult
        data object AuthenticationSuccess: BiometricResult
        data object AuthenticationNotSet: BiometricResult
    }
}