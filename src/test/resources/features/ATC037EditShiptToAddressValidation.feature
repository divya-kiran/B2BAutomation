@Regression @High @MyAccount @TC037
Feature: ATC037 Edit ship to address validation in my account page

Scenario: Verifying web elements in Edit Ship To form

Given User will log in as US registered Credit card user
And User verify log in is successful
Given User navigate to myaccount page
And user clicks on edit ship to address icon
Then user verifies all fields of edit ship to account form
And User verifies required labels for edit ship to account

Scenario: Submitting form and email validation

Given User navigate to myaccount page
And user clicks on edit ship to address icon
Then User enters information in editable fields on edit ship to address form
And click on Edit ship to form save button
And verifies ship to address form success toast message
And navigates to user inbox "automationuseruspt"
##And verifies ship to address email receipt and navigate to mail body
##And verifies web elements in email confirmation body for ship to email
