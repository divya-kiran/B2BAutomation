package stepDefinitions;

import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import baseClass.ConfigFileReader;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PLPPage;

public class SmokeProductMenuPLPPagesValidation extends BaseClass {
	
	   String appurlPLP = configFileReader.getApplicationUrl();
	   PLPPage pLPPage = PageFactory.initElements(driver, PLPPage.class);
	   
	   @Then("^User navigates to garage door opener systems$")
	   public void user_navigates_to_garage_door_opener_systems() throws Throwable {
	       driver.navigate().to(appurlPLP+"Products/Garage-Door-Opener-Systems/c/15-11");
	   }

	   @Then("^Verify page by URL \"([^\"]*)\"$")
	   public void verify_page_by_URL(String arg1) throws Throwable {
		   Thread.sleep(3000);
		   verifypageURL(arg1);
	   }

	   @Then("^Verify Page by title \"([^\"]*)\"$")
	   public void verify_Page_by_title(String arg1) throws Throwable {
		   Thread.sleep(3000);
	       verifypagetitle(arg1);
	   }

	   @Then("^verify Page by product count$")
	   public void verify_Page_by_product_count() throws Throwable {
		  Thread.sleep(5000);
	      String productcount = getText(pLPPage.PLPproductcount);
	      productcount = productcount.substring(1, productcount.length()-1);
	      int productcountint = Integer.valueOf(productcount);
	      if (productcountint == 0)
	      {
	    	  throw new Exception("No products present in PLP page");
	      }
	   }

	   @Then("^User navigates to Commercial door operator systems$")
	   public void user_navigates_to_Commercial_door_operator_systems() throws Throwable {
		   driver.navigate().to(appurlPLP+"Products/Commercial-Door-Operator-Systems/c/20-11");
	   }

	   @Given("^User navigates to Gate operator systems$")
	   public void user_navigates_to_Gate_operator_systems() throws Throwable {
		   driver.navigate().to(appurlPLP+"c/gates");
	   }

	   @Given("^User navigates to Access Control systems$")
	   public void user_navigates_to_Access_Control_systems() throws Throwable {
		   driver.navigate().to(appurlPLP+"c/access");
	   }

	   @Given("^User navigates to All accessories$")
	   public void user_navigates_to_All_accessories() throws Throwable {
		   driver.navigate().to(appurlPLP+"c/accessories");
	   }

	   @Given("^User navigates to favorite products$")
	   public void user_navigates_to_favorite_products() throws Throwable {
		   driver.navigate().to(appurlPLP+"favorite-products");
	   }
}
