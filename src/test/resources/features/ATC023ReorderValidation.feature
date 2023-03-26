@Regression @High @OrderHistory @ATC023
Feature: ATC023 Validation of Order detail page with order again option enabled

Scenario: Validating re order button in order history detail page

Given User will log in as US registered Payment Term user
And User verify log in is successful
And User will clear cart if there are any products present
Then User will Add products to cart using quick order "041A5507-7C"
And User will navigate to PDP page of product "p/001A4811"
And User will Add product to cart from PDP page
And User will click on Mini cart flyer
And User will proceed to cart page from mini cart flyer
When User click on Checkout button in cart page
And I will select ship to delivery address
And User will select shipping method
And User will Click on shipping delivery Save button
Then User will fill details in review order section
And click on place order
Then User will be redirected to order confirmation page
And user clicks on order status and navigate to order history page
And user verifies order number is present in order history page
And User navigates to the order history detail page of recently placed order
And user verifies link navigation in order history page
And user verifies order again button is enabled
And User clicks on on order again and verifies cart page