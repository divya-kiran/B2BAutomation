package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;


public class SmokeOrderProcessingCACC extends BaseClass {
	CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
	CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	
	String appurlCart = configFileReader.getApplicationUrl();
	
	@And("^User will enter credit card details for credit card details Card name \"([^\"]*)\" card number \"([^\"]*)\" Exp Month \"([^\"]*)\" Exp Year\"([^\"]*)\" CVV \"([^\"]*)\" CardHolder Name \"([^\"]*)\"$")
	public void i_will_enter_credit_card_details_for_credit_card_details_Card_name_card_number_Exp_Month_Exp_Year_CVV_CardHolder_Nmae(String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
		Thread.sleep(6000);
		driver.switchTo().frame("xiFrameHosted");
		driver.switchTo().frame("xieCommFrame");
		selectByText(checkoutPage.PaymentSectionCardType, arg1);
		sendKeys(checkoutPage.PaymentSectionCardNumber, arg2);
		selectByText(checkoutPage.PaymentSectionExpMonth, arg3);
		selectByText(checkoutPage.PaymentSectionExpYear, arg4);
		sendKeys(checkoutPage.PaymentSectionCVV, arg5);
		sendKeys(checkoutPage.PaymentSectionCardName, arg6);
		switchToDefault();
	}
	
	@And("^User will click on payment section save button$")
	public void i_will_click_on_payment_section_save_button() throws Throwable {
		switchToDefault();
		jsClick(checkoutPage.PaymentSectionSaveButton);
		Thread.sleep(6000);
	}

	
}
