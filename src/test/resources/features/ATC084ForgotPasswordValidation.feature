@Regression @High @TC084
Feature: ATC084 Forgot password functionality validation

Scenario: Validation of web elements in forgot password POPUP

Given User is on Login Page
Then Clicks on forgot Password Link
And Verify web elements of forgot password PopUP

Scenario: End to End forgot password test validation

Given User is on Login Page
Then Clicks on forgot Password Link
And user enters email address in forgot password text box
And clicks on send email
Then Clicks on forgot Password Link
And user enters chamberlain email address in forgot password text box
And clicks on send email
And navigates to user inbox "automationusercacc"
And verifies forgotten password email receipt and navigate to mail body
And verifies web elements in email confirmation body for forgot password email
