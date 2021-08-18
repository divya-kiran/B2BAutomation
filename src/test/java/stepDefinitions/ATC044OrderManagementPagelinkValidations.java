package stepDefinitions;

import org.openqa.selenium.By;
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

public class ATC044OrderManagementPagelinkValidations extends BaseClass {
	
	OrderManagementPage orderManagementPage = PageFactory.initElements(driver, OrderManagementPage.class);
	OrderHistoryPage orderHistoryPage = PageFactory.initElements(driver, OrderHistoryPage.class);
	RGAPage rgaPage = PageFactory.initElements(driver, RGAPage.class);
	SaveCartPage saveCartPage = PageFactory.initElements(driver, SaveCartPage.class);
	WarrantyClaimPage warrantyClaimPage = PageFactory.initElements(driver, WarrantyClaimPage.class);
	MyTemplatesPage myTemplatesPage = PageFactory.initElements(driver, MyTemplatesPage.class);
	
	@Given("^User navigate to Order Management page$")
	public void user_navigate_to_Order_Management_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"order-management");
	}

	@Then("^User verifies Web elements in order management page$")
	public void user_verifies_Web_elements_in_order_management_page() throws Throwable {
		isElementDisplayed(orderManagementPage.OrderManagementTitle, true);
		isElementDisplayed(orderManagementPage.OrderManagementOrderHistoryLink, true);
		isElementDisplayed(orderManagementPage.OrderHistoryCustomerDesc, true);
		isElementDisplayed(orderManagementPage.ReturnHistoryCustCareDesc, true);
		isElementDisplayed(orderManagementPage.ReturnItemsLink, true);
		isElementDisplayed(orderManagementPage.ReturnHistoryLink, true);
		ScrollToElement(orderManagementPage.ReturnItemsLink);
		isElementDisplayed(orderManagementPage.WarrantyClaimsHeaderText, true);
		isElementDisplayed(orderManagementPage.WarrantyClaimLink, true);
		isElementDisplayed(orderManagementPage.SavedCartLink, true);
		isElementDisplayed(orderManagementPage.SavedCartDesc, true);
		isElementDisplayed(orderManagementPage.MyTemplatesLink, true);
		isElementDisplayed(orderManagementPage.MyTemplatesDesc, true);		
	}

	@Then("^User verifies Order history link and naviagation$")
	public void user_verifies_Order_history_link_and_naviagation() throws Throwable {
	    jsClick(orderManagementPage.OrderManagementOrderHistoryLink);
	    verifypageURL("/my-account/orders");
	    isElementDisplayed(orderHistoryPage.OrderHistoryTitle, true);
	}

	@Then("^User verifies Return history and return items link and navigations$")
	public void user_verifies_Return_history_and_return_items_link_and_navigations() throws Throwable {
		jsClick(orderManagementPage.ReturnHistoryLink);
	    verifypageURL("return-orders/history");
	    isElementDisplayed(rgaPage.RGAHistoryTitle, true);
	    driver.navigate().to(configFileReader.getApplicationUrl()+"order-management");
	    click(orderManagementPage.OrderManagementRGASubmissionPageLink);
	    isElementDisplayed(rgaPage.RGAPageTitle, true);
	    isElementDisplayed(rgaPage.RGAPageShipTOTitle, true);
	    isElementDisplayed(rgaPage.RGAPageSoldTOTitle, true);
	}

	@Then("^user verifies Submit claim link and navigation$")
	public void user_verifies_Submit_claim_link_and_navigation() throws Throwable {
		click(orderManagementPage.OrderManagementSubmitClaimLink);	
		Thread.sleep(3000);
		scrollBottom();
	    jsClick(warrantyClaimPage.WarrantyClaimCheckMark);
	    Thread.sleep(3000);
	    jsClick(warrantyClaimPage.WarrantyClaimCheckNextButton);
	    isElementDisplayed(warrantyClaimPage.WarrantyClaimTitle, true);
	    verifypageURL("/warranty-claim");
	}

	@Then("^User verifies saved cart link and navigation$")
	public void user_verifies_saved_cart_link_and_navigation() throws Throwable {
		ScrollToElement(orderManagementPage.ReturnHistoryLink);
		click(orderManagementPage.OrderManagementSavedCartLink);	
		isElementDisplayed(saveCartPage.SavedCartPageTitle, true);
	    //isElementDisplayed(saveCartPage.SavedCartFirstCard, true);
	    verifypageURL("/my-account/saved-carts");
	}

	@Then("^User verifies My templates link and navigation$")
	public void user_verifies_My_templates_link_and_navigation() throws Throwable {
		ScrollToElement(orderManagementPage.ReturnHistoryLink);
		click(orderManagementPage.MyTemplatesLink);
		isElementDisplayed(myTemplatesPage.PageTitle, true);
	}
}
