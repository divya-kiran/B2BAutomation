@Regression @Medium @TC099
Feature: ATC099 Validating No Order With Pricing user accessability across the site

Scenario: Validating No Order with Pricing user accessability

Given User will log in as US no order with pricing user
And User verify log in is successful
And User will clear cart if there are any products present
And User will navigate to PDP page of product "p/02-51227"
And User will Add product to cart from PDP page
And User will click on Mini cart flyer
And User will proceed to cart page from mini cart flyer
##When User click on Checkout button in cart page
##Then User Navigates to Checkout page
##And User will select shipping method
##And User will Click on shipping delivery Save button
##Then User will fill details in review order section
##And user verify Place order is disabled on place order

Scenario: Validate order history detail page for No order Limited Pricing user

Given User clicks on Order Status link in Homepage new
And User navigates to first order in the order history page
And Verifies product cards