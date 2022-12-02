@Regression @High @TC076
Feature: ATC076 validating payment section in checkout page for Credit card user

Scenario: Validation of payment section in checkout page

Given User will log in as US registered Credit card user
And User verify log in is successful
And User will clear cart if there are any products present
Then User will Add products to cart using quick order "001A4811"
Then user navigates to cart page
And Proceeds to checkoutpage
And User will select shipping method
And User will Click on shipping delivery Save button
And User will enter credit card details for credit card details Card name "Visa" card number "4444333322221111" Exp Month "Aug" Exp Year"2028" CVV "241" CardHolder Name "AutomationUserUSCC"
And User will click on payment section save button
Then User clicks on payment label and get back to payment section
And User will enter credit card details for credit card details Card name "Amex" card number "343434343434343" Exp Month "Aug" Exp Year"2028" CVV "5555" CardHolder Name "AutomationUser"
And User will click on payment section save button
Then User clicks on payment label and get back to payment section
And User will enter credit card details for credit card details Card name "Master-Card" card number "5555555555554444" Exp Month "Aug" Exp Year"2028" CVV "241" CardHolder Name "AutomationUserUSCC"
And User will click on payment section save button
Then User clicks on payment label and get back to payment section
And User will enter credit card details for credit card details Card name "Discover" card number "6011000990139424" Exp Month "Aug" Exp Year"2028" CVV "241" CardHolder Name "AutomationUserUSCC"
And User will click on payment section save button
Then User clicks on payment label and get back to payment section
