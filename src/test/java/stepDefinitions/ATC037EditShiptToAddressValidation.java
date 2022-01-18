package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.ProfilePage;

public class ATC037EditShiptToAddressValidation extends BaseClass {
	ProfilePage profilePage= PageFactory.initElements(driver, ProfilePage.class);

	@Given("^user clicks on edit ship to address icon$")
	public void user_clicks_on_edit_ship_to_address_icon() throws Throwable {
		ScrollToElement(profilePage.ShipToHeading);
	    jsClick(profilePage.EditShipToPencilIcon);
	}

	@Then("^user verifies all fields of edit ship to account form$")
	public void user_verifies_all_fields_of_edit_ship_to_account_form() throws Throwable {
	    isElementDisplayed(profilePage.EditShipToHeading, true);
	    isElementDisplayed(profilePage.EditShipToReqLabel, true);
	    isElementDisplayed(profilePage.EditShipToNumberLabel, true);
	    isElementDisplayed(profilePage.EditShipToNumberVal, true);
	    isElementDisplayed(profilePage.EditDealerExtIDLabel, true);
	    isElementDisplayed(profilePage.EditDealerExtIDVal, true);
	    isElementDisplayed(profilePage.EditShipToCompNameLabel, true);
	    isElementDisplayed(profilePage.EditShipToCompNameVal, true);
	    isElementDisplayed(profilePage.EditShipToAddressLabel, true);
	    isElementDisplayed(profilePage.EditShipToAddressVal, true);
	    ScrollToElement(profilePage.EditShipToCityLabel);
	    isElementDisplayed(profilePage.EditShipToCityLabel, true);
	    isElementDisplayed(profilePage.EditShipToCityVal, true);
	    isElementDisplayed(profilePage.EditShipToStateLabel, true);
	    //isElementDisplayed(profilePage.EditShipToStateVal, true);
	    isElementDisplayed(profilePage.EditShipToZipCodeLabel, true);
	    isElementDisplayed(profilePage.EditShipToZipCodeVal, true);
	    profilePage.EditShipToCancelButton.isEnabled();
	}

	@Then("^User verifies required labels for edit ship to account$")
	public void user_verifies_required_labels_for_edit_ship_to_account() throws Throwable {
		ScrollToElement(profilePage.EditShipToCityLabel);
		clear(profilePage.EditShipToZipCodeVal);
		jsClick(profilePage.EditShipToCityLabel);
		isElementDisplayed("//form[@id='editShipToAddressForm']//label[@for='add-ship-to-form__zip']//span[contains(text(),'Required')]", true);
		clear(profilePage.EditShipToCityVal);
		jsClick(profilePage.EditShipToStateLabel);
		isElementDisplayed("//form[@id='editShipToAddressForm']//label[@for='add-ship-to-form__city']//span[contains(text(),'Required')]", true);
		jsClick(profilePage.EditShipToCancelButton);
	}

	@Then("^User enters information in editable fields on edit ship to address form$")
	public void user_enters_information_in_editable_fields_on_edit_ship_to_address_form() throws Throwable {
		ScrollToElement(profilePage.EditShipToCompNameLabel);
		clear(profilePage.EditShipToCompNameVal);
		jsClick(profilePage.EditShipToAddressLabel);
		sendKeys(profilePage.EditShipToCompNameVal, "ANDERSON OVERHEAD DOOR INC");
		sendKeys(profilePage.EditShipToAddressVal, "610 E PLAZA DR");
		ScrollToElement(profilePage.EditShipToCityVal);
		clear(profilePage.EditShipToCityVal);
		sendKeys(profilePage.EditShipToCityVal, "CARTERVILLE");
		sendKeys(profilePage.EditShipToZipCodeVal, "62918-1955");
		click(profilePage.EditShipToCityTB);
	}

	@Then("^click on Edit ship to form save button$")
	public void click_on_Edit_ship_to_form_save_button() throws Throwable {
		profilePage.EditShipToAddButton.isEnabled();
		ScrollToElement(profilePage.EditShipToAddButton);
		jsClick(profilePage.EditShipToAddButton);
		isElementDisplayed(profilePage.ToastMsgEditShipToAccount, true);
	}

	@Then("^verifies ship to address form success toast message$")
	public void verifies_ship_to_address_form_success_toast_message() throws Throwable {
	    
	}

	@Then("^verifies ship to address email receipt and navigate to mail body$")
	public void verifies_ship_to_address_email_receipt_and_navigate_to_mail_body() throws Throwable {
		isElementDisplayed("(//td[contains(text(),'Changes to Ship To Address')])[1]", true);
	    click("(//td[contains(text(),'Changes to Ship To Address')])[1]");	    
	}

	@Then("^verifies web elements in email confirmation body for ship to email$")
	public void verifies_web_elements_in_email_confirmation_body_for_ship_to_email() throws Throwable {
		driver.switchTo().frame("html_msg_body");
		Thread.sleep(3000);
		isElementDisplayed("//span[contains(text(),'Changes to Ship To Address')]", true);
		isElementDisplayed("//span[contains(text(),'Account Number:')]", true);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[contains(text(),'Old Information')]")));
		} catch (Exception e) {
			e.printStackTrace();
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
		isElementDisplayed("//span[contains(text(),'2022 The Chamberlain Group LLC')]", true);
		isElementDisplayed("//span[contains(text(),'300 Windsor Drive Oak Brook, IL')]", true);
		driver.navigate().to(configFileReader.getApplicationUrl());
	}	    
}
