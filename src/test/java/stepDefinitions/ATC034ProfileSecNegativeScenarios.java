package stepDefinitions;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.ProfilePage;

public class ATC034ProfileSecNegativeScenarios extends BaseClass {
	ProfilePage profilePage= PageFactory.initElements(driver, ProfilePage.class);

	@Then("^user validates First name and last name text box with invalid values$")
	public void user_validates_First_name_and_last_name_text_box_with_invalid_values() throws Throwable {
	    sendKeys(profilePage.FirstNameAndLastNameTextBox, "Name with more than fifty characters this should through an error message like name is too long");
	    click(profilePage.NameandContactHeading);
	    jsClick(profilePage.ProfileSaveButton);
	    isElementDisplayed(profilePage.ToastMsgLongName, true);
	    isElementDisplayed(profilePage.ErrorMsgLongName, true);
	    sendKeys(profilePage.FirstNameAndLastNameTextBox,"AutomationUser USPT");
	    click(profilePage.NameandContactHeading);
	    jsClick(profilePage.ProfileSaveButton);
	    isElementDisplayed(profilePage.ToastMsgNameandContact, true);
	}

	@Then("^Verifies Primary phone with invalid mobile numbers$")
	public void verifies_Primary_phone_with_invalid_mobile_numbers() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"my-account");
		sendKeys(profilePage.PrimaryPhoneTB, "123456789012");
		click(profilePage.NameandContactHeading);
		jsClick(profilePage.ProfileSaveButton);
		isElementDisplayed(profilePage.ToastMsgPriPhoneNum, true);
		isElementDisplayed(profilePage.ErrorMsgInvalidPhnNum, true);
		sendKeys(profilePage.PrimaryPhoneTB, "1234567890");
		click(profilePage.NameandContactHeading);
		jsClick(profilePage.ProfileSaveButton);
	}

	@Then("^user validates old password text box with invalid password$")
	public void user_validates_old_password_text_box_with_invalid_password() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"my-account");
		sendKeys(profilePage.OldPasswordTB, "Test1212");
		sendKeys(profilePage.NewPasswordTB, "Test@123");
		sendKeys(profilePage.ConfirmNewPasswordTB, "Test@123");
		click(profilePage.UpdatePasswordHeading);
		jsClick(profilePage.UpdatePassSaveButton);
		isElementDisplayed(profilePage.ErrorMsgWrongPass, true);
	}

	@Then("^Verifies too short password$")
	public void verifies_too_short_password() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"my-account");
		sendKeys(profilePage.NewPasswordTB, "Tes");
		isElementDisplayed(profilePage.ErrorMsgTooShort, true);
	}

	@Then("^verifies Weak Medium and strong security passwords$")
	public void verifies_Weak_Medium_and_strong_security_passwords() throws Throwable {
		sendKeys(profilePage.NewPasswordTB, "Testtest");
		isElementDisplayed(profilePage.ErrorMsgWeakSec, true);
		sendKeys(profilePage.NewPasswordTB, "Test@12");
		isElementDisplayed(profilePage.ErrorMsgMedSec, true);
		sendKeys(profilePage.NewPasswordTB, "Test@123");
		isElementDisplayed(profilePage.ErrorMsgStrongSec, true);
		sendKeys(profilePage.NewPasswordTB, "Test@");
		isElementDisplayed(profilePage.ErrorMsgPassDonotMatch, true);
	}

	@Then("^verifies password matching$")
	public void verifies_password_matching() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"my-account");
		sendKeys(profilePage.OldPasswordTB, "Test@123");
		sendKeys(profilePage.NewPasswordTB, "Test@123");
		sendKeys(profilePage.ConfirmNewPasswordTB, "Test@123");
		click(profilePage.UpdatePasswordHeading);
		jsClick(profilePage.UpdatePassSaveButton);
		isElementDisplayed(profilePage.ToastMsgPassword, true);
	}
}
