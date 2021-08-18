@Regression @Medium @MyAccount
Feature: ATC041 Invite user Email Validation

Scenario: Invitation email validation

Given User will log in as US registered Payment Term user
And User verify log in is successful
Given User navigate to myaccount page
And user clicks on Invite button and navigate to Invite user form
And User invite new user with email address
And User select roles in invite user section
And selects options from access rights dropdown in invite user section
And clicks on invite button in the form
And navigates to newly invited users email box
And verifies new invitation email receipt and navigate to mail body
And verifies web elements in email confirmation body for new invitation email
