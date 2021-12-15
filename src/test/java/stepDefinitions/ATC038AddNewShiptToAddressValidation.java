package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.ProfilePage;

public class ATC038AddNewShiptToAddressValidation extends BaseClass {
	ProfilePage profilePage= PageFactory.initElements(driver, ProfilePage.class);

	@Given("^user clicks on add ship to address button$")
	public void user_clicks_on_add_ship_to_address_button() throws Throwable {
		ScrollToElement(profilePage.ShipToHeading);
	    jsClick(profilePage.AddNewShipToButton);
	}

	@Then("^user verifies all fields of add ship to account form$")
	public void user_verifies_all_fields_of_add_ship_to_account_form() throws Throwable {
	    isElementDisplayed(profilePage.AddShipToHeading, true);
	    isElementDisplayed(profilePage.AddShipToCompNameLabel, true);
	    isElementDisplayed(profilePage.addShipToCompNameVal, true);
	    isElementDisplayed(profilePage.addShipToAddressLabel, true);
	    isElementDisplayed(profilePage.addShipToAddressVal, true);
	    ScrollToElement(profilePage.addShipToCityLabel);
	    isElementDisplayed(profilePage.addShipToCityLabel, true);
	    isElementDisplayed(profilePage.addShipToCityVal, true);
	    isElementDisplayed(profilePage.addShipToStateLabel, true);
	   // isElementDisplayed(profilePage.addShipToStateVal, true);
	    isElementDisplayed(profilePage.addShipToZipCodeLabel, true);
	    isElementDisplayed(profilePage.addShipToZipCodeVal, true);
	    isElementDisplayed(profilePage.addShipToCountryLabel, true);
	    //isElementDisplayed(profilePage.addShipToCountryVal, true);
	    isElementDisplayed(profilePage.addShipToCancelButton, true);
	    isElementDisplayed(profilePage.addShipToAddButton, true);
	}

	@Then("^User verifies required labels for add ship to account$")
	public void user_verifies_required_labels_for_add_ship_to_account() throws Throwable {
	    	    
	}

	@Then("^User enters information in editable fields on add ship to address form$")
	public void user_enters_information_in_editable_fields_on_add_ship_to_address_form() throws Throwable {
		sendKeys(profilePage.addShipToCompNameVal, "Test Company");
		sendKeys(profilePage.addShipToAddressVal, "3459  Crosswind Drive");
		//jsClick(profilePage.addShipToCountryLabel);
		click("//div[@data-dropdown='p3-dropdown__addShipToAddressForm_country']");
		jsClick(profilePage.CountryAddNewshipto);
		sendKeys(profilePage.addShipToCityVal, "Henderson");
		//click(profilePage.addShipToStateLabel);
		ScrollToElement(profilePage.addShipToZipCodeVal);
		click("//div[@data-dropdown='p3-dropdown__addShipToAddressForm_region']");
		click("//div[@data-dropdown='p3-dropdown__addShipToAddressForm_region']//input[@value='US-AZ']//parent::label");
		click("//input[@id='add-ship-to-form__city']");
		sendKeys(profilePage.addShipToZipCodeVal, "42420");
		click("//input[@id='add-ship-to-form__city']");
	}

	@Then("^verify save to address button is enabled$")
	public void verify_save_to_address_button_is_enabled() throws Throwable {
		
		ScrollToElement(profilePage.addShipToAddButton);
		profilePage.addShipToAddButton.isEnabled();
		click(profilePage.addShipToAddButton);
		isElementDisplayed(profilePage.ToastMsgEditShipToAccount, true);
	}

	@Then("^Click on add to ship to addres save button$")
	public void click_on_add_to_ship_to_addres_save_button() throws Throwable {
	    
	    
	}

	@Then("^verifies add ship to address form success toast message$")
	public void verifies_add_ship_to_address_form_success_toast_message() throws Throwable {
	    
	    
	}

	@Then("^verifies add ship to address email receipt and navigate to mail body$")
	public void verifies_add_ship_to_address_email_receipt_and_navigate_to_mail_body() throws Throwable {
		isElementDisplayed("(//td[contains(text(),'Request for New Ship To Address')])[1]", true);
	    click("(//td[contains(text(),'Request for New Ship To Address')])[1]");		    
	}

	@Then("^verifies web elements in email confirmation body for add ship to email$")
	public void verifies_web_elements_in_email_confirmation_body_for_add_ship_to_email() throws Throwable {
		driver.switchTo().frame("html_msg_body");
		Thread.sleep(3000);
		isElementDisplayed("//span[contains(text(),'New Ship To Address')]", true);
		isElementDisplayed("//span[contains(text(),'Account Number:')]", true);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[contains(text(),'New Information')]")));
		} catch (Exception e) {
			e.printStackTrace();
			driver.navigate().to(configFileReader.getApplicationUrl());
		} 
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
		isElementDisplayed("//span[contains(text(),'2021 The Chamberlain Group LLC')]", true);
		isElementDisplayed("//span[contains(text(),'300 Windsor Drive Oak Brook, IL')]", true);
		driver.navigate().to(configFileReader.getApplicationUrl());	    
	}
}
