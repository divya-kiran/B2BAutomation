package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.PDPPage;
import pageObjects.SearchResultsPage;
import pageObjects.StickyHeaderPage;

public class ATC089MyAccountStickyHeaderValidation extends BaseClass {
	StickyHeaderPage stickyPage = PageFactory.initElements(driver, StickyHeaderPage.class);

	@Given("^Scroll to bottom for sticky navigation$")
	public void scroll_to_bottom_for_sticky_navigation() throws Throwable {
	    scrollBottom();
	}

	@Given("^verify sticky navigation in My account page$")
	public void verify_sticky_navigation_in_My_account_page() throws Throwable {
	    isElementDisplayed(stickyPage.StickyNavigBar, true);
	    isElementDisplayed(stickyPage.ProfileStickyLink, true);
	    isElementDisplayed(stickyPage.CompanyInfoStickyLink, true);
	    isElementDisplayed(stickyPage.ManageUserStickyLink, true);
	    isElementDisplayed(stickyPage.ManageInvitationStickyLink, true);
	    jsClick(stickyPage.CompanyInfoStickyLink);
	    jsClick(stickyPage.ManageInvitationStickyLink);
	    jsClick(stickyPage.ManageUserStickyLink);
	    jsClick(stickyPage.ProfileStickyLink);
	}
}