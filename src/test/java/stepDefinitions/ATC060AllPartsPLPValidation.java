package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.PLPPage;

public class ATC060AllPartsPLPValidation extends BaseClass {
	PLPPage plpPage = PageFactory.initElements(driver, PLPPage.class);
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);

	@When("^User navigates to ALL Parts Parts PLP page$")
	public void user_navigates_to_ALL_Parts_Parts_PLP_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"c/12");
	}

	@Then("^Verifies header elements in ALL Parts Parts PLP page$")
	public void verifies_header_elements_in_ALL_Parts_Parts_PLP_page() throws Throwable {
		isElementDisplayed(plpPage.AllPartsTitle, true);
		isElementDisplayed(plpPage.PriceDisclaimerPLP, true);
	    searchElementDisplayed("atomic-tab[id='tab-products']", "button[part='tab']");
	}

	@Then("^Verifies fourth product card and its attributes in ALL Parts Parts PLP page$")
	public void verifies_fourth_product_card_and_its_attributes_in_ALL_Parts_Parts_PLP_page() throws Throwable {
        if(!driver.findElements(By.id("onetrust-accept-btn-handler")).isEmpty()){
			
			click(homepage.acceptCookies);
		 }else{
		        
		 }
		Thread.sleep(3000);
		searchProductCardDetails("atomic-result-list[class='hydrated']", "div > div > div:nth-child(1) > a", "atomic-field-condition[class='field hydrated']");
		searchProductCardDetails("atomic-result-list[class='hydrated']", "div > div > div:nth-child(1) > a", "atomic-result-section-title[class='hydrated']");
		searchProductCardDetails("atomic-result-list[class='hydrated']", "div > div > div:nth-child(1) > a", "atomic-result-section-title-metadata[class='hydrated']");
		searchProductCardDetails("atomic-result-list[class='hydrated']", "div > div > div:nth-child(1) > a", "atomic-result-section-actions[class='hydrated']");	
	}

	@Then("^User verifies category facet section in ALL Parts Parts PLP page$")
	public void user_verifies_category_facet_section_in_ALL_Parts_Parts_PLP_page() throws Throwable {
         if(!driver.findElements(By.id("onetrust-accept-btn-handler")).isEmpty()){
			
			click(homepage.acceptCookies);
		 }else{
		        
		 }
		Thread.sleep(2000);
		searchFacet("atomic-category-facet[class='hydrated']", "div[part='facet']");
	}

	@Then("^User verifies Price facet section in ALL Parts Parts PLP page$")
	public void user_verifies_Price_facet_section_in_ALL_Parts_Parts_PLP_page() throws Throwable {
		searchFacet("atomic-numeric-facet[facet-id='price-facet']", "div[part='facet']");
	}

	@Then("^user clicks on ALL Parts Parts category facet section and verify correct resultset by count$")
	public void user_clicks_on_ALL_Parts_Parts_category_facet_section_and_verify_correct_resultset_by_count() throws Throwable {
		searchFacetClick("atomic-category-facet[class='hydrated']", "button[part='label-button']");
	}
}

