@Regression @High @TC086 @Registration
Feature: ATC086 Partner registration Page validation

Scenario: Validation of web elements in Partner registration Page

Given User is on Login Page
Then Clicks on sign up now Link
And user click on i know my company account number
And user Verify partner registration page title and header
And user verify all web elements in partner registration page
And user fills all mandatory fields in partner registration page
And Verify header and footer is displayed in login page

Scenario: Validation of when customer doesnt know companys account number

Given User is on Login Page
Then Clicks on sign up now Link
And user click on i donot know my company account number
And user verify request access pop up