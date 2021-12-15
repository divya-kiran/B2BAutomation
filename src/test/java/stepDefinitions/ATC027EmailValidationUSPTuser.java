package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.LoginPage;
import pageObjects.OrderConfirmationPage;

public class ATC027EmailValidationUSPTuser extends BaseClass {
	OrderConfirmationPage orderConfirmationPage= PageFactory.initElements(driver, OrderConfirmationPage.class);
	String ordernumber;
	@Then("^user naviagates to mailinator website$")
	public void user_naviagates_to_mailinator_website() throws Throwable {
		isElementDisplayed(orderConfirmationPage.OrderConfMessageText, true);
	    String messageconf = getText(orderConfirmationPage.OrderConfMessageText);
	    String[] messageConfsplit = messageconf.split(" ");
	    String ordernumberindex = messageConfsplit[3];
	    ordernumber = ordernumberindex.substring(1);
	}

	@Then("^navigates to user inbox \"([^\"]*)\"$")
	public void navigates_to_user_inbox(String arg1) throws Throwable {
	    Thread.sleep(40000);
		driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp?to="+arg1);
	    pageLoadTimeout();
	}

	@Then("^verifies email receipt and navigate to mail body$")
	public void verifies_email_receipt_and_navigate_to_mail_body() throws Throwable {
	    isElementDisplayed("//td[contains(text(),'Order Confirmation: "+ordernumber+"')]", true);
	    click("//td[contains(text(),'Order Confirmation: "+ordernumber+"')]");
	    Thread.sleep(2000);
	}

	@Then("^verifies web elements in email confirmation body$")
	public void verifies_web_elements_in_email_confirmation_body() throws Throwable {
		driver.switchTo().frame("html_msg_body");
		Thread.sleep(1000);
		isElementDisplayed("//span[contains(text(),'Thank you for placing an order with LiftMaster!')]", true);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[contains(text(),'Order Confirmation Number')]")));
		} catch (Exception e) {
			e.printStackTrace();
		} 
		isElementDisplayed("//span[contains(text(),'Order Confirmation Number')]", true);
		isElementDisplayed("//span[contains(text(),'"+ordernumber+"')]", true);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[contains(text(),'Shipping Information')]")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		isElementDisplayed("//span[contains(text(),'Shipping Information')]", true);
		isElementDisplayed("//span[contains(text(),'Order Summary')]", true);
		isElementDisplayed("//span[contains(text(),'Subtotal')]", true);
		isElementDisplayed("//span[contains(text(),'Total')]", true);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[contains(text(),'300 Windsor Drive Oak Brook, IL, 60523')]")));
		} catch (Exception e) {
			e.printStackTrace();
		}
		isElementDisplayed("//span[contains(text(),'The Chamberlain Group LLC - 300')]", true);
		isElementDisplayed("//span[contains(text(),'300 Windsor Drive Oak Brook, IL, 60523')]", true);
		driver.navigate().to(configFileReader.getApplicationUrl());
	}
}
