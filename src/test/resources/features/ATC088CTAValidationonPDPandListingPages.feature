@Regression @High @TC088 @CTAValidations
Feature: ATC088 Different type of CTA validation on PDP and Listing pages

Scenario: Validation of Add to cart CTA

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User search for product "041D9140"
Then verify Add to cart CTA on Search results page
And verify Add to Cart CTA on PDP page

Scenario: Validation of Get Support CTA

When User search for product "041-0125"
Then verify Get Support CTA on Search results page
And verify Get Support CTA on PDP page

Scenario: Validation of NotifyME CTA

When User search for NotifyME product "893LM"
Then verify NotifyME CTA on Search results page
And Verify NotifyME message in search results page
And verify NotifyME CTA on PDP page
And verify Notify ME message on PDP page

Scenario: Validation of Custom CTA

When User search for Custom CTA product "041A3534"
Then verify Custom CTA on Search results page
And verify Custom CTA on PDP page and type of Custom CTA

Scenario: Validation of Learn More CTA for Product with variants

When User search for LearnMore CTA product "EL25"
Then verify Learn more CTA on Search results page
And verify Add to Cart CTA on PDP page

Scenario: Validation of Learn More CTA for configurable products

When User search for CDO product "T"
Then verify Learn more CTA for configurable products on Search results page
And verify Add to Cart CTA on PDP page disabled


