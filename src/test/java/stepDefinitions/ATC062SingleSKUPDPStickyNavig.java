package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PDPPage;

public class ATC062SingleSKUPDPStickyNavig extends BaseClass {
	PDPPage pdpPage = PageFactory.initElements(driver, PDPPage.class);

	@Then("^User scroll down for sticky navigation$")
	public void user_scroll_down_for_sticky_navigation() throws Throwable {
	    scrollBottom();
	}

	@Then("^User verifies sticky navigation headers$")
	public void user_verifies_sticky_navigation_headers() throws Throwable {
	    isElementDisplayed(pdpPage.OverviewLink, true);
	    isElementDisplayed(pdpPage.Incentivelink, true);
	    isElementDisplayed(pdpPage.Descriptionlink, true);
	    isElementDisplayed(pdpPage.specsandwarrlink, true);
	    isElementDisplayed(pdpPage.Resourceslink, true);
	    isElementDisplayed(pdpPage.YouMayAlsolike, true);
	}

	@Then("User clicks on Incentives program in sticky navigation$")
	public void user_clicks_on_Incentives_program_in_sticky_navigation() throws Throwable {
	    jsClick(pdpPage.Incentivelink);
	    Thread.sleep(1000);
	}
	
	@Then("^User clicks on whats included in sticky navigation$")
	public void user_clicks_on_whats_included_in_sticky_navigation() throws Throwable {
	    jsClick(pdpPage.WhatsIncludedlink);
	    Thread.sleep(1000);
	}

	@Then("^verifies web elements in whats included section$")
	public void verifies_web_elements_in_whats_included_section() throws Throwable {
		isElementDisplayed(pdpPage.IncludedHeading, true);
	    isElementDisplayed(pdpPage.IncludesProduct1, true);
	}
	
	@Then("^verifies web elements in Incentive section$")
	public void verifies_web_elements_in__section() throws Throwable {
		isElementDisplayed(pdpPage.IncentivesHeading, true);
	    isElementDisplayed(pdpPage.MyQHeading, true);
	    isElementDisplayed(pdpPage.LearnMoreCTA, true);
	    isElementDisplayed(pdpPage.QuantityIncentiveHeading, true);
	    isElementDisplayed(pdpPage.AddMoreCTA, true);
	}

	@Then("^User clicks on description in sticky navigation$")
	public void user_clicks_on_description_in_sticky_navigation() throws Throwable {
		jsClick(pdpPage.Descriptionlink);
	    Thread.sleep(1000);
	}

	@Then("^verifies web elements in description section$")
	public void verifies_web_elements_in_description_section() throws Throwable {
	    isElementDisplayed(pdpPage.DescHeading, true);
	}

	@Then("^User clicks on specs and warranty in sticky navigation$")
	public void user_clicks_on_specs_and_warranty_in_sticky_navigation() throws Throwable {
		jsClick(pdpPage.specsandwarrlink);
	    Thread.sleep(1000);
	}

	@Then("^verifies web elements in specs and warranty section$")
	public void verifies_web_elements_in_specs_and_warranty_section() throws Throwable {
		isElementDisplayed(pdpPage.SpecificationsHeading, true);
		isElementDisplayed(pdpPage.specsTable, true);
		isElementDisplayed(pdpPage.WarrantyHeading, true);
		isElementDisplayed(pdpPage.WarrantyTable, true);
	}

	@Then("^User clicks on resources in sticky navigation$")
	public void user_clicks_on_resources_in_sticky_navigation() throws Throwable {
		jsClick(pdpPage.Resourceslink);
	    Thread.sleep(1000);
	}

	@Then("^verifies web elements in resources section$")
	public void verifies_web_elements_in_resources_section() throws Throwable {
	    isElementDisplayed(pdpPage.ResourcesHeading, true);
	    isElementDisplayed(pdpPage.TechnicalTab, true);
	    isElementDisplayed(pdpPage.Resourcessection1, true);
	   // isElementDisplayed(pdpPage.Resourcessection2, true);
	    jsClick(pdpPage.SalesMarketingTab);
	    Thread.sleep(2000);
	    isElementDisplayed(pdpPage.SalesTab1, true);
	    //isElementDisplayed(pdpPage.SalesTab2, true);
	}

	@Then("^User clicks on parts in sticky navigation$")
	public void user_clicks_on_parts_in_sticky_navigation() throws Throwable {
	    
	}

	@Then("^verifies web elements in parts section$")
	public void verifies_web_elements_in_parts_section() throws Throwable {
	    
	}

	@Then("^User clicks on You may also like in sticky navigation$")
	public void user_clicks_on_You_may_also_like_in_sticky_navigation() throws Throwable {
		jsClick(pdpPage.YouMayAlsolike);
	    Thread.sleep(1000);
	}
	
	@Then("^verifies web elements in You may also like section$")
	public void verifies_web_elements_in_You_may_also_like_section() throws Throwable {
	    isElementDisplayed(pdpPage.YouMayAlsoLikeHeading, true);
	    isElementDisplayed(pdpPage.YouMayAlsoLikeProd1, true);
	}
}

