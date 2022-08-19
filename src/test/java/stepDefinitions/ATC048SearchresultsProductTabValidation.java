package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.SearchResultsPage;

public class ATC048SearchresultsProductTabValidation extends BaseClass {
	SearchResultsPage searchResultsPage = PageFactory.initElements(driver, SearchResultsPage.class);
	
	@Then("^Verify Search results page header elements$")
	public void verify_Search_results_page_header_elements() throws Throwable {
//	    isElementDisplayed(searchResultsPage.SearchText, true);
//	    isElementDisplayed(searchResultsPage.PriceDiscText, true);
		Thread.sleep(6000);
		//searchElementDisplayed("atomic-search-interface[id='search']", "//*[@id='heading']/div[1]/atomic-query-summary");
		//searchElementDisplayed("atomic-search-interface[id='search']", "div[class='topbar']");
	}

	@Then("^verify products tab is displaying results$")
	public void verify_products_tab_is_displaying_results() throws Throwable {
//		String productcounts = getText(searchResultsPage.SearchResultsProductTabcount);
//	      productcounts = productcounts.substring(1, productcounts.length()-1);
//	      int productcountints = Integer.valueOf(productcounts);
//	      if (productcountints == 0)
//	      {
//	    	  throw new Exception("No products present in Search results page");
//	      }
		searchProductTab("atomic-tab[id='tab-products']", "button[part='tab']");
	}

	@Then("^User verifies category facet section in product tab$")
	public void user_verifies_category_facet_section_in_product_tab() throws Throwable {
//	    isElementDisplayed(searchResultsPage.FacetCategoryLabel, true);
//	    isElementDisplayed(searchResultsPage.CategoryFacet1Label, true);
//	    isElementDisplayed(searchResultsPage.CategoryFacet2Label, true);
//	    isElementDisplayed(searchResultsPage.CategoryFacet3Label, true);
		searchFacet("atomic-category-facet[label='Category']", "button[part='label-button']");
	}

	@Then("^user verifies price facet section in product tab$")
	public void user_verifies_price_facet_section_in_product_tab() throws Throwable {
//		ScrollToElement(searchResultsPage.CategoryFacet3Label);
//		isElementDisplayed(searchResultsPage.FacetPriceLabel, true);
//	    isElementDisplayed(searchResultsPage.PriceFacet1Label, true);
//	    isElementDisplayed(searchResultsPage.PriceFacet2Label, true);
//	    isElementDisplayed(searchResultsPage.PriceFacet3Label, true);
		searchFacet("atomic-numeric-facet[label='Price']", "div[part='facet']");
	}

	@Then("^user clicks in facet check box and verify product tab matches with correct number of results$")
	public void user_clicks_in_facet_check_box_and_verify_prouduct_tab_matches_with_correct_number_of_results() throws Throwable {
//		ScrollToElement(searchResultsPage.PriceDiscText);
//		String productcounts = getText(searchResultsPage.CategoryFacet1Label);
//		String[] productcounts1 = productcounts.split("\\(");
//		String productcounts2 = productcounts1[1].substring(0,productcounts1[1].length()-1);
//		int productcountlabel = Integer.valueOf(productcounts2);
//		jsClick(searchResultsPage.CategoryFacet1Label);
//		Thread.sleep(5000);
//		String productcountstab = getText(searchResultsPage.SearchResultsProductTabcount);
//	      productcountstab = productcountstab.substring(1, productcountstab.length()-1);
//	      int productcountints = Integer.valueOf(productcountstab);
//	      if (productcountints == 0)
//	      {
//	    	  throw new Exception("No products present in Search results page");
//	      }
//		if(productcountints!=productcountlabel){
//			throw new Exception("Facet count and resultant result count do not match");
//		}
		searchFacetClick("atomic-category-facet[label='Category']", "span[part='value-label']");
		
	}

	@Then("^user verifies rail length facet section in product tab$")
	public void user_verifies_rail_length_facet_section_in_product_tab() throws Throwable {
		ScrollToElement(searchResultsPage.PriceFacet1CheckBox);
	    isElementDisplayed(searchResultsPage.RailLengthFacet1Label, true);
	    isElementDisplayed(searchResultsPage.RailLengthFacet2Label, true);
	}

	@Then("^user clicks on rail length facet checkbox and verify results$")
	public void user_clicks_on_rail_length_facet_checkbox_and_verify_results() throws Throwable {
		jsClick(searchResultsPage.CategoryFacet1Label);
	}

	@Then("^user verifies the first product card resulted in search$")
	public void user_verifies_the_first_product_card_resulted_in_search() throws Throwable {
	    searchProductCard("atomic-result-list[class='hydrated']", "div > div > a:nth-child(31) > atomic-result");
	}

	@Then("^User verifies product name summary price image qty box and CTA for the resultant CDO product$")
	public void user_verifies_product_name_summary_price_image_qty_box_and_CTA_for_the_resultant_GDO_product() throws Throwable {
//		isElementDisplayed(searchResultsPage.FirstProdImage, true);
//		isElementDisplayed(searchResultsPage.FirstProdName, true);
//		isElementDisplayed(searchResultsPage.FirstProdSummary, true);
//		isElementDisplayed(searchResultsPage.FirstProdPrice, true);
//		isElementDisplayed("(//div[@class='p3-plp__tabs-content']//li[@class='p3-plp__product-item'])[1]//a", true);
		searchProductCardDetails("atomic-result-list[class='hydrated']", "div > div > a:nth-child(31) > atomic-result", "atomic-field-condition[class='field hydrated']");
		searchProductCardDetails("atomic-result-list[class='hydrated']", "div > div > a:nth-child(31) > atomic-result", "atomic-result-section-title[class='hydrated']");
		searchProductCardDetails("atomic-result-list[class='hydrated']", "div > div > a:nth-child(31) > atomic-result", "atomic-result-section-title-metadata[class='hydrated']");
		searchProductCardDetails("atomic-result-list[class='hydrated']", "div > div > a:nth-child(31) > atomic-result", "atomic-result-section-actions[class='hydrated']");
	}

	@Then("^user verifies first product is redirected to PDP page$")
	public void user_verifies_first_product_is_redirected_to_PDP_page() throws Throwable {
//		isElementDisplayed(searchResultsPage.FirstProduct, true);
//		jsClick(searchResultsPage.FirstProduct);
//		verifypageURL("p/GT");
		searchProductCardClick("atomic-result-list[class='hydrated']", "div > div > a:nth-child(31) > atomic-result");
	}

	@Then("^user verifies product name summary price image qty box and CTA for the resultant single sku product$")
	public void user_verifies_product_name_summary_price_image_qty_box_and_CTA_for_the_resultant_single_sku_product() throws Throwable {
		Thread.sleep(3000);
		searchProductCardDetails("atomic-result-list[class='hydrated']", "atomic-result[class='hydrated']", "atomic-field-condition[class='field hydrated']");
		searchProductCardDetails("atomic-result-list[class='hydrated']", "atomic-result[class='hydrated']", "atomic-result-section-title[class='hydrated']");
		searchProductCardDetails("atomic-result-list[class='hydrated']", "atomic-result[class='hydrated']", "atomic-result-section-title-metadata[class='hydrated']");
		searchProductCardDetails("atomic-result-list[class='hydrated']", "atomic-result[class='hydrated']", "atomic-result-section-actions[class='hydrated']");
	}
	
	@When("^User enter CDO Product into product search box \"([^\"]*)\"$")
	public void user_enter_CDO_Product_into_product_search_box(String arg1) throws Throwable {
		Thread.sleep(3000);
	    searchText("GT");
	}

	@When("^User enter single SKU product into product search box \"([^\"]*)\"$")
	public void user_enter_single_SKU_product_into_product_search_box(String arg1) throws Throwable {
	    searchText("878MAX");
	}
}
