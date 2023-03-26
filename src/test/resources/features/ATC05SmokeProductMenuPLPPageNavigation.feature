@Smoke @High @PMenuPLP @Regression @ATC05
Feature: ATC05 Validating Product Menu PLP pages

Scenario: Verification of Garage door opener systems  PLP page

Given User will log in as US registered Payment Term user
And User verify log in is successful
Then User navigates to garage door opener systems
And Verify page by URL "/c/15-11"
And Verify Page by title "Garage Door Opener Systems"
And verify Page by product count

Scenario: Verification of Commercial door operator systems  PLP page

Then User navigates to Commercial door operator systems
And Verify page by URL "/c/20-11"
And Verify Page by title "Commercial Door Operator Systems"
And verify Page by product count

Scenario: Verification of Gate operator systems  PLP page

Given User navigates to Gate operator systems
And Verify page by URL "/c/gates"
##And Verify Page by title "Test title"
And verify Page by product count

Scenario: Verification of Access Control systems  PLP page

Given User navigates to Access Control systems
And Verify page by URL "/c/access"
And Verify Page by title "Access Control Systems"
And verify Page by product count

Scenario: Verification of All accessories  PLP page

Given User navigates to All accessories
And Verify page by URL "/c/accessories"
And Verify Page by title "Accessories"
And verify Page by product count

Scenario: Verification of My Most ordered products page

Given User will log in as US registered Credit card user
And User verify log in is successful
Given User navigates to favorite products
And Verify page by URL "favorite-products"
And verify Page by product count
