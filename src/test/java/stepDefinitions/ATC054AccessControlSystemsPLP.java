package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PLPPage;

public class ATC054AccessControlSystemsPLP extends BaseClass {
	PLPPage plpPage = PageFactory.initElements(driver, PLPPage.class);

	@When("^User navigates to Access Control PLP page$")
	public void user_navigates_to_Access_Control_PLP_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"c/access");	    
	}

	@Then("^Verifies header elements in Access Control PLP page$")
	public void verifies_header_elements_in_Access_Control_PLP_page() throws Throwable {
		isElementDisplayed(plpPage.AccessControlSystemTitle, true);
	    isElementDisplayed(plpPage.PriceDisclaimerPLP, true);
	    isElementDisplayed(plpPage.PLPproductcount, true);	    
	}

	@Then("^Verifies fourth product card and its attributes in Access Control PLP page$")
	public void verifies_fourth_product_card_and_its_attributes_in_Access_Control_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPproductimage);
		isElementDisplayed(plpPage.PLPproductimage, true);
	    isElementDisplayed(plpPage.PLPproductName, true);
	    isElementDisplayed(plpPage.PLPproductSumm, true);
	    isElementDisplayed(plpPage.PLPproductprice, true);
	    isElementDisplayed(plpPage.PLPproductQTYBOX, true);
	    isElementDisplayed(plpPage.PLPproductAddtoCartCTA, true);	    
	}

	@Then("^User verifies category facet section in Access Control PLP page$")
	public void user_verifies_category_facet_section_in_Access_Control_PLP_page() throws Throwable {
		isElementDisplayed(plpPage.PLPCategory, true);
	    isElementDisplayed(plpPage.AccessControlAccFacet, true);
	    isElementDisplayed(plpPage.AccessControlsFacet, true);	    
	}

	@Then("^User verifies Price facet section in Access Control PLP page$")
	public void user_verifies_Price_facet_section_in_Access_Control_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPCategory);
		isElementDisplayed(plpPage.PLPPriceFacet, true);
	    isElementDisplayed(plpPage.PLPPriceFacet1, true);
	    isElementDisplayed(plpPage.PLPPriceFacet2, true);
	    isElementDisplayed(plpPage.PLPPriceFacet3, true);	    
	}

	@Then("^user clicks on Access Control category facet section and verify correct resultset by count$")
	public void user_clicks_on_Access_Control_category_facet_section_and_verify_correct_resultset_by_count() throws Throwable {
		ScrollToElement(plpPage.PriceDisclaimerPLP);
		String productcountsAcc = getText(plpPage.AccessControlAccFacet);
		String[] productcounts1Acc = productcountsAcc.split("\\(");
		String productcounts2Acc = productcounts1Acc[1].substring(0,productcounts1Acc[1].length()-1);
		int productcountlabelAcc = Integer.valueOf(productcounts2Acc);
		jsClick(plpPage.AccessControlAccFacet);
		Thread.sleep(5000);
		String productcountstabAcc = getText(plpPage.PLPproductcount);
		productcountstabAcc = productcountstabAcc.substring(1, productcountstabAcc.length()-1);
	      int productcountintsAcc = Integer.valueOf(productcountstabAcc);
	      if (productcountintsAcc == 0)
	      {
	    	  throw new Exception("No products present in Search results page");
	      }
		if(productcountintsAcc!=productcountlabelAcc){
			throw new Exception("Facet count and resultant result count do not match");
		}	    
	}
}

