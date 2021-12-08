@Regression @High @MyAccount
Feature: ATC040 Invite user Form Validation

Scenario: Verifying web elements of Invite user Account card

Given User will log in as US registered Payment Term user
And User verify log in is successful
Given User navigate to myaccount page
Then User scrolls to Invite user section and verify header elements
And Verify Web elements of Invite user account card

Scenario: Verifying web elements of Invite user form

Given User navigate to myaccount page
And user clicks on Invite button and navigate to Invite user form
Then User verifies Email address and Confirm email address TextBox
And verifies Account section in invite user form
And verifies roles section in invite user form
And verifies access rights drop down elememnts in invite user form
And verifies cancel and save button for Invite user section

Scenario: Verifying web elements action of Invite users form

Given User navigate to myaccount page
And user clicks on Invite button and navigate to Invite user form
And User enters email address and confirm email address
And User select roles in invite user section
And selects options from access rights dropdown in invite user section
And verify cancel and save button in invite user form