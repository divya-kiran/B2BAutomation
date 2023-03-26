@Regression @High @TC091 @StickyHeader
Feature: ATC091 Validation Sticky header in Partner Portal site 

Scenario: Verification of PLP sticky header

Given User will log in as US registered Payment Term user
And User verify log in is successful
When User navigates to CDO PLP page
Then Verifies sticky header in PLP page
When User navigates to Gate Parts PLP page
Then Verifies sticky header in Gate Parts PLP page

##Scenario: Verification of Search results sticky header

##When User search for product "CAPXLV" in PP
##Then verifies sticky header in search results page

Scenario: Verification of Cart Page sticky header

Given user add Products to cart "p/041A0308" "p/041A5507-7C"
And user navigates to cart page
Then verifies sticky header in cart page

Scenario: Verification of Most ordered products sticky header

Given User will log in as US registered Credit card user
And User verify log in is successful
When User navigates to Most ordered products page
Then verifies sticky header in Most ordered products page
