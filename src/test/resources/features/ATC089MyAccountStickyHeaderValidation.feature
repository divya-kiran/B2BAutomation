@Regression @High @TC089 @StickyHeader
Feature: ATC089 Sticky header validation in my account page

Scenario: Validation of sticky navigation in My Account section

Given User will log in as US registered Payment Term user
And User verify log in is successful
Given User navigate to myaccount page
And Scroll to bottom for sticky navigation
And verify sticky navigation in My account page
