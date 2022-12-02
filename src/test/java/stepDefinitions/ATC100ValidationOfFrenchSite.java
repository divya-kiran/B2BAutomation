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

public class ATC100ValidationOfFrenchSite extends BaseClass {
	PLPPage plpPage = PageFactory.initElements(driver, PLPPage.class);
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	PDPPage pdpPage = PageFactory.initElements(driver, PDPPage.class);
	CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
	CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
	OrderConfirmationPage orderConfirmationPage = PageFactory.initElements(driver, OrderConfirmationPage.class);
	
	@Then("^Navigate to french site and login as user$")
	public void navigate_to_french_site_and_login_as_user() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
		driver.navigate().to("https://frca-liftmaster-partner-uat.onelink-translations.com/login");
		pageLoadTimeout();
	   sendKeys(loginpage.userName, "automationuseruspt@mailinator.com");
	   sendKeys(loginpage.password, "Test@123");
	   click(loginpage.PartnerAccountSignInHeaderfr);
	   jsClick(loginpage.signinButton);	    
	}

	@Then("^verify log in success for french site$")
	public void verify_log_in_success_for_french_site() throws Throwable {
		isElementDisplayed(homepage.HeaderSearchTextBox, true);	    
	}

	@Then("^Verify Homepage header content$")
	public void verify_Homepage_header_content() throws Throwable {
	    isElementDisplayed(homepage.frOrderStatusLink, true);
	    isElementDisplayed(homepage.frquickOrderLink, true);
	    isElementDisplayed(homepage.frMiniCartFlyer, true);
	    isElementDisplayed(homepage.frPartnerProgmTab, true);
	    isElementDisplayed(homepage.frProductsTab, true);
	    isElementDisplayed(homepage.frPartsTab, true);
	    isElementDisplayed(homepage.frResources, true);
	}

	@Then("^navigate to PLP page and verify PLP page$")
	public void navigate_to_PLP_page_and_verify_PLP_page() throws Throwable {
	    driver.navigate().to("https://frca-liftmaster-partner-uat.onelink-translations.com/c/15-11");
	    //Verify products displayed in PLP page
	}

	@Then("^navigate to any PDP page and verify PDP page$")
	public void navigate_to_any_PDP_page_and_verify_PDP_page() throws Throwable {
	    driver.navigate().to("https://frca-liftmaster-partner-uat.onelink-translations.com/p/041A5507-7C");
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

	@Then("^Add product to cart in french site$")
	public void add_product_to_cart_in_french_site() throws Throwable {
	    jsClick(pdpPage.ProductAddToCartCTA);
	    jsClick(homepage.LiftMasterLogo);
	}

	@Then("^Navigate to cart page$")
	public void navigate_to_cart_page() throws Throwable {
	    driver.navigate().to("https://frca-liftmaster-partner-uat.onelink-translations.com/cart");
	}

	@Then("^Proceed to checkout page$")
	public void proceed_to_checkout_page() throws Throwable {
	    jsClick(cartPage.frCartPageCheckoutButton);	    
	}

	@Then("^enter details in the check out page$")
	public void enter_details_in_the_check_out_page() throws Throwable {
		isElementDisplayed(checkoutPage.frCheckoutPageHeader, true);
		ScrollToElement(checkoutPage.ShippingandDeliverySaveButton);
	    jsClick(checkoutPage.ShippingandDeliverySaveButton);
	    isElementDisplayed(checkoutPage.frReviewDetailsAttentionOfTextBox, true);
		sendKeys(checkoutPage.frReviewDetailsAttentionOfTextBox, "Automation User");
	    sendKeys(checkoutPage.frReviewDetailsPONumberTextBox, "Automation Test Number");
	    sendKeys(checkoutPage.ReviewDetailsJobNameTextBox, "Automation user placing an order");
	}

	@Then("^Place the order in french site$")
	public void place_the_order_in_french_site() throws Throwable {
		Thread.sleep(2000);
	    jsClick(checkoutPage.CheckoutStickyPlaceOrderButton); 
	}

	@Then("^verify order confirmation page for french site$")
	public void verify_order_confirmation_page_for_french_site() throws Throwable {
		isElementDisplayed(orderConfirmationPage.frOrderConfMessageText, true);	    
	}
}