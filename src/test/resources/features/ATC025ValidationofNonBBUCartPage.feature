@Regression @High @BBU @TC025 
Feature: ATC025 Non BBU validations on cart page

Scenario: Verify when cart contains one non BBU product and other products

Given User will log in as US NonBBU user
And User verify log in is successful
And User will clear non BBU cart if there are any products present
Then User will Add products to cart using quick order "041D9042"
And User will navigate to PDP page of product "p/8155W"
And User will Add BBU product to cart from PDP page
And User will click on Mini cart flyer
And User will proceed to cart page from mini cart flyer
Then User verifies PopUP for single non BBU product

Scenario:  Verify when cart contains multiple non BBU product and other products

Given User will log in as US NonBBU user
And User verify log in is successful
And User will clear non BBU cart if there are any products present
Then User will Add products to cart using quick order "041D9042"
And User will navigate to PDP page of product "p/8155W"
And User will Add BBU product to cart from PDP page
And User will navigate to PDP page of product "p/8165W"
And User will Add BBU product to cart from PDP page
And User will click on Mini cart flyer
And User will proceed to cart page from mini cart flyer
Then User verifies PopUP for multiple non BBU products

Scenario:  Verify when cart contains only non BBU products

Given User will log in as US NonBBU user
And User verify log in is successful
And User will clear non BBU cart if there are any products present
And User will navigate to PDP page of product "p/8165W"
And User will Add BBU product to cart from PDP page
And User will click on Mini cart flyer
And User will proceed to cart page from mini cart flyer
Then User verifies PopUP for only non BBU products

