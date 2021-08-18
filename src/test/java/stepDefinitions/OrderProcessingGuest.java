package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.CheckoutPage;
import pageObjects.LoginPage;

public class OrderProcessingGuest extends BaseClass {
	LoginPage loginpage= PageFactory.initElements(driver, LoginPage.class);
	CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
	   
	@Then("^User will fill details in review order section for guest$")
	public void i_will_fill_details_in_review_order_section_for_guest() throws Throwable {
	    sendKeys(checkoutPage.ReviewDetailsAttentionOfTextBox, "Automation User");
	    sendKeys(checkoutPage.ReviewDetailsNotesTextBox, "Automation user placing an order");
	}
}
