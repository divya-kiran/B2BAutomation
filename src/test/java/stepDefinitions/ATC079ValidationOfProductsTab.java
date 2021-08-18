package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.HomePage;

public class ATC079ValidationOfProductsTab extends BaseClass {
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);

	@Then("^Hover on product tab and verify GDO header link$")
	public void hover_on_product_tab_and_verify_GDO_header_link() throws Throwable {
	    elementHover(homePage.ProductTab);
	    jsClick(homePage.GDOLink);
	}

	@Then("^Verify GDO page by title and URL$")
	public void verify_GDO_page_by_title_and_URL() throws Throwable {	    
		verifypageURL("Products/Garage-Door-Opener-Systems/c/15-11");
		verifypagetitle("Garage Door Opener Systems");
	}

	@Then("^Hover on product tab and verify CDO header link$")
	public void hover_on_product_tab_and_verify_CDO_header_link() throws Throwable {
		elementHover(homePage.ProductTab);
	    jsClick(homePage.CDOLink);
	}

	@Then("^Verify CDO page by title and URL$")
	public void verify_CDO_page_by_title_and_URL() throws Throwable {
		verifypageURL("Products/Commercial-Door-Operator-Systems/c/20-11");
		verifypagetitle("Commercial Door Operator Systems");  
	}

	@Then("^Hover on product tab and verify Gate operators header link$")
	public void hover_on_product_tab_and_verify_Gate_operators_header_link() throws Throwable {
		elementHover(homePage.ProductTab);
		Thread.sleep(2000);
	    jsClick(homePage.GateOperatorsLink);    
	}

	@Then("^Verify gate operators page by title and URL$")
	public void verify_gate_operators_page_by_title_and_URL() throws Throwable {
		verifypageURL("Products/Gates-Operator-Systems-and-Accessories/c/gates");
		verifypagetitle("Gates Operator Systems and Accessories");
	}

	@Then("^Hover on product tab and verify Access control systems header link$")
	public void hover_on_product_tab_and_verify_Access_control_systems_header_link() throws Throwable {
		elementHover(homePage.ProductTab);
		Thread.sleep(2000);
	    jsClick(homePage.AccessControlSystemsLink);    
	}

	@Then("^Verify Access control systems page by title and URL$")
	public void verify_Access_control_systems_page_by_title_and_URL() throws Throwable {
		verifypageURL("Products/Access-Control-Systems/c/access");
		verifypagetitle("Access Control Systems"); 
	}

	@Then("^Hover on product tab and verify All Accessories header link$")
	public void hover_on_product_tab_and_verify_All_Accessories_header_link() throws Throwable {
		elementHover(homePage.ProductTab);
		Thread.sleep(2000);
	    jsClick(homePage.AllAccessoriesLink);	    
	}

	@Then("^Verify All Accessories page by title and URL$")
	public void verify_All_Accessories_page_by_title_and_URL() throws Throwable {
		verifypageURL("Products/Accessories/c/accessories");
		verifypagetitle("Accessories"); 
	}

	@Then("^Hover on product tab and verify My Most Ordered Products header link$")
	public void hover_on_product_tab_and_verify_My_Most_Ordered_Products_header_link() throws Throwable {
		elementHover(homePage.ProductTab);
		Thread.sleep(2000);
	    jsClick(homePage.MostOrderedProductsLink);    
	}

	@Then("^Verify My Most Ordered Products page by title and URL$")
	public void verify_My_Most_Ordered_Products_page_by_title_and_URL() throws Throwable {
		verifypageURL("favorite-products");
		//verifypagetitle("");  
	}

	@Then("^Hover on product tab and verify Products Prices List header link$")
	public void hover_on_product_tab_and_verify_Products_Prices_List_header_link() throws Throwable {
		elementHover(homePage.ProductTab);
		Thread.sleep(2000);
	    jsClick(homePage.ProductsAndAccessoriesPriceLink);   
	}

	@Then("^Verify Products Prices List page by title and URL$")
	public void verify_Products_Prices_List_page_by_title_and_URL() throws Throwable {
		verifypageURL("/new-price-lists");
		//verifypagetitle("");
	}
}