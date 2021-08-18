package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.HomePage;

public class ATC081ValidationofmyQConnectivitySolutionsTab extends BaseClass {
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);

	@Then("^Hover on parts tab and verify myq Smart Home header link$")
	public void hover_on_parts_tab_and_verify_myq_Smart_Home_header_link() throws Throwable {
		elementHover(homePage.myQConnectivitySolutionTab);
		Thread.sleep(1000);
	    jsClick(homePage.myQSmartHomeLink); 
	}

	@Then("^Verify myq Smart Home page by title and URL$")
	public void verify_myq_Smart_Home_page_by_title_and_URL() throws Throwable {
		verifypageURL("myq-smart-home");
		verifypagetitle("myQ Smart Home | LiftMaster Partner Portal");	    
	}

	@Then("^Hover on parts tab and verify In Garage Delivery header link$")
	public void hover_on_parts_tab_and_verify_In_Garage_Delivery_header_link() throws Throwable {
		elementHover(homePage.myQConnectivitySolutionTab);
		Thread.sleep(1000);
	    jsClick(homePage.InGarageDeliveryLink);	    
	}

	@Then("^Verify In Garage Delivery page by title and URL$")
	public void verify_In_Garage_Delivery_page_by_title_and_URL() throws Throwable {
		verifypageURL("/in-garage-delivery");
		verifypagetitle("In Garage Delivery | LiftMaster Partner Portal");	    
	}

	@Then("^Hover on parts tab and verify myQ Smart Community Access header link$")
	public void hover_on_parts_tab_and_verify_myQ_Smart_Community_Access_header_link() throws Throwable {
		elementHover(homePage.myQConnectivitySolutionTab);
		Thread.sleep(1000);
	    jsClick(homePage.myQSmartCommAccessLink);	    
	}

	@Then("^Verify myQ Smart Community Access page by title and URL$")
	public void verify_myQ_Smart_Community_Access_page_by_title_and_URL() throws Throwable {
		verifypageURL("/myQ-smart-community-access");
		verifypagetitle("myQ Smart Community Access | LiftMaster Partner Portal");	    
	}

	@Then("^Hover on parts tab and verify myQ Smart Facility Access header link$")
	public void hover_on_parts_tab_and_verify_myQ_Smart_Facility_Access_header_link() throws Throwable {
		elementHover(homePage.myQConnectivitySolutionTab);
		Thread.sleep(1000);
	    jsClick(homePage.myQSmartFacilityAccessLink);	    
	}

	@Then("^Verify myQ Smart Facility Access page by title and URL$")
	public void verify_myQ_Smart_Facility_Access_page_by_title_and_URL() throws Throwable {
		verifypageURL("/myq-smart-facility-access");
		verifypagetitle("LiftMaster Partner Portal");	    
	}
}