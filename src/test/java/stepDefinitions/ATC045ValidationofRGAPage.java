package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.MyTemplatesPage;
import pageObjects.OrderHistoryPage;
import pageObjects.OrderManagementPage;
import pageObjects.ProfilePage;
import pageObjects.RGAPage;
import pageObjects.SaveCartPage;
import pageObjects.WarrantyClaimPage;

public class ATC045ValidationofRGAPage extends BaseClass {
	RGAPage rgaPage = PageFactory.initElements(driver, RGAPage.class);

	@Given("^User navigate to RGA page$")
	public void user_navigate_to_RGA_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"rga");	    
	}

	@Then("^User verifies Web elements in RGA form page$")
	public void user_verifies_Web_elements_in_RGA_page() throws Throwable {
	    /*isElementDisplayed(rgaPage.RGAPageTitle, true);
	    isElementDisplayed(rgaPage.RGAPageSoldTOTitle, true);
	    isElementDisplayed(rgaPage.RGAPageSoldTOAddress, true);
	    isElementDisplayed(rgaPage.RGAPageShipTOTitle, true);
	    isElementDisplayed(rgaPage.RequestedByLabel, true);
	    isElementDisplayed(rgaPage.RequestedByVal, true);
	    isElementDisplayed(rgaPage.PrimaryPhnLabel, true);
	    isElementDisplayed(rgaPage.PrimaryPhnVal, true);
	    isElementDisplayed(rgaPage.EmailAddLabel, true);
	    isElementDisplayed(rgaPage.EmailAddVal, true);
	    ScrollToElement(rgaPage.PrimaryPhnLabel);
	    isElementDisplayed(rgaPage.PONumberLabel, true);
	    isElementDisplayed(rgaPage.PONumberTB, true);
	    isElementDisplayed(rgaPage.OrderNumberTB, true);
	    isElementDisplayed(rgaPage.OrderNumberVal, true);
	    isElementDisplayed(rgaPage.NotesTB, true);
	    isElementDisplayed(rgaPage.NotesLabel, true);
	    isElementDisplayed(rgaPage.RGAItemToReturnTitle, true);
	    isElementDisplayed(rgaPage.MaterialLabel, true);
	    isElementDisplayed(rgaPage.MaterialVal, true);
	    isElementDisplayed(rgaPage.QtyLabel, true);
	    isElementDisplayed(rgaPage.QtyTB, true);
	    isElementDisplayed(rgaPage.SerailNumLabel, true);
	    isElementDisplayed(rgaPage.SerialNumTB, true);
	    isElementDisplayed(rgaPage.ReturnReasonSympLabel, true);
	    isElementDisplayed(rgaPage.ReturnReasonSympTB, true);
	    isElementDisplayed(rgaPage.ReturnReasonSympCharacterLimit, true);
	    jsClick(rgaPage.ReturnReasonDD);
	    isElementEnabled(rgaPage.ReturnReasonDD1, true);
	    isElementEnabled(rgaPage.ReturnReasonDD2, true);
	    isElementEnabled(rgaPage.ReturnReasonDD3, true);
	    isElementEnabled(rgaPage.ReturnReasonDD4, true);
	    isElementEnabled(rgaPage.ReturnReasonDD5, true);
	    ScrollToElement(rgaPage.RGAItemSaveButton);
	    isElementDisplayed(rgaPage.RGAItemSaveButton, true);
	    isElementDisplayed(rgaPage.RGASubmit, true);
	    isElementDisplayed(rgaPage.ReturnReasonLabel, true);*/
	    
	}

	@Then("^User verifies Add address form elements in RGA Page$")
	public void user_verifies_Add_address_form_elements_in_RGA_Page() throws Throwable {
	    /*ScrollToElement(rgaPage.RGAPageTitle);
	    jsClick(rgaPage.AddAddressButton);
	    isElementDisplayed(rgaPage.SelectShiptoAddress, true);
	    isElementDisplayed(rgaPage.MyAccountLink, true);
	    isElementDisplayed(rgaPage.GoToMyaccountText, true);
	    isElementDisplayed(rgaPage.ShipToAddressSelect, true);
	    isElementDisplayed(rgaPage.SelectDropshipAddressTitle, true);
	    isElementDisplayed(rgaPage.AddDropShipLink, true);
	    isElementDisplayed(rgaPage.RGAShipToSaveButton, true);
	    jsClick(rgaPage.AddDropShipLink);
	    isElementDisplayed(rgaPage.DropShipAddressHeaderLabel, true);
	    isElementDisplayed(rgaPage.DropShipAddressFirstNameLabel, true);
	    isElementDisplayed(rgaPage.DropShipAddressFirstName, true);
	    isElementDisplayed(rgaPage.DropShipAddressLastName, true);
	    isElementDisplayed(rgaPage.DropShipAddressLastNameLabel, true);
	    isElementDisplayed(rgaPage.DropShipAddressLine1, true);
	    isElementDisplayed(rgaPage.DropShipAddressLine2, true);
	    isElementDisplayed(rgaPage.DropShipAddressCityName, true);
	    ScrollToElement(rgaPage.DropShipAddressPostalCode);
	    isElementDisplayed(rgaPage.DropShipAddressPostalCode, true);
	    isElementDisplayed(rgaPage.DropShipAddressSaveButton, true);
	    isElementDisplayed(rgaPage.DropShipAddressCancelButton, true);*/
	}

	@Given("^User adds address in RGA page$")
	public void user_adds_address_in_RGA_page() throws Throwable {
		ScrollToElement(rgaPage.RGAPageTitle);
	    jsClick(rgaPage.AddAddressButton);
	    jsClick(rgaPage.ShipToAddressSelect);
	    jsClick(rgaPage.RGAShipToSaveButton);
	    Thread.sleep(3000);
	}

	@Then("^User fills all mandatory fields in RGA form$")
	public void user_fills_all_mandatory_fields_in_RGA_form() throws Throwable {
		ScrollToElement(rgaPage.EmailAddLabel);
		sendKeys(rgaPage.PONumberTB, "123456");
	    sendKeys(rgaPage.OrderNumberTB, "123456");
	    sendKeys(rgaPage.NotesTB, "Returning an RGA using Automation Test");
	    sendKeys(rgaPage.MaterialVal, "123456");
	    jsClick(rgaPage.ReturnReasonDD);
	    jsClick(rgaPage.ReturnReasonDD3);
	    sendKeys(rgaPage.QtyTB, "12");
	    sendKeys(rgaPage.SerialNumTB, "123456");
	    sendKeys(rgaPage.ReturnReasonSympTB, "Returning an RGA using Automation Test scenario");	    
	}

	@Then("^User clicks on save item button$")
	public void user_clicks_on_save_item_button() throws Throwable {
	    ScrollToElement(rgaPage.RGAItemSaveButton);
	    jsClick(rgaPage.RGAItemSaveButton);
	    isElementDisplayed(rgaPage.AddAnotherRGA, true);
	    isElementDisplayed(rgaPage.RGAItemToggleButton, true);
	    jsClick(rgaPage.RGAItemToggleButton);
	    isElementDisplayed(rgaPage.RGAEditToggleButton, true);
	    isElementDisplayed(rgaPage.RGADeleteToggleButton, true);
	}

	@Then("^User clicks on Submit return items and verifies success message$")
	public void user_clicks_on_Submit_return_items_and_verifies_success_message() throws Throwable {
	    jsClick(rgaPage.RGASubmit);
	    isElementDisplayed(rgaPage.ToastMsgRGA, true);
	    isElementDisplayed(rgaPage.RGANextSteps, true);
	    isElementDisplayed(rgaPage.RGASupportMail, true);
	}

	@Then("^verifies RGA email receipt and navigate to mail body$")
	public void verifies_RGA_email_receipt_and_navigate_to_mail_body() throws Throwable {
		isElementDisplayed("(//td[contains(text(),'LiftMaster RGA Confirmation')])[1]", true);
	    click("(//td[contains(text(),'LiftMaster RGA Confirmation')])[1]");	    
	}

	@Then("^verifies web elements in email confirmation body for RGA confirmation email$")
	public void verifies_web_elements_in_email_confirmation_body_for_RGA_confirmation_email() throws Throwable {
		driver.switchTo().frame("html_msg_body");
		Thread.sleep(3000);
		isElementDisplayed("//span[contains(text(),'LiftMaster Returned Goods Authorization')]", true);
		isElementDisplayed("//span[contains(.,'Thank you for your return request. It is currently being processed. You should expect to see your RGA acknowledgement within 24 hours. Please save this email copy for your records.')]", true);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[contains(text(),'Sold-To Information')]")));
		} catch (Exception e) {
			driver.navigate().to(configFileReader.getApplicationUrl());
		} 
		isElementDisplayed("//span[contains(text(),'Sold-To Information')]", true);
		isElementDisplayed("//span[contains(text(),'Ship-To Information')]", true);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[contains(text(),'Return Goods Request Information')]")));
		} catch (Exception e) {
			e.printStackTrace();
			driver.navigate().to(configFileReader.getApplicationUrl());
		} 
		isElementDisplayed("//strong[contains(text(),'Requested By')]", true);
		isElementDisplayed("//strong[contains(text(),'Original Order Number')]", true);
		isElementDisplayed("//strong[contains(text(),'Original Order Number')]//parent::span//following-sibling::span", true);
		isElementDisplayed("//strong[contains(text(),'Notes/Special Instructions')]", true);
		isElementDisplayed("//strong[contains(text(),'Notes/Special Instructions')]//parent::span//following-sibling::span", true);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("(//strong[contains(text(),'Material/Part#:')])[1]")));
		} catch (Exception e) {
			e.printStackTrace();
			driver.navigate().to(configFileReader.getApplicationUrl());
		}
		isElementDisplayed("(//strong[contains(text(),'Quantity')])[1]", true);
		isElementDisplayed("(//strong[contains(text(),'Return Reason Code')])[1]", true);
		isElementDisplayed("(//strong[contains(text(),'Return Reason Symptom')])[1]", true);
		isElementDisplayed("(//strong[contains(text(),'Serial#')])[1]", true);
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

	@Given("^User clicks on save item button and click on add another RGA button$")
	public void user_clicks_on_save_item_button_and_click_on_add_another_RGA_button() throws Throwable {
		ScrollToElement(rgaPage.RGAItemSaveButton);
	    jsClick(rgaPage.RGAItemSaveButton);
	    jsClick(rgaPage.AddAnotherRGA);
	}

	@Given("^user fills RGA for another item to return$")
	public void user_fills_RGA_for_another_item_to_return() throws Throwable {
		sendKeys(rgaPage.MaterialVal, "1234567");
	    jsClick(rgaPage.ReturnReasonDD);
	    jsClick(rgaPage.ReturnReasonDD2);
	    sendKeys(rgaPage.QtyTB, "5");
	    sendKeys(rgaPage.SerialNumTB, "123456");
	    sendKeys(rgaPage.ReturnReasonSympTB, "Returning an RGA using Automation Test scenario 1");
	    ScrollToElement(rgaPage.RGAItemSaveButton);
	    jsClick(rgaPage.RGAItemSaveButton);
	    jsClick(rgaPage.AddAnotherRGA);
	    sendKeys(rgaPage.MaterialVal, "12345678");
	    jsClick(rgaPage.ReturnReasonDD);
	    jsClick(rgaPage.ReturnReasonDD5);
	    sendKeys(rgaPage.QtyTB, "50");
	    sendKeys(rgaPage.SerialNumTB, "1234567");
	    sendKeys(rgaPage.ReturnReasonSympTB, "Returning an RGA using Automation Test scenario 2");
	    ScrollToElement(rgaPage.RGAItemSaveButton);
	    jsClick(rgaPage.RGAItemSaveButton);
	}
}
