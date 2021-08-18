@Regression @High @TC026 @BBU
Feature: ATC026 Non BBU validations on checkout page

Scenario: Verify non BBU product on checkout Page

Given User will log in as US registered Payment Term user Non BBU
And User verify log in is successful
And User will clear cart if there are any products present
Then User will Add products to cart using quick order "041A5507-7C"
And User will navigate to PDP page of product "p/8010"
And User will Add product to cart from PDP page
And User will click on Mini cart flyer
And User will proceed to cart page from mini cart flyer
When User click on Checkout button in cart page
Then User Navigates to Checkout page
And User will click on dropship address link
And User will add US california dropship address
And User verifies non BBU error message on Checkout Page
