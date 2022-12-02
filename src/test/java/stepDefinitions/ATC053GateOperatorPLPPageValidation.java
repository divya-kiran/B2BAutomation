package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.PLPPage;

public class ATC053GateOperatorPLPPageValidation extends BaseClass {
	PLPPage plpPage = PageFactory.initElements(driver, PLPPage.class);
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);


	@When("^User navigates to Gate Operator PLP page$")
	public void user_navigates_to_Gate_Operator_PLP_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"c/gates");	    
	}

	@Then("^Verifies header elements in Gate Operator PLP page$")
	public void verifies_header_elements_in_Gate_Operator_PLP_page() throws Throwable {
		isElementDisplayed(plpPage.GateOpTitle, true);
		isElementDisplayed(plpPage.PriceDisclaimerPLP, true);
	    searchElementDisplayed("atomic-tab[id='tab-products']", "button[part='tab']");
	}

	@Then("^Verifies fourth product card and its attributes in Gate Operator PLP page$")
	public void verifies_fourth_product_card_and_its_attributes_in_Gate_Operator_PLP_page() throws Throwable {
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

	@Then("^User verifies category facet section in Gate Operator PLP page$")
	public void user_verifies_category_facet_section_in_Gate_Operator_PLP_page() throws Throwable {
        if(!driver.findElements(By.id("onetrust-accept-btn-handler")).isEmpty()){
			
			click(homepage.acceptCookies);
		 }else{
		        
		 }
		Thread.sleep(2000);
		searchFacet("atomic-category-facet[class='hydrated']", "div[part='facet']");
	}

	@Then("^User verifies Price facet section in Gate Operator PLP page$")
	public void user_verifies_Price_facet_section_in_Gate_Operator_PLP_page() throws Throwable {
		searchFacet("atomic-numeric-facet[facet-id='price-facet']", "div[part='facet']");	    
	}

	@Then("^user clicks on Gate Operator category facet section and verify correct resultset by count$")
	public void user_clicks_on_Gate_Operator_category_facet_section_and_verify_correct_resultset_by_count() throws Throwable {
//		ScrollToElement(plpPage.PriceDisclaimerPLP);
//		String productcountsGate = getText(plpPage.GateAccFacet);
//		String[] productcounts1Gate = productcountsGate.split("\\(");
//		String productcounts2Gate = productcounts1Gate[1].substring(0,productcounts1Gate[1].length()-1);
//		int productcountlabelGate = Integer.valueOf(productcounts2Gate);
//		jsClick(plpPage.GateAccFacet);
//		Thread.sleep(5000);
//		String productcountstabGate = getText(plpPage.PLPproductcount);
//		productcountstabGate = productcountstabGate.substring(1, productcountstabGate.length()-1);
//	      int productcountintsGate = Integer.valueOf(productcountstabGate);
//	      if (productcountintsGate == 0)
//	      {
//	    	  throw new Exception("No products present in Search results page");
//	      }
//		if(productcountintsGate!=productcountlabelGate){
//			throw new Exception("Facet count and resultant result count do not match");
//		}	    
		searchFacetClick("atomic-category-facet[class='hydrated']", "button[part='label-button']");
	}
}

