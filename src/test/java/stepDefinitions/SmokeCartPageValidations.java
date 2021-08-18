package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.CartPage;
import pageObjects.HomePage;


public class SmokeCartPageValidations extends BaseClass {
	CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	String appurlCart = configFileReader.getApplicationUrl();
	
	@Given("^User will clear cart if there are any products present$")
	public void i_will_clear_cart_if_there_are_any_products_present() throws Throwable {
		driver.navigate().to(appurlCart+"cart");
		Thread.sleep(3000);
		click(cartPage.CartPageClearcartIcon);
		click(cartPage.CartPageClearCartPopUPButton);
		Thread.sleep(3000);
		click(homePage.LiftMasterLogo);
	}

	@Then("^I will validate elements in cart page for a single product$")
	public void i_will_validate_elements_in_cart_page_for_a_single_product() throws Throwable {
		isElementDisplayed(cartPage.CartPageTitle, true);
		isElementDisplayed(cartPage.CartPageCheckOutMessage, true);
		isElementDisplayed(cartPage.CartPagePromoCodeTitle, true);
		isElementDisplayed(cartPage.CartPagePromoCodeTexBox, true);
		isElementDisplayed(cartPage.CartPagePromoCodeApplyButton, true);
		isElementDisplayed(cartPage.CartPageProductName1, true);
		isElementDisplayed(cartPage.CartPageEachProdPrice1, true);
		isElementDisplayed(cartPage.CartPageEachProdSummary1, true);
		isElementDisplayed(cartPage.CartPageGallerImage1, true);
		isElementDisplayed(cartPage.CartPageProductQTYBox1, true);
		isElementDisplayed(cartPage.CartPageProductDelIcon1, true);
		isElementDisplayed(cartPage.CartPageEachProdPrice1, true);
		isElementDisplayed(cartPage.CartPageProductPriceTot1, true);
		isElementDisplayed(cartPage.CartPageSavecartIcon, true);
		isElementDisplayed(cartPage.CartPageClearcartIcon, true);
		isElementDisplayed(cartPage.CartPageContinueshoppingLink, true);
		isElementDisplayed(cartPage.CartPageCheckoutButton, true);
	}
}
