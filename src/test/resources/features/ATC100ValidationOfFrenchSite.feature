@FrenchSite @Translations
Feature: ATC100 Validation of french website

Scenario: Validating french website

Given User will log in as US registered Payment Term user
And User verify log in is successful
Then Navigate to french site and login as user
And verify log in success for french site
And Verify Homepage header content
And navigate to PLP page and verify PLP page
And navigate to any PDP page and verify PDP page
And Add product to cart in french site
And Navigate to cart page
And Proceed to checkout page
And enter details in the check out page
And Place the order in french site
And verify order confirmation page for french site
