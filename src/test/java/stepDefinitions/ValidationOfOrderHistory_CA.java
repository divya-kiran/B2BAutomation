package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.OrderHistoryDetailsPage;
import pageObjects.OrderHistoryPage;


public class ValidationOfOrderHistory_CA extends BaseClass {
	OrderHistoryPage orderHistoryPage = PageFactory.initElements(driver, OrderHistoryPage.class);
	OrderHistoryDetailsPage orderHistoryDetailPage = PageFactory.initElements(driver, OrderHistoryDetailsPage.class);

	@Given("^User navigates to first order in the order history page$")
	public void user_navigates_to_first_order_in_the_order_history_page() throws Throwable {
	    click(orderHistoryPage.OrderHistoryFirstOrder);

	}

	@Then("^User verifies header elements$")
	public void user_verifies_header_elements() throws Throwable {
		isElementDisplayed(orderHistoryDetailPage.OrderDetailPageTitle, true);
		isElementDisplayed(orderHistoryDetailPage.OrderHistoryLink, true);
		isElementDisplayed(orderHistoryDetailPage.OrderedDateText, true);
		isElementDisplayed(orderHistoryDetailPage.OrderStatus, true);
		isElementDisplayed(orderHistoryDetailPage.ReorderLink, true);
	}

	@Then("^Verifies delivery address$")
	public void verifies_delivery_address() throws Throwable {
		isElementDisplayed(orderHistoryDetailPage.DeliveryAddressTitle, true);
	}

	@Then("^Verifies product cards$")
	public void verifies_product_cards() throws Throwable {
		isElementDisplayed(orderHistoryDetailPage.OrderDetailCardTitle, true);
		isElementDisplayed(orderHistoryDetailPage.OrderDetailCardProductIndex, true);
		isElementDisplayed(orderHistoryDetailPage.OrderDetailsCardProductNameLink, true);
		isElementDisplayed(orderHistoryDetailPage.OrderDetailsProductSummary, true);
		isElementDisplayed(orderHistoryDetailPage.QTYRequestedAttribute, true);
		isElementDisplayed(orderHistoryDetailPage.QTYRequestedAttributeVal, true);
		isElementDisplayed(orderHistoryDetailPage.QTYShippedAttribute, true);
		isElementDisplayed(orderHistoryDetailPage.QTYShippedAttributeVal, true);
		isElementDisplayed(orderHistoryDetailPage.EachProdPriceAttribute, true);
		isElementDisplayed(orderHistoryDetailPage.EachProdPriceAttributeVal, true);
		isElementDisplayed(orderHistoryDetailPage.TotProdPriceAttribute, true);
		isElementDisplayed(orderHistoryDetailPage.TotProdPriceAttributeVal, true);
		isElementDisplayed(orderHistoryDetailPage.ReturnItemsLink, true);
	}

	@Then("^verify web elemetns in order history detail page$")
	public void verify_web_elemetns_in_order_history_detail_page() throws Throwable {
		isElementDisplayed(orderHistoryDetailPage.OrderDetailPageItems, true);
		isElementDisplayed(orderHistoryDetailPage.InvoiceTitle, true);
		isElementDisplayed(orderHistoryDetailPage.DeliveryMethodsVal, true);
	}

	@Then("^Verify return items link in order history page$")
	public void verify_return_items_link_in_order_history_page() throws Throwable {
		isElementDisplayed(orderHistoryDetailPage.ReturnItemsLink, true);
		jsClick(orderHistoryDetailPage.ReturnItemsLink);
		verifypageURL("rga?orderNumber=");
	}
}
