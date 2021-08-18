@Regression @High @PDP
Feature: ATC061 Validation of overview section of PDP page

Scenario: Verification of overview section of PDP Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to PDP page of product "8500W"
Then Verifies Gallery section of PDP page
And Verifies product details in PDP page