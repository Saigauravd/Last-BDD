
Feature: Login to Suace lab with multiple credentials

@regression
  Scenario Outline: Login with multiple cred
  
  Given User will open the browser and paste the URL "https://www.saucedemo.com/"
  When User enter the Username "<Username>" and Password "<Password>"
  And Click on Login button
  Then Page title should be "Swag Labs"
  When user click on Elipses and click on  logout button 
  Then Page title should be "Swag Labs"
Examples:
 |Username|Password|
 |standard_user|secret_sauce|
|locked_out_user|secret_sauce|
|problem_user|secret_sauce|
|performance_glitch_user|secret_sauce|
|error_user|secret_sauce|
|visual_user|secret_sauce|
