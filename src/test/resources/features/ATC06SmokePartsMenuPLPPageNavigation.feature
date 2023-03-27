@Smoke @Regression @ATC06
Feature: ATC06 Validating Parts Menu PLP pages

Scenario: Verification of Garage door opener parts  PLP page

Given User will log in as US registered Payment Term user
And User verify log in is successful
Then User navigates to garage door opener parts page
And Verify page by URL "c/6"
And Verify Page by title "Garage Door Opener Parts"


Scenario: Verification of Commercial door operator parts  PLP page

Given User navigates to Commercial door operator parts page
And Verify page by URL "c/8"
And Verify Page by title "Commercial Door Operator Parts"


Scenario: Verification of Gate operator parts  PLP page

Given User navigates to Gate operator parts page
And Verify page by URL "/c/9"
And Verify Page by title "Gate Operator Parts"


Scenario: Verification of Access Control parts  PLP page

Given User navigates to Access Control parts page
And Verify page by URL "/c/10"
And Verify Page by title "Telephone Entry and Access Control Parts"


Scenario: Verification of All Parts  PLP page

Given User navigates to All parts page
And Verify page by URL "/c/12"
And Verify Page by title "Parts"

