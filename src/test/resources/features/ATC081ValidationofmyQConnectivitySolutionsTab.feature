@Regression @High @TC081
Feature: ATC081 myQ Connectivity Solutions header tab validation

Scenario: myq Smart Home header link validation

Given User will log in as US registered Credit card user
And User verify log in is successful
Then Hover on parts tab and verify myq Smart Home header link
And Verify myq Smart Home page by title and URL

Scenario: In Garage Delivery header link validation

Given User is on homepage
Then Hover on parts tab and verify In Garage Delivery header link
And Verify In Garage Delivery page by title and URL

Scenario: myQ Smart Community Access link validation

Given User is on homepage
Then Hover on parts tab and verify myQ Smart Community Access header link
And Verify myQ Smart Community Access page by title and URL

Scenario: myQ Smart Facility Access link validation

Given User is on homepage
Then Hover on parts tab and verify myQ Smart Facility Access header link
And Verify myQ Smart Facility Access page by title and URL
