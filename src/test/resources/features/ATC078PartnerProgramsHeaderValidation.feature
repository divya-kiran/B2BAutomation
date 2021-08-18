@Regression @High @TC078
Feature: ATC078 Partner program header validation

Scenario: Partner Connect validation

Given User will log in as US registered Credit card user
And User verify log in is successful
Then verify Partner connect header
And click on About Partner Connect link and verify page

Scenario: Partner Connect validation

Given User is on homepage
Then verify partner rewards header
And click on connect to MyQ and Key link and verify page
And click on connect to key for technicians link and verify page

Scenario: Partner discounts validation

Given User is on homepage
Then verify partner discounts header
And click on quantity discount and free frieght link and verify page

