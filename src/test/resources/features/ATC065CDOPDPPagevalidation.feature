@Regression @High @PDP @TC065
Feature: ATC065 Validation of CDO PDP page

Scenario: Verification of web elements in CDO PDP Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to PDP page of product "T"
Then user verifies web elements in CDO PDP page

Scenario: Verification of CDO PDP Page

When User navigates to PDP page of product "T"
Then Verifies elements in configure section of CDO PDP Page
And User verifies elements in install section of CDO PDP Page
And verifies Add to Cart CTA is enabled