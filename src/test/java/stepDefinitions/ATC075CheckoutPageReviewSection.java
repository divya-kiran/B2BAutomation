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

public class ATC075CheckoutPageReviewSection extends BaseClass {
	CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);

	@Then("^Verify account payment label$")
	public void verify_account_payment_label() throws Throwable {
		Thread.sleep(4000);
		pageLoadTimeout();
	    isElementDisplayed(checkoutPage.AccountPaymentLabel, true);	    
	}

	@Then("^the verify review section web elements$")
	public void the_verify_review_section_web_elements() throws Throwable {
	    ScrollToElement(checkoutPage.AccountPaymentLabel);
		isElementDisplayed(checkoutPage.ReviewOrderLabel, true);
	    isElementDisplayed(checkoutPage.reviewContentMsg, true);
	    isElementDisplayed(checkoutPage.reviewContentMsgLink, true);
	    isElementDisplayed(checkoutPage.ShippingFromCheckoutLabel, true);
	}

	@Then("^click on liftmaster policies and procedures and verify page navigation$")
	public void click_on_liftmaster_policies_and_procedures_and_verify_page_navigation() throws Throwable {
	    jsClick(checkoutPage.reviewContentMsgLink);
	    verifypageURL("/policies-and-procedures");
	    driver.navigate().back();
	    pageLoadTimeout();
	}

	@Then("^verify product details in checkout page$")
	public void verify_product_details_in_checkout_page() throws Throwable {
	    ScrollToElement(checkoutPage.ShippingFromCheckoutLabel);
	    isElementDisplayed(checkoutPage.ProductNameCheckoutPage, true);
	    isElementDisplayed(checkoutPage.ProductDescCheckoutPage, true);
	    isElementDisplayed(checkoutPage.ProductEachPriceCheckoutPage, true);
	    isElementDisplayed(checkoutPage.ProductQTYCheckoutPage, true);
	    isElementDisplayed(checkoutPage.ProductTotPrice, true);
	    isElementDisplayed(checkoutPage.SummaryPlaceOrderBtn, true);
	    isElementDisplayed(checkoutPage.OrderTotalLabel, true);
	    isElementDisplayed(checkoutPage.OrderTotalPrice, true);
	    isElementDisplayed(checkoutPage.OrderTotStickyMsg, true);
	    isElementDisplayed(checkoutPage.CheckoutStickyPlaceOrderButton, true);
	}
	
	@Then("^User clicks on payment label and get back to payment section$")
	public void User_clicks_on_payment_label_and_get_back_to_payment_section() throws Throwable {
	    Thread.sleep(2000);
		jsClick(checkoutPage.PaymentLabel);
	    Thread.sleep(3000);
	    pageLoadTimeout();
	}
	
	@Then("^user Adds address in the billing address section$")
	public void user_Adds_address_in_the_billing_address_section() throws Throwable {
	    isElementDisplayed(checkoutPage.BillingAddress, true);
	    jsClick(checkoutPage.BillingAddresCheckBox);
	    isElementDisplayed(checkoutPage.BillingAddresMsg, true);
	    ScrollToElement(checkoutPage.BillingAddresMsg);
	    sendKeys(checkoutPage.BillingAddressFname, "Automation User");
	    jsClick(checkoutPage.BillingCountryDD);
	    jsClick(checkoutPage.BillingAddresCountrySelect);
	    sendKeys(checkoutPage.BillingAddLane1, "900 Elk Avenue");
	    sendKeys(checkoutPage.BillingAddCity, "Howell");
	    jsClick(checkoutPage.BillingAddStateDD);
	    jsClick(checkoutPage.BillingAddStateDD1);
	    sendKeys(checkoutPage.BillingAddZipCode, "48843");
	    isElementDisplayed(checkoutPage.BillingAddLane1, true);
	    click(checkoutPage.BillingAddLane1);
	    Thread.sleep(3000);
	    jsClick(checkoutPage.BillingAddSaveBtn);
	    Thread.sleep(5000);
	}
}