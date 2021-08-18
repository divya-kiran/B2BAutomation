@Regression @High @SearchResult
Feature: ATC048 Validation of Products tab in search results page

Scenario: Verification of web elements in product tab search results Page

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User enter text into product search box "374ut" 
And Verify page by URL "search?text="
Then Verify Search results page header elements
And verify products tab is displaying results

Scenario: Verification of facets in product tab search result page

When User enter text into product search box "GT" 
Then User verifies category facet section in product tab
And user verifies price facet section in product tab
And user clicks in facet check box and verify product tab matches with correct number of results
When User enter text into product search box "8010" 
Then user verifies rail length facet section in product tab
And user clicks on rail length facet checkbox and verify results

Scenario: Verification of product cards in product tab search result page

When User enter text into product search box "GT"
Then user verifies the first product card resulted in search
And User verifies product name summary price image qty box and CTA for the resultant CDO product
And user verifies first product is redirected to PDP page
When User enter text into product search box "878MAX"
Then user verifies product name summary price image qty box and CTA for the resultant single sku product
