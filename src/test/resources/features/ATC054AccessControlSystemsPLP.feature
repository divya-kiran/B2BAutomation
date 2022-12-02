@Regression @High @PLP @TC054
Feature: ATC054 Validation of Access Control PLP page

Scenario: Verification of Access Control PLP Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to Access Control PLP page
Then Verifies header elements in Access Control PLP page
##And Verifies fourth product card and its attributes in Access Control PLP page
And user verifies product card click on PLP is navigating to PDP page by link

Scenario: Verification of facets in Access Control PLP Page

When User navigates to Access Control PLP page
Then User verifies category facet section in Access Control PLP page
And User verifies Price facet section in Access Control PLP page
And user clicks on Access Control category facet section and verify correct resultset by count
And user verifes show more link in PLP page


