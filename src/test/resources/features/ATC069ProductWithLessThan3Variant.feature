@Regression @High
Feature: ATC069 Validation of PDP page with product having less than 3 variants

Scenario: Validation of PDP page with product having less than 3 variants

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to PDP page of product "EL25G"
And Verifies PDP page of product having less than 3 variants
