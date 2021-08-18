@Regression @High @TC090 @StickyHeader
Feature: ATC090 Validation Sticky header in PDP page

Scenario: Verification of add to cart CTA in sticky header

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to PDP page of product "CAPXLV"
And Scroll to bottom for sticky navigation
Then user verifies Add to cart CTA in sticky navigation of PDP page

Scenario: Verification of get support CTA in sticky header

When User navigates to PDP page of product "041A3027"
And Scroll to bottom for sticky navigation
Then user verifies get support CTA in sticky navigation of PDP page

Scenario: Verification of Custom CTA in sticky header

When User navigates to PDP page of product "041A3534"
And Scroll to bottom for sticky navigation
Then user verifies Custom CTA in sticky navigation of PDP page

Scenario: Verification of NotifyME CTA in sticky header

When User navigates to PDP page of product "041B0012"
And Scroll to bottom for sticky navigation
Then user verifies Notify ME CTA in sticky navigation of PDP page

Scenario: Verification of Add to Cart CTA in sticky header

When User navigates to PDP page of product "T"
And Scroll to bottom for sticky navigation
Then user verifies configurable products CTA in sticky navigation of PDP page

Scenario: Verification of add to cart CTA in sticky header for GDO products

When User navigates to PDP page of product "EL25G"
And Scroll to bottom for sticky navigation
Then user verifies GDO products CTA in sticky navigation of PDP page
