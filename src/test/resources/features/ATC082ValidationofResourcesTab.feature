@Regression @High @TC082
Feature: ATC082 Resources Tab Link tab validation

Scenario: Resources Tab sales and marketing link validation

Given User will log in as US registered Credit card user
And User verify log in is successful
Then Hover on resource tab and verify sales and marketing header links

Scenario: Resorces Tab Technical header link validation

Given User is on homepage
Then Hover on resource tab and verify Technical header links

Scenario: Resource tab training link validation

Given User is on homepage
Then Hover on resource tab and verify training header link

Scenario: Resource Tab safety link validation

Given User is on homepage
Then Hover on resource tab and verify safety header link
