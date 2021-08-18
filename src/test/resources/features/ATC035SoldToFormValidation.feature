@Regression @High @TC035 @MyAccount
Feature: ATC035 Sold To form validation

Scenario: Verifying web elements in Sold To form

Given User will log in as US registered Payment Term user
And User verify log in is successful
Given User navigate to myaccount page
Then user verifies all fields of sold to account form
And User verifies required labels for sold to account

Scenario: Submitting form and email validation

Given User navigate to myaccount page
Then User fills editable fields in sold to form
And click on sold to form save button
And verifies sold to form success toast message
And navigates to user inbox "automationuseruspt"
And verifies sold to email receipt and navigate to mail body
And verifies web elements in email confirmation body for sold to email

