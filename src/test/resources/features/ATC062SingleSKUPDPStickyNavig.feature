@Regression @High @PDP @TC062
Feature: ATC062 Validation of sticky navigation section of PDP page

Scenario: Verification of sticky navigation section of PDP Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to PDP page of product "8500MC"
Then User scroll down for sticky navigation
And User verifies sticky navigation headers

Scenario: Verification of sticky navigation section in detail of PDP page

When User navigates to PDP page of product "8500MC"
Then User scroll down for sticky navigation
And User clicks on Incentives program in sticky navigation
And verifies web elements in Incentive section
And User clicks on description in sticky navigation
And verifies web elements in description section
And User clicks on specs and warranty in sticky navigation
And verifies web elements in specs and warranty section
And User clicks on resources in sticky navigation
And verifies web elements in resources section
And User clicks on parts in sticky navigation
And verifies web elements in parts section
And User clicks on You may also like in sticky navigation
And verifies web elements in You may also like section
