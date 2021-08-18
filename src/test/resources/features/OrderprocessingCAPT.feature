@Regression @High @PlaceOrder
Feature: ATC016 Placing an order using CA registered Payment Terms user

Scenario: Placing an order using CA registered Payment Terms user  

Given User will log in as CA registered Payment Term user
And User verify log in is successful
And User will clear cart if there are any products present
Then User will Add products to cart using quick order "001A4811"
And User will navigate to PDP page of product "p/8355W"
And User will Add product to cart from PDP page
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
