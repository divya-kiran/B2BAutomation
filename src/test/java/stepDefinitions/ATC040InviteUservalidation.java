package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.ProfilePage;

public class ATC040InviteUservalidation extends BaseClass {
	ProfilePage profilePage= PageFactory.initElements(driver, ProfilePage.class);

	@Then("^User scrolls to Invite user section and verify header elements$")
	public void user_scrolls_to_Invite_user_section_and_verify_header_elements() throws Throwable {
		ScrollToElement(profilePage.InvitationHeadings);
		isElementDisplayed(profilePage.InvitationHeadings, true);
		isElementDisplayed(profilePage.InviteButton, true);
	}

	@Then("^Verify Web elements of Invite user account card$")
	public void verify_Web_elements_of_Invite_user_account_card() throws Throwable {
		isElementDisplayed(profilePage.Invitationcard1, true);
		isElementDisplayed(profilePage.InvitationcardEmail, true);
		isElementDisplayed(profilePage.InvitationcardRole, true); 
		isElementDisplayed(profilePage.InvitationcardStatus, true);
		isElementDisplayed(profilePage.InvitationcardDelButton, true); 
	}

	@Given("^user clicks on Invite button and navigate to Invite user form$")
	public void user_clicks_on_Invite_button_and_navigate_to_Invite_user_form() throws Throwable {
		ScrollToElement(profilePage.InvitationHeadings);
		jsClick(profilePage.InviteButton);
		isElementDisplayed(profilePage.InviteUserheading, true);
	}

	@Then("^User verifies Email address and Confirm email address TextBox$")
	public void user_verifies_Email_address_and_Confirm_email_address_TextBox() throws Throwable {
		isElementDisplayed(profilePage.InviteUserEmailAddTB, true);
		isElementDisplayed(profilePage.InviteUserConfEmailAddTB, true);
			    
	}

	@Then("^verifies Account section in invite user form$")
	public void verifies_Account_section_in_invite_user_form() throws Throwable {
		isElementDisplayed(profilePage.InviteUserAccount, true);
		isElementDisplayed(profilePage.InviteUserAccountInfo, true);
	}

	@Then("^verifies roles section in invite user form$")
	public void verifies_roles_section_in_invite_user_form() throws Throwable {
	    isElementDisplayed(profilePage.InviteUserRole, true);
	    jsClick(profilePage.InviteUserRoleDD);
	    isElementDisplayed(profilePage.InviteUserRoleDDCompAdmin, true);
	    isElementDisplayed(profilePage.InviteUserRoleDDCompEmp, true);
	    isElementDisplayed(profilePage.InviteUserRoleDDDiag, true);
	}

	@Then("^verifies access rights drop down elememnts in invite user form$")
	public void verifies_access_rights_drop_down_elememnts_in_invite_user_form() throws Throwable {
		isElementDisplayed(profilePage.InviteUserAccessRights, true);
	    jsClick(profilePage.InviteUserAccessRightsDD);
	    isElementDisplayed(profilePage.InviteUserAccessRightsFullaccess, true);
	    isElementDisplayed(profilePage.InviteUserAccessRightsNoorderwithLimPricing, true);
	    isElementDisplayed(profilePage.InviteUserAccessRightsNoorderorPricing, true);
	    isElementDisplayed(profilePage.InviteUserAccessRightsNoorderorPricing, true);
	    isElementDisplayed(profilePage.InviteUserAccessRightsNoorderWithPricing, true);
	    jsClick(profilePage.InviteUserAccessRights);
	}

	@Then("^verifies cancel and save button for Invite user section$")
	public void verifies_cancel_and_save_button_for_Invite_user_section() throws Throwable {
	    isElementDisplayed(profilePage.InviteUserCancelButton, true);
	    isElementDisplayed(profilePage.InviteUserInviteButton, true);
	}

	@Given("^User enters email address and confirm email address$")
	public void user_enters_email_address_and_confirm_email_address() throws Throwable {
		sendKeys(profilePage.InviteUserEmailAddTB, "AutomationUserTest@mailinator.com");
		sendKeys(profilePage.InviteUserConfEmailAddTB, "AutomationUserTest@mailinator.com");
	}

	@Given("^User select roles in invite user section$")
	public void user_select_roles_in_invite_user_section() throws Throwable {
		jsClick(profilePage.InviteUserRoleDD);
		jsClick(profilePage.InviteUserRoleDDCompAdmin);
	}

	@Given("^selects options from access rights dropdown in invite user section$")
	public void selects_options_from_access_rights_dropdown_in_invite_user_section() throws Throwable {
		jsClick(profilePage.InviteUserAccessRights);
	    jsClick(profilePage.InviteUserAccessRightsDD);
	    jsClick(profilePage.InviteUserAccessRightsNoorderorPricing);
	}

	@Given("^verify cancel and save button in invite user form$")
	public void verify_cancel_and_save_button_in_invite_user_form() throws Throwable {
	   isElementDisplayed(profilePage.InviteUserCancelButton, true);
	   profilePage.InviteUserInviteButton.isEnabled();
	}
}
