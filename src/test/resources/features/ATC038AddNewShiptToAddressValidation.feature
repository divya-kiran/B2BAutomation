@Regression @Medium @TC038 @MyAccount
Feature: ATC038 Add ship to address validation in my account page

Scenario: Verifying web elements in Add Ship To form

Given User will log in as US registered Credit card user
And User verify log in is successful
Given User navigate to myaccount page
And user clicks on add ship to address button
Then user verifies all fields of add ship to account form
And User verifies required labels for add ship to account

Scenario: Submitting form and email validation

Given User navigate to myaccount page
And user clicks on add ship to address button
Then User enters information in editable fields on add ship to address form
And Click on add to ship to addres save button
And verifies add ship to address form success toast message
And navigates to user inbox "automationuseruspt"
##And verifies add ship to address email receipt and navigate to mail body
##And verifies web elements in email confirmation body for add ship to email
