Feature: Login in to demo site

Background:
Given User is able open the browser
When thw user enter the url "https://admin-demo.nopcommerce.com/login"
And Enter the Username "admin@yourstore.com" and Password "admin"
And click on login button
Then The page title should be "Dashboard / nopCommerce administration"

@sanity
Scenario: Login with valid credentials

When User click on Log out button 
Then The page title should be "Your store. Login"


@sanity
Scenario: Create new Customer

When The user click on Customer menu and click on customer click on Customer tab
And Click on Add new button
And Fill all the demografic data
Then New Customer will be Saved "The new customer has been added successfully."
