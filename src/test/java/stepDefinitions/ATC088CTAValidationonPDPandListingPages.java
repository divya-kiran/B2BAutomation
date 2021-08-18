package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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
		productName=arg1;
		sendKeys(homePage.HeaderSearchTextBox, arg1);
		homePage.HeaderSearchTextBox.sendKeys(Keys.RETURN);
	}

	@Then("^verify Add to cart CTA on Search results page$")
	public void verify_Add_to_cart_CTA_on_Search_results_page() throws Throwable {
		ScrollToElement(searchresultsPage.FirstProdImage);
		isElementDisplayed("//h2[contains(text(),'"+productName+"')]//parent::div//div[@class='p3-plp__product-footer']//button[contains(text(),'Add to cart')]", true);
	   	Thread.sleep(1000);
	   	try {		
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//h2[contains(text(),'"+productName+"')]//parent::div//parent::li[@class='p3-plp__product-item']")));
			pageLoadTimeout();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue("Element Not Found| Error - " + e,false);
		}
	}

	@Then("^verify Add to Cart CTA on PDP page$")
	public void verify_Add_to_Cart_CTA_on_PDP_page() throws Throwable {
	   	isElementDisplayed("//button[contains(text(),'Add to cart') and @id='addToCartButton']", true);
	}

	@Then("^verify Get Support CTA on Search results page$")
	public void verify_Get_Support_CTA_on_Search_results_page() throws Throwable {
		ScrollToElement(searchresultsPage.FirstProdName);
		isElementDisplayed("//h2[contains(text(),'"+productName+"')]//parent::div//div[@class='p3-plp__product-footer']//a[contains(text(),'Get Support')]", true);
		Thread.sleep(1000);
		try {		
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//h2[contains(text(),'"+productName+"')]//parent::div//parent::li[@class='p3-plp__product-item']")));
			pageLoadTimeout();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue("Element Not Found| Error - " + e,false);
		} 
	}

	@Then("^verify Get Support CTA on PDP page$")
	public void verify_Get_Support_CTA_on_PDP_page() throws Throwable {
	   isElementDisplayed("//a[contains(text(),'Get Support')]", true);	    
	}

	@Then("^verify NotifyME CTA on Search results page$")
	public void verify_NotifyME_CTA_on_Search_results_page() throws Throwable {
		ScrollToElement(searchresultsPage.FirstProdName);
		isElementDisplayed("//h2[contains(text(),'"+productName+"')]//parent::div//div[@class='p3-plp__product-footer']//button[contains(text(),'Notify Me')]", true);
	}

	@Then("^Verify NotifyME message in search results page$")
	public void verify_NotifyME_message_in_search_results_page() throws Throwable {
	   	try {		
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//h2[contains(text(),'"+productName+"')]//parent::div//div[@class='p3-plp__product-footer']//button[contains(text(),'Notify Me')]")));
			pageLoadTimeout();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue("Element Not Found| Error - " + e,false);
		} 
	   	Thread.sleep(2000);
	   	isElementDisplayed("//div[contains(text(),'You will be notified when "+productName+" is available')]", true);
	   	try {		
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//h2[contains(text(),'"+productName+"')]//parent::div//parent::li[@class='p3-plp__product-item']")));
			pageLoadTimeout();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue("Element Not Found| Error - " + e,false);
		} 
	}

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
	   	isElementDisplayed("//p[contains(text(),'You will be notified when "+productName+" is available')]", true);
	}

	@Then("^verify Notify ME message on PDP page$")
	public void verify_Notify_ME_message_on_PDP_page() throws Throwable {
	}

	@Then("^verify Custom CTA on Search results page$")
	public void verify_Custom_CTA_on_Search_results_page() throws Throwable {
		ScrollToElement(searchresultsPage.FirstProdName);
		isElementDisplayed("//h2[contains(text(),'"+productName+"')]//parent::div//div[@class='p3-plp__product-footer']//a[contains(text(),'Contact Us')]", true);
		try {		
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//h2[contains(text(),'"+productName+"')]//parent::div//parent::li[@class='p3-plp__product-item']")));
			pageLoadTimeout();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue("Element Not Found| Error - " + e,false);
		} 
	}

	@Then("^verify Custom CTA on PDP page and type of Custom CTA$")
	public void verify_Custom_CTA_on_PDP_page_and_type_of_Custom_CTA() throws Throwable {
	    isElementDisplayed("//a[contains(text(),'Contact Us') and @class='p3-button__primary']", true);
	}

	@Then("^verify Learn more CTA on Search results page$")
	public void verify_Learn_more_CTA_on_Search_results_page() throws Throwable {
		ScrollToElement(searchresultsPage.FirstProdName);
		isElementDisplayed("//h2[contains(text(),'"+productName+"')]//parent::div//div[@class='p3-plp__product-footer']//a[contains(text(),'Learn More')]", true);
		try {		
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//h2[contains(text(),'"+productName+"')]//parent::div//parent::li[@class='p3-plp__product-item']")));
			pageLoadTimeout();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue("Element Not Found| Error - " + e,false);
		} 	    
	}
	
	@Then("^verify Learn more CTA for configurable products on Search results page$")
	public void verify_Learn_more_CTA_for_configurable_products_on_Search_results_page() throws Throwable {
		ScrollToElement(searchresultsPage.FirstProdName);
		isElementDisplayed("//h2[text()='"+productName+"']//parent::div//div[@class='p3-plp__product-footer']//a[contains(text(),'Learn More')]", true);
		try {		
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//h2[text()='"+productName+"']//parent::div//parent::li[@class='p3-plp__product-item']")));
			pageLoadTimeout();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue("Element Not Found| Error - " + e,false);
		}     
	}

	@Then("^verify Add to Cart CTA on PDP page disabled$")
	public void verify_Add_to_Cart_CTA_on_PDP_page_disabled() throws Throwable {
	   //	isElementdisabled(element, expected)    
	}
}