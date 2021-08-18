package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PDPPage;

public class ATC061SingleSKUPDPOverviewSection extends BaseClass {
	PDPPage pdpPage = PageFactory.initElements(driver, PDPPage.class);

	@When("^User navigates to PDP page of product \"([^\"]*)\"$")
	public void user_navigates_to_PDP_page_of_product(String arg1) throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"p/"+arg1);
	}

	@Then("^Verifies Gallery section of PDP page$")
	public void verifies_Gallery_section_of_PDP_page() throws Throwable {
	    isElementDisplayed(pdpPage.ProductHeroImage, true);
	    isElementDisplayed(pdpPage.ProductThumbnailImage, true);
	    ScrollToElement(pdpPage.ProductHeroImage);
	    isElementDisplayed(pdpPage.ProductGalleryDownloadIcon, true);
	}

	@Then("^Verifies product details in PDP page$")
	public void verifies_product_details_in_PDP_page() throws Throwable {
		 ScrollToElement(pdpPage.ProductTitle);
		isElementDisplayed(pdpPage.ProductTitle, true);
	    isElementDisplayed(pdpPage.ProductSummary, true);
	    isElementDisplayed(pdpPage.ProductPrice, true);
	    isElementDisplayed(pdpPage.ProductPriceDisclaimer, true);
	    isElementDisplayed(pdpPage.ProductQTYBox, true);
	    isElementDisplayed(pdpPage.ProductAddToCartCTA, true);
	}
}

