package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.PDPPage;

public class ATC071CDOProductCartPageValidations extends BaseClass {
	CartPage cartPage= PageFactory.initElements(driver, CartPage.class);
	PDPPage pdpPage=PageFactory.initElements(driver, PDPPage.class);
	HomePage homePage =PageFactory.initElements(driver, HomePage.class);
	
	@When("^user adds CDO product to cart$")
	public void user_adds_CDO_product_to_cart() throws Throwable {
		WebElement AcceptCookies  = driver.findElement(By.id("onetrust-accept-btn-handler"));
		if (AcceptCookies != null)
		{
			AcceptCookies.click();
		}
		ScrollToElement(pdpPage.CDOProductConfigureLabel);
	    jsClick(pdpPage.TVoltagePhaseLabel3);
	    jsClick(pdpPage.THorsePowerLabel3);
	    jsClick(pdpPage.DAMPENVButton);
	    Thread.sleep(2000);
	    jsClick(pdpPage.Modification1);
	    jsClick(pdpPage.Option1);
	    Thread.sleep(2000);
	    jsClick(pdpPage.Modification2);
	    jsClick(pdpPage.Modification2Option1);
	    Thread.sleep(2000);
	    jsClick(pdpPage.TSafetyDeviceN4DD);
	    Thread.sleep(2000);
	    jsClick(pdpPage.TSafetyDeviceN4Label1);
	    jsClick(pdpPage.TDoorHeightLabel);
	    Thread.sleep(2000);
	    jsClick(pdpPage.TDoorHeightLabel1);
	    jsClick(pdpPage.FIModificationsLabel);
	    Thread.sleep(2000);
	    jsClick(pdpPage.FIModificationsLabel1); 
	    Thread.sleep(2000);
		jsClick(pdpPage.ProductAddToCartCTA);
		Thread.sleep(2000);
		jsClick(pdpPage.CDOPopUPNOButton);
		Thread.sleep(2000);
	}

	@Then("^Verifies CDO product details in cart page$")
	public void verifies_CDO_product_details_in_cart_page() throws Throwable {
	    
	}

	@Then("^verifies product link navigation of CDO product to PDP page in cart$")
	public void verifies_product_link_navigation_of_CDO_product_to_PDP_page_in_cart() throws Throwable {
	    isElementDisplayed(cartPage.CartPageProductName1, true);
	    jsClick(cartPage.CartPageProductName1);
	    verifypageURL("/p/");
	    driver.navigate().to(configFileReader.getApplicationUrl()+"cart");
	    ScrollToElement(cartPage.CartPageProductName1);
	    isElementDisplayed(cartPage.ParentSubcomp1Link, true);
	    jsClick(cartPage.ParentSubcomp1Link);
	    verifypageURL("/p/");
	    driver.navigate().to(configFileReader.getApplicationUrl()+"cart");
	    ScrollToElement(cartPage.CDOProductChildSubComponent);
	    isElementDisplayed(cartPage.ChildSubcomp1Link, true);
	    jsClick(cartPage.ChildSubcomp1Link);
	    
	}

	@Then("^verify two product line items are present for T product with the selected options$")
	public void verify_two_product_line_items_are_present_for_T_product_with_the_selected_options() throws Throwable {
	    Thread.sleep(2000);
		ScrollToElement(cartPage.CartPageProductName1);
	    isElementEnabled(cartPage.CDOProductIncluded1, true);
//		isElementDisplayed(cartPage.CDOProductParentSubComponent, true);
//	    isElementDisplayed(cartPage.ParentSubcomp1Link, true);
//	    isElementDisplayed(cartPage.ParentSubcomp1QTY, true);
//	    isElementDisplayed(cartPage.ParentSubcomp1Summ, true);
//	    isElementDisplayed(cartPage.ParentSubcomp2Link, true);
//	    isElementDisplayed(cartPage.ParentSubcomp2QTY, true);
//	    isElementDisplayed(cartPage.ParentSubcomp2Summ, true);
//	    ScrollToElement(cartPage.CDOProductIncluded2);
//	    isElementEnabled(cartPage.CDOProductIncluded2, true);
//		isElementDisplayed(cartPage.CDOProductChildSubComponent, true);
//	    isElementDisplayed(cartPage.ChildSubcomp1Link, true);
//	    isElementDisplayed(cartPage.ChildSubcomp1QTY, true);
//	    isElementDisplayed(cartPage.ChildSubcomp1Summ, true);
//	    isElementDisplayed(cartPage.ChildSubcomp2Link, true);
//	    isElementDisplayed(cartPage.ChildSubcomp2QTY, true);
//	    isElementDisplayed(cartPage.ChildSubcomp2Summ, true);
	}

	@Then("^verifies child product line items for CDO product T$")
	public void verifies_child_product_line_items_for_CDO_product_T() throws Throwable {
	    
	    
	}

	@Then("^verify child product link navigation to PDP page$")
	public void verify_child_product_link_navigation_to_PDP_page() throws Throwable {
	    
	    
	}	
}