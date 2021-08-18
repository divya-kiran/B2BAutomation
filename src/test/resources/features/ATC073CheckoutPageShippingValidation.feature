@Regression @High @TC073 @Checkout
Feature: ATC073 validating shipping section in checkout page

Scenario: Validation of shipping web elements

Given User will log in as US registered Payment Term user
And User verify log in is successful
And User will clear cart if there are any products present
Then User will Add products to cart using quick order "001A4811"
Then user navigates to cart page
And Proceeds to checkoutpage
And verifies shipping delivery web elements

Scenario: Validation of clicking on my account in shipping delivery section

Given user navigates to cart page
And Proceeds to checkoutpage
And click on my account link
Then verify page navigation from checkout page to my account page
Then user navigates to cart page
And Proceeds to checkoutpage
And click on back to cart and verify user is on cart page
