# TACTICAL_TRADES_README_FILE

---
![image](https://github.com/user-attachments/assets/a79cff73-fac1-41e4-9b77-3433b0828d79)

### Table of Contents

- [Link To Github](#https://github.com/VCCT-OPSC7311-G1-2024/OPSC7312_POE_TACTICAL_TRADES_Organization)
- [Description](#description)
- [How To Use](#how-to-use)
- [Technologies](#technologies)
- [API'S](#API)
- [Utilization of Github](#utilization-of-github)
- [Utilization of Github Actions](#utilization-of-github-actions)
- [Design Considerations](#design-considerations)
- [License](#license)

---

[Link To Github](https://github.com/VCCT-OPSC7311-G1-2024/OPSC7312_POE_TACTICAL_TRADES_Organization)


---

### Description
Tactical Trades is a cryptocurrency trading application that allows users to practice trading some of the largest cryptocurrencies in the world without spending money. This app makes use of real-time trading data using the same APIs as many big trading platforms to provide users with a completely accurate trading simulation. Tactical trades have many features to improve user experience such as colourblind graph filters, user-friendly interfaces, news feeds and advanced analytical data to ensure that the user has access to all the data possible to make informed trades. The app will also have difficulty selections allowing users to select their starting amount and will have goals the user can achieve.

---

### Technologies
- Android Studio 
- Kotlin
- Firebase
- JUnit
- Mockito
- Robolectric
- GitHub worrkflows for automation
  
---

### Video Link
- YouTube
- https://youtu.be/glXLAJKVchM
  
---

### API
- CoinAPI(https://www.coinapi.io/)
  ![image](https://github.com/user-attachments/assets/78788087-7ae7-43af-bb74-c54eec858b1b)

- NewsAPI(https://newsapi.ai/?gad_source=1&gclid=CjwKCAjw0t63BhAUEiwA5xP54eQbeZkLgkmLoTrY88AyC0TwNeLskyb9rHhw0HH9a11rGZr5peT1gBoClaoQAvD_BwE)
  ![image](https://github.com/user-attachments/assets/1631b446-ec67-4ece-9d04-11370e62d63e)
  
---

### Utilization of Github
By using github we were able to peform version control. This allowed us to be able to track changes that were made to the application as well as allowing for collaboration between group members. Github increased the speed of the developement process as each member were able to work on each of the features seperately and this prevented team members from working on the same feature as the project manager assigned each group member a feature.

---

### Utilization of Github Actions

In the development of Tactical Trades, we utilized GitHub Actions to streamline our testing process and ensure continuous integration. GitHub Actions was configured to automatically run our suite of tests each time code was pushed to the repository, allowing us to quickly identify and resolve any issues that might impact functionality. By automating these tests, we maintained code reliability and minimized potential errors before they reached the app’s build. This integration significantly enhanced our workflow by providing instant feedback on code changes, helping us uphold the app’s stability and performance throughout development

---
### Purpose of the Application
The purpose of Tactical Trades is to provide a safe, realistic environment for users to learn and practice cryptocurrency trading without financial risk. By leveraging real-time data through Coin API, the app aims to simulate the experience of trading on major platforms, equipping users with essential insights and data for making informed trades. Tactical Trades is designed for accessibility and learning, with features like colorblind-friendly graphs, intuitive interfaces, and advanced analytical tools to deepen users’ understanding of market trends. With customizable difficulty settings and achievable trading goals, the app serves as an engaging educational tool for both beginners and seasoned enthusiasts looking to refine their trading strategies.

---

### Design Considerations
#### The Design considerations are as follows:
- Ensured that the interface was user-friendly. This was achieved by making the user-interface as simple as possible and did not have to many events occuring at once that would overwhelm the users.
- Ensured that the application displayed the user with a News Feed as well as advanced analytical data so that the users is able to make informed trades.
- Used a Model-View-Control Design Architecture to ensure that the application is seperated into three interconnected components. By doing this it ensured that our code was organized, easy to manage and test. It also allowed us to be able to develop each independent component.
- Ensured that the application had a navigation bar so that the user is able to navigate to each screen easily.
- Ensured that a Firebase database was created and implemented into the application so that accounts and user data can be stored.
- Ensured that the app displayed the user with responses when an action was performed.This allows the user to be informed when an action is either successful or failed.
- Made sure that the application had a finger print scanner to ensure that the correct user was accessing the account and not a threat agent.
- Allowed for the user to be able to change their profile picture.
- The user is able to view their balance on every screen.
- The application allows for the user to change the language from english to afrikaans.
- The user is able to change their username and password.
- The user is able to change the theme of their application.
- Application has a leaderboard function that ranks each user by how much money they have made through trading.
---

## Release Notes
- Added Fingerprint scanning for when the user logs in to increase security of the application
- Added the ability for users to change the language of the application from english to afrikaans
- ![image](https://github.com/user-attachments/assets/12db608b-daa0-4efc-abf9-7886d97e060d)
- Added graph to each of the crypto coins that show the history of the coin
- added a report feature that allows for the user to be able to see how much they have gained or lost during the month.
- ![image](https://github.com/user-attachments/assets/819887f8-0a40-4dd9-8ba0-4c3fb6b1227e)
- added how much a user has made or lost in the balance box
- ![image](https://github.com/user-attachments/assets/390872a9-cb87-4945-b264-7bf91385ee71
- Added Leaderboard feature that displays users in order from the most money made to the least money made.
- ![image](https://github.com/user-attachments/assets/b9ce55fa-ac75-4754-8e07-8d5cfa9cc29b)
- Added the ability for a user to change their settings.
- Added offline mode that allows the user to perform actions when not connected to the internet using SQLLite
- Implemented real time notifications 


## How To Use
---
### How to register
- To register the user must enter in their Username,Name,Email,Password, and lastly to confirm their password
- Requirements for the password is that it must have a capital letter, a number, and a special character.
- Once the user has entered in all of the required data the user must click the register button and this will take the user to the Home screen.
- If the user already has an account they are able to click the "Click here to login" button and this will take the user to the login screen.

![image](https://github.com/user-attachments/assets/c983b76e-4529-4a3c-b764-251c73417afa)

![image](https://github.com/user-attachments/assets/51555a9d-05a1-484d-9863-4139444c6fd4)

---
### How to Login
- If the user already has a account they are able to enter in their email and password
- Once the user has entered in their details they must click the "Login" button and this will take the user to the Home screen
- If the user does not have an account then they must click the "CLICK HERE TO REGISTER" button.

![image](https://github.com/user-attachments/assets/50ba83c1-0c1b-425e-9100-9fe323b0ddae)

---

### Home Page and Features
- Once on the home page the user will be able to see their profile picture the current amount in their balance aswell as a graph that shows the user how much their investments have either gown down or increased.

![image](https://github.com/user-attachments/assets/a2598cb0-60f2-4a7d-829e-276c136cf8da)

- If the user wishes to add a wallet they are able to click on the button bellow the "Wallets" Title
- They will then be able to select which wallet they wish to add aswell as the colour they want the wallet to be

![image](https://github.com/user-attachments/assets/41d9c652-2bc1-4b85-b432-ea984bb865c2)
![image](https://github.com/user-attachments/assets/fa428509-c051-4265-b149-5207a54c2f82)

- Once the wallet has been added it will be displayed under the wallets title in the Home screen
- In the home screen the user is also able to view one of the news articles that revolves around crypto currency and stocks.

![image](https://github.com/user-attachments/assets/c0dd3781-a29c-41ac-902f-42af4249ddeb)

- The user is also able to view what coins are on their watchlist by scrolling down on the home screen

![image](https://github.com/user-attachments/assets/93b47bc1-cde4-4c19-81f1-11b82d43c537)

---
### Wallet Feature
 - When the user clicks the wallet icon in the navigation bar at the bottom they will be taken to the wallet screen.

![image](https://github.com/user-attachments/assets/7cd2a7ff-7297-44b5-8ad3-49981e5e176c)

- On the wallet screen the user will be able to view all of their current wallets
- If the user wishes to add another wallet they are able to click the "+" button on the left side of the screen
  
![image](https://github.com/user-attachments/assets/bba33b6b-9c0a-4ad6-850a-2718fdee199d)

- Once the user clicks on the "+" button they are shown a menu that allows the user to select a crypto coin and also what colour they wish to make the coin.
  
![image](https://github.com/user-attachments/assets/7dfe6914-a53a-480b-815b-fbe160b121ca)

- After the user has added a coin their newly added wallet will appear on "Wallets" screen.
![image](https://github.com/user-attachments/assets/4b43ea58-9000-4000-b55c-88da5c23ffdf)
![image](https://github.com/user-attachments/assets/e6c4aa6b-272c-4f65-b3d9-559780c9393b)

---

### Trade Feature
- When the user clicks the trade icon on the navigation bar they will be taken to the "Trade" screen
- On this screen the user will be able to view all the crypto currencies they are able to trade.
  
![image](https://github.com/user-attachments/assets/b132090a-faba-44c7-8185-045d32c09d4d)

- When the user clicks on a coin they will be taken to the screen of the crypto they clicked on

![image](https://github.com/user-attachments/assets/0c93cf8a-556d-4575-b458-2ad7c3998375)
![image](https://github.com/user-attachments/assets/f48aab18-d19f-4543-9d55-0e920b2d5625)

- On this screen the user will be shown three buttons they are "Buy Coin", "Sell Coin", and "Add to Watch list ".
- The user will be shown the value of the coin as well the amount they have of that specific crypto in their wallet.
  
---

### Buy Crypto Feature
- If the user clicks on the "Buy" button on the Crypto screen they will be taken to the "Buy Crypto" screen.

![image](https://github.com/user-attachments/assets/f5dee4b3-87c7-4e2a-9af7-3820fefd5b06)

- On this screen the user is able to enter how much they wish to spend on that specific crypto by clicking the green button that has two arrows one going downwards and the other one facing upwards.
- Once clicked the user will be shown a screen that will ask them how much they wish to add.
  
![image](https://github.com/user-attachments/assets/4567e200-572e-4e05-8d47-d578a45cd6b6)
![image](https://github.com/user-attachments/assets/ac1b04bc-cf5e-473a-8c03-1fa772a428d6)

- Once the user has entered how much they wish to add the amount they wish to add will be displayed under the green button and the amount of crypto they are able to purchase with the amount they entered will be shown to the user.
- When they have selected the amount they wish to purchase they must click the "Confirm" button
- When the "Confirm" button has been clicked the wallet that is specific to that crypto currency will be updated.
  
![image](https://github.com/user-attachments/assets/72828cee-6570-41f4-9470-23c50733b1c9)
![image](https://github.com/user-attachments/assets/ce057a1b-52b2-425e-a29a-1a44912fbe78)
![image](https://github.com/user-attachments/assets/53686369-d624-4d27-9086-dc97418af571)

![image](https://github.com/user-attachments/assets/2e91829d-0a9e-443f-824a-79145cdd13e6)

-The user is able to jump between the "Buy Crpyto" screen and the "Sell Crypto" screen by clickin the pink button in the middle of the two blocks.

---

### Sell Crypto Feature
- If the user clicks the "Sell" button on the crypto screen they will be taken to the "Sell Crypto" screen.

![image](https://github.com/user-attachments/assets/eb3726e1-bcdf-40eb-acb7-7444a404b7ef)

- The user is able to select the amount of crypto they wish to sell by clickin the green button with the two arrows
- Once the user has clicked the green button with the arrows they will be shown a menu that will allow them to enter how much crpyto they wish to sell

![image](https://github.com/user-attachments/assets/8f15fd78-3f0d-465e-9166-f0e55d3a1b3a)

- Once they enter how much crypto they wish to sell the "Sell Crypto" screen will be updated with how much crypto they entered and also the amount of money they will make from selling that specific crypto.
  
![image](https://github.com/user-attachments/assets/82817078-3b09-419e-a635-1e346a8edd18)
![image](https://github.com/user-attachments/assets/7e37b0cd-354d-4285-8827-7011cc6d46ce)

- When the user has clicked the "Confirm" button their balance will be updated with the amount of money they made from selling the crypto and their wallet that stored the crypto they sold will be updated.
  
![image](https://github.com/user-attachments/assets/1c4ecc08-cccb-4fd8-a3a7-3ccc86fae409)

---

### Watch List Feature
- If the user clicks the "Add To Watchlist" button the crypto will be added to the users "Watch List" screen.
- Once the crypto has been added to the users watch list, they will be able to view that crypto on their Watch list.
- The user will be able to see how much their crypto has decreased in value or increased in value.

![image](https://github.com/user-attachments/assets/5a4248ca-d27a-47ee-9946-10e85dc512ab)

---

### News Feature
- When the user clicks the News button in the navigation menu they will be taken to the "News" screen
- Once on this menu the user will be able to view all the news that is related to crypto currency and stocks.

![image](https://github.com/user-attachments/assets/96f17f37-7c0e-4c02-a85a-44cbea4f803f)

---

### Settings Feature
- If the user clicks the cog wheel icon in the top right of every screen they will be taken to the settings screen.

![image](https://github.com/user-attachments/assets/038b745e-b463-448f-bc13-bb1ab74a402a)
![image](https://github.com/user-attachments/assets/6574ac38-35d6-42d6-8a87-91894edf14cc)

- On this screen the user is able to change their profile picture, username, password. 
- On this screen the user is also able to delete their account.
- Once the "Delete Account" button is clicked the users account will be deleted.

- On the "Settings" screen the user is also able to customize their application.
- The user is able to change the Theme of the App the user is able to make their App theme either Dark Theme, or Light Theme.

![image](https://github.com/user-attachments/assets/e942b03c-b5b2-4ac3-9feb-8f97df85e720)
![image](https://github.com/user-attachments/assets/a75b973a-f653-4c76-8cbc-0e35615d89bd)
![image](https://github.com/user-attachments/assets/a48cbcef-52c8-47cf-8a38-f1a9a20fbfae)
![image](https://github.com/user-attachments/assets/0d4a55e1-072b-478f-bcfb-c54a1634f9e1)

- The user is also able to change the language of the application from English to Afrikaans.
- On this screen the user is also able to enable notifications.

![image](https://github.com/user-attachments/assets/7aa26daa-e87d-4ae3-a0ea-8728519b7f8d)
![image](https://github.com/user-attachments/assets/fc95d613-a1ab-4a9e-b154-66e668e7288d)

- In the settings screen the user is also able to edit the balance of their account.

![image](https://github.com/user-attachments/assets/90cd8076-94f4-4361-9b5c-15970f603625)
  
- The last three features on the "Settings" screen are three buttons they are "Sign Out" , "Save Changes", and "Discard Changes".

---

### Firebase 
- We implemented Firebase Authentication for SSO with email and password

![Screenshot (1105)](https://github.com/user-attachments/assets/e2ed9034-b176-4d88-bd2d-52aebbf7691a)


- We used a real-time Firebase database

![Screenshot (1106)](https://github.com/user-attachments/assets/fa7a6ecc-7c10-4a5c-8de9-0d1b28b37a8e)
![Screenshot (1109)](https://github.com/user-attachments/assets/4b5f2bac-bb18-4fd0-a76d-da98c5207ee9)
![Screenshot (1110)](https://github.com/user-attachments/assets/8cddee61-0eb8-42ff-b4ec-8946579ff792)


- We also made use of Firebase Storage

![Screenshot (1111)](https://github.com/user-attachments/assets/7d985fd5-7edf-473a-9b14-46431b241946)
![Screenshot (1112)](https://github.com/user-attachments/assets/181cd67e-3258-438f-a91f-563fae953390)
![Screenshot (1113)](https://github.com/user-attachments/assets/26074670-ba5c-4665-ad4a-258b14d9f566)

## Attempt to publish to google playstore 

- The app APK was creted along with a keystore
  ![Screenshot 2024-11-03 212251](https://github.com/user-attachments/assets/0142d735-5f9b-4c4a-a508-51cada345a38)
-  The console account however did not allow me access required to publish the app
  ![Screenshot 2024-11-03 222349](https://github.com/user-attachments/assets/c240288a-0fac-461a-9777-1f41b8c4764b)
- However I proceeded and created a new app and filled in the various app details.
  ![Screenshot 2024-11-03 222432](https://github.com/user-attachments/assets/198c2b24-9e63-4128-8126-9eefc0596f56)
![Screenshot 2024-11-03 222528](https://github.com/user-attachments/assets/f3ec2f3b-8a7e-4c78-8b0a-7253ddec84dc)
![Screenshot 2024-11-03 223352](https://github.com/user-attachments/assets/fe86992f-10c3-4c98-9a43-58e089c6c3d5)
![Screenshot 2024-11-03 224232](https://github.com/user-attachments/assets/27dff403-129b-4bc1-95bf-0f359eb8b0f2)
the graphics and Icons were uploaded:
![Screenshot 2024-11-03 224756](https://github.com/user-attachments/assets/efe50516-1448-4f7d-a79e-e473129905eb)
![Screenshot 2024-11-03 225627](https://github.com/user-attachments/assets/1e0a45b0-b9ad-442b-9569-b216013f90e1)
![Screenshot 2024-11-03 225632](https://github.com/user-attachments/assets/8cf10f76-75b4-4510-aeb6-e51ab5123a59)
Logo:

![Tactical_Trades_Logo](https://github.com/user-attachments/assets/706bdde3-9ed4-4c99-8c8f-0d83b8785241)

Screen Banner:

![Group 237597](https://github.com/user-attachments/assets/2530e973-8a64-4a89-b61f-c01d555c99ac)

Data safety required a privacy policy URL that was attempted but ultimately failed
![Screenshot 2024-11-03 225805](https://github.com/user-attachments/assets/01ca2b35-1080-490e-ae6b-3a7a81bbefac)

- The app draught was created however could not proceed as my account did not have the relevant permisssions needed:
  ![Screenshot 2024-11-04 125129](https://github.com/user-attachments/assets/005b584c-1b18-4abc-908e-7af367672c4c)
  - This was the primary reason for being unable to published and could not be resolved despite our best efforts.
    








## AI Usage Writeup 
Use of AI in development:
GitHub Copilot and ChatGPT were two AI tools that were very helpful in debugging and improving the code as it was being developed. Copilot offered solutions and code recommendations for typical coding problems.
When some features did not work as intended, ChatGPT helped with more thorough troubleshooting by assisting in the identification and resolution of particular coding problems.
ChatGPT offers multiple processes and apporaches to solving a problem which helps to save time in debigging the errors. 

AI use Acknowledgement and Citations:
As part of our development process, AI technologies were cited in line with academic honesty and transparency. While ChatGPT and GitHub Copilot offered assistance with debugging and code recommendations, they were not responsible for any of the fundamental choices regarding functionality, architecture, or design. The team examined and modified any code changes or recommendations from Copilot and ChatGPT as needed to meet the project's particular needs. This strategy made sure that, even while AI technologies increased productivity, Tactical Trades' main design and logic components were still the result of the team's autonomous labor.
  
## License

MIT License

Copyright (c) [2017] [James Q Quick]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
