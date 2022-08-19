package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.GuestUserPages;
import pageObjects.HomePage;
import pageObjects.ProfilePage;
import pageObjects.StickyHeaderPage;

public class ATC093GuestUserPDPandPLPvalidation extends BaseClass {
	GuestUserPages guestUserPage= PageFactory.initElements(driver, GuestUserPages.class);
	ProfilePage profilePage = PageFactory.initElements(driver, ProfilePage.class);
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	
	@Then("^verifies become a partner link in PLP page$")
	public void verifies_become_a_partner_link_in_PLP_page() throws Throwable {
     if(!driver.findElements(By.id("onetrust-accept-btn-handler")).isEmpty()){
			
			click(homepage.acceptCookies);
		 }else{
		        
		 }
	  //  searchElementCTA("atomic-result-list[class='hydrated']", "div > div > a:nth-child(31) > atomic-result", "div > atomic-result-section-actions > result-product-cta-component", "section > div > div > a.coveo-link-external");
	}

	@Then("^Verify become a partner link in PDP page$")
	public void verify_become_a_partner_link_in_PDP_page() throws Throwable {
		isElementDisplayed(guestUserPage.BecomeApartnerPDP, true);
	}

	@Then("^user verifies Become a partner link in sticky navigation of PDP page$")
	public void user_verifies_Become_a_partner_link_in_sticky_navigation_of_PDP_page() throws Throwable {
		isElementDisplayed(guestUserPage.BecomeApartnerPDP, true);
	}
	
	@Then("^user verifes order history link is not displayed in homepage$")
	public void user_verifes_order_history_link_is_not_displayed_in_homepage() throws Throwable {
	    isElementNotDisplayed1("//img[@alt='Order Status']//parent::a", true);
	}

	@Then("^user verifies partner connect link is not displayed in homepage$")
	public void user_verifies_partner_connect_link_is_not_displayed_in_homepage() throws Throwable {
		isElementNotDisplayed1("//span[text()='Partner Programs']", true);
	}

	@Then("^verify add drop ship address is not displayed in checkout page$")
	public void verify_add_drop_ship_address_is_not_displayed_in_checkout_page() throws Throwable {
		isElementNotDisplayed1("//span[text()='Add drop-ship address']", true);
	}

	@Given("^User is on HomePage$")
	public void user_is_on_HomePage() throws Throwable {
	    driver.navigate().to(configFileReader.getApplicationUrl());
	}
	
	@Then("^user verifies profile Section Name and contact web elements for guest user$")
	public void user_profile_Section_Name_and_contact_web_elements_for_guest_user() throws Throwable {
		isElementDisplayed(profilePage.ProfileHeading, true);
	    isElementDisplayed(profilePage.NameandContactHeading, true);
	    isElementDisplayed(profilePage.FirstNameAndLastNameLabel, true);
	    isElementDisplayed(profilePage.FirstNameAndLastNameTextBox, true);
	    isElementDisplayed(profilePage.CompanyNameLabel, true);
	    isElementDisplayed(profilePage.CompanyNameTB, true);
	    isElementDisplayed(profilePage.PrimaryPhoneLabel, true);
	    isElementDisplayed(profilePage.PrimaryPhoneTB, true);
	    isElementDisplayed(profilePage.SecondaryPhoneTB, true);
	    isElementNotDisplayed1("//div[@data-dropdown='p3-dropdown__account-form-position']//div", true);
	}
}