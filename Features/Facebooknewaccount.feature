Feature: validate facebook create new account feature

Scenario Outline: Validate Facebook create new account

Given user to go to facebook new account homepage
When  user types "<firstname>" and "<surname>" and "<emailaddress>" and "<confirmemail>" and "<newpassword>"
When user selects birth date and gender and clicks sign up 
Then user is redirected to profile page

Examples: 
|firstname|surname|emailaddress|confirmemail|newpassword|
|Adira|king|athea0404@gmail.com|athea0404@gmail.com|Faradi22|