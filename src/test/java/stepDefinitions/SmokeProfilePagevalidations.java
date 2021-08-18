package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.ProfilePage;


public class SmokeProfilePagevalidations extends BaseClass {
	String URLprofile = configFileReader.getApplicationUrl();
	ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
	
	@Then("^User navigate to profile page$")
	public void user_navigate_to_profile_page() throws Throwable {
	    driver.navigate().to(URLprofile+"my-account");
	}

	@Then("^user verifies profile Section$")
	public void user_verifies_profile_Section() throws Throwable {
	    isElementDisplayed(profilePage.ProfileHeading, true);   
	    isElementDisplayed(profilePage.NameandContactHeading, true);
	    isElementDisplayed(profilePage.UpdatePasswordHeading, true);
	}

	@Then("^verifies Company information section$")
	public void verifies_Company_information_section() throws Throwable {
		isElementDisplayed(profilePage.CompanyInfoHeading, true);
		isElementDisplayed(profilePage.SoldToHeading, true);
		isElementDisplayed(profilePage.ShipToHeading, true);
	}

	@Then("^verifies Manage users section$")
	public void verifies_Manage_users_section() throws Throwable {
		isElementDisplayed(profilePage.ManageUsersHeading, true);	    
	}

	@Then("^verifies Invitations section$")
	public void verifies_Invitations_section() throws Throwable {
		isElementDisplayed(profilePage.InvitationHeadings, true);
	}
}
