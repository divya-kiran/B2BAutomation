@Regression @High @OrderHistory
Feature: ATC022 Validation of order history and order detail page content for CA registered user

Scenario: Validating order history page

Given User will log in as CA registered Payment Term user
And User verify log in is successful
Given User clicks on Order Status link in Homepage
And Verify page by URL "my-account/orders"
And Verify Page by title "LiftMaster Partner Portal"
And Verfies order history heading
And verifies PO number search box
And Verifies order total count
And verifies sorting toggle button
And Verify Order card elements

Scenario: Validation of Filter option in order history page

Given User clicks on Order Status link in Homepage
Then User click on Filter option in order history page
And Verifies filter by status menu
And Verifies filter by orders within Menu
And Verifies filter GO button operations

Scenario: Validate order history detail page

Given User clicks on Order Status link in Homepage
And User navigates to first order in the order history page
Then User verifies header elements
And Verifies delivery address
And Verifies product cards
And verify web elemetns in order history detail page
And Verify return items link in order history page
