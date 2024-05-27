Feature: Login in to demo site


@sanity
Scenario: Login with valid credentials
Given User is able open the browser
When thw user enter the url "https://admin-demo.nopcommerce.com/login"
And Enter the Username "admin@yourstore.com" and Password "admin"
And click on login button
Then The page title should be "Dashboard / nopCommerce administration"
When User click on Log out button 
Then The page title should be "Your store. Login"
