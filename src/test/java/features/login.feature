Feature: Login to facebook account
Scenario: Login to facebook account using valid credentails
Given Navigate to facebook login page
When Enter the user name and password and click on submit button
Then User should be logged into the facebook account
And User should see the home page
