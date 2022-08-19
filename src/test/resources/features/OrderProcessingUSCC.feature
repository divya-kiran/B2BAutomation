@Regression @High @PlaceOrder
Feature: ATC014 Placing an order using US registered Credit card user

Scenario: Placing an order using US registered Credit card user  

Given User will log in as US registered Credit card user
And User verify log in is successful
And User will clear cart if there are any products present
Then User will Add products to cart using quick order "041D9042"
And User will navigate to PDP page of product "p/8500"
And User will Add product to cart from PDP page
And User will click on Mini cart flyer
And User will proceed to cart page from mini cart flyer
When User click on Checkout button in cart page
Then User Navigates to Checkout page
And I will select ship to delivery address
And User will select shipping method
And User will Click on shipping delivery Save button
And User will enter credit card details for credit card details Card name "Visa" card number "4111111111111111" Exp Month "Aug" Exp Year"2028" CVV "241" CardHolder Name "AutomationUserUSCC"
And User will click on payment section save button
Then User will fill details in review order section
And click on place order
Then User will be redirected to order confirmation page
