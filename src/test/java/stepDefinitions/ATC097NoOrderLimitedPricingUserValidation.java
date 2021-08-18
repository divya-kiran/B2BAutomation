package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CheckoutPage;
import pageObjects.ContentLandingPage;
import pageObjects.GuestUserPages;
import pageObjects.HomePage;
import pageObjects.OrderHistoryDetailsPage;
import pageObjects.PDPPage;
import pageObjects.PLPPage;
import pageObjects.ProfilePage;
import pageObjects.StickyHeaderPage;

public class ATC097NoOrderLimitedPricingUserValidation extends BaseClass {
	PLPPage plpPage = PageFactory.initElements(driver, PLPPage.class);
	PDPPage pdpPage = PageFactory.initElements(driver, PDPPage.class);
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	OrderHistoryDetailsPage orderHistoryDetailPage = PageFactory.initElements(driver, OrderHistoryDetailsPage.class);
	CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);

	@Then("^User will navigate to PLP page and verify Add to cart is disabled$")
	public void user_will_navigate_to_PLP_page_and_verify_Add_to_cart_is_disabled() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"c/12");
		ScrollToElement(plpPage.PLPproductimage);
		isElementDisplayed(plpPage.PLPproductimage, true);
	    isElementDisplayed(plpPage.PLPproductName, true);
	    isElementDisplayed(plpPage.PLPproductSumm, true);
	    isElementDisplayed(plpPage.PLPproductprice, true);
	    isElementDisplayed(plpPage.PLPproductQTYBOX, true);
	    isElementdisabled(plpPage.PLPproductAddtoCartCTA, false);
	}

	@Then("^User will navigate to PDP page and verify add to cart is disabled$")
	public void user_will_navigate_to_PDP_page_and_verify_add_to_cart_is_disabled() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"p/012B0393");
		isElementdisabled(pdpPage.ProductAddToCartCTAXPATH, false);
		
	}

	@Then("^verify quick order elements is not present$")
	public void verify_quick_order_elements_is_not_present() throws Throwable {
	    ScrollToElement(homePage.OrderstatuslinkNew);
	    isElementNotDisplayed1("//img[contains(@alt,'Quick Order')]//parent::button", true);
	}
	
	@Then("^user verify Place order is disabled on place order$")
	public void user_verify_Place_order_is_disabled_on_place_order() throws Throwable {
		isElementdisabled(checkoutPage.CheckoutStickyPlaceOrderButton, false);
		driver.navigate().to(configFileReader.getApplicationUrl());
	}
	
	@Given("^User clicks on Order Status link in Homepage new$")
	public void User_clicks_on_Order_Status_link_in_Homepage_new() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl());
		  jsClick(homePage.OrderstatuslinkNew); 

	}
	
	@Given("^Verifies product card detail in order history page$")
	public void verifies_product_card_detail_in_order_history_page() throws Throwable {
		isElementDisplayed(orderHistoryDetailPage.OrderDetailCardTitle, true);
		isElementDisplayed(orderHistoryDetailPage.OrderDetailCardProductIndex, true);
		isElementDisplayed(orderHistoryDetailPage.OrderDetailsCardProductNameLink, true);
		isElementDisplayed(orderHistoryDetailPage.OrderDetailsProductSummary, true);
		isElementDisplayed(orderHistoryDetailPage.QTYRequestedAttribute, true);
		isElementDisplayed(orderHistoryDetailPage.QTYRequestedAttributeVal, true);
		isElementDisplayed(orderHistoryDetailPage.QTYShippedAttribute, true);
		isElementDisplayed(orderHistoryDetailPage.QTYShippedAttributeVal, true);
		isElementNotDisplayed1("((//ul[@class='p3-page-order-details__items-list'])[1]//span[contains(text(),'Price EA:')])[1]", true);
		isElementNotDisplayed1("((//ul[@class='p3-page-order-details__items-list'])[1]//span[contains(text(),'Price EA:')]//following-sibling::span)[1]", true);
		isElementNotDisplayed1("((//ul[@class='p3-page-order-details__items-list'])[1]//span[contains(text(),'Total:')])[1]", true);
		isElementNotDisplayed1("((//ul[@class='p3-page-order-details__items-list'])[1]//span[contains(text(),'Total:')]//following-sibling::span)[1]", true);
	}
}