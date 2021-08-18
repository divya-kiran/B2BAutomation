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
		isElementDisplayed(searchResultsPage.SearchText, true);
	    isElementDisplayed(searchResultsPage.PriceDiscText, true);
	    isElementDisplayed(searchResultsPage.SearchLabel, true);	    
	}

	@Then("^User verifies literature type facet section in resource tab$")
	public void user_verifies_literature_type_facet_section_in_resource_tab() throws Throwable {
		isElementDisplayed(searchResultsPage.LiteratureTypeLabel, true);
	    isElementDisplayed(searchResultsPage.LiteratureTypeFacet1Label, true);
	    isElementDisplayed(searchResultsPage.LiteratureTypeFacet2Label, true);
	    isElementDisplayed(searchResultsPage.LiteratureTypeFacet3Label, true);
	}

	@Then("^user verifies Asset type facet section in resource tab$")
	public void user_verifies_Asset_type_facet_section_in_resource_tab() throws Throwable {
		ScrollToElement(searchResultsPage.AssetTypeLabel);
		isElementDisplayed(searchResultsPage.AssetTypeLabel, true);
	    isElementDisplayed(searchResultsPage.AssetTypeFacet1Label, true);
	    isElementDisplayed(searchResultsPage.AssetTypeFacet2Label, true);
	    isElementDisplayed(searchResultsPage.AssetTypeFacet3Label, true);
	}

	@Then("^user clicks in literature type facet check box and verify resource tab matches with correct number of results$")
	public void user_clicks_in_literature_type_facet_check_box_and_verify_resource_tab_matches_with_correct_number_of_results() throws Throwable {
		ScrollToElement(searchResultsPage.PriceDiscText);
		String productcounts = getText(searchResultsPage.LiteratureTypeFacet1Label);
		String[] productcounts1 = productcounts.split("\\(");
		String productcounts2 = productcounts1[1].substring(0,productcounts1[1].length()-1);
		int productcountlabel = Integer.valueOf(productcounts2);
		jsClick(searchResultsPage.LiteratureTypeFacet1Label);
		Thread.sleep(5000);
		String productcountstab = getText(searchResultsPage.SearchResultsResourcesTabcount);
	      productcountstab = productcountstab.substring(1, productcountstab.length()-1);
	      int productcountints = Integer.valueOf(productcountstab);
	      if (productcountints == 0)
	      {
	    	  throw new Exception("No products present in Search results page");
	      }
		if(productcountints!=productcountlabel){
			throw new Exception("Facet count and resultant result count do not match");
		}
	}

	@Then("^User verifies document tab card$")
	public void user_verifies_document_tab_card() throws Throwable {
	    ScrollToElement(searchResultsPage.AssetTypeShowMore);
	    isElementDisplayed(searchResultsPage.AssetTypeShowMore, true);
	}
}
