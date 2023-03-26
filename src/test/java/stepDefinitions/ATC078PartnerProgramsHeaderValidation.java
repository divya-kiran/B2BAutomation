package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.HomePage;

public class ATC078PartnerProgramsHeaderValidation extends BaseClass {
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);

	@Then("^verify Partner connect header$")
	public void verify_Partner_connect_header() throws Throwable {
	    elementHover(homePage.PartnerProgramsTab);
	    isElementDisplayed(homePage.AboutPconnectLink, true);
	    jsClick(homePage.AboutPconnectLink);
	    verifypageURL("/partnerconnect");
	}

	@Then("^click on About Partner Connect link and verify page$")
	public void click_on_About_Partner_Connect_link_and_verify_page() throws Throwable {
	    
	}

	@Given("^User is on homepage$")
	public void user_is_on_homepage() throws Throwable {
	    jsClick(homePage.LiftMasterLogo);
	    pageLoadTimeout();
	    Thread.sleep(2000);
	}

	@Then("^verify partner rewards header$")
	public void verify_partner_rewards_header() throws Throwable {
		elementHover(homePage.PartnerProgramsTab);
	    isElementDisplayed(homePage.ConnectToMyQKey, true);
	    jsClick(homePage.ConnectToMyQKey);
	    verifypageURL("/myq-diagnostics");
	}

	@Then("^click on connect to MyQ and Key link and verify page$")
	public void click_on_connect_to_MyQ_and_Key_link_and_verify_page() throws Throwable {
	    	    
	}

	@Then("^click on connect to key for technicians link and verify page$")
	public void click_on_connect_to_key_for_technicians_link_and_verify_page() throws Throwable {
	    	    
	}

	@Then("^verify partner discounts header$")
	public void verify_partner_discounts_header() throws Throwable {
	    	    
	}

	@Then("^click on quantity discount and free frieght link and verify page$")
	public void click_on_quantity_discount_and_free_frieght_link_and_verify_page() throws Throwable {
	    elementHover(homePage.PartnerProgramsTab);
	    isElementDisplayed(homePage.QAandFreeFreight, true);
	    jsClick(homePage.QAandFreeFreight);
	    verifypageURL("/quantity-truckload");
	}
}