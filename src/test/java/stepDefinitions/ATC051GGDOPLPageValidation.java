package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PLPPage;

public class ATC051GGDOPLPageValidation extends BaseClass {
	PLPPage plpPage = PageFactory.initElements(driver, PLPPage.class);

	@When("^User navigates to GDO PLP page$")
	public void user_navigates_to_GDO_PLP_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"Products/Garage-Door-Opener-Systems/c/15-11");	    
	}

	@Then("^Verifies header elements in GDO PLP page$")
	public void verifies_header_elements_in_GDO_PLP_page() throws Throwable {
	    isElementDisplayed(plpPage.GDOTitle, true);
	    isElementDisplayed(plpPage.PriceDisclaimerPLP, true);
	    isElementDisplayed(plpPage.PLPproductcount, true);
	}

	@Then("^Verifies fourth product card and its attributes in GDO PLP page$")
	public void verifies_fourth_product_card_and_its_attributes_in_GDO_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPproductimage);
		isElementDisplayed(plpPage.PLPproductimage, true);
	    isElementDisplayed(plpPage.PLPproductName, true);
	    isElementDisplayed(plpPage.PLPproductSumm, true);
	    isElementDisplayed(plpPage.PLPproductprice, true);
	    isElementDisplayed(plpPage.PLPproductQTYBOX, true);
	    isElementDisplayed(plpPage.PLPproductAddtoCartCTA, true);
	}

	@Then("^user verifies product card click on PLP is navigating to PDP page by link$")
	public void user_verifies_product_card_click_on_PLP_is_navigating_to_PDP_page_by_link() throws Throwable {
	    jsClick(plpPage.PLPproductimage);
	    verifypageURL("/p/");
	}

	@Then("^User verifies category facet section in GDO PLP page$")
	public void user_verifies_category_facet_section_in_GDO_PLP_page() throws Throwable {
		explicitWaitVisible(plpPage.PLPCategory);
		isElementDisplayed(plpPage.PLPRemoveFacet, true);
	    isElementDisplayed(plpPage.GDOFacetRemove, true);
	    isElementDisplayed(plpPage.PLPCategory, true);
	    isElementDisplayed(plpPage.GDOAccFacet, true);
	    isElementDisplayed(plpPage.GDOOperatorFacet, true);
	    isElementDisplayed(plpPage.GDOFinisFacet, true);
	}

	@Then("^User verifies Price facet section in GDO PLP page$")
	public void user_verifies_Price_facet_section_in_GDO_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPCategory);
		isElementDisplayed(plpPage.PLPPriceFacet, true);
	    isElementDisplayed(plpPage.PLPPriceFacet1, true);
	    isElementDisplayed(plpPage.PLPPriceFacet2, true);
	    isElementDisplayed(plpPage.PLPPriceFacet3, true);    
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
		ScrollToElement(plpPage.PriceDisclaimerPLP);
		String productcountsGDO = getText(plpPage.GDOAccFacet);
		String[] productcounts1GDO = productcountsGDO.split("\\(");
		String productcounts2GDO = productcounts1GDO[1].substring(0,productcounts1GDO[1].length()-1);
		int productcountlabelGDO = Integer.valueOf(productcounts2GDO);
		jsClick(plpPage.GDOAccFacet);
		Thread.sleep(5000);
		String productcountstabGDO = getText(plpPage.PLPproductcount);
		productcountstabGDO = productcountstabGDO.substring(1, productcountstabGDO.length()-1);
	      int productcountintsGDO = Integer.valueOf(productcountstabGDO);
	      if (productcountintsGDO == 0)
	      {
	    	  throw new Exception("No products present in Search results page");
	      }
		if(productcountintsGDO!=productcountlabelGDO){
			throw new Exception("Facet count and resultant result count do not match");
		}
	}
	
	@Then("^user verifes show more link in PLP page$")
	public void user_verifes_show_more_link_in_GDO_PLP_page() throws Throwable {
	    ScrollToElement(plpPage.PLPShowMoreLink);
		isElementDisplayed(plpPage.PLPShowMoreLink, true);
	}
}
