package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PDPPage;


public class OrderProcessingUSCC extends BaseClass {
	LoginPage loginpage= PageFactory.initElements(driver, LoginPage.class);
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	PDPPage pdpPage= PageFactory.initElements(driver, PDPPage.class);
	CheckoutPage checkoutPage= PageFactory.initElements(driver, CheckoutPage.class);
	
	@Given("^User will select options from install step in CDO PDP page$")
	public void user_will_select_options_from_install_step_in_CDO_PDP_page() throws Throwable {
		jsClick(pdpPage.CDORollingButton);
	    Thread.sleep(2000);
	    ScrollToElement(pdpPage.CDODoorHeightDD);
	    click(pdpPage.CDODoorHeightDD);
	    jsClick(pdpPage.CDODoorHeightDDVal1);
	    Thread.sleep(1000);
	    click(pdpPage.CDOKeywaySizeDD);
	    jsClick(pdpPage.CDOKeywaySizeDDVal1);
	    Thread.sleep(1000);
	    click(pdpPage.CDOShaftSizeDD);
	    jsClick(pdpPage.CDOShaftSizeDDVal1);
	    Thread.sleep(1000);
	    click(pdpPage.CDOSafetyDeiceDD);
	    jsClick(pdpPage.CDOSafetyDeiceDDVal1);
	    Thread.sleep(1000);
	}
	
	@Given("^User will click on NO for CDO POPUP$")
	public void User_will_click_on_NO_for_CDO_POPUP() throws Throwable {
		jsClick(pdpPage.CDOPopUPNOButton);
	}
	
	@Given("^User will Add product to cart from CDO PDP page$")
	public void User_will_Add_product_to_cart_from_CDOPDP_page() throws Throwable {
		Thread.sleep(2000);
		jsClick(pdpPage.ProductAddToCartCTA);
		Thread.sleep(2000);
	}
	
	@Given("^User will navigate to homepage$")
	public void User_will_navigate_to_homepage() throws Throwable {
		jsClick(homepage.LiftMasterLogo);
	}
	
	@Then("^User will scroll to delivery save and click on save$")
	public void User_will_scroll_to_delivery_save_and_click_on_save() throws Throwable {
		ScrollToElement(checkoutPage.ShippingandDeliverySaveButton);
	    jsClick(checkoutPage.ShippingandDeliverySaveButton);
	}
}
