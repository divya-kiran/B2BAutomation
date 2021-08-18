package stepDefinitions;

import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PDPPage;


public class SmokePDPPageValidation extends BaseClass {
	
	String appurlPDP = configFileReader.getApplicationUrl();
	PDPPage pDPage = PageFactory.initElements(driver, PDPPage.class);
	   
	@Then("^User will navigate to single SKU product PDP page \"([^\"]*)\"$")
	public void user_will_navigate_to_single_SKU_product_PDP_page(String arg1) throws Throwable {
		 driver.navigate().to(appurlPDP+arg1);
		 CompareExactText(pDPage.ProductTitle, arg1);
	}

	@Then("^Verify Product Name Price CTA Summary Gallery Image Price disclaimer for single SKU$")
	public void verify_Product_Name_Price_CTA_Summary_Gallery_Image_Price_disclaimer_for_single_SKU() throws Throwable {
		CompareExactText(pDPage.ProductPriceDisclaimer, "List price; add to cart to see your price.");
		isElementDisplayed(pDPage.ProductSummary, true);
		CompareExactText(pDPage.ProductAddToCartCTA, "Add to cart");
		isElementDisplayed(pDPage.ProductGalleryDownloadIcon, true);
		String price = getText(pDPage.ProductPrice);
		price = price.substring(1);
		float pricefloat = Float.parseFloat(price);
		if (pricefloat == 0.00)
	      {
	    	  throw new Exception("Price is below zero or invlaid");
	      }
	}

	@Given("^User will navigate to GDO product PDP page \"([^\"]*)\"$")
	public void user_will_navigate_to_GDO_product_PDP_page(String arg1) throws Throwable {
		 driver.navigate().to(appurlPDP+arg1);
		 CompareExactText(pDPage.ProductTitle, arg1);
	}

	@Given("^Verify Product Name Price CTA Rail Length Gallery Image Price disclaimer for GDO$")
	public void verify_Product_Name_Price_CTA_Rail_Length_Gallery_Image_Price_disclaimer_for_GDO() throws Throwable {
		isElementDisplayed(pDPage.ProductSummary, true);
		CompareExactText(pDPage.ProductPriceDisclaimer, "List price; add to cart to see your price.");
		CompareExactText(pDPage.ProductAddToCartCTA, "Add to cart");
		isElementDisplayed(pDPage.ProductGalleryDownloadIcon, true);
		isElementDisplayed(pDPage.GDOProductRailLength, true);
		String price = getText(pDPage.ProductPrice);
		price = price.substring(1);
		float pricefloat = Float.parseFloat(price);
		if (pricefloat == 0.00)
	      {
	    	  throw new Exception("Price is below zero or invlaid");
	      }
		
	}

	@Given("^User will navigate to CDO product PDP page \"([^\"]*)\"$")
	public void user_will_navigate_to_CDO_product_PDP_page(String arg1) throws Throwable {
		 driver.navigate().to(appurlPDP+arg1);
	}

	@Given("^Verify Product Name Price CTA Summary Gallery Image Price disclaimer for CDO$")
	public void verify_Product_Name_Price_CTA_Summary_Gallery_Image_Price_disclaimer_for_CDO() throws Throwable {
		isElementDisplayed(pDPage.ProductSummary, true);
		CompareExactText(pDPage.ProductPriceDisclaimer, "List price; add to cart to see your price.");
		CompareExactText(pDPage.ProductAddToCartCTA, "Add to cart");
		isElementDisplayed(pDPage.ProductGalleryDownloadIcon, true);
		isElementDisplayed(pDPage.CDOProductStartingatLabel, true);
		String price = getText(pDPage.ProductPrice);
		price = price.substring(1);
		float pricefloat = Float.parseFloat(price);
		if (pricefloat == 0.00)
	      {
	    	  throw new Exception("Price is below zero or invlaid");
	      }
	}

	@Given("^Verify Templates Configure and install section for CDO products$")
	public void verify_Templates_Configure_and_install_section_for_CDO_products() throws Throwable {
	    isElementDisplayed(pDPage.CDOProductTemplateLabel, true);
	    isElementDisplayed(pDPage.CDOProductConfigureLabel, true);
	    isElementDisplayed(pDPage.CDOProductInstallLabel, true);
	}
}
