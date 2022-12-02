@Regression @High @TC070 @Cart
Feature: ATC070 Cart page validations for a single SKU product

Scenario: Validation of Cart Page web elements for a single product

Given User will log in as US registered Payment Term user
And User verify log in is successful
And User will clear cart if there are any products present
And User will navigate to PDP page of product "p/041-0031"
And User will Add product to cart from PDP page
And User will click on Mini cart flyer
And User will proceed to cart page from mini cart flyer
##Then user add Products to cart "p/041A5507-7C"
##Given user navigates to cart page
And verify all web elements related to single SKU product in cart page
##And Verifies total price of all the products
And click on continue shopping in cart page

Scenario: Validation of Cart Page save cart and Job name for a single product

Given user navigates to cart page
And click on Save cart in cart page and verify Save cart pop up and its elements
Then user navigates to cart page
And user adds job name and save it

Scenario: Validation of Cart Page price changes

Given user navigates to cart page
And Verify each price and total price for a single SKU product
And user change the quantity of a single SKU product
And verify total price changed in Cart

Scenario: Validation of Cart Page product navigation

Given user navigates to cart page
And Click on product and verify user navigated to PDP page
Then user navigates to cart page
##And delete first product
##And click on checkout button and verify user navigated to Checkout page
