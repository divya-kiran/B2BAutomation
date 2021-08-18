package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.CheckoutPage;
import pageObjects.LoginPage;

public class OrderprocessingCAPT extends BaseClass {
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	CheckoutPage checkout = PageFactory.initElements(driver, CheckoutPage.class);
	
	@Then("^User will add CA dropship address$")
	public void user_will_add_CA_dropship_address() throws Throwable {

	    sendKeys(checkout.DropShipAddressFirstName, "Automation");
	    sendKeys(checkout.DropShipAddressLastName, "User");
	    isElementDisplayed(checkout.DropShipAddressHeaderLabel, true);
	    click(checkout.DropShipAddressCountryNameLabel);
	    click("//li[@class='p3-dropdown__item']");
	    Thread.sleep(2000);
	    sendKeys(checkout.DropShipAddressLine1, "4879 Blind Bay Road");
	    sendKeys(checkout.DropShipAddressCityName, "Sicamous");
	    isElementDisplayed(checkout.DropShipAddressHeaderLabel, true);
	    click(checkout.DropShipAddressStateNameLabel);
	    click("//input[@value='CA-BC']//parent::label");
	    sendKeys(checkout.DropShipAddressPostalCode, "V0E 2V0");
	    click(checkout.DropShipAddressHeaderLabel);
	    Thread.sleep(2000);
	    ScrollToElement(checkout.DropShipAddressSaveButton);
	    jsClick(checkout.DropShipAddressSaveButton);
	    Thread.sleep(15000);
	}
}
