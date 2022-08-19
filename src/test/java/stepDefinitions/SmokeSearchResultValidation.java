package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import baseClass.ConfigFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.PLPPage;
import pageObjects.SearchResultsPage;



public class SmokeSearchResultValidation extends BaseClass {
	HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	SearchResultsPage searchResultsPage = PageFactory.initElements(driver, SearchResultsPage.class);
	 
	@When("^User enter text into product search box \"([^\"]*)\"$")
	public void user_enter_text_into_product_search_box(String arg1) throws Throwable {
//	   sendKeys(homepage.HeaderSearchTextBox, arg1);
//	   homepage.HeaderSearchTextBox.sendKeys(Keys.RETURN);
//	   CompareExactText(searchResultsPage.SearchText, arg1);
		searchText("8500");
	}

	@Then("^Verify Search results page header$")
	public void verify_Search_results_page_header() throws Throwable {
	   isElementDisplayed(searchResultsPage.SearchResultsPriceDisc, true);
	}

	@Then("^verify products tab by count$")
	public void verify_products_tab_by_count() throws Throwable {
		 String productcounts = getText(searchResultsPage.SearchResultsProductTabcount);
	      productcounts = productcounts.substring(1, productcounts.length()-1);
	      int productcountints = Integer.valueOf(productcounts);
	      if (productcountints == 0)
	      {
	    	  throw new Exception("No products present in Search results page");
	      }
	}

	@Then("^User click on resources tab$")
	public void user_click_on_resources_tab() throws Throwable {
	   Thread.sleep(2000);
	   searchClick("atomic-tab[tab-id='resources']", "button[part='tab']");
	}

	@Then("^Verify resources tab by count$")
	public void verify_resources_tab_by_count() throws Throwable {
		String productcountr = getText(searchResultsPage.SearchResultsResourcesTabcount);
	      productcountr = productcountr.substring(1, productcountr.length()-1);
	      int productcountintr = Integer.valueOf(productcountr);
	      if (productcountintr == 0)
	      {
	    	  throw new Exception("No resoruces section present in Search results page");
	      }
	}
}

