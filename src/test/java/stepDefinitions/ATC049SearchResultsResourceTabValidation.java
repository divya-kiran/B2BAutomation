package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.SearchResultsPage;

public class ATC049SearchResultsResourceTabValidation extends BaseClass {
	SearchResultsPage searchResultsPage = PageFactory.initElements(driver, SearchResultsPage.class);

	@Given("^verify header elements in resource tab section$")
	public void verify_header_elements_in_resource_tab_section() throws Throwable {
		searchElementDisplayed("atomic-query-summary[class='hydrated']", "div[class='text-on-background']");
	}

	@Then("^User verifies literature type facet section in resource tab$")
	public void user_verifies_literature_type_facet_section_in_resource_tab() throws Throwable {
//		isElementDisplayed(searchResultsPage.LiteratureTypeLabel, true);
//	    isElementDisplayed(searchResultsPage.LiteratureTypeFacet1Label, true);
//	    isElementDisplayed(searchResultsPage.LiteratureTypeFacet2Label, true);
//	    isElementDisplayed(searchResultsPage.LiteratureTypeFacet3Label, true);
		Thread.sleep(2000);
		searchElementDisplayed("atomic-facet[label='Document Type']", "div[part='facet']");
	}

	@Then("^user verifies Asset type facet section in resource tab$")
	public void user_verifies_Asset_type_facet_section_in_resource_tab() throws Throwable {
		searchElementDisplayed("atomic-facet[label='Asset Type']", "div[part='facet']");
	}

	@Then("^user clicks in literature type facet check box and verify resource tab matches with correct number of results$")
	public void user_clicks_in_literature_type_facet_check_box_and_verify_resource_tab_matches_with_correct_number_of_results() throws Throwable {
		searchClick("atomic-facet[label='Asset Type']", "button[part='value-checkbox']");
	}

	@Then("^User verifies document tab card$")
	public void user_verifies_document_tab_card() throws Throwable {
//	    ScrollToElement(searchResultsPage.AssetTypeShowMore);
//	    isElementDisplayed(searchResultsPage.AssetTypeShowMore, true);
		searchProductCardDetails("atomic-result-list[class='hydrated']", "atomic-result[class='hydrated']", "div[class='result-root display-grid density-comfortable image-small with-sections']");
	}
}
