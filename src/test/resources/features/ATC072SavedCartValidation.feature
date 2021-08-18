@Regression @High @TC072 @Cart
Feature: ATC072 Saved Cart page validation

Scenario: Validation of Saved cart page web elements

Given User will log in as US registered Payment Term user
And User verify log in is successful
Then User will Add products to cart using quick order "001A4811"
Then user navigates to cart page
And Save existing cart

Scenario: Validation of actions in saved cart page

Given user is on saved carts pages
Then Verfies saved cart page web elements
And verify sort by Drop down 
And Verify first saved cart card details
And user clicks on saved cart restore button and validates restore cart pop up
And user clicks on delete saved cart button

