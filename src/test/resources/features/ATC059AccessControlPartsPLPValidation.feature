@Regression @High @PLP @TC059
Feature: ATC059 Validation of Access Control Parts PLP page

Scenario: Verification of Access Control Parts PLP Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to Access Control Parts PLP page
Then Verifies header elements in Access Control Parts PLP page
##And Verifies fourth product card and its attributes in Access Control Parts PLP page
And user verifies product card click on PLP is navigating to PDP page by link

Scenario: Verification of facets in Access Control Parts PLP Page

When User navigates to Access Control Parts PLP page
Then User verifies category facet section in Access Control Parts PLP page
And User verifies Price facet section in Access Control Parts PLP page
And user clicks on Access Control Parts category facet section and verify correct resultset by count


