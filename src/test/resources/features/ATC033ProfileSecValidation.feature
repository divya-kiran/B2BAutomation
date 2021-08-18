@Regression @High @TC033 @MyAccount
Feature: ATC033 Verify profile section positive scenarios

Scenario: Validating Profile section

Given User will log in as US registered Payment Term user
And User verify log in is successful
Given User navigate to myaccount page
Then user verifies profile Section Name and contact web elements
And user verifies profile Section Update Password web elements
And Verifies required error for first name and last name text box
And Verifies required error for primary phone

Scenario: Validation of Text boxes in profile section

Given User navigate to myaccount page
Then User enter text in the text boxes present in Name and contact section
And Verify save button is enabled
And Click on save button name and contact and verifies success toast message

Scenario: Validation of update password Text boxes in profile section

Given User navigate to myaccount page
Then Enters old password in update password section
And Enter new passwords in update password section
And Click on save button in update password section and verifies success toast message

