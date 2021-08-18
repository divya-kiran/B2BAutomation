@Regression @High @TC092 @StickyHeader
Feature: ATC092 Validation Sticky header in Partner Portal site 2

Scenario: Verification of Order history sticky header

Given User will log in as US registered Payment Term user
And User verify log in is successful
Given User clicks on Order Status link in Homepage
Then Verifies sticky header in order history page

Scenario: Verification of Saved carts sticky header

When User navigates to saved carts page
Then verifies sticky header in saved carts page

Scenario: Verification of My Templates sticky header

Given User navigates to my templates page
Then verifies sticky header in My Templates page
