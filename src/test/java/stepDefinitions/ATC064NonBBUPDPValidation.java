package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PDPPage;

public class ATC064NonBBUPDPValidation extends BaseClass {
	PDPPage pdpPage = PageFactory.initElements(driver, PDPPage.class);

	@Then("^User clicks on click here for more information in non BBU PDP page$")
	public void user_clicks_on_click_here_for_more_information_in_non_BBU_PDP_page() throws Throwable {
	    jsClick(pdpPage.NonBBUClickHere);
	    Thread.sleep(2000);
	}

	@Then("^user verifies elements in Non BBU pop up section$")
	public void user_verifies_elements_in_Non_BBU_pop_up_section() throws Throwable {
		isElementDisplayed(pdpPage.CA969Heading, true);
		isElementDisplayed(pdpPage.WhatYouHeadingNonBBU, true);
		isElementDisplayed(pdpPage.LMCHeadingNonBBU, true);
		driver.navigate().to(configFileReader.getApplicationUrl());
	}
}

