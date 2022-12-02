@Regression @High @PLP @TC058
Feature: ATC058 Validation of Gate Parts PLP page

Scenario: Verification of Gate Parts PLP Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to Gate Parts PLP page
Then Verifies header elements in Gate Parts PLP page
##And Verifies fourth product card and its attributes in Gate Parts PLP page
And user verifies product card click on PLP is navigating to PDP page by link

Scenario: Verification of facets in Gate Parts PLP Page

When User navigates to Gate Parts PLP page
Then User verifies category facet section in Gate Parts PLP page
And User verifies Price facet section in Gate Parts PLP page
And user clicks on Gate Parts category facet section and verify correct resultset by count
And user verifes show more link in PLP page


