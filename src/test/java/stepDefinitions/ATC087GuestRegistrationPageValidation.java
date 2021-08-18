package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class ATC087GuestRegistrationPageValidation extends BaseClass {
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

	@Then("^user click on my company doesnt have a liftmaster partner account$")
	public void user_click_on_my_company_doesnt_have_a_liftmaster_partner_account() throws Throwable {
	    jsClick(loginPage.GuestRegBtn);
	}

	@Then("^user Verify guest registration page title and header$")
	public void user_Verify_guest_registration_page_title_and_header() throws Throwable {
	    verifypageURL("/guestregister");
	    verifypagetitle("Register Page |");
	}

	@Then("^user verify all web elements in guest registration page$")
	public void user_verify_all_web_elements_in_guest_registration_page() throws Throwable {
		isElementDisplayed(loginPage.GuestRegHeading, true);
		isElementDisplayed(loginPage.GuestRegReqLabel, true);
		isElementDisplayed(loginPage.GuestRegLabel, true);
		isElementDisplayed(loginPage.GuestRegInterestedMsg, true);
		ScrollToElement(loginPage.GuestRegInterestedMsg);
	}

	@Then("^user fills all mandatory fields in guest registration page$")
	public void user_fills_all_mandatory_fields_in_guest_registration_page() throws Throwable {
	    sendKeys(loginPage.FNameandLName, "Guest User");
	    sendKeys(loginPage.BusinessNameTB, "Test Company");
	    jsClick(loginPage.GuestCountryDD);
	    jsClick(loginPage.CountryDDUSVal);
	    sendKeys(loginPage.GuestLine1TB, "2991 Brighton Circle Road");
	    sendKeys(loginPage.GuestLine2TB, "Test Line");
	    sendKeys(loginPage.GuestCityTB, "Saint Cloud");
	    jsClick(loginPage.GuestStateDD);
	    jsClick(loginPage.GuestStateDDVal);
	    sendKeys(loginPage.GuestPostCodeTB, "86401");
	    ScrollToElement(loginPage.GuestLine1TB);
	    sendKeys(loginPage.PrimaryPhoneTB, "1234567890");
	    sendKeys(loginPage.GuestSecondaryPhnTB, "1234567890");
	    sendKeys(loginPage.EmailAddTB, "guestuser12345@mailinator.com");
	    sendKeys(loginPage.EmailConfTB, "guestuser12345@mailinator.com");
	    sendKeys(loginPage.PasswordTB, "Test@123");
	    sendKeys(loginPage.ConfirmPwbTB, "Test@123");
	    ScrollToElement(loginPage.GuestCityTB);
	    click(loginPage.EmailAddTB);
	    isElementDisplayed(loginPage.GuestCancelBtn, true);
	    isElementDisplayed(loginPage.GuestSaveBtn, true);
	}

	@Then("^verify signup button in guest registration page$")
	public void verify_signup_button_in_guest_registration_page() throws Throwable {
		loginPage.GuestSaveBtn.isEnabled();
	}
}