package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ContentLandingPage;
import pageObjects.GuestUserPages;
import pageObjects.HomePage;
import pageObjects.ProfilePage;
import pageObjects.StickyHeaderPage;

public class ATC095Integrations extends BaseClass {
	ContentLandingPage contentLandingPage= PageFactory.initElements(driver, ContentLandingPage.class);

	@Then("^User navigates to co op advertising page$")
	public void user_navigates_to_co_op_advertising_page() throws Throwable {
	   	driver.navigate().to(configFileReader.getApplicationUrl()+"co-op-program");
	}

	@Then("^verfies balihoo CTA$")
	public void verfies_balihoo_CTA() throws Throwable {
	   	ScrollToElement(contentLandingPage.CoOpLabel);
	}

	@Given("^User navigates to Liftmaster Merchandise page$")
	public void user_navigates_to_Liftmaster_Merchandise_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"merchandise-collateral");
	}

	@Then("^verifies shop now button$")
	public void verifies_shop_now_button() throws Throwable {
	   	isElementDisplayed(contentLandingPage.ShopNowLink, true);
	   	jsClick(contentLandingPage.ShopNowLink);
	}

	@Then("^verifies na corporation web page$")
	public void verifies_na_corporation_web_page() throws Throwable {
	   	verifypageURL("estore/liftmaster-login.aspx");
	}

	@Given("^User navigates to partner connect page$")
	public void user_navigates_to_partner_connect_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"connect");
	}

	@Then("^click on liftmaster partner rewards$")
	public void click_on_liftmaster_partner_rewards() throws Throwable {
	   	 isElementDisplayed(contentLandingPage.PartnerRewardsLink, true);
	   	 jsClick(contentLandingPage.PartnerRewardsLink);
	}

	@Then("^verifies partner rewards page$")
	public void verifies_partner_rewards_page() throws Throwable {
	   	verifypageURL("rewards.liftmaster.com/login");
	}

	@Given("^User navigates to support page$")
	public void user_navigates_to_support_page() throws Throwable {
	   	 driver.navigate().to("https://support.partner.liftmaster.com/s");
	}

	@Given("^verifies partner support page$")
	public void verifies_partner_support_page() throws Throwable {
	   	 isElementDisplayed(contentLandingPage.LiftMasterLogo, true);
	}

	@Given("^User navigates to guest register page$")
	public void user_navigates_to_guest_register_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
		driver.navigate().to(configFileReader.getApplicationUrl()+"guestregister");
	}

	@Then("^verifies captch option in registration page$")
	public void verifies_captch_option_in_registration_page() throws Throwable {
		ScrollToElement(contentLandingPage.Captcha);
		isElementDisplayed(contentLandingPage.Captcha, true);
	}
}