@Regression @High @TC087 @Registration
Feature: ATC087 Guest registration Page validation

Scenario: Validation of web elements in Guest registration Page

Given User is on Login Page
Then Clicks on sign up now Link
And user click on my company doesnt have a liftmaster partner account
And user Verify guest registration page title and header
And user verify all web elements in guest registration page
And user fills all mandatory fields in guest registration page
And verify signup button in guest registration page
And Verify header and footer is displayed in login page