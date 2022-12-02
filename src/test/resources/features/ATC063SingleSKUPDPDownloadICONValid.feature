@Regression @High @PDP
Feature: ATC063 Validation of download icon of single SKU PDP page

Scenario: Verification of download icon of single sku PDP Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to PDP page of product "8500WMC"
Then User clicks on download icon
And user verifies elements in download pop up section
