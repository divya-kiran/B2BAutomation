package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PDPPage;

public class ATC065CDOPDPPagevalidation extends BaseClass {
	PDPPage pdpPage = PageFactory.initElements(driver, PDPPage.class);

	@Then("^user verifies web elements in CDO PDP page$")
	public void user_verifies_web_elements_in_CDO_PDP_page() throws Throwable {
		isElementDisplayed(pdpPage.ProductTitle, true);
		ScrollToElement(pdpPage.ProductTitle);
	    isElementDisplayed(pdpPage.ProductSummary, true);
		isElementDisplayed(pdpPage.ProductHeroImage, true);
	    isElementDisplayed(pdpPage.ProductThumbnailImage, true);
	    isElementDisplayed(pdpPage.ProductGalleryDownloadIcon, true);
	    isElementDisplayed(pdpPage.TemplatesHeading, true);
	    jsClick(pdpPage.TemplatesDD);
	    isElementDisplayed(pdpPage.LMTemplatesHeading, true);
	    isElementDisplayed(pdpPage.LMTemplates2, true);
	    isElementDisplayed(pdpPage.LMTemplates3, true);
	    ScrollToElement(pdpPage.CDOProductConfigureLabel);
	    isElementDisplayed(pdpPage.CDOProductConfigureLabel, true);
	    isElementDisplayed(pdpPage.CDOProductInstallLabel, true);
	    isElementDisplayed(pdpPage.CDOProductStartingatLabel, true);
	    isElementDisplayed(pdpPage.ProductPrice, true);
	    isElementDisplayed(pdpPage.ProductPriceDisclaimer, true);
	    isElementDisplayed(pdpPage.ProductQTYBox, true);
	    isElementDisplayed(pdpPage.ProductAddToCartCTA, true);
	}

	@Then("^Verifies elements in configure section of CDO PDP Page$")
	public void verifies_elements_in_configure_section_of_CDO_PDP_Page() throws Throwable {
	    ScrollToElement(pdpPage.CDOProductConfigureLabel);
		isElementDisplayed(pdpPage.CDOProductConfigureLabel, true);
	    isElementDisplayed(pdpPage.TVoltagePhaseLabel, true);
	    jsClick(pdpPage.TVoltagePhaseLabel3);
	    isElementDisplayed(pdpPage.THorsePowerLabel, true);
	    jsClick(pdpPage.THorsePowerLabel3);
	    isElementDisplayed(pdpPage.SpecialModificationLabel, true);
	    jsClick(pdpPage.DAMPENVButton);
	    Thread.sleep(2000);
	    jsClick(pdpPage.Modification1);
	    jsClick(pdpPage.Option1);
	    Thread.sleep(2000);
	    jsClick(pdpPage.Modification2);
	    jsClick(pdpPage.Modification2Option1);
	}

	@Then("^User verifies elements in install section of CDO PDP Page$")
	public void user_verifies_elements_in_install_section_of_CDO_PDP_Page() throws Throwable {
		isElementDisplayed(pdpPage.CDOProductInstallLabel, true);
	    isElementDisplayed(pdpPage.TSafetyDeviceN4, true);
	    jsClick(pdpPage.TSafetyDeviceN4DD);
	    Thread.sleep(2000);
	    jsClick(pdpPage.TSafetyDeviceN4Label1);
	    isElementDisplayed(pdpPage.TDoorHeight, true);
	    jsClick(pdpPage.TDoorHeightLabel);
	    Thread.sleep(2000);
	    jsClick(pdpPage.TDoorHeightLabel1);
	    isElementDisplayed(pdpPage.FIModifications, true);
	    jsClick(pdpPage.FIModificationsLabel);
	    Thread.sleep(2000);
	    jsClick(pdpPage.FIModificationsLabel1);
	    isElementDisplayed(pdpPage.ProductPrice, true);
	    isElementDisplayed(pdpPage.ProductPriceDisclaimer, true);
	    isElementDisplayed(pdpPage.ProductQTYBox, true);
	    isElementDisplayed(pdpPage.ProductAddToCartCTA, true);
	}

	@Then("^verifies Add to Cart CTA is enabled$")
	public void verifies_Add_to_Cart_CTA_is_enabled() throws Throwable {
		pdpPage.ProductAddToCartCTA.isEnabled();
	}
}