@Regression @High @MyAccount @TC039
Feature: ATC039 Manage user Form Validation

Scenario: Verifying web elements of Manage user Account card

Given User will log in as US registered user
And User verify log in is successful
Given User navigate to myaccount page
And User scrolls to Manage user section and verify header elements
Then Verify Web elements of manage user account card

Scenario: Verifying web elements of Manage user form

Given User navigate to myaccount page
And user clicks on pencil icon of manage user account card and navigate to edit user form
Then User verifies Email address and phone number section
And verifies status and password section
And verifies roles section
And verifies access rights drop down elememnts
And verifies position drop down elememnts
And verifies cancel and save button for manage user section

Scenario: Verifying link navigations of manage users form

Given User navigate to myaccount page
And user clicks on pencil icon of manage user account card and navigate to edit user form
And click on reset password and verify password window
And Click on deactivate link and verify deactivate window
And select options from access rights dropdown
And select options from position dropdwn
And verify cancel and save button in manage user form
