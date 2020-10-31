Feature: OrangeHrm
@loginsingledata
Scenario: validate login test
Given i launch url in chrome browser
When i enter username in textbox  and i enter password in textbox
When i click on login button
Then i verify url 
Then i close browser
@loginmultipledata
Scenario Outline: validate login with multiple data
Given launch url in "<Browser>" 
When user enter "<Username>" in username field
When user enter "<Password>" in password field
When user click login button
Then user verify url text
Then user close browser
Examples:
|Browser|Username|Password|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123!@#|
|chrome|Admin2|Qedge123!@#|
|firefox|Admin|Qedge123!@#4|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123!@#|





