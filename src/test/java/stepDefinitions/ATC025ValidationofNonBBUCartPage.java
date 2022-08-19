package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PDPPage;

public class ATC025ValidationofNonBBUCartPage extends BaseClass {
	CheckoutPage checkout = PageFactory.initElements(driver, CheckoutPage.class);
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	PDPPage pdpPage = PageFactory.initElements(driver, PDPPage.class);
	
	String appurlnonBBU = configFileReader.getApplicationUrl();

	@Given("^User will clear non BBU cart if there are any products present$")
	public void user_will_clear_non_BBU_cart_if_there_are_any_products_present() throws Throwable {
		driver.navigate().to(appurlnonBBU+"cart");
		boolean flag1 = isElementNotDisplayed("//button[contains(text(),'Remove Item(s) & View Cart')]", true);
		boolean flag2 = isElementNotDisplayed("//button[contains(text(),'Remove Item(s) & Continue Shopping')]", true);
		
		if(!flag1){
			jsClick(cartPage.RemoveItemsViewCart);
			jsClick(cartPage.CartPageClearcartIcon);
			jsClick(cartPage.CartPageClearCartPopUPButton);
			Thread.sleep(3000);
			jsClick(homePage.LiftMasterLogo);
		}
		else if(!flag2){
			jsClick(cartPage.RemoveItemsContinueShopping);
		}
		else{
			jsClick(cartPage.CartPageClearcartIcon);
			jsClick(cartPage.CartPageClearCartPopUPButton);
			Thread.sleep(3000);
			jsClick(homePage.LiftMasterLogo);
		}
		
	}
	
	@Given("^User will Add BBU product to cart from PDP page$")
	public void user_will_Add_BBU_product_to_cart_from_PDP_page() throws Throwable {
		Thread.sleep(2000);
		sendKeys(pdpPage.AddRails, "1");
		jsClick(pdpPage.HeadandRailsAddToCartCTA);
		Thread.sleep(2000);
		jsClick(homePage.LiftMasterLogo);
	}

	@Then("^User verifies PopUP for single non BBU product$")
	public void user_verifies_PopUP_for_single_non_BBU_product() throws Throwable {
	    isElementDisplayed(cartPage.RemoveItemsContinueShopping, true);
	    isElementDisplayed(cartPage.RemoveItemsViewCart, true);
	    isElementDisplayed(cartPage.NonBBUModalHeader, true);
	    isElementDisplayed(cartPage.NonBBUModalStaticText, true);
	    isElementDisplayed(cartPage.NonBBUModalProductImage, true);
	    jsClick(cartPage.RemoveItemsViewCart);
	    verifypageURL("/cart");
	    isElementDisplayed(cartPage.CartPageTitle, true);
	}

	@Then("^User verifies PopUP for multiple non BBU products$")
	public void user_verifies_PopUP_for_multiple_non_BBU_products() throws Throwable {
		isElementDisplayed(cartPage.RemoveItemsContinueShopping, true);
	    isElementDisplayed(cartPage.RemoveItemsViewCart, true);
	    isElementDisplayed(cartPage.NonBBUModalHeader, true);
	    isElementDisplayed(cartPage.NonBBUModalStaticText, true);
	    isElementDisplayed(cartPage.NonBBUModalProductImage, true);
	    isElementDisplayed(cartPage.NonBBUModalProductImage2, true);
	    jsClick(cartPage.RemoveItemsContinueShopping);
	    Thread.sleep(2000);
	    verifypagetitle("| Home Page");
	}

	@Then("^User verifies PopUP for only non BBU products$")
	public void user_verifies_PopUP_for_only_non_BBU_products() throws Throwable {
		isElementDisplayed(cartPage.RemoveItemsContinueShopping, true);
	    isElementNotDisplayed("//button[contains(text(),'Remove Item(s) & View Cart')]", true);
	    isElementDisplayed(cartPage.NonBBUModalHeader, true);
	    isElementDisplayed(cartPage.NonBBUModalStaticText, true);
	    isElementDisplayed(cartPage.NonBBUModalProductImage, true);
	    jsClick(cartPage.RemoveItemsContinueShopping);
	    verifypagetitle("| Home Page");	    
	}
	
	@Then("^User will add US california dropship address$")
	public void user_will_add_US_california_dropship_address() throws Throwable {
	    sendKeys(checkout.DropShipAddressFirstName, "NonBBUProduct");
	    sendKeys(checkout.DropShipAddressLastName, "User");
	    isElementDisplayed(checkout.DropShipAddressHeaderLabel, true);
	    ScrollToElement(checkout.DropShipAddressCountryNameLabel);
	    click(checkout.DropShipAddressCountryNameLabel);
	    click("//li[@class='p3-dropdown__item']");
	    Thread.sleep(2000);
	    sendKeys(checkout.DropShipAddressLine1, "4140  State Street");
	    isElementDisplayed(checkout.DropShipAddressHeaderLabel, true);
	    click(checkout.DropShipAddressStateNameLabel);
	    jsClick(checkout.SelectCAState);
	    sendKeys(checkout.DropShipAddressCityName, "LOS ANGELES");
	    sendKeys(checkout.DropShipAddressPostalCode, "90001");
	    click(checkout.DropShipAddressHeaderLabel);
	    Thread.sleep(2000);
	    ScrollToElement(checkout.DropShipAddressSaveButton);
	    jsClick(checkout.DropShipAddressSaveButton);
	    Thread.sleep(5000);
	}
	
	@Then("^User verifies non BBU error message on Checkout Page$")
	public void user_Verifies_Non_BBU_error_message_on_checkout_page() throws Throwable {
	    ScrollToElement(checkout.DropShipAddressHeaderLabel);
		isElementDisplayed(checkout.NonBBUErrorMessage, true);
	    driver.navigate().to(appurlnonBBU);
	}
}
