@Regression @High @TC094 @GuestUser
Feature: ATC094 behavioral validation of guest user pages

Scenario: Verification of HomePage for guest user

Given User will log in as US Guest user
And User verify log in is successful
Then user verifes order history link is not displayed in homepage
And user verifies partner connect link is not displayed in homepage
Given User navigate to myaccount page
Then user verifies profile Section Name and contact web elements for guest user
And user verifies profile Section Update Password web elements

Scenario: Verification of checkout page for guest user

Then User will Add products to cart using quick order "041D9042"
Then user navigates to cart page
When User click on Checkout button in cart page
Then User Navigates to Checkout page
And verify add drop ship address is not displayed in checkout page

Scenario: Verification of search text box results for guest user

Given User is on HomePage
When User enter text into product search box "8500WMC" 
And Verify page by URL "/searchResult#q=8500WMC&tab=products"
Then Verify Search results page header elements
And verify products tab is displaying results