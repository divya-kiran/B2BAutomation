package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class SaveCartPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-page-saved-carts__list']//li[@class='p3-page-saved-carts__item'])[1]")
	public WebElement SavedCartFirstCard;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Saved Carts']")
	public WebElement SavedCartPageTitle;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Sort by')]")
	public WebElement SortByLabel;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@data-dropdown,'p3-dropdown__sort-by')]//div[@class='p3-dropdown__button']")
	public WebElement SavedCartsDD;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@value,'byDateSaved')]//parent::label")
	public WebElement ByDateSaved;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@value,'Name')]//parent::label")
	public WebElement ByNameDDVal;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@value,'Total')]//parent::label")
	public WebElement ByTotalDDVal;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-popup-menu'])[1]//button")
	public WebElement SavedCartToggleButton1;
	
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Restore')])[1]")
	public WebElement RestoreButton1;
	
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Delete')])[1]")
	public WebElement DeleteButton1;
	
	@FindBy(how = How.XPATH, using = "(//p[contains(text(),'Modified')])[1]")
	public WebElement ModifiedDate1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='savedCartsForm']/ul/li[1]/div/div[2]/div[2]/span[1]")
	public WebElement QTY1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='savedCartsForm']/ul/li[1]/div/div[2]/div[2]/span[2]")
	public WebElement QTYVal1;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-page-saved-carts__cart-qty-and-price'])[1]//span[@class='p3-page-saved-carts__cart-price']")
	public WebElement SavedCartPrice1;
	
	@FindBy(how = How.XPATH, using = "(//p[@class='p3-page-saved-carts__cart-description'])[1]")
	public WebElement SavedCartDesc;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Restore Cart')]")
	public WebElement RestoreCartHeading;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'The following saved cart will restore as active cart:')]")
	public WebElement RestoreCartMsg;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Keep a copy of this cart on saved list')]")
	public WebElement CheckBoxText;
	
	@FindBy(how = How.XPATH, using = "//input[@name='keepRestoredCart']//parent::label")
	public WebElement RestoreCartCheckBox;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'CANCEL')]")
	public WebElement RestoreCartCancelButton;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'RESTORE')]")
	public WebElement RestoreCartRestoreButton;
	
	public SaveCartPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
