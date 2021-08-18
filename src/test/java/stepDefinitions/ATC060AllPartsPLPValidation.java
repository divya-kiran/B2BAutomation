package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PLPPage;

public class ATC060AllPartsPLPValidation extends BaseClass {
	PLPPage plpPage = PageFactory.initElements(driver, PLPPage.class);

	@When("^User navigates to ALL Parts Parts PLP page$")
	public void user_navigates_to_ALL_Parts_Parts_PLP_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"c/12");
	}

	@Then("^Verifies header elements in ALL Parts Parts PLP page$")
	public void verifies_header_elements_in_ALL_Parts_Parts_PLP_page() throws Throwable {
		isElementDisplayed(plpPage.AllPartsTitle, true);
	    isElementDisplayed(plpPage.PriceDisclaimerPLP, true);
	    isElementDisplayed(plpPage.PLPproductcount, true);
	}

	@Then("^Verifies fourth product card and its attributes in ALL Parts Parts PLP page$")
	public void verifies_fourth_product_card_and_its_attributes_in_ALL_Parts_Parts_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPproductimage);
		isElementDisplayed(plpPage.PLPproductimage, true);
	    isElementDisplayed(plpPage.PLPproductName, true);
	    isElementDisplayed(plpPage.PLPproductSumm, true);
	    isElementDisplayed(plpPage.PLPproductprice, true);
	    isElementDisplayed(plpPage.PLPproductQTYBOX, true);
	    isElementDisplayed(plpPage.PLPproductAddtoCartCTA, true);
	}

	@Then("^User verifies category facet section in ALL Parts Parts PLP page$")
	public void user_verifies_category_facet_section_in_ALL_Parts_Parts_PLP_page() throws Throwable {
		isElementDisplayed(plpPage.PLPCategory, true);
	    isElementDisplayed(plpPage.CDOPartsFacet, true);
	    isElementDisplayed(plpPage.GatePartsFacet, true); 
	}

	@Then("^User verifies Price facet section in ALL Parts Parts PLP page$")
	public void user_verifies_Price_facet_section_in_ALL_Parts_Parts_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPCategory);
		isElementDisplayed(plpPage.PLPPriceFacet, true);
	    isElementDisplayed(plpPage.PLPPriceFacet1, true);
	    isElementDisplayed(plpPage.PLPPriceFacet2, true);
	    isElementDisplayed(plpPage.PLPPriceFacet3, true);
	}

	@Then("^user clicks on ALL Parts Parts category facet section and verify correct resultset by count$")
	public void user_clicks_on_ALL_Parts_Parts_category_facet_section_and_verify_correct_resultset_by_count() throws Throwable {
		ScrollToElement(plpPage.PriceDisclaimerPLP);
		String productcountsALLParts = getText(plpPage.CDOPartsFacet);
		String[] productcounts1ALLParts = productcountsALLParts.split("\\(");
		String productcounts2ALLParts = productcounts1ALLParts[1].substring(0,productcounts1ALLParts[1].length()-1);
		int productcountlabelALLParts = Integer.valueOf(productcounts2ALLParts);
		jsClick(plpPage.CDOPartsFacet);
		Thread.sleep(5000);
		String productcountstabALLParts = getText(plpPage.PLPproductcount);
		productcountstabALLParts = productcountstabALLParts.substring(1, productcountstabALLParts.length()-1);
	      int productcountintsALLParts = Integer.valueOf(productcountstabALLParts);
	      if (productcountintsALLParts == 0)
	      {
	    	  throw new Exception("No products present in Search results page");
	      }
		if(productcountintsALLParts!=productcountlabelALLParts){
			throw new Exception("Facet count and resultant result count do not match");
		}	
	}
}

