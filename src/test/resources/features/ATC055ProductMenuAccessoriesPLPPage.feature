@Regression @High @PLP
Feature: ATC055 Validation of Accessories PLP page

Scenario: Verification of Accessories PLP Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to Accessories PLP page
Then Verifies header elements in Accessories PLP page
And Verifies fourth product card and its attributes in Accessories PLP page
And user verifies product card click on PLP is navigating to PDP page by link

Scenario: Verification of facets in Accessories PLP Page

When User navigates to Accessories PLP page
Then User verifies category facet section in Accessories PLP page
And User verifies Price facet section in Accessories PLP page
And user clicks on Accessories category facet section and verify correct resultset by count
And user verifes show more link in PLP page


