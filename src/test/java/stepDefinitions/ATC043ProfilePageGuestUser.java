package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.ProfilePage;

public class ATC043ProfilePageGuestUser extends BaseClass {
	ProfilePage profilePage= PageFactory.initElements(driver, ProfilePage.class);

	@Then("^User verifies name and contact details section$")
	public void user_verifies_name_and_contact_details_section() throws Throwable {
	    isElementDisplayed(profilePage.ProfileHeading, true);
	    isElementDisplayed(profilePage.NameandContactHeading, true);
	    isElementDisplayed(profilePage.FirstNameAndLastNameLabel, true);
	    isElementDisplayed(profilePage.CompanyNameLabel, true);
	    isElementDisplayed(profilePage.PrimaryPhoneLabel, true);
	}

	@Then("^User verifies update password section$")
	public void user_verifies_update_password_section() throws Throwable {
		isElementDisplayed(profilePage.UpdatePasswordHeading, true);
	    isElementDisplayed(profilePage.OldPasswordTB, true);
	    isElementDisplayed(profilePage.NewPasswordTB, true);
	    isElementDisplayed(profilePage.ConfirmNewPasswordTB, true);
	}

	@Then("^User verifies ship to sold to manage user and invite user section is not displayed for guest user$")
	public void user_verifies_ship_to_sold_to_manage_user_and_invite_user_section_is_not_displayed_for_guest_user() throws Throwable {
	    isElementNotDisplayed1("//h3[contains(text(),'Sold To')]", true);
	    isElementNotDisplayed1("//h3[contains(text(),'Ship To')]", true);
	    isElementNotDisplayed1("//h3[contains(text(),'Manage Users')]", true);
	    isElementNotDisplayed1("//h3[contains(text(),'Invitations')]", true);
	}
}
