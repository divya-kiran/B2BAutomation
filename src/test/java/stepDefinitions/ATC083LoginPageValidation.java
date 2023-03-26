package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class ATC083LoginPageValidation extends BaseClass {
	LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
	}

	@Then("^Verify web elements in sign in modal$")
	public void verify_web_elements_in_sign_in_modal() throws Throwable {
	    isElementDisplayed(loginPage.PartnerAccountSignInHeader, true);
	    isElementDisplayed(loginPage.userName, true);
	    isElementDisplayed(loginPage.password, true);
	    isElementDisplayed(loginPage.signinButton, true);
	    isElementDisplayed(loginPage.RememberMeCheckBox, true);
	    isElementDisplayed(loginPage.ForgotPasswordButton, true);
	}

	@Then("^Verify signup now link$")
	public void verify_signup_now_link() throws Throwable {
		ScrollToElement(loginPage.DontHaveAccountLabel);
		isElementDisplayed(loginPage.SignUpLink, true);
		isElementDisplayed(loginPage.DontHaveAccountLabel, true);
	}

	@Then("^Verify header and footer is displayed in login page$")
	public void verify_header_and_footer_is_displayed_in_login_page() throws Throwable {
		ScrollToElement(loginPage.LanguageSelector);
		isElementDisplayed(homePage.LiftMasterLogo, true);
	    isElementDisplayed(loginPage.LanguageSelector, true);
	    ScrollToElement(homePage.PrivacyPolicyFooterLink);
	    isElementDisplayed(homePage.PrivacyPolicyFooterLink, true);
	    isElementDisplayed(homePage.PartnerSupportFooterLink, true);
	    isElementDisplayed(homePage.DonotSellMyPersonalInfoFooterLink, true);
	    isElementDisplayed(homePage.FooterCopyright, true);
	    isElementDisplayed(homePage.FooterFaceboobLink, true);
	    isElementDisplayed(homePage.FooterTwitterLink, true);
	    isElementDisplayed(homePage.FooterInstagramLink, true);
	    isElementDisplayed(homePage.FooterYouTubeLink, true);
	}
	
	@Then("^Clicks on forgot Password Link$")
	public void clicks_on_forgot_Password_Link() throws Throwable {
	    isElementDisplayed(loginPage.ForgotPasswordButton, true);
		jsClick(loginPage.ForgotPasswordButton);
	}

	@Then("^Verify web elements of forgot password PopUP$")
	public void verify_web_elements_of_forgot_password_PopUP() throws Throwable {
	    isElementDisplayed(loginPage.ForgotPwdPopupHeader, true);
	    isElementDisplayed(loginPage.ForgotPwdPopupReqLabel, true);
	    isElementDisplayed(loginPage.ForgotPwdPopupText, true);
	    isElementDisplayed(loginPage.EmailAdd, true);
	    isElementDisplayed(loginPage.ForgotPwdSendEmailBtn, true);
	    isElementDisplayed(loginPage.ForgotPwdCancelBtn, true);
	}
	
	@Then("^Clicks on sign up now Link$")
	public void clicks_on_sign_up_now_Link() throws Throwable {
		jsClick(loginPage.SignUpLink);
		verifypageURL("/registersplash");
	}

	@Then("^Verify web elements in Register spalsh Page$")
	public void verify_web_elements_in_Register_spalsh_Page() throws Throwable {
		isElementDisplayed(loginPage.RegisterSplashPageHeading, true);
	    isElementDisplayed(loginPage.RegisterSplashPageLabel, true);
	    isElementDisplayed(loginPage.IKnowbtn, true);
	    isElementDisplayed(loginPage.IdontKnowbtn, true);
	    isElementDisplayed(loginPage.GuestRegBtn, true);
	}
	
	@Then("^user enters email address in forgot password text box$")
	public void user_enters_email_address_in_forgot_password_text_box() throws Throwable {
		sendKeys(loginPage.EmailAdd, "automationusercacc@mailinator.com");
		isElementDisplayed(loginPage.ForgotPwdPopupHeader, true);
		click(loginPage.ForgotPwdPopupHeader);
	}

	@Then("^clicks on send email$")
	public void clicks_on_send_email() throws Throwable {
	    jsClick(loginPage.ForgotPwdSendEmailBtn);
	}

	@Then("^user enters chamberlain email address in forgot password text box$")
	public void user_enters_chamberlain_email_address_in_forgot_password_text_box() throws Throwable {
		sendKeys(loginPage.EmailAdd, "divya.kiran@chamberlain.com");
		isElementDisplayed(loginPage.ForgotPwdPopupHeader, true);
		click(loginPage.ForgotPwdPopupHeader);
	}

	@Then("^verifies forgotten password email receipt and navigate to mail body$")
	public void verifies_forgotten_password_email_receipt_and_navigate_to_mail_body() throws Throwable {
		isElementDisplayed("(//td[contains(text(),'Forgotten Password')])[1]", true);
		click("(//td[contains(text(),'Forgotten Password')])[1]");	
	}

	@Then("^verifies web elements in email confirmation body for forgot password email$")
	public void verifies_web_elements_in_email_confirmation_body_for_forgot_password_email() throws Throwable {
		driver.switchTo().frame("html_msg_body");
		Thread.sleep(3000);
		isElementDisplayed("//span[contains(text(),'reset your password')][1]", true);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[contains(text(),'reset your password')][1]")));
		} catch (Exception e) {
			e.printStackTrace();
			driver.navigate().to(configFileReader.getApplicationUrl());
		} 
		isElementDisplayed("//a[contains(text(),'RESET MY PASSWORD')]", true);
		isElementDisplayed("//a[contains(text(),'login page')]", true);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[contains(text(),'300 Windsor Drive Oak Brook, IL')]")));
		} catch (Exception e) {
			e.printStackTrace();
			driver.navigate().to(configFileReader.getApplicationUrl());
		}
		isElementDisplayed("//span[contains(text(),'2023 The Chamberlain Group LLC')]", true);
		isElementDisplayed("//span[contains(text(),'300 Windsor Drive Oak Brook, IL')]", true);
		driver.navigate().to(configFileReader.getApplicationUrl());
	}
}