package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import pageObjects.ProfilePage;

public class ATC036CommunicationPrefValidation extends BaseClass {
	ProfilePage profilePage= PageFactory.initElements(driver, ProfilePage.class);

	@Then("^User verifies communication preferences link$")
	public void user_verifies_communication_preferences_link() throws Throwable {
	    isElementDisplayed(profilePage.CommunicationPrefLink, true);	    
	}

	@Then("^click on communication preferences link$")
	public void click_on_communication_preferences_link() throws Throwable {
	    ScrollToElement(profilePage.CommunicationPrefLink);	
	    jsClick(profilePage.CommunicationPrefLink);
	    Thread.sleep(3000);
	}

	@Then("^verify communication preferences window web elements$")
	public void verify_communication_preferences_window_web_elements() throws Throwable {
		driver.switchTo().frame(profilePage.CommunicationPrefiFrame);
	    isElementDisplayed(profilePage.CommunicationPrefHeading, true);	
	    isElementDisplayed("//input[@value='Save Preferences']", true);
	    driver.navigate().to(configFileReader.getApplicationUrl());
	}
}
