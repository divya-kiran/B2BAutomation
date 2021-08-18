@Regression @High @TC079
Feature: ATC079 Products Tab header validation

Scenario: GDO header link validation

Given User will log in as US registered Credit card user
And User verify log in is successful
Then Hover on product tab and verify GDO header link
And Verify GDO page by title and URL

Scenario: CDO header link validation

Given User is on homepage
Then Hover on product tab and verify CDO header link
And Verify CDO page by title and URL

Scenario: Gate operators link validation

Given User is on homepage
Then Hover on product tab and verify Gate operators header link
And Verify gate operators page by title and URL

Scenario: Access control systems link validation

Given User is on homepage
Then Hover on product tab and verify Access control systems header link
And Verify Access control systems page by title and URL

Scenario: All Accessories link validation

Given User is on homepage
Then Hover on product tab and verify All Accessories header link
And Verify All Accessories page by title and URL

Scenario: My Most Ordered Products link validation

Given User is on homepage
Then Hover on product tab and verify My Most Ordered Products header link
And Verify My Most Ordered Products page by title and URL

Scenario: Products Prices List link validation

Given User is on homepage
Then Hover on product tab and verify Products Prices List header link
And Verify Products Prices List page by title and URL