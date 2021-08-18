@Regression @Medium @MyAccount
Feature: ATC036 Validation of communication preferences

Scenario: Verifying web elements of communication preferences link

Given User will log in as US registered Payment Term user
And User verify log in is successful
Then User navigate to myaccount page
Then User verifies communication preferences link
And click on communication preferences link
And verify communication preferences window web elements
