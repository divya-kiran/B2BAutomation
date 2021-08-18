package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.OrderHistoryPage;
import pageObjects.PDPPage;


public class ValidationOfOrderHistory_US extends BaseClass {
	PDPPage pdpPage = PageFactory.initElements(driver, PDPPage.class);
	CheckoutPage checkout = PageFactory.initElements(driver, CheckoutPage.class);
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);
	OrderHistoryPage orderHistoryPage = PageFactory.initElements(driver, OrderHistoryPage.class);
	LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	
	@Given("^User clicks on Order Status link in Homepage$")
	public void user_clicks_on_Order_Status_link_in_Homepage() throws Throwable {
	  jsClick(homePage.OrderstatuslinkNew); 
	}
	@Then("^Verfies order history heading$")
	public void verfies_order_history_heading() throws Throwable {
	    isElementDisplayed(orderHistoryPage.OrderHistoryTitle, true);	   
	}

	@Then("^verifies PO number search box$")
	public void verifies_PO_number_search_box() throws Throwable {
		isElementDisplayed(orderHistoryPage.OrderHistoryPONumberTB, true);
	}

	@Then("^Verifies order total count$")
	public void verifies_order_total_count() throws Throwable {
		isElementDisplayed(orderHistoryPage.OrderHistoryTotOrders, true);	   
	}

	@Then("^verifies sorting toggle button$")
	public void verifies_sorting_toggle_button() throws Throwable {
		isElementDisplayed(orderHistoryPage.OrderHistoryToggleButtonNewest, true);	   
	}

	@Then("^verifies show more link in order history page$")
	public void verifies_show_more_link_in_order_history_page() throws Throwable {
		isElementDisplayed(orderHistoryPage.ShowMoreLink, true);	   
	}

	@Then("^Verify Order card elements$")
	public void verify_Order_card_elements() throws Throwable {
		isElementDisplayed(orderHistoryPage.OrderCardOrderNumber, true);	
		isElementDisplayed(orderHistoryPage.OrderCardOrderNumberVal, true);	
		isElementDisplayed(orderHistoryPage.OrderCardPONumber, true);	
		isElementDisplayed(orderHistoryPage.OrderCardOrderDate, true);	
		isElementDisplayed(orderHistoryPage.OrderCardOrderDateVal, true);	
		isElementDisplayed(orderHistoryPage.OrderCardOrderStatusCard, true);	
		isElementDisplayed(orderHistoryPage.OrderHistoryGoButton, true);	
	}

	@Then("^User click on Filter option in order history page$")
	public void user_click_on_Filter_option_in_order_history_page() throws Throwable {
		click(orderHistoryPage.FilterToggleButton);
	}

	@Then("^Verifies filter by status menu$")
	public void verifies_filter_by_status_menu() throws Throwable {
		isElementDisplayed(orderHistoryPage.FilterByStatusToggleButton, true);
		isElementDisplayed(orderHistoryPage.FilterByCreatedCheckBox, true);	  
	    isElementDisplayed(orderHistoryPage.FilterByCreatedStatus, true);
	    isElementDisplayed(orderHistoryPage.FilterByBeingProcessedCheckBox, true);
	    isElementDisplayed(orderHistoryPage.FilterByBeingProcessedStatus, true);
	    isElementDisplayed(orderHistoryPage.FilterByShippedCheckBox, true);
	    isElementDisplayed(orderHistoryPage.FilterByShippedStatus, true);
	    isElementDisplayed(orderHistoryPage.FilterByCompletedCheckBox, true);
	    isElementDisplayed(orderHistoryPage.FilterByCompletedStatus, true);
	}

	@Then("^Verifies filter by orders within Menu$")
	public void verified_filter_by_orders_within_Menu() throws Throwable {
		isElementDisplayed(orderHistoryPage.FilterByOrderToggleButton, true);
		isElementDisplayed(orderHistoryPage.FilterByOrders1to30daysCheckBox, true);
		isElementDisplayed(orderHistoryPage.FilterByOrders1to30days, true);
		isElementDisplayed(orderHistoryPage.FilterByOrders30to60daysCheckBox, true);
		isElementDisplayed(orderHistoryPage.FilterByOrders30to60days, true);
		isElementDisplayed(orderHistoryPage.FilterByOrders60to90daysCheckBox, true);
		isElementDisplayed(orderHistoryPage.FilterByOrders60to90days, true);
		isElementDisplayed(orderHistoryPage.FilterByOrders90to120daysCheckBox, true);
		isElementDisplayed(orderHistoryPage.FilterByOrders90to120days, true);
	}

	@Given("^User will log in as user having ship to accounts$")
	public void user_will_log_in_as_user_having_ship_to_accounts() throws Throwable {
		boolean flag = isElementNotDisplayed("//img[contains(@alt,'My Account')]", true);
		if(!flag){
			driver.navigate().to(configFileReader.getApplicationUrl()+"logout");
		}
	   sendKeys(loginpage.userName, "automationusershipto@mailinator.com");
	   sendKeys(loginpage.password, "Test@123");
	   click(loginpage.PartnerAccountSignInHeader);
	   jsClick(loginpage.signinButton);	   
	}

	@Then("^User clicks on shipto filter option$")
	public void user_clicks_on_shipto_filter_option() throws Throwable {
	    click(orderHistoryPage.OrderHistoryShipToDD);	   
	}

	@Then("^Verifies shipto accounts menu$")
	public void verifies_shipto_accounts_menu() throws Throwable {
		//isElementDisplayed(orderHistoryPage., true);
	}
	
	@Then("^Verifies filter GO button operations$")
	public void verifies_filter_GO_button_operations() throws Throwable {
	    String ordercount = getText(orderHistoryPage.FilterByCreatedStatusVal);
	    ordercount = ordercount.substring(1, ordercount.length()-1);
	    click(orderHistoryPage.FilterByCreatedCheckBox);
	    Thread.sleep(2000);
	    click(orderHistoryPage.OrderHistoryGoButton);
	    int ordercountint = Integer.valueOf(ordercount);
	    String ordercounttot = getText(orderHistoryPage.OrderHistoryTotOrders);
	    int ordercounttotint = Integer.valueOf(ordercounttot);
	    if(ordercountint!=ordercounttotint){
	    	throw new Exception("Resultant Product count total do not match with the actual total count");
	    }
	}

	@Then("^Verifies ShipTo GO button operations$")
	public void verifies_ShipTo_GO_button_operations() throws Throwable {
	    
	}


}
