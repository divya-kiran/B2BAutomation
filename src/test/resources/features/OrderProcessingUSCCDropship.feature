@Regression @High @PlaceOrder @TC015
Feature: ATC015 Placing an drop ship order using US registered Credit card user

Scenario: Placing an drop ship order using US registered Credit card user  

Given User will log in as US registered Credit card user
And User verify log in is successful
And User will clear cart if there are any products present
And User will navigate to PDP page of product "p/CSW200501UL"
And User will Add product to cart from PDP page
And User will navigate to PDP page of product "p/BH505L5R3"
And User will select options from install step in CDO PDP page
And User will Add product to cart from CDO PDP page
And User will navigate to homepage
And User will click on Mini cart flyer
And User will proceed to cart page from mini cart flyer
When User click on Checkout button in cart page
Then User Navigates to Checkout page
And User will click on dropship address link
And User will add US dropship address
And User will select shipping method
And User will scroll to delivery save and click on save
And User will enter credit card details for credit card details Card name "Discover" card number "6011000990139424" Exp Month "Aug" Exp Year"2028" CVV "241" CardHolder Name "AutomationUserUSCC"
And User will click on payment section save button
Then User will fill details in review order section
And click on place order
Then User will be redirected to order confirmation page

