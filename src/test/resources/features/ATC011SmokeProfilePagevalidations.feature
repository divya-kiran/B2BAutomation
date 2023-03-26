@Smoke @Regression @ATC011
Feature: ATC011 Verify profile section

Scenario: Verification of profile section

Given User will log in as US registered Payment Term user
And User verify log in is successful
Then User navigate to profile page
And user verifies profile Section
And verifies Company information section
And verifies Manage users section
And verifies Invitations section