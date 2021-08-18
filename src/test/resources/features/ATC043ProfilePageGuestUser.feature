@Regression @High @MyAccount @GuestUser
Feature: ATC043 Profilepage validation for guest user

Scenario: Verifying my account page for guest user

Given User will log in as US Guest user
And User verify log in is successful
Given User navigate to myaccount page
Then User verifies name and contact details section
And User verifies update password section
And User verifies ship to sold to manage user and invite user section is not displayed for guest user