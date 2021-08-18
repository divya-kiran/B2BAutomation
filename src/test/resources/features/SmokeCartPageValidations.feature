@Smoke
Feature: ATC09 Verifying Cart page

Scenario: Cart page validations for a single product

Given User will log in as US registered Payment Term user
And User verify log in is successful
And User will clear cart if there are any products present
Then User will Add products to cart using quick order "041A2817-6P"
And User will click on Mini cart flyer
And User will proceed to cart page from mini cart flyer
Then I will validate elements in cart page for a single product