package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.LoginPage;
import pageObjects.OrderConfirmationPage;
import pageObjects.OrderHistoryDetailsPage;

public class ReorderValidation extends BaseClass {
	OrderConfirmationPage orderConfirmationPage = PageFactory.initElements(driver, OrderConfirmationPage.class);
	OrderHistoryDetailsPage orderHistoryDetailsPage = PageFactory.initElements(driver, OrderHistoryDetailsPage.class);
	String ordernumber;
	
	@Then("^user clicks on order status and navigate to order history page$")
	public void user_clicks_on_order_status_and_navigate_to_order_history_page() throws Throwable {
	    isElementDisplayed(orderConfirmationPage.OrderConfMessageText, true);
	    String messageconf = getText(orderConfirmationPage.OrderConfMessageText);
	    String[] messageConfsplit = messageconf.split(" ");
	    String ordernumberindex = messageConfsplit[3];
	    ordernumber = ordernumberindex.substring(1);
	    Thread.sleep(10000);
	    click(orderConfirmationPage.OrderStatusLink);
	    verifypageURL("my-account/orders");
	}

	@Then("^user verifies order number is present in order history page$")
	public void user_verifies_order_number_is_present_in_order_history_page() throws Throwable {
		isElementDisplayed("//a[contains(text(),'"+ordernumber+"')]", true);
	}

	@Then("^user verifies order again button is enabled$")
	public void user_verifies_order_again_button_is_enabled() throws Throwable {
		orderHistoryDetailsPage.ReorderLink.isEnabled();
	}

	@Then("^User clicks on on order again and verifies cart page$")
	public void user_clicks_on_on_order_again_and_verifies_cart_page() throws Throwable {
	    click(orderHistoryDetailsPage.ReorderLink);
	    verifypageURL("cart");
	    isElementDisplayed("//a[contains(text(),'041A5507-7C')]", true);
	    isElementDisplayed("//a[contains(text(),'02-51227')]", true);
	}
	
	@Then("^User navigates to the order history detail page of recently placed order$")
	public void user_navigates_to_the_order_history_page_of_recently_placed_order() throws Throwable {
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//a[contains(text(),'"+ordernumber+"')]")));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		//jsClick("//a[contains(text(),'"+ordernumber+"')]");
		try {		
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[contains(text(),'"+ordernumber+"')]")));
			pageLoadTimeout();
		} catch (Exception e) {
			e.printStackTrace();
			//Assert.assertTrue(false, "Element Not Found" + element + "| Error - " + e);
			Assert.assertTrue("order number Not Found in order history page| Error - " + e,false);
			//Reporter.log("Element Not Found" + element + "| Error - " + e);
		} 
	}

	@Then("^user verifies link navigation in order history page$")
	public void user_verifies_link_navigation_in_order_history_page() throws Throwable {
		try {		
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[contains(text(),'041A5507-7C')]")));
			pageLoadTimeout();
		} catch (Exception e) {
			e.printStackTrace();
			//Assert.assertTrue(false, "Element Not Found" + element + "| Error - " + e);
			Assert.assertTrue("Product link Not Found in order history detail page| Error - " + e,false);
			//Reporter.log("Element Not Found" + element + "| Error - " + e);
		} 
	    verifypageURL("p/041A5507-7C");
	    isElementDisplayed("//h1[contains(text(),'041A5507-7C')]", true);
	    driver.navigate().back();
	    pageLoadTimeout();
	    try {		
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[contains(text(),'02-51227')]")));
			pageLoadTimeout();
		} catch (Exception e) {
			e.printStackTrace();
			//Assert.assertTrue(false, "Element Not Found" + element + "| Error - " + e);
			Assert.assertTrue("Product link Not Found in order history detail page| Error - " + e,false);
			//Reporter.log("Element Not Found" + element + "| Error - " + e);
		} 
	    verifypageURL("p/02-51227");
	    isElementDisplayed("//h1[contains(text(),'02-51227')]", true);
	    driver.navigate().back();
	    pageLoadTimeout();
	}
	
	@Then("^user verifies order again button is disabled$")
	public void user_verifies_order_again_button_is_disabled() throws Throwable {
		isElementdisabled(orderHistoryDetailsPage.ReorderLink, false);
	}
}
