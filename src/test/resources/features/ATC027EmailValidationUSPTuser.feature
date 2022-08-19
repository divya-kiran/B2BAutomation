@Regression @High @EmailValidation @TC027 @TestWed
Feature: ATC027 Validating order confirmation email for US registered Payment terms user

Scenario: Validating order confirmation email for US registered Payment terms user  

Given User will log in as US registered Payment Term user
And User verify log in is successful
And User will clear cart if there are any products present
And User will navigate to PDP page of product "p/02-51227"
And User will Add product to cart from PDP page
And User will click on Mini cart flyer
And User will proceed to cart page from mini cart flyer
When User click on Checkout button in cart page
Then User Navigates to Checkout page
And User will select shipping method
And User will Click on shipping delivery Save button
Then User will fill details in review order section
And click on place order
Then User will be redirected to order confirmation page
And user naviagates to mailinator website
And navigates to user inbox "automationuseruspt"
And verifies email receipt and navigate to mail body
And verifies web elements in email confirmation body
