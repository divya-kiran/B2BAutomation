@Regression @High @PLP @TC053
Feature: ATC053 Validation of Gate Operator PLP page

Scenario: Verification of Gate Operator PLP Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to Gate Operator PLP page
Then Verifies header elements in Gate Operator PLP page
##And Verifies fourth product card and its attributes in Gate Operator PLP page
And user verifies product card click on PLP is navigating to PDP page by link

Scenario: Verification of facets in Gate Operator PLP Page

When User navigates to Gate Operator PLP page
Then User verifies category facet section in Gate Operator PLP page
And User verifies Price facet section in Gate Operator PLP page
And user clicks on Gate Operator category facet section and verify correct resultset by count
And user verifes show more link in PLP page


