package stepDefinitions;


import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import pageObjects.PDPPage;

public class ATC069ProductWithLessThan3Variant extends BaseClass {
	PDPPage pdpPage= PageFactory.initElements(driver, PDPPage.class);

	@Given("^Verifies PDP page of product having less than (\\d+) variants$")
	public void verifies_PDP_page_of_product_having_less_than_variants(int arg1) throws Throwable {
	    isElementDisplayed(pdpPage.ProductTitle, true);
	    isElementDisplayed(pdpPage.AlsoKnownAs, true);
	    isElementEnabled(pdpPage.GreyButtonEL25, true);
	    isElementEnabled(pdpPage.SilverButtonEL25, true);
	    isElementEnabled(pdpPage.NickelButtonEL25, true);
	    jsClick(pdpPage.NickelButtonEL25);
	    verifypageURL("/EL25/p/EL25N");
	}
}