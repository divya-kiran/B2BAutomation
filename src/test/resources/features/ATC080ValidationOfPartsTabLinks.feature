@Regression @High @TC080
Feature: ATC080 Parts Tab header validation

Scenario: GDO Parts header link validation

Given User will log in as US registered Credit card user
And User verify log in is successful
Then Hover on parts tab and verify GDO parts header link
And Verify GDO parts page by title and URL

Scenario: CDO parts header link validation

Given User is on homepage
Then Hover on parts tab and verify CDO parts header link
And Verify CDO parts page by title and URL

Scenario: Gate operators parts link validation

Given User is on homepage
Then Hover on parts tab and verify Gate operators parts header link
And Verify gate operators parts page by title and URL

Scenario: Access control parts link validation

Given User is on homepage
Then Hover on parts tab and verify Access control parts header link
And Verify Access control parts page by title and URL

Scenario: All Parts link validation

Given User is on homepage
Then Hover on parts tab and verify All Parts header link
And Verify All Parts page by title and URL

Scenario: Parts Prices List link validation

Given User is on homepage
Then Hover on parts tab and verify Parts Prices List header link
And Verify Parts Prices List page by title and URL