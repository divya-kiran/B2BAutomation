@Regression @High @EmailValidation
Feature: ATC029 Validating order confirmation email for CA registered Payment Terms user

Scenario: Validating order confirmation email for CA registered Payment Terms user  

Given User will log in as CA registered Payment Term user
And User verify log in is successful
And User will clear cart if there are any products present
And User will navigate to PDP page of product "p/041A5483C"
And User will Add product to cart from PDP page
And User will navigate to PDP page of product "p/10-2109"
And User will Add product to cart from PDP page
And User will click on Mini cart flyer
And User will proceed to cart page from mini cart flyer
When User click on Checkout button in cart page
Then User Navigates to Checkout page
And User will click on dropship address link
And User will add CA dropship address
And User will select shipping method
And User will scroll to delivery save and click on save
Then User will fill details in review order section
And click on place order
Then User will be redirected to order confirmation page
And user naviagates to mailinator website
And navigates to user inbox "automationusercapt"
And verifies email receipt and navigate to mail body
And verifies web elements in email confirmation body
