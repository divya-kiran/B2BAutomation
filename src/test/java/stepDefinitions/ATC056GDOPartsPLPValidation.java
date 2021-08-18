package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PLPPage;

public class ATC056GDOPartsPLPValidation extends BaseClass {
	PLPPage plpPage = PageFactory.initElements(driver, PLPPage.class);

	@When("^User navigates to GDO Parts PLP page$")
	public void user_navigates_to_GDO_Parts_PLP_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"c/6");
	}

	@Then("^Verifies header elements in GDO Parts PLP page$")
	public void verifies_header_elements_in_GDO_Parts_PLP_page() throws Throwable {
		isElementDisplayed(plpPage.GDOPartsTitle, true);
	    isElementDisplayed(plpPage.PriceDisclaimerPLP, true);
	    isElementDisplayed(plpPage.PLPproductcount, true);
	}

	@Then("^Verifies fourth product card and its attributes in GDO Parts PLP page$")
	public void verifies_fourth_product_card_and_its_attributes_in_GDO_Parts_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPproductimage);
		isElementDisplayed(plpPage.PLPproductimage, true);
	    isElementDisplayed(plpPage.PLPproductName, true);
	    isElementDisplayed(plpPage.PLPproductSumm, true);
	    isElementDisplayed(plpPage.PLPproductprice, true);
	    isElementDisplayed(plpPage.PLPproductQTYBOX, true);
	    isElementDisplayed(plpPage.PLPproductAddtoCartCTA, true);	
	}

	@Then("^User verifies category facet section in GDO Parts PLP page$")
	public void user_verifies_category_facet_section_in_GDO_Parts_PLP_page() throws Throwable {
		isElementDisplayed(plpPage.PLPCategory, true);
	    isElementDisplayed(plpPage.GDOPartsLightLens, true);
	    isElementDisplayed(plpPage.GDOPartsElectrical, true);
	    isElementDisplayed(plpPage.GDOPartsBrackets, true);
	    isElementDisplayed(plpPage.GDOPartsLogicBoards, true);
	}

	@Then("^User verifies Price facet section in GDO Parts PLP page$")
	public void user_verifies_Price_facet_section_in_GDO_Parts_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPCategory);
		isElementDisplayed(plpPage.PLPPriceFacet, true);
	    isElementDisplayed(plpPage.PLPPriceFacet1, true);
	    isElementDisplayed(plpPage.PLPPriceFacet2, true);
	    isElementDisplayed(plpPage.PLPPriceFacet3, true);
	}

	@Then("^user clicks on GDO Parts category facet section and verify correct resultset by count$")
	public void user_clicks_on_GDO_Parts_category_facet_section_and_verify_correct_resultset_by_count() throws Throwable {
		ScrollToElement(plpPage.PriceDisclaimerPLP);
		String productcountsGDOParts = getText(plpPage.GDOPartsLightLens);
		String[] productcounts1GDOParts = productcountsGDOParts.split("\\(");
		String productcounts2GDOParts = productcounts1GDOParts[1].substring(0,productcounts1GDOParts[1].length()-1);
		int productcountlabelGDOParts = Integer.valueOf(productcounts2GDOParts);
		jsClick(plpPage.GDOPartsLightLens);
		Thread.sleep(5000);
		String productcountstabGDOParts = getText(plpPage.PLPproductcount);
		productcountstabGDOParts = productcountstabGDOParts.substring(1, productcountstabGDOParts.length()-1);
	      int productcountintsGDOParts = Integer.valueOf(productcountstabGDOParts);
	      if (productcountintsGDOParts == 0)
	      {
	    	  throw new Exception("No products present in Search results page");
	      }
		if(productcountintsGDOParts!=productcountlabelGDOParts){
			throw new Exception("Facet count and resultant result count do not match");
		}	
	}
}

