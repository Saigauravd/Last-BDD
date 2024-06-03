Feature: Login in to demo site

Background: repeated steps
Given User is able open the browser
When thw user enter the url "https://admin-demo.nopcommerce.com/login"
And Enter the Username "admin@yourstore.com" and Password "admin"
And click on login button

@sanity
Scenario: Login with valid credentials
Then The page title should be "Dashboard / nopCommerce administration"

When User click on Log out button 
Then The page title should be "Your store. Login"



Scenario: Create new Customer

When The user click on Customer menu and click on customer click on Customer tab
And Click on Add new button
And Fill all the demografic data
Then New Customer will be Saved "The new customer has been added successfully."
@XY
Scenario: Search for the Customer
When The user click on Customer menu and click on customer click on Customer tab
And Enter the email id
And click on search button
Then email id will be appeared "brenda_lindgren@nopCommerce.com"