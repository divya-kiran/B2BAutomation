package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PLPPage;

public class ATC055ProductMenuAccessoriesPLPPage extends BaseClass {
	PLPPage plpPage = PageFactory.initElements(driver, PLPPage.class);

	@When("^User navigates to Accessories PLP page$")
	public void user_navigates_to_Accessories_PLP_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"c/accessories");	    
	}

	@Then("^Verifies header elements in Accessories PLP page$")
	public void verifies_header_elements_in_Accessories_PLP_page() throws Throwable {
		isElementDisplayed(plpPage.AccessoriesTitle, true);
	    isElementDisplayed(plpPage.PriceDisclaimerPLP, true);
	    isElementDisplayed(plpPage.PLPproductcount, true);	    
	}

	@Then("^Verifies fourth product card and its attributes in Accessories PLP page$")
	public void verifies_fourth_product_card_and_its_attributes_in_Accessories_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPproductimage);
		isElementDisplayed(plpPage.PLPproductimage, true);
	    isElementDisplayed(plpPage.PLPproductName, true);
	    isElementDisplayed(plpPage.PLPproductSumm, true);
	    isElementDisplayed(plpPage.PLPproductprice, true);
	    isElementDisplayed(plpPage.PLPproductQTYBOX, true);
	    isElementDisplayed(plpPage.PLPproductAddtoCartCTA, true);	    
	}

	@Then("^User verifies category facet section in Accessories PLP page$")
	public void user_verifies_category_facet_section_in_Accessories_PLP_page() throws Throwable {
		isElementDisplayed(plpPage.PLPCategory, true);
	    isElementDisplayed(plpPage.AccessoriesCDOFacet, true);
	}

	@Then("^User verifies Price facet section in Accessories PLP page$")
	public void user_verifies_Price_facet_section_in_Accessories_PLP_page() throws Throwable {
		ScrollToElement(plpPage.PLPCategory);
		isElementDisplayed(plpPage.PLPPriceFacet, true);
	    isElementDisplayed(plpPage.PLPPriceFacet1, true);
	    isElementDisplayed(plpPage.PLPPriceFacet2, true);
	    isElementDisplayed(plpPage.PLPPriceFacet3, true);
	}

	@Then("^user clicks on Accessories category facet section and verify correct resultset by count$")
	public void user_clicks_on_Accessories_category_facet_section_and_verify_correct_resultset_by_count() throws Throwable {
		ScrollToElement(plpPage.PriceDisclaimerPLP);
		String productcountsAcces = getText(plpPage.AccessoriesCDOFacet);
		String[] productcounts1Acces = productcountsAcces.split("\\(");
		String productcounts2Acces = productcounts1Acces[1].substring(0,productcounts1Acces[1].length()-1);
		int productcountlabelAcces = Integer.valueOf(productcounts2Acces);
		jsClick(plpPage.AccessoriesCDOFacet);
		Thread.sleep(5000);
		String productcountstabAcces = getText(plpPage.PLPproductcount);
		productcountstabAcces = productcountstabAcces.substring(1, productcountstabAcces.length()-1);
	      int productcountintsAcces = Integer.valueOf(productcountstabAcces);
	      if (productcountintsAcces == 0)
	      {
	    	  throw new Exception("No products present in Search results page");
	      }
		if(productcountintsAcces!=productcountlabelAcces){
			throw new Exception("Facet count and resultant result count do not match");
		}	    
	}
}

