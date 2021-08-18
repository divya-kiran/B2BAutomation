@Regression @Medium
Feature: ATC098 Validating No Order NO Pricing user accessability across the site

Scenario: Validating No Order NO Pricing user accessability

Given User will log in as No order No Pricing user
And User verify log in is successful
Then User will navigate to PLP page and verify Add to cart is disabled
And User will navigate to PDP page and verify add to cart is disabled
And verify quick order elements is not present

Scenario: Validate order history detail page for No order NO Pricing user

Given User clicks on Order Status link in Homepage
And User navigates to first order in the order history page
And Verifies product card detail in order history page
