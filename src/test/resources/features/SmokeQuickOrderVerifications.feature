@Smoke
Feature: ATC04 Verify quick order widget functionality

Scenario: Verification of quick order widget elements  

Given User will log in as US registered Payment Term user
And User verify log in is successful
Then User clicks on Quick order icon
And User Verifies quick order widget title
And User Verifies quick order close icon
And User Verifies quick order text box
And User Verifies quick order quantity box
And User Verifies quick order Add to Cart CTA is disabled before entering text
And User clicks on quick order close icon

Scenario: Adding product to cart via quick order

Given User clicks on Quick order icon
Then Enter single sku product in quick order text box
And Click on add to cart
And user verifies success message
Then Enter single sku product in quick order text box
And Add quantity greater than 1
And Click on add to cart
And user verifies success message
And User clicks on quick order close icon

Scenario: Verifying error messages for quick order

Given User clicks on Quick order icon
Then Enter non sellable product in quick order text box
And Click on add to cart
And User verifies error message
Then Enter special characters in quick order text box
And Click on add to cart
And  User verifies invalid special characters message