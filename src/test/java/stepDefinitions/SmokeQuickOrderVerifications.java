package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.QuickOrderPage;


public class SmokeQuickOrderVerifications extends BaseClass {
	QuickOrderPage quickOrderPage = PageFactory.initElements(driver, QuickOrderPage.class);
	@Then("^User clicks on Quick order icon$")
	public void user_clicks_on_Quick_order_icon() throws Throwable {
	    jsClick(quickOrderPage.QuickOrderPopUP);
	}

	@Then("^User Verifies quick order widget title$")
	public void user_Verifies_quick_order_widget_title() throws Throwable {
	    isElementDisplayed(quickOrderPage.QuickOrderWidgetTitle, true);
	}

	@Then("^User Verifies quick order close icon$")
	public void user_Verifies_quick_order_close_icon() throws Throwable {
		isElementDisplayed(quickOrderPage.QuickOrdercloseicon, true);
	}

	@Then("^User Verifies quick order text box$")
	public void user_Verifies_quick_order_text_box() throws Throwable {
		isElementDisplayed(quickOrderPage.QuickOrderTextBox, true);
		isElementDisplayed(quickOrderPage.QuickOrderTextBoxTitle, true);
	}

	@Then("^User Verifies quick order quantity box$")
	public void user_Verifies_quick_order_quantity_box() throws Throwable {
		isElementDisplayed(quickOrderPage.QuickOrderQTYBox, true);
		isElementDisplayed(quickOrderPage.QuickOrderQTYBoxTitle, true);
	}

	@Then("^User Verifies quick order Add to Cart CTA is disabled before entering text$")
	public void user_Verifies_quick_order_Add_to_Cart_CTA_is_disabled_before_entering_text() throws Throwable {
	    isElementEnabled(quickOrderPage.QuickOrderAddToCart, false);
	}

	@Then("^User clicks on quick order close icon$")
	public void user_clicks_on_quick_order_close_icon() throws Throwable {
	    click(quickOrderPage.QuickOrdercloseicon);
	}

	@Then("^Enter single sku product in quick order text box$")
	public void enter_single_sku_product_in_quick_order_text_box() throws Throwable {
		sendKeys(quickOrderPage.QuickOrderTextBox, "041A3589-3");
	}

	@Then("^Click on add to cart$")
	public void click_on_add_to_cart() throws Throwable {
	    jsClick(quickOrderPage.QuickOrderAddToCart);
	}

	@Then("^user verifies success message$")
	public void user_verifies_success_message() throws Throwable {
	    isElementDisplayed(quickOrderPage.QuickOrderSuccessMessage, true);
	}

	@Then("^Add quantity greater than (\\d+)$")
	public void add_quantity_greater_than(int arg1) throws Throwable {
	    sendKeys(quickOrderPage.QuickOrderQTYBox, "10");
	}

	@Then("^Enter non sellable product in quick order text box$")
	public void enter_non_sellable_product_in_quick_order_text_box() throws Throwable {
	    sendKeys(quickOrderPage.QuickOrderTextBox, "123");
	}

	@Then("^User verifies error message$")
	public void user_verifies_error_message() throws Throwable {
	    isElementDisplayed(quickOrderPage.QuickOrderErrorMessage, true);
	}

	@Then("^Enter special characters in quick order text box$")
	public void enter_special_characters_in_quick_order_text_box() throws Throwable {
	    sendKeys(quickOrderPage.QuickOrderTextBox, "$1@");
	}

	@Then("^User verifies invalid special characters message$")
	public void user_verifies_invalid_special_characters_message() throws Throwable {
	    isElementDisplayed(quickOrderPage.QuickOrderErrorMessageSpecialCharacters, true);
	}
}
