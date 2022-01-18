package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.ProfilePage;

public class ATC035SoldToFormValidation extends BaseClass {
	ProfilePage profilePage= PageFactory.initElements(driver, ProfilePage.class);
	
	@Then("^user verifies all fields of sold to account form$")
	public void user_verifies_all_fields_of_sold_to_account_form() throws Throwable {
	   ScrollToElement(profilePage.SoldToHeading);
		isElementDisplayed(profilePage.SoldToHeading, true);
	    //isElementDisplayed(profilePage.SoldToReqLabel, true);
	    ScrollToElement(profilePage.SoldToCustomerNumberLabel);
	    isElementDisplayed(profilePage.SoldToCustomerNumberLabel, true);
	    isElementDisplayed(profilePage.SoldToCustomerNumberVal, true);
	    isElementDisplayed(profilePage.SoldToDealerLabel, true);
	    isElementDisplayed(profilePage.SoldToDealerIDVal, true);
	    isElementDisplayed(profilePage.SoldToCompanyNameLabel, true);
	    isElementDisplayed(profilePage.SoldToCompanyNameVal, true);
	    isElementDisplayed(profilePage.SoldToAddressLabel, true);
	    isElementDisplayed(profilePage.SoldToAddressVal, true);
	    isElementDisplayed(profilePage.SoldToAddress2Label, true);
	    isElementDisplayed(profilePage.SoldToCityLabel, true);
	    isElementDisplayed(profilePage.SoldToCityVal, true);
	    isElementDisplayed(profilePage.SoldToCountryLabel, true);
	    isElementDisplayed(profilePage.SoldToCountryVal, true);
	    isElementDisplayed(profilePage.SoldToZipCodeLabel, true);
	    isElementDisplayed(profilePage.SoldToZipCodeVal, true);
	    isElementDisplayed(profilePage.SoldToStateLabel, true);
	    isElementDisplayed(profilePage.SoldToStateVal, true);
	}

	@Then("^User verifies required labels for sold to account$")
	public void user_verifies_required_labels() throws Throwable {
	    jsClick(profilePage.SoldToCustomerNumberVal);
	    Thread.sleep(3000);
	    profilePage.SoldToCancelButton.isEnabled();
	    clear(profilePage.SoldToAddressTB);
	    click(profilePage.SoldToCompanyNameTB);
	    isElementDisplayed(profilePage.SoldToAddressReqLabel, true);
	    sendKeys(profilePage.SoldToAddressTB, "300 WINDSOR DR");
	    jsClick(profilePage.SoldToCompanyNameTB);
	    profilePage.SoldToCancelButton.isEnabled();
	    profilePage.SoldToSaveButton.isEnabled();	    
	}

	@Then("^User fills editable fields in sold to form$")
	public void user_edit_fields_in_sold_to_form() throws Throwable {
		ScrollToElement(profilePage.SoldToCustomerNumberVal);
		jsClick(profilePage.SoldToCustomerNumberVal);
	    Thread.sleep(2000);
	    clear(profilePage.SoldToCompanyNameTB);
	    click(profilePage.SoldToAddressTB);
	    sendKeys(profilePage.SoldToCompanyNameTB, "CHAMBERLAIN GROUP INC");
	    clear(profilePage.SoldToAddressTB);
	    click(profilePage.SoldToCompanyNameTB);
	    sendKeys(profilePage.SoldToAddressTB, "300 WINDSOR DR");
	    click(profilePage.SoldToCompanyNameTB);
	    Thread.sleep(2000);
	}

	@Then("^click on sold to form save button$")
	public void click_on_sold_to_form_save_button() throws Throwable {
		ScrollToElement(profilePage.SoldToSaveButton);
		jsClick(profilePage.SoldToSaveButton);
	    isElementDisplayed(profilePage.ToastMsgSoldToAccount,true);
	}

	@Then("^verifies sold to form success toast message$")
	public void verifies_sold_to_form_success_toast_message() throws Throwable {
	    
	}

	@Then("^verifies sold to email receipt and navigate to mail body$")
	public void verifies_sold_to_email_receipt_and_navigate_to_mail_body() throws Throwable {
	    isElementDisplayed("(//td[contains(text(),'Changes to Sold To Address')])[1]", true);
	    click("(//td[contains(text(),'Changes to Sold To Address')])[1]");
	}

	@Then("^verifies web elements in email confirmation body for sold to email$")
	public void verifies_web_elements_in_email_confirmation_body_for_sold_to_email() throws Throwable {
		driver.switchTo().frame("html_msg_body");
		Thread.sleep(3000);
		isElementDisplayed("//span[contains(text(),'Changes to Sold To Address')]", true);
		isElementDisplayed("//span[contains(text(),'Account Number:')]", true);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[contains(text(),'Old Information')]")));
		} catch (Exception e) {
			driver.navigate().to(configFileReader.getApplicationUrl());
		} 
		isElementDisplayed("//span[contains(text(),'Old Information')]", true);
		isElementDisplayed("//span[contains(text(),'New Information')]", true);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[contains(text(),'Requested By:')]")));
		} catch (Exception e) {
			e.printStackTrace();
			driver.navigate().to(configFileReader.getApplicationUrl());
		} 
		isElementDisplayed("//span[contains(text(),'Requested By:')]", true);
		isElementDisplayed("//span[contains(text(),'Requested By:')]//following-sibling::span", true);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[contains(text(),'300 Windsor Drive Oak Brook, IL')]")));
		} catch (Exception e) {
			e.printStackTrace();
			driver.navigate().to(configFileReader.getApplicationUrl());
		}
		isElementDisplayed("//span[contains(text(),'2022 The Chamberlain Group')]", true);
		isElementDisplayed("//span[contains(text(),'300 Windsor Drive Oak Brook, IL')]", true);
		driver.navigate().to(configFileReader.getApplicationUrl());
	}
	
}
