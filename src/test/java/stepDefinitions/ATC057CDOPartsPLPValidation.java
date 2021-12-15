package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PLPPage;

public class ATC057CDOPartsPLPValidation extends BaseClass {
	PLPPage plpPage = PageFactory.initElements(driver, PLPPage.class);

	@When("^User navigates to CDO Parts PLP page$")
	public void user_navigates_to_CDO_Parts_PLP_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"c/8");
	}

	@Then("^Verifies header elements in CDO Parts PLP page$")
	public void verifies_header_elements_in_CDO_Parts_PLP_page() throws Throwable {
		isElementDisplayed(plpPage.CDOPartsTitle, true);
	    isElementDisplayed(plpPage.PriceDisclaimerPLP, true);
	    isElementDisplayed(plpPage.PLPproductcount, true);
	}

	@Then("^Verifies fourth product card and its attributes in CDO Parts PLP page$")
	public void verifies_fourth_product_card_and_its_attributes_in_CDO_Parts_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPproductimage);
		isElementDisplayed(plpPage.PLPproductimage, true);
	    isElementDisplayed(plpPage.PLPproductName, true);
	    isElementDisplayed(plpPage.PLPproductSumm, true);
	    isElementDisplayed(plpPage.PLPproductprice, true);
	    isElementDisplayed(plpPage.PLPproductQTYBOX, true);
	    isElementDisplayed(plpPage.PLPproductAddtoCartCTA, true);	
	}

	@Then("^User verifies category facet section in CDO Parts PLP page$")
	public void user_verifies_category_facet_section_in_CDO_Parts_PLP_page() throws Throwable {
		explicitWaitVisible(plpPage.PLPCategory);
		isElementDisplayed(plpPage.PLPCategory, true);
	    isElementDisplayed(plpPage.CDOPartsBrackets, true);
	    isElementDisplayed(plpPage.CDOPartsElectricals, true);
	    isElementDisplayed(plpPage.CDOPartsPanels, true);
	}

	@Then("^User verifies Price facet section in CDO Parts PLP page$")
	public void user_verifies_Price_facet_section_in_CDO_Parts_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPCategory);
		isElementDisplayed(plpPage.PLPPriceFacet, true);
	    isElementDisplayed(plpPage.PLPPriceFacet1, true);
	    isElementDisplayed(plpPage.PLPPriceFacet2, true);
	    isElementDisplayed(plpPage.PLPPriceFacet3, true);	    
	}

	@Then("^user clicks on CDO Parts category facet section and verify correct resultset by count$")
	public void user_clicks_on_CDO_Parts_category_facet_section_and_verify_correct_resultset_by_count() throws Throwable {
		ScrollToElement(plpPage.PriceDisclaimerPLP);
		String productcountsCDOParts = getText(plpPage.CDOPartsBrackets);
		String[] productcounts1CDOParts = productcountsCDOParts.split("\\(");
		String productcounts2CDOParts = productcounts1CDOParts[1].substring(0,productcounts1CDOParts[1].length()-1);
		int productcountlabelCDOParts = Integer.valueOf(productcounts2CDOParts);
		jsClick(plpPage.CDOPartsBrackets);
		Thread.sleep(5000);
		String productcountstabCDOParts = getText(plpPage.PLPproductcount);
		productcountstabCDOParts = productcountstabCDOParts.substring(1, productcountstabCDOParts.length()-1);
	      int productcountintsCDOParts = Integer.valueOf(productcountstabCDOParts);
	      if (productcountintsCDOParts == 0)
	      {
	    	  throw new Exception("No products present in Search results page");
	      }
		if(productcountintsCDOParts!=productcountlabelCDOParts){
			throw new Exception("Facet count and resultant result count do not match");
		}	    
	}
}

