package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PDPPage;
import pageObjects.SearchResultsPage;

public class ATC088CTAValidationonPDPandListingPages extends BaseClass {
	SearchResultsPage searchresultsPage = PageFactory.initElements(driver, SearchResultsPage.class);
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	PDPPage pdpPage = PageFactory.initElements(driver, PDPPage.class);
	String productName;
	
	@When("^User search for product \"([^\"]*)\"$")
	public void user_search_for_product(String arg1) throws Throwable {
		searchText("041D9140");
	}
	
	@When("^User search for NotifyME product \"([^\"]*)\"$")
	public void user_search_for_NotifyME_product(String arg1) throws Throwable {
		searchText("8550WLB");
	}
	
	@When("^User search for Custom CTA product \"([^\"]*)\"$")
	public void user_search_for_Custom_CTA_product(String arg1) throws Throwable {
		searchText("CAPXLV");
	}
	
	@When("^User search for LearnMore CTA product \"([^\"]*)\"$")
	public void user_search_for_LearnMore_CTA_product(String arg1) throws Throwable {
		searchText("T");
	}
	
	@When("^User search for CDO product \"([^\"]*)\"$")
	public void user_search_for_CDO_product(String arg1) throws Throwable {
		searchText("DDO8900WMC");
	}

	@Then("^verify Add to cart CTA on Search results page$")
	public void verify_Add_to_cart_CTA_on_Search_results_page() throws Throwable {
//		ScrollToElement(searchresultsPage.FirstProdImage);
//		isElementDisplayed("//h2[contains(text(),'"+productName+"')]//parent::div//div[@class='p3-plp__product-footer']//button[contains(text(),'Add to cart')]", true);
//	   	Thread.sleep(1000);
//	   	try {		
//			JavascriptExecutor executor = (JavascriptExecutor)driver;
//			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//h2[contains(text(),'"+productName+"')]//parent::div//parent::li[@class='p3-plp__product-item']")));
//			pageLoadTimeout();
//		} catch (Exception e) {
//			e.printStackTrace();
//			Assert.assertTrue("Element Not Found| Error - " + e,false);
//		}
		Thread.sleep(10000);
	   	searchElementCTA("atomic-result-list[class='hydrated']","atomic-result[class='hydrated']", "div > atomic-result-section-actions > result-product-cta-component", "section > div > div > form > button");
	   	searchProductCardClick("atomic-result-list[class='hydrated']", "div > div > div:nth-child(1) > a");
	}

	@Then("^verify Add to Cart CTA on PDP page$")
	public void verify_Add_to_Cart_CTA_on_PDP_page() throws Throwable {
	   	isElementDisplayed("//button[contains(text(),'Add to cart') and @id='addToCartButton']", true);
	}

	@Then("^verify Get Support CTA on Search results page$")
	public void verify_Get_Support_CTA_on_Search_results_page() throws Throwable {
		searchClear();
		Thread.sleep(2000);
		searchText("041-0125");
	}

	@Then("^verify Get Support CTA on PDP page$")
	public void verify_Get_Support_CTA_on_PDP_page() throws Throwable {
		Thread.sleep(10000);
		searchElementCTA("atomic-result-list[class='hydrated']","atomic-result[class='hydrated']", "div > atomic-result-section-actions > result-product-cta-component", "section > div > div > a");
		searchProductCardClick("atomic-result-list[class='hydrated']", "div > div > a");
	}
	

	@Then("^verify NotifyME CTA on Search results page$")
	public void verify_NotifyME_CTA_on_Search_results_page() throws Throwable {
		Thread.sleep(3000);
		WebElement AcceptCookies  = driver.findElement(By.id("onetrust-accept-btn-handler"));
		if (AcceptCookies != null)
		{
			AcceptCookies.click();
		}
		searchElementCTA("atomic-result-list[class='hydrated']","atomic-result[class='hydrated']", "div > atomic-result-section-actions > result-product-cta-component", "p[id='notify-me-message']");
		searchProductCardClick("atomic-result-list[class='hydrated']", "div > div > div:nth-child(1) > a");

	}

	/*@Then("^Verify NotifyME message in search results page$")
	public void verify_NotifyME_message_in_search_results_page() throws Throwable {
		searchElementCTA("atomic-result-list[class='hydrated']","atomic-result[class='hydrated']", "div > atomic-result-section-actions > result-product-cta-component", "p[id='notify-me-message']");
		searchProductCardClick("atomic-result-list[class='hydrated']", "div > div > div:nth-child(1) > a");
	}*/

	@Then("^verify NotifyME CTA on PDP page$")
	public void verify_NotifyME_CTA_on_PDP_page() throws Throwable {
	   	isElementDisplayed("//button[contains(text(),'NOTIFY ME')]", true);
	   	try {		
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[contains(text(),'NOTIFY ME')]")));
			pageLoadTimeout();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue("Element Not Found| Error - " + e,false);
		} 
	   	isElementDisplayed("//div[contains(text(),'You will be notified')]", true);
	}

	@Then("^verify Notify ME message on PDP page$")
	public void verify_Notify_ME_message_on_PDP_page() throws Throwable {
	}

	@Then("^verify Custom CTA on Search results page$")
	public void verify_Custom_CTA_on_Search_results_page() throws Throwable {
		searchElementCTA("atomic-result-list[class='hydrated']","atomic-result[class='hydrated']", "div > atomic-result-section-actions > result-product-cta-component", "section > div > div > form > button");
		searchProductCardClick("atomic-result-list[class='hydrated']", "div > div > div:nth-child(1) > a");
	}

	@Then("^verify Custom CTA on PDP page and type of Custom CTA$")
	public void verify_Custom_CTA_on_PDP_page_and_type_of_Custom_CTA() throws Throwable {
	    
	}

	@Then("^verify Learn more CTA on Search results page$")
	public void verify_Learn_more_CTA_on_Search_results_page() throws Throwable {
		searchElementCTA("atomic-result-list[class='hydrated']","atomic-result[class='hydrated']", "div > atomic-result-section-actions > result-product-cta-component", "section > div > div > a");
		searchProductCardClick("atomic-result-list[class='hydrated']", "div > div > div:nth-child(1) > a");
	}
	
	@Then("^verify Learn more CTA for configurable products on Search results page$")
	public void verify_Learn_more_CTA_for_configurable_products_on_Search_results_page() throws Throwable {
		searchElementCTA("atomic-result-list[class='hydrated']","atomic-result[class='hydrated']", "div > atomic-result-section-actions > result-product-cta-component", "section > div > div > a");
		searchProductCardClick("atomic-result-list[class='hydrated']", "div > div > div:nth-child(1) > a");
	}

	@Then("^verify Add to Cart CTA on PDP page disabled$")
	public void verify_Add_to_Cart_CTA_on_PDP_page_disabled() throws Throwable {
	  isElementdisabled(pdpPage.AddMoreCTA, true);   
	}
}