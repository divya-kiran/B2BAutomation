@Regression @High @PLP @TC052
Feature: ATC052 Validation of CDO PLP page

Scenario: Verification of CDO PLP Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to CDO PLP page
Then Verifies header elements in CDO PLP page
And Verifies fourth product card and its attributes in CDO PLP page
And user verifies product card click on PLP is navigating to PDP page by link

Scenario: Verification of facets in CDO PLP Page

When User navigates to CDO PLP page
Then User verifies category facet section in CDO PLP page
And User verifies Price facet section in CDO PLP page
And user clicks on CDO category facet section and verify correct resultset by count
And user verifes show more link in PLP page