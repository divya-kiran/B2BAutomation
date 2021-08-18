@Smoke
Feature: ATC08 Verifying search results page

Scenario: Verifying search results page Product tab

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User enter text into product search box "374ut"
And Verify page by URL "search?text="
Then Verify Search results page header
And verify products tab by count

Scenario: Verifying search results page resources sectoin

When User enter text into product search box "T"
And Verify page by URL "search?text="
Then User click on resources tab
Then Verify Search results page header
And Verify resources tab by count