@Regression @High @PDP
Feature: ATC067 creation and deletion of CDO template

Scenario: Creation and deletion of CDO template

Given User will log in as US registered Payment Term user
And User verify log in is successful
Then User navigates to PDP page of product "T"
Then Verifies elements in configure section of CDO PDP Page
And Click on Save template in CDO PDP page
And Fill details in Save template form and click on Save
And verify success toast message in CDO PDP Page
And Navigate to My templates and verify template created successfully
