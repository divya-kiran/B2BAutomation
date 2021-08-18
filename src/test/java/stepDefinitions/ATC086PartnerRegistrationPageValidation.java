package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class ATC086PartnerRegistrationPageValidation extends BaseClass {
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

	@Then("^user click on i know my company account number$")
	public void user_click_on_i_know_my_company_account_number() throws Throwable {
	    jsClick(loginPage.IKnowbtn);
	}

	@Then("^user Verify partner registration page title and header$")
	public void user_Verify_partner_registration_page_title_and_header() throws Throwable {
	    verifypagetitle("Register Page |");
	    verifypageURL("/register");
	}

	@Then("^user verify all web elements in partner registration page$")
	public void user_verify_all_web_elements_in_partner_registration_page() throws Throwable {
	    isElementDisplayed(loginPage.RegisterPageHeader, true);
	    ScrollToElement(loginPage.RegisterPageHeader);
	}

	@Then("^user fills all mandatory fields in partner registration page$")
	public void user_fills_all_mandatory_fields_in_partner_registration_page() throws Throwable {
		sendKeys(loginPage.AccountNumberTB, "111003");
	    sendKeys(loginPage.PostalCodeTB, "60523");
	    sendKeys(loginPage.FNameandLName, "Automation User");
	    jsClick(loginPage.PositionDD);
	    isElementDisplayed(loginPage.PositionDDOwnerVal, true);
	    isElementDisplayed(loginPage.PositionDDPurchasingVal, true);
	    isElementDisplayed(loginPage.PositionDDSalesVal, true);
	    isElementDisplayed(loginPage.PositionDDBranchVal, true);
	    isElementDisplayed(loginPage.PositionDDMarketingVal, true);
	    isElementDisplayed(loginPage.PositionDDServiceVal, true);
	    isElementDisplayed(loginPage.PositionDDTechVal, true);
	    jsClick(loginPage.PositionDDOwnerVal);
	    jsClick(loginPage.CountryDD);
	    jsClick(loginPage.CountryDDUSVal);
	    sendKeys(loginPage.PrimaryPhoneTB, "1234567890");
	    sendKeys(loginPage.SecondaryPhnTB, "1234567890");
	    sendKeys(loginPage.EmailAddTB, "Automation12345@mailinator.com");
	    sendKeys(loginPage.EmailConfTB, "Automation12345@mailinator.com");
	    sendKeys(loginPage.PasswordTB, "Test@123");
	    sendKeys(loginPage.ConfirmPwbTB, "Test@123");
	    ScrollToElement(loginPage.FNameandLName);
	   // isElementDisplayed(loginPage.ReCaptcha, true);
	    click(loginPage.PrimaryPhoneTB);
	    isElementDisplayed(loginPage.RegFormCancelBtn, true);
	    isElementDisplayed(loginPage.RegFormSignUPBtn, true);
	    loginPage.RegFormSignUPBtn.isEnabled();
	}
	
	@Then("^user click on i donot know my company account number$")
	public void user_click_on_i_donot_know_my_company_account_number() throws Throwable {
	    jsClick(loginPage.IdontKnowbtn);
	}

	@Then("^user verify request access pop up$")
	public void user_verify_request_access_pop_up() throws Throwable {
	    isElementDisplayed(loginPage.RequestAccessPopUP, true);
	    isElementDisplayed(loginPage.RequestAccessPopUPText, true);
	}
}