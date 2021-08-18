package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import baseClass.ConfigFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;


public class SmokeFooterVerifications extends BaseClass {

	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	
	@Then("^User verifies Announcements link$")
	public void user_verifies_Announcements_link() throws Throwable {
		
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
	    isElementDisplayed(homepage.AnnouncementsFooterLink, true);
	}

	@Then("^User verifies Contact Us link$")
	public void user_verifies_Contact_Us_link() throws Throwable {
		isElementDisplayed(homepage.ContactUSFooterLink, true);
	}

	@Then("^User verifies Partner Support link$")
	public void user_verifies_Partner_Support_link() throws Throwable {
		isElementDisplayed(homepage.PartnerSupportFooterLink, true);
	}

	@Then("^User verifies FAQs link$")
	public void user_verifies_FAQs_link() throws Throwable {
		isElementDisplayed(homepage.FAQFooterLink, true);
	}

	@Then("^User verifies Legal Disclaimer link$")
	public void user_verifies_Legal_Disclaimer_link() throws Throwable {
		isElementDisplayed(homepage.LegalDiscFooterLink, true);
	}

	@Then("^User verifies Privacy Policy link$")
	public void user_verifies_Privacy_Policy_link() throws Throwable {
		isElementDisplayed(homepage.PrivacyPolicyFooterLink, true);
	}

	@Then("^User verifies social terms conditions link$")
	public void user_verifies_social_terms_conditions_link() throws Throwable {
		isElementDisplayed(homepage.SocialTermsFooterLink, true);
	}

	@Then("^User verifies Policy and procedure link$")
	public void user_verifies_Policy_and_procedure_link() throws Throwable {
		isElementDisplayed(homepage.PolicyandProcedureFooterLink, true);
	}

	@Then("^User verifies Terms and conditions link$")
	public void user_verifies_Terms_and_conditions_link() throws Throwable {
		isElementDisplayed(homepage.TermsandConditionFooterLink, true);
	}

	@Then("^User verifies do not sell my personal information link$")
	public void user_verifies_do_not_sell_my_personal_information_link() throws Throwable {
		isElementDisplayed(homepage.DonotSellMyPersonalInfoFooterLink, true);
	}

	@Then("^User verifies Social Media icons$")
	public void user_verifies_Social_Media_icons() throws Throwable {
		isElementDisplayed(homepage.FooterYouTubeLink, true);
		isElementDisplayed(homepage.FooterFaceboobLink, true);
		isElementDisplayed(homepage.FooterTwitterLink, true);
		isElementDisplayed(homepage.FooterInstagramLink, true);
	}

	@Then("^User verifies copyright message$")
	public void user_verifies_copyright_message() throws Throwable {
		isElementDisplayed(homepage.FooterCopyright, true);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", homepage.MyAccountLink);
	}


	
}
