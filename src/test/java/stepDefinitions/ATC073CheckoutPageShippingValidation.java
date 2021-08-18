package stepDefinitions;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.PDPPage;
import pageObjects.SaveCartPage;

public class ATC073CheckoutPageShippingValidation extends BaseClass {
	CartPage cartPage= PageFactory.initElements(driver, CartPage.class);
	CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
	
	@Given("^Proceeds to checkoutpage$")
	public void proceeds_to_checkoutpage() throws Throwable {
	    jsClick(cartPage.CartPageCheckoutButton);	    
	}

	@Given("^verifies shipping delivery web elements$")
	public void verifies_shipping_delivery_web_elements() throws Throwable {
	    isElementDisplayed(checkoutPage.ShippingandDeliveryHeading, true);
	    isElementDisplayed(checkoutPage.SelectShipToAddLabel,true);
	    isElementDisplayed(checkoutPage.MyAccountLabel,true);
	    isElementDisplayed(checkoutPage.MyAccountLink,true);
	    isElementDisplayed(checkoutPage.ShipToAddress1,true);
	    isElementDisplayed(checkoutPage.SelectDropShipLabel,true);
	    isElementDisplayed(checkoutPage.DropShipAddText,true);
	    isElementDisplayed(checkoutPage.SelectShippingMethodLabel,true);
	}

	@Given("^click on my account link$")
	public void click_on_my_account_link() throws Throwable {
	    jsClick(checkoutPage.MyAccountLink);
	    verifypageURL("my-account");
	}

	@Then("^verify page navigation from checkout page to my account page$")
	public void verify_page_navigation_from_checkout_page_to_my_account_page() throws Throwable {
	    	    
	}

	@Then("^click on back to cart and verify user is on cart page$")
	public void click_on_back_to_cart_and_verify_user_is_on_cart_page() throws Throwable {
	    jsClick(checkoutPage.BackToCartLink);
	    verifypageURL("/cart");
	}
	
	@Given("^verifies each delivery option in checkout page$")
	public void verifies_each_delivery_option_in_checkout_page() throws Throwable {
		ScrollToElement(checkoutPage.SelectShippingMethodLabel);
		isElementDisplayed(checkoutPage.SelectShippingMethodLabel,true);
		isElementDisplayed(checkoutPage.Pro3,true);
		isElementDisplayed(checkoutPage.Pro3Desc,true);
		isElementDisplayed(checkoutPage.Pro3EligibleStates,true);
		isElementDisplayed(checkoutPage.TwoDayAir,true);
		isElementDisplayed(checkoutPage.TwoDayAirDesc,true);
		isElementDisplayed(checkoutPage.ThreeDayAir,true);
		isElementDisplayed(checkoutPage.ThreeDayAirDesc,true);
		isElementDisplayed(checkoutPage.Ground,true);
		isElementDisplayed(checkoutPage.GroundDesc,true);
		isElementDisplayed(checkoutPage.GroundShippingZone,true);
		isElementDisplayed(checkoutPage.CommonCarrierTL,true);
		isElementDisplayed(checkoutPage.CommonCarrierTLDesc,true);
		isElementDisplayed(checkoutPage.CustomerPickUP,true);
		isElementDisplayed(checkoutPage.CustomerPickUPDesc,true);
	}
}