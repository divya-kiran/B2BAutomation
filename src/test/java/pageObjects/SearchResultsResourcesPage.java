package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class SearchResultsResourcesPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.LINK_TEXT, using = "Register Your Product")
	public WebElement registerYourProductLink;
	
	@FindBy(how = How.ID, using = "country-dropdown-link")
	public WebElement countryDropdownLink;
	
	@FindBy(how = How.CLASS_NAME, using = "current-lang")
	public WebElement currentCountry;
	
	@FindBy(how = How.XPATH, using = "//body")
	public WebElement pageBody;
	
	public SearchResultsResourcesPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
