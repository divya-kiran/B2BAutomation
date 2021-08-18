package stepDefinitions;



import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.OrderHistoryDetailsPage;
import pageObjects.OrderHistoryPage;
import pageObjects.OrderManagementPage;
import pageObjects.RGAPage;
import pageObjects.SaveCartPage;
import pageObjects.WarrantyClaimPage;


public class SmokeOrderManagementVerifications extends BaseClass {
	String URLOrderManagement = configFileReader.getApplicationUrl();
	OrderManagementPage orderManagementPage = PageFactory.initElements(driver, OrderManagementPage.class);
	SaveCartPage saveCartpage = PageFactory.initElements(driver, SaveCartPage.class);
	OrderHistoryPage orderHistoryPage = PageFactory.initElements(driver, OrderHistoryPage.class);
	OrderHistoryDetailsPage orderHistoryDetailPage = PageFactory.initElements(driver, OrderHistoryDetailsPage.class);
	WarrantyClaimPage warrantyClaimPage = PageFactory.initElements(driver, WarrantyClaimPage.class);
	RGAPage rgaPage =PageFactory.initElements(driver, RGAPage.class);
	
	@Then("^User will navigate to order management page$")
	public void user_will_navigate_to_order_management_page() throws Throwable {
		driver.navigate().to(URLOrderManagement+"order-management");
	}

	@Then("^User verifies elements present in order management page$")
	public void user_verifies_elements_present_in_order_management_page() throws Throwable {
	    isElementDisplayed(orderManagementPage.OrderManagementTitle, true);
	    isElementDisplayed(orderManagementPage.OrderManagementOrderHistoryLink, true);
	    isElementDisplayed(orderManagementPage.OrderManagementRGASubmissionPageLink, true);
	    isElementDisplayed(orderManagementPage.OrderManagementSavedCartLink, true);
	    isElementDisplayed(orderManagementPage.OrderManagementSubmitClaimLink, true);
	}

	@Given("^user navigates to saved cart page$")
	public void user_navigates_to_saved_cart_page() throws Throwable {
	    click(orderManagementPage.OrderManagementSavedCartLink);	    
	}

	@Then("^User verifies elements in saved cart page$")
	public void user_verifies_elements_in_saved_cart_page() throws Throwable {
	     isElementDisplayed(saveCartpage.SavedCartPageTitle, true);
	     isElementDisplayed(saveCartpage.SavedCartFirstCard, true);
	}

	@Given("^user navigates to Order history page$")
	public void user_navigates_to_Order_history_page() throws Throwable {
	    click(orderManagementPage.OrderManagementOrderHistoryLink);	    
	}

	@Then("^User verifies elements in Order history page$")
	public void user_verifies_elements_in_Order_history_page() throws Throwable {
	    isElementDisplayed(orderHistoryPage.OrderHistoryTitle, true);
	    isElementDisplayed(orderHistoryPage.OrderHistoryPONumberTB, true);
	    isElementDisplayed(orderHistoryPage.OrderHistoryShipToDD, true);
	    isElementDisplayed(orderHistoryPage.OrderHistoryFilterOption, true);
	    isElementDisplayed(orderHistoryPage.OrderHistoryGoButton, true);
	    isElementDisplayed(orderHistoryPage.OrderHistoryFirstOrder, true);
	}

	@Then("^User clicks on the first order present in order history page$")
	public void user_clicks_on_the_first_order_present_in_order_history_page() throws Throwable {
		click(orderHistoryPage.OrderHistoryFirstOrder);
	}

	@Then("^User verifies order history detail page elements$")
	public void user_verifies_order_history_detail_page_elements() throws Throwable {
		isElementDisplayed(orderHistoryDetailPage.OrderDetailPageTitle, true);
		isElementDisplayed(orderHistoryDetailPage.OrderDetailPageItems, true);
	}

	@Given("^user navigates to Warranty claim  page$")
	public void user_navigates_to_Warranty_claim_page() throws Throwable {
	    click(orderManagementPage.OrderManagementSubmitClaimLink);	    
	}

	@Given("^user clicks on check box$")
	public void user_clicks_on_check_box() throws Throwable {
		Thread.sleep(3000);
		scrollBottom();
	    jsClick(warrantyClaimPage.WarrantyClaimCheckMark);
	    Thread.sleep(3000);
	    jsClick(warrantyClaimPage.WarrantyClaimCheckNextButton);
	}

	@Then("^User verifies main elements in Warranty claim page$")
	public void user_verifies_main_elements_in_Warranty_claim_page() throws Throwable {
		isElementDisplayed(warrantyClaimPage.WarrantyClaimTitle, true);
		isElementDisplayed(warrantyClaimPage.WarrantyClaimHomeOwner, true);
		isElementDisplayed(warrantyClaimPage.WarrantyClaimServiceCallInfo, true);
	}

	@Given("^user navigates to RGA submission  page$")
	public void user_navigates_to_RGA_submission_page() throws Throwable {
	    click(orderManagementPage.OrderManagementRGASubmissionPageLink);	    
	}

	@Then("^User verifies main elements in RGA submission page$")
	public void user_verifies_main_elements_in_RGA_submission_page() throws Throwable {
	    isElementDisplayed(rgaPage.RGAPageTitle, true);
	    isElementDisplayed(rgaPage.RGAPageShipTOTitle, true);
	    isElementDisplayed(rgaPage.RGAPageSoldTOTitle, true);
	    isElementDisplayed(rgaPage.RGAItemToReturnTitle, true);
	}

}
