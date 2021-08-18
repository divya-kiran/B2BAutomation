@Regression @High @TC044
Feature: ATC044 OrderManagement Page validations

Scenario: Verifying web elements in order management page

Given User will log in as US registered Payment Term user
And User verify log in is successful
Given User navigate to Order Management page
Then User verifies Web elements in order management page
And User verifies Order history link and naviagation
Then User navigate to Order Management page
And User verifies Return history and return items link and navigations
Then User navigate to Order Management page
And user verifies Submit claim link and navigation
Then User navigate to Order Management page
And User verifies saved cart link and navigation
Then User navigate to Order Management page
And User verifies My templates link and navigation