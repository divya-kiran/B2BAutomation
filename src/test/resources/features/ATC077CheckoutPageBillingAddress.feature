@Regression @High @TC077 @Checkout
Feature: ATC077 validating payment section billing address in checkout page for Credit card user

Scenario: Validation of payment section in checkout page

Given User will log in as US registered Credit card user
And User verify log in is successful
And User will clear cart if there are any products present
Then User will Add products to cart using quick order "001A4811"
Then user navigates to cart page
And Proceeds to checkoutpage
And User will select shipping method
And User will Click on shipping delivery Save button
And User will enter credit card details for credit card details Card name "Visa" card number "4111111111111111" Exp Month "Aug" Exp Year"2028" CVV "241" CardHolder Name "AutomationUserUSCC"
And user Adds address in the billing address section
