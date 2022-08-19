package stepDefinitions;


import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.PDPPage;

public class ATC070CartPageValidationsSingleSKU extends BaseClass {
	CartPage cartPage= PageFactory.initElements(driver, CartPage.class);
	PDPPage pdpPage=PageFactory.initElements(driver, PDPPage.class);
	HomePage homePage =PageFactory.initElements(driver, HomePage.class);
	float initialeachprice;
	
	@Then("^user add Products to cart \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_add_Products_to_cart(String arg1, String arg2) throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+arg1);
		Thread.sleep(2000);
		jsClick(pdpPage.ProductAddToCartCTA);
		driver.navigate().to(configFileReader.getApplicationUrl()+arg2);
		Thread.sleep(2000);
		jsClick(pdpPage.ProductAddToCartCTA);
	}

	@Then("^verify all web elements related to single SKU product in cart page$")
	public void verify_all_web_elements_related_to_single_SKU_product_in_cart_page() throws Throwable {
		isElementDisplayed(cartPage.CartPageTitle, true);
		isElementDisplayed(cartPage.CartPageContinueshoppingLink, true);
		isElementDisplayed(cartPage.CartPageSavecartIcon, true);
		isElementDisplayed(cartPage.CartPageClearcartIcon, true);
		isElementDisplayed(cartPage.CartPageGallerImage1, true);
		isElementDisplayed(cartPage.CartPageProductName1, true);
		isElementDisplayed(cartPage.CartPageEachProdSummary1, true);
		isElementDisplayed(cartPage.CartPageEachProdPrice1, true);
		isElementDisplayed(cartPage.CartPageProductQTYBox1, true);
		isElementDisplayed(cartPage.CartPageProductDelIcon1, true);
		isElementDisplayed(cartPage.CartPageProductPriceTot1, true);
		isElementDisplayed(cartPage.CartPageOrderTotal, true);
		isElementDisplayed(cartPage.OrderTotalPrice, true);
		isElementDisplayed(cartPage.CartPageCheckOutMessage, true);
		isElementDisplayed(cartPage.CartPageCheckoutButton, true);
		isElementDisplayed(cartPage.CartPagePromoCodeTitle, true);
		isElementDisplayed(cartPage.CartPagePromoCodeTexBox, true);
		isElementDisplayed(cartPage.CartPagePromoCodeApplyButton, true);
	}

	@Then("^click on continue shopping in cart page$")
	public void click_on_continue_shopping_in_cart_page() throws Throwable {
	    jsClick(cartPage.CartPageContinueshoppingLink);
	}

	@Given("^user navigates to cart page$")
	public void user_navigates_to_cart_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"cart");	    
	}

	@Then("^click on Save cart in cart page and verify Save cart pop up and its elements$")
	public void click_on_Save_cart_in_cart_page_and_verify_Save_cart_pop_up_and_its_elements() throws Throwable {
	    jsClick(cartPage.CartPageSavecartIcon);
	    isElementDisplayed(cartPage.SaveCartSaveTitle, true);
	    isElementDisplayed(cartPage.SaveCartPOPUPReqLabel, true);
	    isElementDisplayed(cartPage.SaveCartCartNameTB, true);
	    isElementDisplayed(cartPage.SaveCartDescTB, true);
	    isElementDisplayed(cartPage.SaveCartSubmitButton, true);	    
	}

	@Then("^user adds job name and save it$")
	public void user_adds_job_name_and_save_it() throws Throwable {
	    jsClick(cartPage.AddJobName1);
	    isElementDisplayed(cartPage.JobName1TB, true);
	    isElementDisplayed(cartPage.JobNameMsg1, true);
	    isElementDisplayed(cartPage.JobName1SaveButton, true);
	}

	@Then("^Verify each price and total price for a single SKU product$")
	public void verify_each_price_and_total_price_for_a_single_SKU_product() throws Throwable {
	    isElementDisplayed(cartPage.CartPageEachProdPrice1, true);
	    String initialeachpricestr = cartPage.CartPageEachProdPrice1.getText();
	    String[] eachpricestr = initialeachpricestr.split(" ");
	    String eachpricestrnew = eachpricestr[0];
	    eachpricestrnew = eachpricestrnew.substring(1);
	    initialeachprice = Float.parseFloat(eachpricestrnew);
	    System.out.println(initialeachpricestr);
	    isElementDisplayed(cartPage.CartPageProductPriceTot1, true);	    
	}

	@Then("^user change the quantity of a single SKU product$")
	public void user_change_the_quantity_of_a_single_SKU_product() throws Throwable {
	    sendKeys(cartPage.CartPageProductQTYBox1, "3");	
	    click(cartPage.CartPageProductPriceTot1);
	    Thread.sleep(3000);
	    jsClick(cartPage.UpdateCart1);
	    pageLoadTimeout();
	}

	@Then("^verify total price changed in Cart$")
	public void verify_total_price_changed_in_Cart() throws Throwable {
		Thread.sleep(3000);
	    String totpricechangeStr = cartPage.CartPageProductPriceTot1.getText();
	    totpricechangeStr = totpricechangeStr.substring(1);
	    float totpricechange = Float.parseFloat(totpricechangeStr);
	    float newinitialeachprice= initialeachprice+initialeachprice+initialeachprice;
	    int totpricechangeint = (int) totpricechange;
	    int newinitialeachpriceint = (int) newinitialeachprice;
	    if(!(totpricechangeint == newinitialeachpriceint)){
	    	throw new Exception("tot price doesnt match the expected price");
	    }
	}

	@Then("^Verifies total price of all the products$")
	public void Verifies_total_price_of_all_the_products() throws Throwable {
		String totpricechangeStrt = cartPage.CartPageProductPriceTot1.getText();
	    totpricechangeStrt = totpricechangeStrt.substring(1);
	    float totpricechanget = Float.parseFloat(totpricechangeStrt);
	    String totpricechangeStrt2 = cartPage.CartPageProductPriceTot2.getText();
	    totpricechangeStrt2 = totpricechangeStrt2.substring(1);
	    float totpricechanget2 = Float.parseFloat(totpricechangeStrt2);
	    float totpriceeach = totpricechanget2 + totpricechanget;
	    int totpriceeachint = (int) totpriceeach;
		String OrdertotStrt = cartPage.OrderTotalPrice.getText();
		OrdertotStrt = OrdertotStrt.substring(1);
	    float Ordertott = Float.parseFloat(OrdertotStrt);
	    int Ordertottint = (int) Ordertott;
	    if(!(totpriceeachint == Ordertottint)){
	    	throw new Exception("Order total do not match the product totals price combined");
	    }
	}
	
	@Then("^Click on product and verify user navigated to PDP page$")
	public void click_on_product_and_verify_user_navigated_to_PDP_page() throws Throwable {
	    jsClick(cartPage.CartPageProductName1);
	    verifypageURL("/p/");
	}

	@Then("^click on checkout button and verify user navigated to Checkout page$")
	public void click_on_checkout_button_and_verify_user_navigated_to_Checkout_page() throws Throwable {
	    jsClick(cartPage.CartPageCheckoutButton);
	    verifypageURL("heckout/multi/delivery-address/add");
	}
	
	@Then("^delete first product$")
	public void delete_first_product() throws Throwable {
		jsClick(cartPage.CartPageProductDelIcon1);
		isElementDisplayed("//div[contains(.,' has been removed from your cart. ')]", true);
	}
}