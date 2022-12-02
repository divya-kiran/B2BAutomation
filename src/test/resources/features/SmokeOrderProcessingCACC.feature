@Smoke @Regression
Feature: ATC12 Placing an order using CA registered Credit card user

Scenario: Placing an order using CA registered Credit card user  

Given User will log in as CA registered Credit card user
And User verify log in is successful
Then User will Add products to cart using quick order "841LM"
And User will click on Mini cart flyer
And User will proceed to cart page from mini cart flyer
When User click on Checkout button in cart page
Then User Navigates to Checkout page
And I will select ship to delivery address
And User will select shipping method
And User will Click on shipping delivery Save button
And User will enter credit card details for credit card details Card name "Amex" card number "343434343434343" Exp Month "Aug" Exp Year"2028" CVV "5555" CardHolder Name "AutomationUser"
And User will click on payment section save button
Then User will fill details in review order section
And click on place order
Then User will be redirected to order confirmation page
