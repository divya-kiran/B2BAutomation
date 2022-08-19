@Regression @High @OrderHistory
Feature: ATC024 Validation of Order detail page with order again option disabled

Scenario: Validating re order button in order history detail page

Given User will log in as US registered Payment Term user
And User verify log in is successful
And User will clear cart if there are any products present
Then User will Add products to cart using quick order "041A5507-7C"
And User will navigate to PDP page of product "p/BH505L5R3"
And User will select options from install step in CDO PDP page
And User will Add product to cart from CDO PDP page
And Click on CheckoutCTA on Pop Up
And User will navigate to homepage
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
And User navigates to the order history detail page of recently placed order
And user verifies order again button is disabled
