package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.HomePage;

public class ATC082ValidationofResourcesTab extends BaseClass {
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);

	@Then("^Hover on resource tab and verify sales and marketing header links$")
	public void hover_on_resource_tab_and_verify_sales_and_marketing_header_links() throws Throwable {
		elementHover(homePage.ResourcesTab);
		Thread.sleep(1000);
	    isElementDisplayed(homePage.SalesMarketingHeader, true);
	    isElementDisplayed(homePage.CommServiceSolutionLink, true);
	    isElementDisplayed(homePage.CoOpAdvProgramLink, true);
	    isElementDisplayed(homePage.LiftMasterMerchandCollLink, true);
	    isElementDisplayed(homePage.LMLogoDownloadsLink, true);
	}

	@Then("^Hover on resource tab and verify Technical header links$")
	public void hover_on_resource_tab_and_verify_Technical_header_links() throws Throwable {
		elementHover(homePage.ResourcesTab);
		Thread.sleep(1000);
		isElementDisplayed(homePage.TechnicalTab, true);
	    isElementDisplayed(homePage.ProductandServiceLink, true);
	    isElementDisplayed(homePage.MasterCodeResetUtitlityLink, true);
	}

	@Then("^Hover on resource tab and verify training header link$")
	public void hover_on_resource_tab_and_verify_training_header_link() throws Throwable {
		elementHover(homePage.ResourcesTab);
		Thread.sleep(1000);
	    isElementDisplayed(homePage.TrainingHeading, true);
	    isElementDisplayed(homePage.TrainingVideosLink, true);
	    isElementDisplayed(homePage.LiveOnDemandWebinarsLink, true);
	    isElementDisplayed(homePage.TrainingAcademyLinks, true);	    
	}

	@Then("^Hover on resource tab and verify safety header link$")
	public void hover_on_resource_tab_and_verify_safety_header_link() throws Throwable {
		elementHover(homePage.ResourcesTab);
		Thread.sleep(1000);
	    isElementDisplayed(homePage.SafetyHeading, true);
	    isElementDisplayed(homePage.CommercialSafetyLink, true);
	    isElementDisplayed(homePage.GarageSafetyLink, true);	    
	}
}