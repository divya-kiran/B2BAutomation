@Regression @High @TC075 @Checkout
Feature: ATC075 validating review section in checkout page

Scenario: Validation of review section web elements and its action

Given User will log in as US registered Payment Term user
And User verify log in is successful
And User will clear cart if there are any products present
Then User will Add products to cart using quick order "001A4811"
Then user navigates to cart page
And Proceeds to checkoutpage
And User will select shipping method
And User will Click on shipping delivery Save button
And Verify account payment label
And the verify review section web elements
And click on liftmaster policies and procedures and verify page navigation
And verify product details in checkout page
