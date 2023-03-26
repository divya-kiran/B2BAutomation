@Regression @High @OrderHistory @ATC021
Feature: ATC021 Validation of order history page content for US registered user

Scenario: Validating order history page

Given User will log in as US registered Payment Term user
And User verify log in is successful
Given User clicks on Order Status link in Homepage
And Verify page by URL "my-account/orders"
And Verify Page by title "LiftMaster Partner Portal"
And Verfies order history heading
And verifies PO number search box
And Verifies order total count
And verifies sorting toggle button
And verifies show more link in order history page
And Verify Order card elements

Scenario: Validation of Filter option in order history page

Given User clicks on Order Status link in Homepage
Then User click on Filter option in order history page
And Verifies filter by status menu
And Verifies filter by orders within Menu
And Verifies filter GO button operations

Scenario: Validation of Ship To Filter option in order history page

Given User will log in as user having ship to accounts
And User verify log in is successful
Given User clicks on Order Status link in Homepage
Then User clicks on shipto filter option
And Verifies shipto accounts menu
And Verifies ShipTo GO button operations