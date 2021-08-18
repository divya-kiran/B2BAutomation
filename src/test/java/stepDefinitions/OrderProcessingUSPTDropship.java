package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.PDPPage;


public class OrderProcessingUSPTDropship extends BaseClass {
	PDPPage pdpPage = PageFactory.initElements(driver, PDPPage.class);
	CheckoutPage checkout = PageFactory.initElements(driver, CheckoutPage.class);
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	
	String pdpurl = configFileReader.getApplicationUrl();
	
	@Given("^User will navigate to PDP page of product \"([^\"]*)\"$")
	public void user_will_navigate_to_PDP_page_of_product(String arg1) throws Throwable {
		driver.navigate().to(pdpurl+arg1);
	}

	@Given("^User will Add product to cart from PDP page$")
	public void user_will_Add_product_to_cart_from_PDP_page() throws Throwable {
		Thread.sleep(2000);
		jsClick(pdpPage.ProductAddToCartCTA);
		Thread.sleep(2000);
		click(homePage.LiftMasterLogo);
	}
	@Then("^User will click on dropship address link$")
	public void user_will_Click_on_dropship_address_link() throws Throwable {
		click(checkout.AddDropshipAddressLink);
		Thread.sleep(5000);
	}
	@Then("^User will verify elements present in dropship address pop up$")
	public void user_will_verify_elements_present_in_dropship_address_pop_up() throws Throwable {
	    isElementDisplayed(checkout.DropShipAddressHeaderLabel, true);
	    isElementDisplayed(checkout.DropShipAddressRequiredLabel, true);
	    isElementDisplayed(checkout.DropShipAddressFirstNameLabel, true);
	    isElementDisplayed(checkout.DropShipAddressLastNameLabel, true);
	    isElementDisplayed(checkout.DropShipAddressFirstName, true);
	    isElementDisplayed(checkout.DropShipAddressLastName, true);
	    isElementDisplayed(checkout.DropShipAddressCountryNameLabel, true);
	    isElementDisplayed(checkout.DropShipAddressAddress1Label, true);
	    isElementDisplayed(checkout.DropShipAddressLine1, true);
	    isElementDisplayed(checkout.DropShipAddressLine2, true);
	    isElementDisplayed(checkout.DropShipAddressCityNameLabel, true);
	    isElementDisplayed(checkout.DropShipAddressCityName, true);
	    isElementDisplayed(checkout.DropShipAddressPostalCode, true);
	    isElementDisplayed(checkout.DropShipAddressPostalCodeLabel, true);
	    isElementDisplayed(checkout.DropShipAddressCancelButton, true);
	    isElementDisplayed(checkout.DropShipAddressSaveButton, true);
	}

	@Then("^User will add US dropship address$")
	public void user_will_add_US_dropship_address() throws Throwable {
	    sendKeys(checkout.DropShipAddressFirstName, "Automation");
	    sendKeys(checkout.DropShipAddressLastName, "User");
	    isElementDisplayed(checkout.DropShipAddressHeaderLabel, true);
	    click(checkout.DropShipAddressCountryNameLabel);
	    click("//li[@class='p3-dropdown__item']");
	    Thread.sleep(2000);
	    sendKeys(checkout.DropShipAddressLine1, "581  Glen Street");
	    sendKeys(checkout.DropShipAddressCityName, "Buffalo");
	    isElementDisplayed(checkout.DropShipAddressHeaderLabel, true);
	    click(checkout.DropShipAddressStateNameLabel);
	    click("//input[@value='US-AZ']//parent::label");
	    sendKeys(checkout.DropShipAddressCityName, "Kentucky");
	    sendKeys(checkout.DropShipAddressPostalCode, "42716");
	    click(checkout.DropShipAddressHeaderLabel);
	    Thread.sleep(2000);
	    ScrollToElement(checkout.DropShipAddressSaveButton);
	    jsClick(checkout.DropShipAddressSaveButton);
	    Thread.sleep(15000);
	}

}
