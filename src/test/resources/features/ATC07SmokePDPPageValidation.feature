@Smoke @ATC07
Feature: ATC07 Validating PDP pages

Scenario: Verification PDP page for single SKU product

Given User will log in as US registered Payment Term user
And User verify log in is successful
Then User will navigate to single SKU product PDP page "p/CPS-UN4"
And Verify Product Name Price CTA Summary Gallery Image Price disclaimer for single SKU

Scenario: Verification PDP page for GDO product

Given User will navigate to GDO product PDP page "p/8010"
And Verify Product Name Price CTA Rail Length Gallery Image Price disclaimer for GDO

Scenario: Verification PDP page for CDO product

Given User will navigate to CDO product PDP page "p/T"
And Verify Product Name Price CTA Summary Gallery Image Price disclaimer for CDO
And Verify Templates Configure and install section for CDO products
