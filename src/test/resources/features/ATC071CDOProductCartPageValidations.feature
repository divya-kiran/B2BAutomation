@Regression @High @TC071 @Cart
Feature: ATC071 Cart page validations for a CDO product

Scenario: Validation of Cart Page web elements for a CDO product

Given User will log in as US registered Payment Term user
And User verify log in is successful
And User will clear cart if there are any products present
When User navigates to PDP page of product "T"
And user adds CDO product to cart

Scenario: Validation of Cart Page for product T

Given user navigates to cart page
Then Verifies CDO product details in cart page
And verifies product link navigation of CDO product to PDP page in cart
Then user navigates to cart page
And verify two product line items are present for T product with the selected options
And verifies child product line items for CDO product T
And verify child product link navigation to PDP page
