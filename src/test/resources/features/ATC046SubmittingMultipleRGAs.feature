@Regression @Medium @RGA @TC046
Feature: ATC046 RGA page validation with multiple returns

Scenario: Submission of multiple RGAs

Given User will log in as US registered Payment Term user
And User verify log in is successful
Given User navigate to RGA page
And User adds address in RGA page
Then User fills all mandatory fields in RGA form
And User clicks on save item button and click on add another RGA button
And user fills RGA for another item to return
And User clicks on Submit return items and verifies success message
