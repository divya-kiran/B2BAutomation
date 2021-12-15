package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.WarrantyClaimPage;

public class ATC047ValidationofWarrantyClaim extends BaseClass {
	WarrantyClaimPage WCPage = PageFactory.initElements(driver, WarrantyClaimPage.class);

	@Given("^User navigate to Terms and conditions of Warranty claim page$")
	public void user_navigate_to_Terms_and_conditions_of_Warranty_claim_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"warranty-claim");
	}

	@Then("^User verifies web elements in Terms and conditions of Warranty claim page$")
	public void user_verifies_web_elements_in_Terms_and_conditions_of_Warranty_claim_page() throws Throwable {
	    isElementDisplayed(WCPage.WsupportProgramTCPage, true);
	    ScrollToElement(WCPage.WContactTextTCPage);
	    isElementDisplayed(WCPage.WContactTextTCPage, true);
	    isElementDisplayed(WCPage.WContactLinkTCPage, true);
	}

	@Given("^User navigate to Warranty claim page$")
	public void user_navigate_to_Warranty_claim_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"warranty-claim");
		Thread.sleep(3000);
		scrollBottom();
	    jsClick(WCPage.WarrantyClaimCheckMark);
	    Thread.sleep(3000);
	    jsClick(WCPage.WarrantyClaimCheckNextButton);
	}

	@Then("^User verifies all web elements of Warranty claim page and enter information in mandatory fields$")
	public void user_verifies_all_web_elements_of_Warranty_claim_page() throws Throwable {
		isElementDisplayed(WCPage.WarrantyClaimTitle, true);
	    isElementDisplayed(WCPage.WarrantyClaimHomeOwner, true);
	    ScrollToElement(WCPage.WarrantyClaimHomeOwner);
	    isElementDisplayed(WCPage.WCServiceDate, true);
	    isElementDisplayed(WCPage.ContactPersonTB, true);
	    isElementDisplayed(WCPage.CountryDD, true);
	    isElementDisplayed(WCPage.Address1, true);
	    isElementDisplayed(WCPage.Address2, true);
	    isElementDisplayed(WCPage.CityName, true);
	    isElementDisplayed(WCPage.StateDD, true);
	    isElementDisplayed(WCPage.PostCode, true);
	    isElementDisplayed(WCPage.WarrantyClaimServiceCallInfo, true);
	    isElementDisplayed(WCPage.WarrantyProductYesorNo, true);
	    isElementDisplayed(WCPage.WarrantyClaimYesButton, true);
	    isElementDisplayed(WCPage.WarrantyClaimNoButton, true);
	    isElementDisplayed(WCPage.ProductDidYouService, true);
	    isElementDisplayed(WCPage.ResidentialRadioButton, true);
	    isElementDisplayed(WCPage.CDORadioButton, true);
	    isElementDisplayed(WCPage.OpenerModelNum, true);
	    isElementDisplayed(WCPage.OpenerSerialNum, true);
	    isElementDisplayed(WCPage.OriginalInstalDate, true);
	    isElementDisplayed(WCPage.ProblemTextBox, true);
	    isElementDisplayed(WCPage.RemedyTextArea, true);
	    isElementDisplayed(WCPage.PartsReplacedTB, true);
	    ScrollToElement(WCPage.warrantyClaimSaveButton);
	    isElementDisplayed(WCPage.warrantyClaimSaveButton, true);
	    ScrollToElement(WCPage.WarrantyClaimHomeOwner);
	    sendKeys(WCPage.WCServiceDate, "01/07/2021");
	    jsClick(WCPage.ContactPersonLabel);
	    sendKeys(WCPage.ContactPersonTB, "Automated User");
	    jsClick(WCPage.CountryDD);
	    jsClick(WCPage.CountryDDUSA);
	    sendKeys(WCPage.Address1, "2400 S THOMPSON");
	    sendKeys(WCPage.CityName, "SPRINGDALE");
	    jsClick(WCPage.StateDD);
	    jsClick(WCPage.StateDDAZ);
	    sendKeys(WCPage.PostCode, "72764");
	    jsClick(WCPage.WarrantyClaimYesButton);
	    jsClick(WCPage.CDORadioButton);
	    sendKeys(WCPage.OpenerModelNum, "1234567");
	    sendKeys(WCPage.OpenerSerialNum, "7654321");
	    sendKeys(WCPage.OriginalInstalDate, "01/07/2020");
	    jsClick(WCPage.ContactPersonLabel);
	    ScrollToElement(WCPage.OriginalInstalDate);
	    sendKeys(WCPage.ProblemTextBox, "Claim submitted by a autmation Bot");
	    sendKeys(WCPage.RemedyTextArea, "Claim submitted by a autmation Bot");
	    sendKeys(WCPage.PartsReplacedTB, "Claim submitted by a autmation Bot");
	    WCPage.warrantyClaimSaveButton.isEnabled();
	}

	@Then("^user clicks on submit in warranty claim page$")
	public void user_clicks_on_submit_in_warranty_claim_page() throws Throwable {
		jsClick(WCPage.warrantyClaimSaveButton);   
	}

	@Then("^verifies success message and page navigation$")
	public void verifies_success_message() throws Throwable {
	    isElementDisplayed(WCPage.ToastMessage, true);
	    verifypageURL("order-management");
	}

	@Then("^verifies Warranty claim email receipt and navigate to mail body$")
	public void verifies_Warranty_claim_email_receipt_and_navigate_to_mail_body() throws Throwable {
		isElementDisplayed("(//td[contains(text(),'LiftMaster Warranty Claim')])[1]", true);
	    click("(//td[contains(text(),'LiftMaster Warranty Claim')])[1]");
	}

	@Then("^verifies web elements in email confirmation body for Warranty claim confirmation email$")
	public void verifies_web_elements_in_email_confirmation_body_for_Warranty_claim_confirmation_email() throws Throwable {
		driver.switchTo().frame("html_msg_body");
		Thread.sleep(3000);
		isElementDisplayed("//span[contains(text(),'Warranty Support Claim')]", true);
		isElementDisplayed("//a[contains(text(),'Denise.Racana@liftmaster.com')]", true);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//a[contains(text(),'Denise.Racana@liftmaster.com')]")));
		} catch (Exception e) {
			e.printStackTrace();
			driver.navigate().to(configFileReader.getApplicationUrl());
		} 
		isElementDisplayed("//span[contains(text(),'Claim Number:')]", true);
		isElementDisplayed("//span[contains(text(),'Dealer ID:')]", true);
		isElementDisplayed("//span[contains(text(),'CHAMBERLAIN GROUP INC')]", true);
		isElementDisplayed("//strong[contains(text(),'Contact Email Address')]", true);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//strong[contains(text(),'Contact Email Address')]")));
		} catch (Exception e) {
			e.printStackTrace();
			driver.navigate().to(configFileReader.getApplicationUrl());
		} 
		isElementDisplayed("//strong[contains(text(),'Model Number')]", true);
		isElementDisplayed("//strong[contains(text(),'Submitted On')]", true);
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
