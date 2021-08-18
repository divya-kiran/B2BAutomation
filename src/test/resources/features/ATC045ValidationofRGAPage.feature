@Regression @High @RGA @EmailValidation
Feature: ATC045 Return Goods Authorization page validation and email validation

Scenario: Verifying web elements in RGA page

Given User will log in as US registered Payment Term user
And User verify log in is successful
Given User navigate to RGA page
Then User verifies Web elements in RGA form page
And User verifies Add address form elements in RGA Page

Scenario: Verifying submission of RGA and email validation

Given User navigate to RGA page
And User adds address in RGA page
Then User fills all mandatory fields in RGA form
And User clicks on save item button
And User clicks on Submit return items and verifies success message
And navigates to user inbox "automationuseruspt"
And verifies RGA email receipt and navigate to mail body
And verifies web elements in email confirmation body for RGA confirmation email
