package stepDefinitions;

import java.util.Random;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CartPage;
import pageObjects.HomePage;
import pageObjects.PDPPage;
import pageObjects.SaveCartPage;

public class ATC072SavedCartValidation extends BaseClass {
	CartPage cartPage= PageFactory.initElements(driver, CartPage.class);
	SaveCartPage savecartPage= PageFactory.initElements(driver, SaveCartPage.class);
	Random rnd = new Random();
	String savedcartname;
	
	@Then("^Save existing cart$")
	public void save_existing_cart() throws Throwable {
	    jsClick(cartPage.CartPageSavecartIcon);
	    isElementDisplayed(cartPage.SaveCartSaveTitle, true);
	    isElementDisplayed(cartPage.SaveCartPOPUPReqLabel, true);
	    isElementDisplayed(cartPage.SaveCartStaticText, true);
	    isElementDisplayed(cartPage.SaveCartSavedCartsLink, true);
	    int savecart6digitnum = rnd.nextInt(999999);
	    savedcartname  = "SavedCart"+savecart6digitnum;
	    sendKeys(cartPage.SaveCartCartNameTB,savedcartname);
	    sendKeys(cartPage.SaveCartDescTB, "Automation bot saving cart");
	    ScrollToElement(cartPage.SaveCartSubmitButton);
	    jsClick(cartPage.SaveCartSubmitButton);
	    isElementDisplayed(cartPage.SavedCartToastMsg, true);
	    isElementDisplayed(cartPage.SavedCartLinkToastMsg, true);
	    jsClick(cartPage.SavedCartLinkToastMsg);
	}

	@Given("^user is on saved carts pages$")
	public void user_is_on_saved_carts_pages() throws Throwable {
	    verifypageURL("my-account/saved-carts");
	}

	@Then("^Verfies saved cart page web elements$")
	public void verfies_saved_cart_page_web_elements() throws Throwable {
		isElementDisplayed(savecartPage.SavedCartPageTitle, true);
		isElementDisplayed(savecartPage.SortByLabel, true);
		isElementDisplayed(savecartPage.SavedCartsDD, true);
	}

	@Then("^verify sort by Drop down$")
	public void verify_sort_by_Drop_down() throws Throwable {
		jsClick(savecartPage.SavedCartsDD);
		isElementDisplayed(savecartPage.ByDateSaved, true);
		isElementDisplayed(savecartPage.ByNameDDVal, true);
		isElementDisplayed(savecartPage.ByTotalDDVal, true);
		jsClick(savecartPage.ByDateSaved);
		verifypageURL("my-account/saved-carts?sort=byDateSaved");
		driver.navigate().back();
		pageLoadTimeout();	    
	}

	@Then("^Verify first saved cart card details$")
	public void verify_first_saved_cart_card_details() throws Throwable {
	    isElementDisplayed(savecartPage.ModifiedDate1, true);
	    isElementDisplayed(savecartPage.QTY1, true);
	    isElementDisplayed(savecartPage.QTYVal1, true);
	    isElementDisplayed(savecartPage.SavedCartPrice1, true);
	    isElementDisplayed(savecartPage.SavedCartDesc, true);
	}

	@Then("^user clicks on saved cart restore button and validates restore cart pop up$")
	public void user_clicks_on_saved_cart_restore_button_and_validates_restore_cart_pop_up() throws Throwable {
	    jsClick(savecartPage.SavedCartToggleButton1);
	    jsClick(savecartPage.RestoreButton1);
	    Thread.sleep(3000);
	    isElementDisplayed(savecartPage.RestoreCartHeading, true);
	    isElementDisplayed(savecartPage.RestoreCartMsg, true);
	    isElementDisplayed(savecartPage.CheckBoxText, true);
	    isElementDisplayed(savecartPage.RestoreCartCheckBox, true);
	    isElementDisplayed(savecartPage.RestoreCartCancelButton, true);
	    isElementDisplayed(savecartPage.RestoreCartRestoreButton, true);
	    jsClick(savecartPage.RestoreCartCancelButton);
	    Thread.sleep(3000);
	}

	@Then("^user clicks on delete saved cart button$")
	public void user_clicks_on_delete_saved_cart_button() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"my-account/saved-carts");
		pageLoadTimeout();
		jsClick(savecartPage.SavedCartToggleButton1);
		jsClick(savecartPage.DeleteButton1);
		isElementDisplayed("//div[contains(text(),'Cart named')]", true);
	}
}