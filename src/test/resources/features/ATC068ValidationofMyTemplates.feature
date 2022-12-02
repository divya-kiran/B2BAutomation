@Regression @High @Templates @TC068
Feature: ATC068 Validation of My templates page

Scenario: Validation of my templates page

Given User will log in as US registered Payment Term user
And User verify log in is successful
Then User navigates to my templates page
And Verifies header elements in my templates page
And verifies first template card details
And click on show detail and verify details
And click on template name and verify user navigated to PDP page successfully
