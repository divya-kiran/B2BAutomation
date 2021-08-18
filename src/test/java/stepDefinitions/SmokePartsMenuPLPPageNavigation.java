package stepDefinitions;

import java.util.Properties;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class SmokePartsMenuPLPPageNavigation extends BaseClass {
	String appurlPLPparts = configFileReader.getApplicationUrl();
	
	@Then("^User navigates to garage door opener parts page$")
	public void user_navigates_to_garage_door_opener_parts_page() throws Throwable {
		driver.navigate().to(appurlPLPparts+"c/6");
	}

	@Given("^User navigates to Commercial door operator parts page$")
	public void user_navigates_to_Commercial_door_operator_parts_page() throws Throwable {
		driver.navigate().to(appurlPLPparts+"c/8");
	}

	@Given("^User navigates to Gate operator parts page$")
	public void user_navigates_to_Gate_operator_parts_page() throws Throwable {
		driver.navigate().to(appurlPLPparts+"c/9");
	}

	@Given("^User navigates to Access Control parts page$")
	public void user_navigates_to_Access_Control_parts_page() throws Throwable {
		driver.navigate().to(appurlPLPparts+"c/10");
	}

	@Given("^User navigates to All parts page$")
	public void user_navigates_to_All_parts_page() throws Throwable {
		driver.navigate().to(appurlPLPparts+"c/12");
	}


}
