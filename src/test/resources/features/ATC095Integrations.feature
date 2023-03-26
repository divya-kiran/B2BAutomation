@Regression @High @TC095 @Integrations
Feature: ATC095 validation of Partner Portal integrations

Scenario: Verification of balihoo integration

Given User will log in as US registered Payment Term user
And User verify log in is successful
Then User navigates to co op advertising page
And verfies balihoo CTA

Scenario: Verification of Nvision/LiftMaster store integration

Given User navigates to Liftmaster Merchandise page
Then verifies shop now button
And verifies na corporation web page

##Scenario: Verification of frosch/rewards integration

##Given User navigates to partner connect page
##Then click on liftmaster partner rewards
##And verifies partner rewards page

##Scenario: Verification of support page

##Given User navigates to support page
##And verifies partner support page

Scenario: Verification of captcha integration

Given User navigates to guest register page
Then verifies captch option in registration page


