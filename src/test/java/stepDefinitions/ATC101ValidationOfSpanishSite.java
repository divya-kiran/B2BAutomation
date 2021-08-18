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
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.OrderConfirmationPage;
import pageObjects.OrderHistoryDetailsPage;
import pageObjects.PDPPage;
import pageObjects.PLPPage;
import pageObjects.ProfilePage;
import pageObjects.StickyHeaderPage;

public class ATC101ValidationOfSpanishSite extends BaseClass {
	PLPPage plpPage = PageFactory.initElements(driver, PLPPage.class);
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	PDPPage pdpPage = PageFactory.initElements(driver, PDPPage.class);
	CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
	CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
	OrderConfirmationPage orderConfirmationPage = PageFactory.initElements(driver, OrderConfirmationPage.class);
	
	@Given("^Navigate to spanish site and login as credit card user$")
	public void navigate_to_spanish_site_and_login_as_credit_card_user() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
		driver.navigate().to("https://es-liftmaster-partner-uat.onelink-translations.com/login");
		pageLoadTimeout();
	   sendKeys(loginpage.userName, "automationuseruscc@mailinator.com");
	   sendKeys(loginpage.password, "Test@123");
	   click(loginpage.PartnerAccountSignInHeaderesp);
	   jsClick(loginpage.signinButton);	 	    
	}

	@Given("^verify log in success for spanish site$")
	public void verify_log_in_success_for_spanish_site() throws Throwable {
		isElementDisplayed(homepage.HeaderSearchTextBox, true);	 	    
	}

	@Given("^Verify Homepage header content for spanish site$")
	public void verify_Homepage_header_content_for_spanish_site() throws Throwable {
		isElementDisplayed(homepage.espOrderStatusLink, true);
	    isElementDisplayed(homepage.espquickOrderLink, true);
	    isElementDisplayed(homepage.espMiniCartFlyer, true);
	    isElementDisplayed(homepage.espPartnerProgmTab, true);
	    isElementDisplayed(homepage.espProductsTab, true);
	    isElementDisplayed(homepage.espPartsTab, true);
	    isElementDisplayed(homepage.espResources, true);	    
	}

	@Given("^navigate to PLP page and verify PLP page of spanish site$")
	public void navigate_to_PLP_page_and_verify_PLP_page_of_spanish_site() throws Throwable {
	    driver.navigate().to("https://es-liftmaster-partner-uat.onelink-translations.com/c/gates");
	    //verify PLP page 
	}

	@Given("^navigate to any PDP page and verify PDP page of spanish site$")
	public void navigate_to_any_PDP_page_and_verify_PDP_page_of_spanish_site() throws Throwable {
		driver.navigate().to("https://es-liftmaster-partner-uat.onelink-translations.com/p/041A5507-7C");
	    pageLoadTimeout();
	    isElementDisplayed(pdpPage.ProductHeroImage, true);
	    isElementDisplayed(pdpPage.ProductThumbnailImage, true);
	    ScrollToElement(pdpPage.ProductTitle);
		isElementDisplayed(pdpPage.ProductTitle, true);
	    isElementDisplayed(pdpPage.ProductSummary, true);
	    isElementDisplayed(pdpPage.ProductPrice, true);
	    isElementDisplayed(pdpPage.ProductPriceDisclaimer, true);
	    isElementDisplayed(pdpPage.ProductQTYBox, true);
	    isElementDisplayed(pdpPage.ProductAddToCartCTA, true);	    
	}

	@Given("^Add product to cart in spanish site$")
	public void add_product_to_cart_in_spanish_site() throws Throwable {
		jsClick(pdpPage.ProductAddToCartCTA);
	    jsClick(homepage.LiftMasterLogo);	    
	}

	@Given("^Navigate to cart page in spanish site$")
	public void navigate_to_cart_page_in_spanish_site() throws Throwable {
	    driver.navigate().to("https://es-liftmaster-partner-uat.onelink-translations.com/cart");	    
	}

	@Given("^Proceed to checkout page in spanish site$")
	public void proceed_to_checkout_page_in_spanish_site() throws Throwable {
		jsClick(cartPage.espCartPageCheckoutButton);	 
	}

	@Given("^enter details in the check out page spanish site$")
	public void enter_details_in_the_check_out_page_spanish_site() throws Throwable {
		isElementDisplayed(checkoutPage.frCheckoutPageHeader, true);
		ScrollToElement(checkoutPage.ShippingandDeliverySaveButton);
	    jsClick(checkoutPage.ShippingandDeliverySaveButton);
	    Thread.sleep(6000);
		driver.switchTo().frame("xiFrameHosted");
		driver.switchTo().frame("xieCommFrame");
		/*selectByText(checkoutPage.PaymentSectionCardType, arg1);
		sendKeys(checkoutPage.PaymentSectionCardNumber, arg2);
		selectByText(checkoutPage.PaymentSectionExpMonth, arg3);
		selectByText(checkoutPage.PaymentSectionExpYear, arg4);
		sendKeys(checkoutPage.PaymentSectionCVV, arg5);
		sendKeys(checkoutPage.PaymentSectionCardName, arg6);
		switchToDefault();*/
	    switchToDefault();
		jsClick(checkoutPage.PaymentSectionSaveButton);
		Thread.sleep(6000);
	    isElementDisplayed(checkoutPage.frReviewDetailsAttentionOfTextBox, true);
		sendKeys(checkoutPage.frReviewDetailsAttentionOfTextBox, "Automation User");
	    sendKeys(checkoutPage.frReviewDetailsPONumberTextBox, "Automation Test Number");
	    sendKeys(checkoutPage.ReviewDetailsNotesTextBox, "Automation user placing an order");	    
	}

	@Given("^Place the order in spanish site$")
	public void place_the_order_in_spanish_site() throws Throwable {
	    
	    
	}

	@Given("^verify order confirmation page for spanish site$")
	public void verify_order_confirmation_page_for_spanish_site() throws Throwable {
	    
	    
	}
}