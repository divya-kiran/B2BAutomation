@Regression @High @PLP
Feature: ATC051 Validation of GDO PLP page

Scenario: Verification of GDO PLP Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to GDO PLP page
Then Verifies header elements in GDO PLP page
And Verifies fourth product card and its attributes in GDO PLP page
And user verifies product card click on PLP is navigating to PDP page by link

Scenario: Verification of facets in GDO PLP Page

When User navigates to GDO PLP page
Then User verifies category facet section in GDO PLP page
And User verifies Price facet section in GDO PLP page
And User verifies Rail Length facet section in GDO PLP page
And user clicks on category facet section and verify correct resultset by count
And user verifes show more link in PLP page


