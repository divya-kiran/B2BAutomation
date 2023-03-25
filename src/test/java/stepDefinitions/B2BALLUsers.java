package stepDefinitions;


import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import baseClass.ConfigFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MiniCartFlyerPage;
import pageObjects.OrderConfirmationPage;
import pageObjects.QuickOrderPage;

public class B2BALLUsers extends BaseClass {
	
	   LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	   HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	   QuickOrderPage quickorderPage = PageFactory.initElements(driver, QuickOrderPage.class);
	   MiniCartFlyerPage miniCartFlyerPage = PageFactory.initElements(driver, MiniCartFlyerPage.class);
	   CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
	   CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
	   OrderConfirmationPage orderConfirmationPage = PageFactory.initElements(driver, OrderConfirmationPage.class);
	   public static ConfigFileReader configFileReader = new ConfigFileReader();
	   
	@Given("^User will log in as US registered Payment Term user$")
	public void user_will_log_in_as_US_registered_Payment_Term_user() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
		pageLoadTimeout();
	   sendKeys(loginpage.userName, "automationuseruspt@mailinator.com");
	   sendKeys(loginpage.password, "Test@123");
	   click(loginpage.PartnerAccountSignInHeader);
	   jsClick(loginpage.signinButton);
	   }
	
	@Given("^User will log in as No order Limited Pricing user$")
	public void user_will_log_in_as_No_order_Limited_Pricing_user() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
		pageLoadTimeout();
	   sendKeys(loginpage.userName, "NoOrderLimitedPricing@mailinator.com");
	   sendKeys(loginpage.password, "Test@123");
	   click(loginpage.PartnerAccountSignInHeader);
	   jsClick(loginpage.signinButton);
	}
	
	@Given("^User will log in as No order No Pricing user$")
	public void user_will_log_in_as_No_order_No_Pricing_user() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
		pageLoadTimeout();
	   sendKeys(loginpage.userName, "NoOrderNoPricing@mailinator.com");
	   sendKeys(loginpage.password, "Test@123");
	   click(loginpage.PartnerAccountSignInHeader);
	   jsClick(loginpage.signinButton);
	}
	
	@Given("^User will log in as US no order with pricing user$")
	public void User_will_log_in_as_US_no_order_with_pricing_user() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
		pageLoadTimeout();
	   sendKeys(loginpage.userName, "NoOrderWithPricing@mailinator.com");
	   sendKeys(loginpage.password, "Test@123");
	   click(loginpage.PartnerAccountSignInHeader);
	   jsClick(loginpage.signinButton);
	}
	
	@Given("^User will log in as US registered Payment Term user Non BBU$")
	public void user_will_log_in_as_US_registered_Payment_Term_user_Non_BBU() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
		pageLoadTimeout();
	   sendKeys(loginpage.userName, "bala.pradeep@chamberlain.com");
	   sendKeys(loginpage.password, "Test@123");
	   click(loginpage.PartnerAccountSignInHeader);
	   jsClick(loginpage.signinButton);
	}

	@Given("^User will log in as CA registered Credit card user$")
	public void user_will_log_in_as_CA_registered_Credit_card_user() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
		pageLoadTimeout();
	   sendKeys(loginpage.userName, "automationusercacc@mailinator.com");
	   sendKeys(loginpage.password, "Test@123");
	   click(loginpage.PartnerAccountSignInHeader);
	   jsClick(loginpage.signinButton);
	}
	
	@Given("^User will log in as CA Guest user$")
	public void user_will_log_in_as_CA_Guest_user() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
		pageLoadTimeout();
	   sendKeys(loginpage.userName, "Automationguestuserca@mailinator.com");
	   sendKeys(loginpage.password, "Test@123");
	   click(loginpage.PartnerAccountSignInHeader);
	   jsClick(loginpage.signinButton);
	}
	
	@Given("^User will log in as CA registered Payment Term user$")
	public void user_will_log_in_as_CA_registered_Payment_Term_user() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
		pageLoadTimeout();
	   sendKeys(loginpage.userName, "automationusercapt@mailinator.com");
	   sendKeys(loginpage.password, "Test@123");
	   click(loginpage.PartnerAccountSignInHeader);
	   jsClick(loginpage.signinButton);
	}
	
	@Given("^User will log in as US registered Credit card user$")
	public void user_will_log_in_as_US_registered_Credit_card_user() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
		pageLoadTimeout();
	   sendKeys(loginpage.userName, "automationuseruscc@mailinator.com");
	   sendKeys(loginpage.password, "Test@123");
	   click(loginpage.PartnerAccountSignInHeader);
	   jsClick(loginpage.signinButton);
	}
	
	@Given("^User will log in as US Guest user$")
	public void user_will_log_in_as_US_Guest_user() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
		pageLoadTimeout();
	   sendKeys(loginpage.userName, "Automationguestuserus@mailinator.com");
	   sendKeys(loginpage.password, "Test@123");
	   click(loginpage.PartnerAccountSignInHeader);
	   jsClick(loginpage.signinButton);
	}
	
	@Given("^User will log in as US NonBBU user$")
	public void user_will_log_in_as_US_NonBBU_user_user() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
		pageLoadTimeout();
	   Thread.sleep(3000);
	   sendKeys(loginpage.userName, "automationusernonbbu@mailinator.com");
	   sendKeys(loginpage.password, "Test@123");
	   click(loginpage.PartnerAccountSignInHeader);
	   jsClick(loginpage.signinButton);
	
	}
	
	@Given("^User verify log in is successful$")
	public void user_verify_log_in_is_successful() throws Throwable {
	    //isElementDisplayed(homepage.HeaderSearchTextBox, true);
		if(!driver.findElements(By.id("onetrust-accept-btn-handler")).isEmpty()){
			
			click(homepage.acceptCookies);
		 }else{
		        
		 }
		searchTextBoxDisplayed("atomic-search-box[class='search-box-item hydrated']", "div[class='grow flex items-center']");
	}

	@Then("^User will Add products to cart using quick order \"([^\"]*)\"$")
	public void i_will_Add_products_to_cart_using_quick_order(String arg1) throws Throwable {
	    jsClick(quickorderPage.QuickOrderPopUP);
	    sendKeys(quickorderPage.QuickOrderTextBox, arg1);
	    jsClick(quickorderPage.QuickOrderAddToCart);
	    Thread.sleep(5000);
	}

	@Then("^User will click on Mini cart flyer$")
	public void i_will_click_on_Mini_cart_flyer() throws Throwable {
	    Thread.sleep(4000);
		jsClick(miniCartFlyerPage.MiniCartFlyerIcon);
	}

	@Then("^User will proceed to cart page from mini cart flyer$")
	public void i_will_proceed_to_cart_page_from_mini_cart_flyer() throws Throwable {
	    jsClick(miniCartFlyerPage.MiniCartFlyerCheckout);
	}

	@When("^User click on Checkout button in cart page$")
	public void i_click_on_Checkout_button_in_cart_page() throws Throwable {
	    jsClick(cartPage.CartPageCheckoutButton);
	}

	@Then("^User Navigates to Checkout page$")
	public void user_Navigates_to_Checkout_page() throws Throwable {
	    isElementDisplayed(checkoutPage.CheckoutPageHeader, true);
	}

	@Then("^I will select ship to delivery address$")
	public void i_will_select_ship_to_delivery_address() throws Throwable {
	    
	}
	
	@Then("^I will click on Add new Address$")
	public void i_will_click_on_Add_new_Address() throws Throwable {
	    click(checkoutPage.GuestAddnewAddress);
	}
	
	@Then("^User will add guest new address$")
	public void User_will_add_guest_new_address() throws Throwable {
	    
	}
	
	

	@Then("^User will select shipping method$")
	public void i_will_select_shipping_method() throws Throwable {
	    
	}

	@Then("^User will Click on shipping delivery Save button$")
	public void User_will_Click_on_shipping_delivery_Save_button() throws Throwable {
		ScrollToElement(checkoutPage.ShippingandDeliverySaveButton);
	    jsClick(checkoutPage.ShippingandDeliverySaveButton);
	}

	@Then("^User will fill details in review order section$")
	public void i_will_fill_details_in_review_order_section() throws Throwable {
		isElementDisplayed(checkoutPage.ReviewDetailsAttentionOfTextBox, true);
		sendKeys(checkoutPage.ReviewDetailsAttentionOfTextBox, "Automation User");
	    sendKeys(checkoutPage.ReviewDetailsPONumberTextBox, "Automation Test Number");
	    sendKeys(checkoutPage.ReviewDetailsJobNameTextBox, "Automation user placing an order");
	    Thread.sleep(2000);
	}

	@Then("^click on place order$")
	public void click_on_place_order() throws Throwable {
		isElementDisplayed(checkoutPage.CheckoutStickyPlaceOrderButton, true);
	    jsClick(checkoutPage.CheckoutStickyPlaceOrderButton);
	}

	@Then("^User will be redirected to order confirmation page$")
	public void user_will_be_redirected_to_order_confirmation_page() throws Throwable {
		isElementDisplayed(orderConfirmationPage.OrderConfMessageText, true);
	}

}
