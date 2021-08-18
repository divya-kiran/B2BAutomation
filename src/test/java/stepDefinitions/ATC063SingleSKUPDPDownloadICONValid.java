package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PDPPage;

public class ATC063SingleSKUPDPDownloadICONValid extends BaseClass {
	PDPPage pdpPage = PageFactory.initElements(driver, PDPPage.class);

	@Then("^User clicks on download icon$")
	public void user_clicks_on_download_icon() throws Throwable {
	    ScrollToElement(pdpPage.ProductHeroImage);
		jsClick(pdpPage.ProductGalleryDownloadIcon);
	    Thread.sleep(2000);
	}

	@Then("^user verifies elements in download pop up section$")
	public void user_verifies_elements_in_download_pop_up_section() throws Throwable {
	    isElementDisplayed(pdpPage.MarketingAssets, true);
	    isElementDisplayed(pdpPage.DownloadImage1, true);
	    isElementDisplayed(pdpPage.JPEG1, true);
	    isElementDisplayed(pdpPage.PNG1, true);
	    isElementDisplayed(pdpPage.Logo1Heading, true);
	    isElementDisplayed(pdpPage.Logo2Heading, true);
	    isElementDisplayed(pdpPage.Logo3Heading, true);
	}
}

