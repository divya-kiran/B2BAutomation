package stepDefinitions;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.ProfilePage;

public class ATC033ProfileSecPositiveScenarios extends BaseClass {
	ProfilePage profilePage= PageFactory.initElements(driver, ProfilePage.class);
	
	@Given("^User navigate to myaccount page$")
	public void user_navigate_to_myaccount_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"my-account");
	}

	@Given("^user verifies profile Section Name and contact web elements$")
	public void user_verifies_profile_Section_Name_and_contact_web_elements() throws Throwable {
	    isElementDisplayed(profilePage.ProfileHeading, true);
	    isElementDisplayed(profilePage.NameandContactHeading, true);
	    //isElementDisplayed(profilePage.NameandcontactRequiredLabel, true);
	    isElementDisplayed(profilePage.FirstNameAndLastNameLabel, true);
	    isElementDisplayed(profilePage.FirstNameAndLastNameTextBox, true);
	    isElementDisplayed(profilePage.CompanyNameLabel, true);
	    isElementDisplayed(profilePage.CompanyNameTB, true);
	    isElementDisplayed(profilePage.PositionDD, true);
	    click(profilePage.PositionDD);
	    isElementDisplayed(profilePage.PositionDD1, true);
	    isElementDisplayed(profilePage.PositionDD2, true);
	    isElementDisplayed(profilePage.PositionDD3, true);
	    isElementDisplayed(profilePage.PositionDD4, true);
	    isElementDisplayed(profilePage.PositionDD5, true);
	    isElementDisplayed(profilePage.PrimaryPhoneLabel, true);
	    isElementDisplayed(profilePage.PrimaryPhoneTB, true);
	    isElementDisplayed(profilePage.SecondaryPhoneTB, true);
	    click(profilePage.PositionDD1);
	}

	@Given("^user verifies profile Section Update Password web elements$")
	public void user_verifies_profile_Section_Update_Password_web_elements() throws Throwable {
		isElementDisplayed(profilePage.UpdatePasswordHeading, true);
	    isElementDisplayed(profilePage.UpdatePassReqLabel, true);
	    isElementDisplayed(profilePage.OldPasswordTB, true);
	    isElementDisplayed(profilePage.NewPasswordTB, true);
	    isElementDisplayed(profilePage.ConfirmNewPasswordTB, true);
	}

	@Then("^Verifies required error for first name and last name text box$")
	public void verifies_required_error_for_first_name_and_last_name_text_box() throws Throwable {
	    jsClick(profilePage.FirstNameAndLastNameTextBox);
	    clear(profilePage.FirstNameAndLastNameTextBox);
	    click(profilePage.NameandContactHeading);
	    isElementDisplayed(profilePage.FirstNameAndLastNameReqMsg, true);
	    profilePage.ProfileCancelButton.isEnabled();
	    sendKeys(profilePage.FirstNameAndLastNameTextBox, "AutomationUser USPT");
	}

	@Then("^Verifies required error for primary phone$")
	public void verifies_required_error_for_Company_name() throws Throwable {
	    clear(profilePage.PrimaryPhoneTB);
	    click(profilePage.NameandContactHeading);
	    isElementDisplayed("//input[@id='account-form__primary-phone']//parent::label//span[contains(text(),'Required')]", true);
	    
	}

	@Then("^verifies cancel button is enabled$")
	public void verifies_cancel_button_is_enabled() throws Throwable {
		//jsClick(profilePage.ProfileCancelButton);
	}

	@Then("^User enter text in the text boxes present in Name and contact section$")
	public void user_enter_text_in_the_text_boxes_present_in_Name_and_contact_section() throws Throwable {
		Random rnd = new Random();
	    int number = rnd.nextInt(999999999);
	    sendKeys(profilePage.PrimaryPhoneTB, Integer.toString(number)+"0");
	    sendKeys(profilePage.FirstNameAndLastNameTextBox, "AutomationUser USPT");
		click(profilePage.NameandContactHeading);
		click(profilePage.PositionDD);
		click(profilePage.PositionDD1);
	}

	@Then("^Verify save button is enabled$")
	public void verify_save_button_is_enabled() throws Throwable {
		profilePage.ProfileSaveButton.isEnabled();
	}

	@Then("^Click on save button name and contact and verifies success toast message$")
	public void click_on_save_button_name_and_contact_and_verifies_success_toast_message() throws Throwable {
	    jsClick(profilePage.ProfileSaveButton);
	    isElementDisplayed(profilePage.ToastMsgNameandContact, true);
	}

	@Then("^Enters old password in update password section$")
	public void enters_old_password_in_update_password_section() throws Throwable {
	    sendKeys(profilePage.OldPasswordTB, "Test@123");
	}

	@Then("^Enter new passwords in update password section$")
	public void enter_new_passwords_in_update_password_section() throws Throwable {
		sendKeys(profilePage.NewPasswordTB, "Test@123");
		sendKeys(profilePage.ConfirmNewPasswordTB, "Test@123");
		Thread.sleep(4000);
		click(profilePage.UpdatePasswordHeading);
	}

	@Then("^Click on save button in update password section and verifies success toast message$")
	public void click_on_save_button_in_update_password_section_and_verifies_success_toast_message() throws Throwable {
		jsClick(profilePage.UpdatePassSaveButton);
	    isElementDisplayed(profilePage.ToastMsgPassword, true);
	}
}
