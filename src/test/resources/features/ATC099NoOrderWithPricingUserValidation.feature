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

Scenario: Validate order history detail page for No order Limited Pricing user

Given User clicks on Order Status link in Homepage new
And User navigates to first order in the order history page
And Verifies product cards