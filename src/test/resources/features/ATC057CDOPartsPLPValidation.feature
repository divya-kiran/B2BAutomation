@Regression @High @PLP @TC057
Feature: ATC057 Validation of CDO Parts PLP page

Scenario: Verification of CDO Parts PLP Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to CDO Parts PLP page
Then Verifies header elements in CDO Parts PLP page
##And Verifies fourth product card and its attributes in CDO Parts PLP page
And user verifies product card click on PLP is navigating to PDP page by link

Scenario: Verification of facets in CDO Parts PLP Page

When User navigates to CDO Parts PLP page
Then User verifies category facet section in CDO Parts PLP page
And User verifies Price facet section in CDO Parts PLP page
And user clicks on CDO Parts category facet section and verify correct resultset by count
And user verifes show more link in PLP page


