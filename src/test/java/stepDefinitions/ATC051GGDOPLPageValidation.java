package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.PLPPage;

public class ATC051GGDOPLPageValidation extends BaseClass {
	PLPPage plpPage = PageFactory.initElements(driver, PLPPage.class);
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);

	@When("^User navigates to GDO PLP page$")
	public void user_navigates_to_GDO_PLP_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"Products/Garage-Door-Opener-Systems/c/15-11");	    
	}

	@Then("^Verifies header elements in GDO PLP page$")
	public void verifies_header_elements_in_GDO_PLP_page() throws Throwable {
	    isElementDisplayed(plpPage.GDOTitle, true);
	    isElementDisplayed(plpPage.PriceDisclaimerPLP, true);
	    searchElementDisplayed("atomic-tab[id='tab-products']", "button[part='tab']");
	}

	@Then("^Verifies fourth product card and its attributes in GDO PLP page$")
	public void verifies_fourth_product_card_and_its_attributes_in_GDO_PLP_page() throws Throwable {
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

	@Then("^user verifies product card click on PLP is navigating to PDP page by link$")
	public void user_verifies_product_card_click_on_PLP_is_navigating_to_PDP_page_by_link() throws Throwable {
	    searchProductCardClick("atomic-result-list[class='hydrated']", "div > div > div:nth-child(1) > a");
	    verifypageURL("/p/");
	}

	@Then("^User verifies category facet section in GDO PLP page$")
	public void user_verifies_category_facet_section_in_GDO_PLP_page() throws Throwable {
         if(!driver.findElements(By.id("onetrust-accept-btn-handler")).isEmpty()){
			
			click(homepage.acceptCookies);
		 }else{
		        
		 }
		Thread.sleep(2000);
		searchFacet("atomic-category-facet[class='hydrated']", "div[part='facet']");
	}

	@Then("^User verifies Price facet section in GDO PLP page$")
	public void user_verifies_Price_facet_section_in_GDO_PLP_page() throws Throwable {
		searchFacet("atomic-numeric-facet[facet-id='price-facet']", "div[part='facet']");   
	}
	
	@Then("^User verifies Rail Length facet section in GDO PLP page$")
	public void Userverifies_Rail_Length_facet_section_in_GDO_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPPriceFacet);
		isElementDisplayed(plpPage.PLPRailLength, true);
	    isElementDisplayed(plpPage.PLPRailLength1, true);
	    isElementDisplayed(plpPage.PLPRailLength2, true);
	    isElementDisplayed(plpPage.PLPRailLength3, true);   
	}

	@Then("^user clicks on category facet section and verify correct resultset by count$")
	public void user_clicks_on_category_facet_section_and_verify_correct_resultset_by_count() throws Throwable {
		searchFacetClick("atomic-category-facet[class='hydrated']", "button[part='label-button']");
	}
	
	@Then("^user verifes show more link in PLP page$")
	public void user_verifes_show_more_link_in_GDO_PLP_page() throws Throwable {
		scrollBottom();
	    searchElementDisplayed("atomic-load-more-results[class='hydrated']", "span[class='truncate']");
	    searchClick("atomic-load-more-results[class='hydrated']", "span[class='truncate']");
	}
}
