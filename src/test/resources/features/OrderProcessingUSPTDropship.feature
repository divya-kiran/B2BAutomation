@Regression @High @PlaceOrder
Feature: ATC013 Placing an drop ship order using US registered Payment terms user

Scenario: Placing an order drop ship using US registered Payment Terms user  

Given User will log in as US registered Payment Term user
And User verify log in is successful
And User will clear cart if there are any products present
Then User will Add products to cart using quick order "041A5507-7C"
And User will navigate to PDP page of product "p/EESBFM"
And User will Add product to cart from PDP page
And User will click on Mini cart flyer
And User will proceed to cart page from mini cart flyer
When User click on Checkout button in cart page
Then User Navigates to Checkout page
And User will click on dropship address link
And User will verify elements present in dropship address pop up
And User will add US dropship address
And User will select shipping method
And User will Click on shipping delivery Save button
Then User will fill details in review order section
And click on place order
Then User will be redirected to order confirmation page
