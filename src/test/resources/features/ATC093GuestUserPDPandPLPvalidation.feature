@Regression @High @TC093 @GuestUser
Feature: ATC093 Validation PDP and PLP pages for guest user

Scenario: Verification PLP page for guest user

Given User will log in as US Guest user
And User verify log in is successful
When User navigates to CDO PLP page
Then verifies become a partner link in PLP page
Then Verifies header elements in CDO PLP page
Then Verifies sticky header in PLP page

Scenario: Verification of PDP page for guest user

When User navigates to PDP page of product "CSL24ULMC"
Then Verify become a partner link in PDP page
And Scroll to bottom for sticky navigation
Then user verifies Become a partner link in sticky navigation of PDP page
When User navigates to PDP page of product "8500WMC"
Then User scroll down for sticky navigation
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

