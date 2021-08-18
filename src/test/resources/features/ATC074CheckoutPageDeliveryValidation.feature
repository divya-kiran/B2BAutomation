@Regression @High @TC074 @Checkout
Feature: ATC074 validating delivery section in checkout page

Scenario: Validation of delivery section web elements and its action

Given User will log in as US registered Payment Term user
And User verify log in is successful
And User will clear cart if there are any products present
Then User will Add products to cart using quick order "001A4811"
Then user navigates to cart page
And Proceeds to checkoutpage
And verifies each delivery option in checkout page
