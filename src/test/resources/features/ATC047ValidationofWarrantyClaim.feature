@Regression @High @Warranty @EmailValidation @TC047
Feature: ATC047 Validation of Warranty claim page

Scenario: Verification of web elements in terms and condition Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
Given User navigate to Terms and conditions of Warranty claim page
Then User verifies web elements in Terms and conditions of Warranty claim page

Scenario: Verification of web elements in Warranty Claim Page and email validation

Given User navigate to Warranty claim page
Then User verifies all web elements of Warranty claim page and enter information in mandatory fields
And user clicks on submit in warranty claim page
And verifies success message and page navigation
And navigates to user inbox "automationuseruspt"
And verifies Warranty claim email receipt and navigate to mail body
And verifies web elements in email confirmation body for Warranty claim confirmation email