package stepDefinitions;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.HomePage;

public class ATC080ValidationOfPartsTabLinks extends BaseClass {
	HomePage homePage = PageFactory.initElements(driver, HomePage.class);

	@Then("^Hover on parts tab and verify GDO parts header link$")
	public void hover_on_parts_tab_and_verify_GDO_parts_header_link() throws Throwable {
		elementHover(homePage.PartsTab);
		Thread.sleep(1000);
	    jsClick(homePage.GDOPartsLink);  
	}

	@Then("^Verify GDO parts page by title and URL$")
	public void verify_GDO_parts_page_by_title_and_URL() throws Throwable {
		verifypageURL("Products/Parts/Garage-Door-Opener-Parts/c/6");
		verifypagetitle("Garage Door Opener Parts");
	}

	@Then("^Hover on parts tab and verify CDO parts header link$")
	public void hover_on_parts_tab_and_verify_CDO_parts_header_link() throws Throwable {
		elementHover(homePage.PartsTab);
		Thread.sleep(1000);
	    jsClick(homePage.CDOPartsLink);     
	}

	@Then("^Verify CDO parts page by title and URL$")
	public void verify_CDO_parts_page_by_title_and_URL() throws Throwable {
		verifypageURL("Products/Parts/Commercial-Door-Operator-Parts/c/8");
		verifypagetitle("Commercial Door Operator Parts");    
	}

	@Then("^Hover on parts tab and verify Gate operators parts header link$")
	public void hover_on_parts_tab_and_verify_Gate_operators_parts_header_link() throws Throwable {
		elementHover(homePage.PartsTab);
		Thread.sleep(1000);
	    jsClick(homePage.GateOperatorPartsLink);     
	}

	@Then("^Verify gate operators parts page by title and URL$")
	public void verify_gate_operators_parts_page_by_title_and_URL() throws Throwable {
		verifypageURL("Products/Parts/Gate-Operator-Parts/c/9");
		verifypagetitle("Gate Operator Parts");    
	}

	@Then("^Hover on parts tab and verify Access control parts header link$")
	public void hover_on_parts_tab_and_verify_Access_control_parts_header_link() throws Throwable {
		elementHover(homePage.PartsTab);
		Thread.sleep(1000);
	    jsClick(homePage.AccessControlPartsLink);     
	}

	@Then("^Verify Access control parts page by title and URL$")
	public void verify_Access_control_parts_page_by_title_and_URL() throws Throwable {
		verifypageURL("Products/Parts/Telephone-Entry-and-Access-Control-Parts/c/10");
		verifypagetitle("Telephone Entry and Access Control Parts");    
	}

	@Then("^Hover on parts tab and verify All Parts header link$")
	public void hover_on_parts_tab_and_verify_All_Parts_header_link() throws Throwable {
		elementHover(homePage.PartsTab);
		Thread.sleep(1000);
	    jsClick(homePage.AllPartsLink);     
	}

	@Then("^Verify All Parts page by title and URL$")
	public void verify_All_Parts_page_by_title_and_URL() throws Throwable {
		verifypageURL("Products/Parts/c/12");
		verifypagetitle("Parts"); 	    
	}

	@Then("^Hover on parts tab and verify Parts Prices List header link$")
	public void hover_on_parts_tab_and_verify_Parts_Prices_List_header_link() throws Throwable {
		elementHover(homePage.PartsTab);
		Thread.sleep(1000);
	    jsClick(homePage.PartsPriceListLink);     
	}

	@Then("^Verify Parts Prices List page by title and URL$")
	public void verify_Parts_Prices_List_page_by_title_and_URL() throws Throwable {
		verifypageURL("parts-price-lists");
		//verifypagetitle("");	    
	}
}