@Regression @High @PDP
Feature: ATC066 Validation of CDO PDP page sticky navigation

Scenario: Verification of CDO PDP Page sticky navigation

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to PDP page of product "T"
Then User scroll down for sticky navigation
And User clicks on description in sticky navigation
And verifies web elements in description section
And User clicks on resources in sticky navigation
And verifies web elements in resources section
And User clicks on parts in sticky navigation
And verifies web elements in parts section
