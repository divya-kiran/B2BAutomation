package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PLPPage;

public class ATC052CDOPLPageValidation extends BaseClass {
	PLPPage plpPage = PageFactory.initElements(driver, PLPPage.class);

	@When("^User navigates to CDO PLP page$")
	public void user_navigates_to_CDO_PLP_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"c/20-11");
	}

	@Then("^Verifies header elements in CDO PLP page$")
	public void verifies_header_elements_in_CDO_PLP_page() throws Throwable {
		isElementDisplayed(plpPage.CDOTilte, true);
	    isElementDisplayed(plpPage.PriceDisclaimerPLP, true);
	    isElementDisplayed(plpPage.PLPproductcount, true);
	}

	@Then("^Verifies fourth product card and its attributes in CDO PLP page$")
	public void verifies_fourth_product_card_and_its_attributes_in_CDO_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPproductimage);
		isElementDisplayed(plpPage.PLPproductimage, true);
	    isElementDisplayed(plpPage.PLPproductName, true);
	    isElementDisplayed(plpPage.PLPproductSumm, true);
	    isElementDisplayed(plpPage.PLPproductprice, true);
	}

	@Then("^User verifies category facet section in CDO PLP page$")
	public void user_verifies_category_facet_section_in_CDO_PLP_page() throws Throwable {
		isElementDisplayed(plpPage.PLPCategory, true);
	    isElementDisplayed(plpPage.CDOAccFacet, true);
	    isElementDisplayed(plpPage.CDOOperatorFacet, true);
	    isElementDisplayed(plpPage.CDOFinisFacet, true);
	}

	@Then("^User verifies Price facet section in CDO PLP page$")
	public void user_verifies_Price_facet_section_in_CDO_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPCategory);
		isElementDisplayed(plpPage.PLPPriceFacet, true);
	    isElementDisplayed(plpPage.PLPPriceFacet1, true);
	    isElementDisplayed(plpPage.PLPPriceFacet2, true);
	    isElementDisplayed(plpPage.PLPPriceFacet3, true); 
	}

	@Then("^user clicks on CDO category facet section and verify correct resultset by count$")
	public void user_clicks_on_CDO_category_facet_section_and_verify_correct_resultset_by_count() throws Throwable {
		ScrollToElement(plpPage.PriceDisclaimerPLP);
		String productcountsCDO = getText(plpPage.CDOAccFacet);
		String[] productcounts1CDO = productcountsCDO.split("\\(");
		String productcounts2CDO = productcounts1CDO[1].substring(0,productcounts1CDO[1].length()-1);
		int productcountlabelCDO = Integer.valueOf(productcounts2CDO);
		jsClick(plpPage.CDOAccFacet);
		Thread.sleep(5000);
		String productcountstabCDO = getText(plpPage.PLPproductcount);
		productcountstabCDO = productcountstabCDO.substring(1, productcountstabCDO.length()-1);
	      int productcountintsCDO = Integer.valueOf(productcountstabCDO);
	      if (productcountintsCDO == 0)
	      {
	    	  throw new Exception("No products present in Search results page");
	      }
		if(productcountintsCDO!=productcountlabelCDO){
			throw new Exception("Facet count and resultant result count do not match");
		}
	}
}

