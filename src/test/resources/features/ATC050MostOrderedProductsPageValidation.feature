@Regression @High @TC050
Feature: ATC050 Validation of Most ordered products page

Scenario: Verification of Most ordered products Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
Then User navigates to Most ordered products page
And verify web elements in most ordered products page
And user verifies first most ordered product card

