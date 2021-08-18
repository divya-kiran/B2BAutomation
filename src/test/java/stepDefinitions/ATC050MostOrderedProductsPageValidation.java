package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Then;
import pageObjects.MostOrderedProductsPage;

public class ATC050MostOrderedProductsPageValidation extends BaseClass {
	MostOrderedProductsPage mostOrderedProductsPage = PageFactory.initElements(driver, MostOrderedProductsPage.class);

	@Then("^User navigates to Most ordered products page$")
	public void user_navigates_to_Most_ordered_products_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"favorite-products");
	}

	@Then("^verify web elements in most ordered products page$")
	public void verify_web_elements_in_most_ordered_products_page() throws Throwable {
		verifypageURL("/favorite-products");
	    isElementDisplayed(mostOrderedProductsPage.MostOrderedProductsPriceDisc, true);
	    isElementDisplayed(mostOrderedProductsPage.MostOrderedProductsTab, true);
	    isElementDisplayed(mostOrderedProductsPage.MostOrderedProductsImage, true);
	    isElementDisplayed(mostOrderedProductsPage.MostOrderedProductSummary, true);
	    isElementDisplayed(mostOrderedProductsPage.MostOrderedProductPrice, true);
	    isElementDisplayed(mostOrderedProductsPage.MostOrderedProductQTYBox, true);
	    isElementDisplayed(mostOrderedProductsPage.MostOrderedProductCTA, true);
	}

	@Then("^user verifies first most ordered product card$")
	public void user_verifies_first_most_ordered_product_card() throws Throwable {
	    
	}
}
