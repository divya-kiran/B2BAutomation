package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import baseClass.ConfigFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MiniCartFlyerPage;
import pageObjects.OrderConfirmationPage;
import pageObjects.QuickOrderPage;

public class SmokeHeaderMenuVerifications extends BaseClass {
	
	   LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
	   HomePage homepage = PageFactory.initElements(driver, HomePage.class);
	   QuickOrderPage quickorderPage = PageFactory.initElements(driver, QuickOrderPage.class);
	   MiniCartFlyerPage miniCartFlyerPage = PageFactory.initElements(driver, MiniCartFlyerPage.class);
	   CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
	   CheckoutPage checkoutPage = PageFactory.initElements(driver, CheckoutPage.class);
	   OrderConfirmationPage orderConfirmationPage = PageFactory.initElements(driver, OrderConfirmationPage.class);
	   
	   @Then("^User verifies LiftMaster Logo$")
	   public void user_verifies_LiftMaster_Logo() throws Throwable {
	       isElementDisplayed(homepage.LiftMasterLogo, true);
	   }

	   @Then("^User verifies Search TextBox$")
	   public void user_verifies_Search_TextBox() throws Throwable {
	       isElementDisplayed(homepage.HeaderSearchTextBox, true);
	   }

	   @Then("^User verifies My Account Navigation menu$")
	   public void user_verifies_My_Account_Navigation_menu() throws Throwable {
		   isElementDisplayed(homepage.MyAccountLink, true);
	   }

	   @Then("^User verifies Quick order link$")
	   public void user_verifies_Quick_order_link() throws Throwable {
	       isElementDisplayed(quickorderPage.QuickOrderPopUP, true);
	   }

	   @Then("^User verifies order status link$")
	   public void user_verifies_order_status_link() throws Throwable {
	       isElementDisplayed(homepage.Orderstatuslink, true);
	   }

	   @Then("^User verifies Mini Cart icon$")
	   public void user_verifies_Mini_Cart_icon() throws Throwable {
	       isElementDisplayed(miniCartFlyerPage.MiniCartFlyerIcon, true);
	   }

	   @Then("^User verifies Partner Programs navigation menu$")
	   public void user_verifies_Partner_Programs_navigation_menu() throws Throwable {
	       isElementDisplayed(homepage.PartnerProgramsMenu, true);
	   }

	   @Then("^User verifies Products menu$")
	   public void user_verifies_Products_menu() throws Throwable {
	       isElementDisplayed(homepage.ProductsMenu, true);
	       elementHover(homepage.ProductsMenu);
	       Thread.sleep(2000);
	       isElementDisplayed(homepage.HeaderGarageDoorOpenerSystemsLink, true);
	       isElementDisplayed(homepage.HeaderCommercialDoorOperatorSystemsLink, true);
	       isElementDisplayed(homepage.HeaderGateDoorOperatorSystemsLink, true);
	       isElementDisplayed(homepage.HeaderAccessControlSystemsLink, true);
	       isElementDisplayed(homepage.HeaderAllAccessoriesLink, true);
	       isElementDisplayed(homepage.HeaderMostOrderedLink, true);
	   }

	   @Then("^User verifies Parts menu$")
	   public void user_verifies_Parts_menu() throws Throwable {
		   isElementDisplayed(homepage.PartsMenu, true);
		   elementHover(homepage.PartsMenu);
		   Thread.sleep(2000);
		   isElementDisplayed(homepage.PartsGarageDoorOpenerPartsLink, true);
		   isElementDisplayed(homepage.PartsCommercialDoorPartsLink, true);
		   isElementDisplayed(homepage.PartsGateOperatorPartsLink, true);
		   isElementDisplayed(homepage.PartsAccessControlPartsLink, true);
		   isElementDisplayed(homepage.PartsMenuAllPartsLink, true);
	   }

	   @Then("^User verifies myQ connectivity solutions menu$")
	   public void user_verifies_myQ_connectivity_solutions_menu() throws Throwable {
		   isElementDisplayed(homepage.myQconnectivitysolutionsMenu, true);
	   }

	   @Then("^User verifies Resources section menu$")
	   public void user_verifies_Resources_section_menu() throws Throwable {
		   isElementDisplayed(homepage.ResourcesMenu, true);
	   }

}
