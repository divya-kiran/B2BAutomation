@Regression @High @PDP
Feature: ATC064 Validation of Non BBU PDP page

Scenario: Verification of NON BBU PDP Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to PDP page of product "8010"
Then User clicks on click here for more information in non BBU PDP page
And user verifies elements in Non BBU pop up section
