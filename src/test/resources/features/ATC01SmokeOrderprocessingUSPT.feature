@Smoke @High @Regression @ATC01
Feature: ATC01 Placing an order using US registered Payment Terms user

Scenario: Placing an order using US registered Payment Terms user  

Given User will log in as US registered Payment Term user
And User verify log in is successful
And User will clear cart if there are any products present
Then User will Add products to cart using quick order "041A2817-6P"
And User will click on Mini cart flyer
And User will proceed to cart page from mini cart flyer
When User click on Checkout button in cart page
Then User Navigates to Checkout page
And I will select ship to delivery address
And User will select shipping method
And User will Click on shipping delivery Save button
Then User will fill details in review order section
And click on place order
Then User will be redirected to order confirmation page
