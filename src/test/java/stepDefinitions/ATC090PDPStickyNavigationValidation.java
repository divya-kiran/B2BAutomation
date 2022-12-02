package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import pageObjects.StickyHeaderPage;

public class ATC090PDPStickyNavigationValidation extends BaseClass {
	StickyHeaderPage stickyPage = PageFactory.initElements(driver, StickyHeaderPage.class);

	@Then("^user verifies Add to cart CTA in sticky navigation of PDP page$")
	public void user_verifies_Add_to_cart_CTA_in_sticky_navigation_of_PDP_page() throws Throwable {
	    isElementDisplayed(stickyPage.StickyNavImage, true);
	    isElementDisplayed(stickyPage.StickyNavPName, true);
	    isElementDisplayed(stickyPage.StickyNavSummary, true);
	    isElementDisplayed(stickyPage.ListPriceDisc, true);
	    isElementDisplayed(stickyPage.PriceVal, true);
	    isElementDisplayed(stickyPage.QTYBox, true);
	    isElementDisplayed(stickyPage.StickyNavAddToCartBtn, true);
	    stickyPage.StickyNavAddToCartBtn.isEnabled();
	}

	@Then("^user verifies get support CTA in sticky navigation of PDP page$")
	public void user_verifies_get_support_CTA_in_sticky_navigation_of_PDP_page() throws Throwable {
		isElementDisplayed(stickyPage.StickyNavImage, true);
	    isElementDisplayed(stickyPage.StickyNavPName, true);
	    isElementDisplayed(stickyPage.StickyNavSummary, true);
	    isElementDisplayed(stickyPage.GetSupportCTAbtn, true);
	}

	@Then("^user verifies Custom CTA in sticky navigation of PDP page$")
	public void user_verifies_Custom_CTA_in_sticky_navigation_of_PDP_page() throws Throwable {
		isElementDisplayed(stickyPage.StickyNavImage, true);
	    isElementDisplayed(stickyPage.StickyNavPName, true);
	    isElementDisplayed(stickyPage.StickyNavSummary, true);
	    isElementDisplayed(stickyPage.CustomCTAbtn, true);    
	}

	@Then("^user verifies Notify ME CTA in sticky navigation of PDP page$")
	public void user_verifies_Notify_ME_CTA_in_sticky_navigation_of_PDP_page() throws Throwable {
		isElementDisplayed(stickyPage.NotifyMEimg, true);
	    isElementDisplayed(stickyPage.StickyNavPName, true);
	    isElementDisplayed(stickyPage.StickyNavSummary, true);
	    isElementDisplayed(stickyPage.NotifyMEBtn, true);	    
	}

	@Then("^user verifies configurable products CTA in sticky navigation of PDP page$")
	public void user_verifies_configurable_products_CTA_in_sticky_navigation_of_PDP_page() throws Throwable {
		isElementDisplayed(stickyPage.StickyNavImage, true);
	    isElementDisplayed(stickyPage.StickyNavPName, true);
	    isElementDisplayed(stickyPage.StickyNavSummary, true);
	    isElementDisplayed(stickyPage.ListPriceDisc, true);
	    isElementDisplayed(stickyPage.PriceVal, true);
	    isElementDisplayed(stickyPage.QTYBox, true);
	    isElementDisplayed(stickyPage.StickyNavAddToCartBtn, true);
	    //isElementdisabled(stickyPage.StickyNavAddToCartBtn, false);
	}

	@Then("^user verifies GDO products CTA in sticky navigation of PDP page$")
	public void user_verifies_GDO_products_CTA_in_sticky_navigation_of_PDP_page() throws Throwable {
		Thread.sleep(2000);
		isElementDisplayed(stickyPage.StickyNavImage, true);
	    isElementDisplayed(stickyPage.StickyNavPName, true);
	    isElementDisplayed(stickyPage.StickyNavSummary, true);
	    isElementDisplayed(stickyPage.ListPriceDisc, true);
	    isElementDisplayed(stickyPage.PriceVal, true);
	    isElementDisplayed(stickyPage.QTYBox, true);
	    isElementDisplayed(stickyPage.StickyNavAddToCartBtn, true);
	}
}