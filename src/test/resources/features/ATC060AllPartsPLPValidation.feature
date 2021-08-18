@Regression @High @PLP
Feature: ATC060 Validation of ALL Parts Parts PLP page

Scenario: Verification of ALL Parts Parts PLP Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to ALL Parts Parts PLP page
Then Verifies header elements in ALL Parts Parts PLP page
And Verifies fourth product card and its attributes in ALL Parts Parts PLP page
And user verifies product card click on PLP is navigating to PDP page by link

Scenario: Verification of facets in ALL Parts Parts PLP Page

When User navigates to ALL Parts Parts PLP page
Then User verifies category facet section in ALL Parts Parts PLP page
And User verifies Price facet section in ALL Parts Parts PLP page
And user clicks on ALL Parts Parts category facet section and verify correct resultset by count
And user verifes show more link in PLP page


