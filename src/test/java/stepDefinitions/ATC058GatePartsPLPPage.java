package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PLPPage;

public class ATC058GatePartsPLPPage extends BaseClass {
	PLPPage plpPage = PageFactory.initElements(driver, PLPPage.class);

	@When("^User navigates to Gate Parts PLP page$")
	public void user_navigates_to_Gate_Parts_PLP_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"c/9");	    
	}

	@Then("^Verifies header elements in Gate Parts PLP page$")
	public void verifies_header_elements_in_Gate_Parts_PLP_page() throws Throwable {
		isElementDisplayed(plpPage.GatePartsTitle, true);
	    isElementDisplayed(plpPage.PriceDisclaimerPLP, true);
	    isElementDisplayed(plpPage.PLPproductcount, true);	    
	}

	@Then("^Verifies fourth product card and its attributes in Gate Parts PLP page$")
	public void verifies_fourth_product_card_and_its_attributes_in_Gate_Parts_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPproductimage);
		isElementDisplayed(plpPage.PLPproductimage, true);
	    isElementDisplayed(plpPage.PLPproductName, true);
	    isElementDisplayed(plpPage.PLPproductSumm, true);
	    isElementDisplayed(plpPage.PLPproductprice, true);
	    isElementDisplayed(plpPage.PLPproductQTYBOX, true);
	    isElementDisplayed(plpPage.PLPproductAddtoCartCTA, true);	    
	}

	@Then("^User verifies category facet section in Gate Parts PLP page$")
	public void user_verifies_category_facet_section_in_Gate_Parts_PLP_page() throws Throwable {
		explicitWaitVisible(plpPage.PLPCategory);
		isElementDisplayed(plpPage.PLPCategory, true);
	    isElementDisplayed(plpPage.GatePartsElectrical, true);
	    isElementDisplayed(plpPage.GatePartsBrackets, true);
	    isElementDisplayed(plpPage.GatePartsPanels, true);
	    isElementDisplayed(plpPage.GatePartsLogicBoards, true);
	}

	@Then("^User verifies Price facet section in Gate Parts PLP page$")
	public void user_verifies_Price_facet_section_in_Gate_Parts_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPCategory);
		isElementDisplayed(plpPage.PLPPriceFacet, true);
	    isElementDisplayed(plpPage.PLPPriceFacet1, true);
	    isElementDisplayed(plpPage.PLPPriceFacet2, true);
	    isElementDisplayed(plpPage.PLPPriceFacet3, true);	    
	}

	@Then("^user clicks on Gate Parts category facet section and verify correct resultset by count$")
	public void user_clicks_on_Gate_Parts_category_facet_section_and_verify_correct_resultset_by_count() throws Throwable {
		ScrollToElement(plpPage.PriceDisclaimerPLP);
		String productcountsGateParts = getText(plpPage.GatePartsElectrical);
		String[] productcounts1GateParts = productcountsGateParts.split("\\(");
		String productcounts2GateParts = productcounts1GateParts[1].substring(0,productcounts1GateParts[1].length()-1);
		int productcountlabelGateParts = Integer.valueOf(productcounts2GateParts);
		jsClick(plpPage.GatePartsElectrical);
		Thread.sleep(5000);
		String productcountstabGateParts = getText(plpPage.PLPproductcount);
		productcountstabGateParts = productcountstabGateParts.substring(1, productcountstabGateParts.length()-1);
	      int productcountintsGateParts = Integer.valueOf(productcountstabGateParts);
	      if (productcountintsGateParts == 0)
	      {
	    	  throw new Exception("No products present in Search results page");
	      }
		if(productcountintsGateParts!=productcountlabelGateParts){
			throw new Exception("Facet count and resultant result count do not match");
		}	    
	}
}

