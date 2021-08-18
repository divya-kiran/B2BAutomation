@Regression @Medium @TC034 @MyAccount
Feature: ATC034 Verify profile section negative scenarios

Scenario: Invalid name in profile section

Given User will log in as US registered Payment Term user
And User verify log in is successful
Given User navigate to myaccount page
Then user validates First name and last name text box with invalid values
And Verifies Primary phone with invalid mobile numbers

Scenario: Password text box verification

Given User navigate to myaccount page
Then user validates old password text box with invalid password
And Verifies too short password
And verifies Weak Medium and strong security passwords
And verifies password matching
