@Smoke @ATC10 @Regression
Feature: ATC10 Verifying Order management section - Include saved carts, Warranty claim and RGA

Scenario: Validation of order management

Given User will log in as US registered Payment Term user
And User verify log in is successful
Then User will navigate to order management page
And User verifies elements present in order management page

Scenario: Validation of Saved Cart page

Given User will navigate to order management page
And user navigates to saved cart page
Then User verifies elements in saved cart page

Scenario: Validation of Order history page

Given User will navigate to order management page
And user navigates to Order history page
Then User verifies elements in Order history page
And User clicks on the first order present in order history page
And User verifies order history detail page elements

Scenario: Validation of Warranty claim page

Given User will navigate to order management page
And user navigates to Warranty claim  page
And user clicks on check box
Then User verifies main elements in Warranty claim page

Scenario:  Validation of RGA submission page

Given User will navigate to order management page
And user navigates to RGA submission  page
Then User verifies main elements in RGA submission page
