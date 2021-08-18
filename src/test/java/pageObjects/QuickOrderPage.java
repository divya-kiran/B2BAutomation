package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class QuickOrderPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.LINK_TEXT, using = "Register Your Product")
	public WebElement registerYourProductLink;
	
	@FindBy(how = How.ID, using = "quickOrderSearch")
	public WebElement QuickOrderTextBox;
	
	@FindBy(how = How.ID, using = "quickOrderButton")
	public WebElement QuickOrderAddToCart;
	
	@FindBy(how = How.CLASS_NAME, using = "current-lang")
	public WebElement currentCountry;
	
	@FindBy(how = How.XPATH, using = "//img[contains(@alt,'Quick Order')]//parent::button")
	public WebElement QuickOrderPopUP;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'QUICK ORDER')]")
	public WebElement QuickOrderWidgetTitle;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'QUICK ORDER')]/following-sibling::button")
	public WebElement QuickOrdercloseicon;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Part, Accessory or Model Number')]")
	public WebElement QuickOrderTextBoxTitle;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'QTY')]")
	public WebElement QuickOrderQTYBoxTitle;
	
	@FindBy(how = How.ID, using = "quickOrderQty")
	public WebElement QuickOrderQTYBox;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'has been added to your cart')]")
	public WebElement QuickOrderSuccessMessage;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'No exact match found; please try the search bar.')]")
	public WebElement QuickOrderErrorMessage;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'LiftMaster product numbers should not have special characters other than dashes or underscores. Please check your entry and try again.')]")
	public WebElement QuickOrderErrorMessageSpecialCharacters;
	
	public QuickOrderPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
