package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.ProfilePage;

public class ATC042SalesRepInfoValidation extends BaseClass {
	ProfilePage profilePage= PageFactory.initElements(driver, ProfilePage.class);

	@Given("^User navigates to salesrep info section$")
	public void user_navigates_to_salesrep_info_section() throws Throwable {
	    ScrollToElement(profilePage.SoldToStateLabel);
	}

	@Given("^User verifies sales rep info web elements$")
	public void user_verifies_sales_rep_info_web_elements() throws Throwable {
	    isElementDisplayed(profilePage.SalesRepName, true);
	    isElementDisplayed(profilePage.SalesRepemailID, true);
	    isElementDisplayed(profilePage.SalesRepMobNum, true);
	}
}
