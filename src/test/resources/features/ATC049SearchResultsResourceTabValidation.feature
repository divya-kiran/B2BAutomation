@Regression @High @SearchResult
Feature: ATC049 Validation of Resources tab in search results page

Scenario: Verification of web elements in resource tab search results Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User enter text into product search box "374ut" 
Then User click on resources tab
And verify header elements in resource tab section

Scenario: Verification of facets in resource tab search result page

When User enter text into product search box "GT" 
Then User click on resources tab
Then User verifies literature type facet section in resource tab
And user verifies Asset type facet section in resource tab
And user clicks in literature type facet check box and verify resource tab matches with correct number of results
And User verifies document tab card