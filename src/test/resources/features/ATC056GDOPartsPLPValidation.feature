@Regression @High @PLP @TC056
Feature: ATC056 Validation of GDO Parts PLP page

Scenario: Verification of GDO Parts PLP Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to GDO Parts PLP page
Then Verifies header elements in GDO Parts PLP page
##And Verifies fourth product card and its attributes in GDO Parts PLP page
And user verifies product card click on PLP is navigating to PDP page by link

Scenario: Verification of facets in GDO Parts PLP Page

When User navigates to GDO Parts PLP page
Then User verifies category facet section in GDO Parts PLP page
And User verifies Price facet section in GDO Parts PLP page
And user clicks on GDO Parts category facet section and verify correct resultset by count
And user verifes show more link in PLP page


