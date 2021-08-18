package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.StickyHeaderPage;

public class ATC091StickyNavigationPartnerPortal extends BaseClass {
	StickyHeaderPage stickyPage = PageFactory.initElements(driver, StickyHeaderPage.class);
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	
	@Then("^Verifies sticky header in PLP page$")
	public void verifies_sticky_header_in_PLP_page() throws Throwable {
	    scrollBottom();
		isElementDisplayed(stickyPage.CDOStickyTitle, true);
		isElementDisplayed(stickyPage.PLPStickyPriceDisc, true);
		isElementDisplayed(stickyPage.ProductsTabSticky, true);
	}

	@Then("^Verifies sticky header in Gate Parts PLP page$")
	public void Verifies_sticky_header_in_Gate_Parts_PLP_page() throws Throwable {
		scrollBottom();
		isElementDisplayed(stickyPage.GatePartsStickytitle, true);
		isElementDisplayed(stickyPage.PLPStickyPriceDisc, true);
		isElementDisplayed(stickyPage.ProductsTabSticky, true);	    
	}
	
	@When("^User search for product \"([^\"]*)\" in PP$")
	public void user_search_for_product_in_PP(String arg1) throws Throwable {
	    driver.navigate().to(configFileReader.getApplicationUrl());
	    sendKeys(homePage.HeaderSearchTextBox, arg1);
	    homePage.HeaderSearchTextBox.sendKeys(Keys.RETURN);
	}
	
	@Then("^verifies sticky header in search results page$")
	public void verifies_sticky_header_in_search_results_page() throws Throwable {
		scrollBottom();
		isElementDisplayed(stickyPage.Yousearchedfor, true);
		isElementDisplayed(stickyPage.SearchString, true);
		isElementDisplayed(stickyPage.PLPStickyPriceDisc, true);
		isElementDisplayed(stickyPage.ProductsTabSticky, true);
		isElementDisplayed(stickyPage.ResourceTabSticky, true); 
	}

	@Then("^verifies sticky header in cart page$")
	public void verifies_sticky_header_in_cart_page() throws Throwable {
		scrollBottom();
		isElementDisplayed(stickyPage.MyCartTitle, true);
		isElementDisplayed(stickyPage.ContinueShopping, true);
		isElementDisplayed(stickyPage.SaveCart, true);
		isElementDisplayed(stickyPage.ClearCart, true);	    
	}

	@Then("^verifies sticky header in Most ordered products page$")
	public void verifies_sticky_header_in_Most_ordered_products_page() throws Throwable {
		scrollBottom();
		isElementDisplayed(stickyPage.PLPStickyPriceDisc, true);
		isElementDisplayed(stickyPage.ProductsTabSticky, true);		    
	}
	
	@Then("^Verifies sticky header in order history page$")
	public void verifies_sticky_header_in_order_history_page() throws Throwable {
	   scrollBottom();
	   isElementDisplayed(stickyPage.OrderHistoryLabel, true);
	   isElementDisplayed(stickyPage.OrderHistoryMsg, true);
	   isElementDisplayed(stickyPage.POorOrderNum, true);
	   isElementDisplayed(stickyPage.FilterOption, true);
	   isElementDisplayed(stickyPage.ShipTo, true);
	   isElementDisplayed(stickyPage.OrderCount, true);
	   isElementDisplayed(stickyPage.SearchGo, true);
	   isElementDisplayed(stickyPage.SortingToggleBtn, true);
	}

	@When("^User navigates to saved carts page$")
	public void user_navigates_to_saved_carts_page() throws Throwable {
	    driver.navigate().to(configFileReader.getApplicationUrl()+"my-account/saved-carts");
	}

	@Then("^verifies sticky header in saved carts page$")
	public void verifies_sticky_header_in_saved_carts_page() throws Throwable {
		scrollBottom();
		isElementDisplayed(stickyPage.SavedCart, true);
		isElementDisplayed(stickyPage.SortBy, true);
		isElementDisplayed(stickyPage.SortByDD, true);
	}

	@Then("^verifies sticky header in My Templates page$")
	public void verifies_sticky_header_in_My_Templates_page() throws Throwable {
		scrollBottom();
		isElementDisplayed(stickyPage.MyTemplates, true);
		isElementDisplayed(stickyPage.MyTemplatesDesc, true);
		isElementDisplayed(stickyPage.NumTemplates, true);
		isElementDisplayed(stickyPage.SelectBtn, true);
	}
}