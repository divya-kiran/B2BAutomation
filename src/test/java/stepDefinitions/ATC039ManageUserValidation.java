package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.LoginPage;
import pageObjects.ProfilePage;

public class ATC039ManageUserValidation extends BaseClass {
	ProfilePage profilePage= PageFactory.initElements(driver, ProfilePage.class);
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	
	@Given("^User will log in as US registered user$")
	public void user_will_log_in_as_US_registered_user() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
		pageLoadTimeout();
	   sendKeys(loginpage.userName, "automationuseruspt@mailinator.com");
	   sendKeys(loginpage.password, "Test@123");
	   click(loginpage.PartnerAccountSignInHeader);
	   jsClick(loginpage.signinButton);
	   }

	@Given("^User scrolls to Manage user section and verify header elements$")
	public void user_scrolls_to_Manage_user_section_and_verify_header_elements() throws Throwable {
	    ScrollToElement(profilePage.ManageUsersHeading);
	    isElementDisplayed(profilePage.ManageUsersHeading, true);
	}

	@Then("^Verify Web elements of manage user account card$")
	public void verify_Web_elements_of_manage_user_account_card() throws Throwable {
		isElementDisplayed(profilePage.ManageUser1, true);
		isElementDisplayed(profilePage.ManageUserEmail, true);
		isElementDisplayed(profilePage.ManageUserAccessRights, true);
		isElementDisplayed(profilePage.ManageUserStatus, true);
		isElementDisplayed(profilePage.ManageUserEditButton, true);
	}

	@Given("^user clicks on pencil icon of manage user account card and navigate to edit user form$")
	public void user_clicks_on_pencil_icon_of_manage_user_account_card_and_navigate_to_edit_user_form() throws Throwable {
		ScrollToElement(profilePage.ManageUsersHeading);
		jsClick(profilePage.ManageUserEditButton);
	    isElementDisplayed(profilePage.ManageUserPopUPHeading, true);
	    isElementDisplayed(profilePage.ManageUserReqLabel, true);
	}

	@Then("^User verifies Email address and phone number section$")
	public void user_verifies_Email_address_and_phone_number_section() throws Throwable {
		isElementDisplayed(profilePage.ManageUserEmailAddLabel, true);
	    isElementDisplayed(profilePage.ManageUserEmailAddTB, true);
	    isElementDisplayed(profilePage.ManageUserPhoneLabel, true);
	    isElementDisplayed(profilePage.ManageUserPhoneTB, true);
	}

	@Then("^verifies status and password section$")
	public void verifies_status_and_passoword_section() throws Throwable {
		isElementDisplayed(profilePage.ManageUserActiveStatus, true);
	    isElementDisplayed(profilePage.ManageUserDeactivateButton, true);
	    isElementDisplayed(profilePage.ManageUserPasswordLbl, true);
	    isElementDisplayed(profilePage.ManageUserResetButton, true);
	}

	@Then("^verifies roles section$")
	public void verifies_roles_section() throws Throwable {
		isElementDisplayed(profilePage.ManageUserRole, true);
		jsClick(profilePage.ManageUserAccessRolesDD);
	    isElementDisplayed(profilePage.ManageUserCompanySelectAdmText, true);
	    isElementDisplayed(profilePage.ManageUserCompanyEmpText, true);
	    isElementDisplayed(profilePage.ManageUserDiagText, true);
	}

	@Then("^verifies access rights drop down elememnts$")
	public void verifies_access_rights_drop_down_elememnts() throws Throwable {
	    ScrollToElement(profilePage.ManageUserAccessRightsLbl);
	    isElementDisplayed(profilePage.ManageUserAccessRightsLbl, true);
	    jsClick(profilePage.ManageUserAccessRightsDD);
	   // isElementDisplayed(profilePage.ManageUserAccessRightsDDFullaccess, true);
	    isElementDisplayed(profilePage.MUAccessRightsDDNoOrderingwithlimitedpricing, true);
	    isElementDisplayed(profilePage.MUAccessRightsDDNoOrderingorpricing, true);
	    isElementDisplayed(profilePage.MUAccessRightsDDNoOrderingwithpricing, true);
	}

	@Then("^verifies position drop down elememnts$")
	public void verifies_position_drop_down_elememnts() throws Throwable {
		jsClick(profilePage.ManageUserPositionLbl);
		isElementDisplayed(profilePage.ManageUserPositionLbl, true);
	    jsClick(profilePage.ManageUserPositionDD);  
	    isElementDisplayed(profilePage.ManageUserPositionDDPurchDirector, true);
	    isElementDisplayed(profilePage.ManageUserPositionDDSalesVP, true);
	    isElementDisplayed(profilePage.ManageUserPositionDDBranch, true);
	    isElementDisplayed(profilePage.ManageUserPositionDDMarketing, true);
	    isElementDisplayed(profilePage.ManageUserPositionDDService, true);
	    isElementDisplayed(profilePage.ManageUserPositionDDTech, true);
	}

	@Then("^verifies cancel and save button for manage user section$")
	public void verifies_cancel_and_save_button_for_manage_user_section() throws Throwable {
		jsClick(profilePage.ManageUserPositionLbl);
		isElementDisplayed(profilePage.ManageUserPositionLbl, true);
		isElementDisplayed(profilePage.ManageUserCancelButton, true);
		isElementDisplayed(profilePage.ManageUserSaveButton, true);		
	}
	
	@Given("^click on reset password and verify password window$")
	public void click_on_reset_password_and_verify_password_window() throws Throwable {
	    ScrollToElement(profilePage.ManageUserResetButton);
	    jsClick(profilePage.ManageUserResetButton);
	    isElementDisplayed(profilePage.ManageUserResetPassword, true);
	    isElementDisplayed(profilePage.ManageUserResetPasswordReqLbl, true);
	    isElementDisplayed(profilePage.ManageUserNewPassword, true);
	    isElementDisplayed(profilePage.ManageUserConfirmNewPassword, true);
	    isElementDisplayed(profilePage.ManageUserResetPWDCancelButton, true);
	    //isElementDisplayed(profilePage.ManageUserResetPWDUpdateButton, true);
	    jsClick(profilePage.ManageUserResetPWDCancelButton);
	}

	@Given("^Click on deactivate link and verify deactivate window$")
	public void click_on_deactivate_link_and_verify_deactivate_window() throws Throwable {
	    jsClick(profilePage.ManageUserDeactivateButton);
	    isElementDisplayed(profilePage.ManageUserDeactiveUserHeading, true);
	    isElementDisplayed(profilePage.ManageUserDeactiveUserText, true);
	    isElementDisplayed(profilePage.ManageUserDeactivateWindowCancelButton, true);
	    isElementDisplayed(profilePage.ManageUserDeactivateWindowButton, true);
	    jsClick(profilePage.ManageUserDeactivateWindowCancelButton);
	}

	@Given("^select options from access rights dropdown$")
	public void select_options_from_access_rights_dropdown() throws Throwable {
	    isElementDisplayed(profilePage.ManageUserAccessRightsLbl, true);
	    jsClick(profilePage.ManageUserAccessRightsDD);
	    isElementDisplayed(profilePage.MUAccessRightsDDNoOrderingwithlimitedpricing, true);
	    jsClick(profilePage.MUAccessRightsDDNoOrderingwithlimitedpricing);
	    isElementDisplayed(profilePage.ManageUserCancelButton, true);
		isElementDisplayed(profilePage.ManageUserSaveButton, true);	
	}

	@Given("^select options from position dropdwn$")
	public void select_options_from_position_dropdwn() throws Throwable {
		jsClick(profilePage.ManageUserPositionLbl);
		isElementDisplayed(profilePage.ManageUserPositionLbl, true);
	    jsClick(profilePage.ManageUserPositionDD);  
	    jsClick(profilePage.ManageUserPositionDDSalesVP);
	    jsClick(profilePage.ManageUserPositionDD);  
	    jsClick(profilePage.ManageUserPositionDDMarketing);
	}

	@Given("^verify cancel and save button in manage user form$")
	public void verify_cancel_and_save_button_in_manage_user_form() throws Throwable {
		profilePage.ManageUserCancelButton.isEnabled();
		profilePage.ManageUserSaveButton.isEnabled();
	}
}
