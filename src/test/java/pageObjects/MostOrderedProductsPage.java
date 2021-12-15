package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class MostOrderedProductsPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'p3-plp__heading')]//span[contains(text(),'All prices shown are')]//parent::li")
	public WebElement MostOrderedProductsPriceDisc;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__heading']//li[contains(text(),'Products')]")
	public WebElement MostOrderedProductsTab;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//li[@class='p3-plp__product-item'])[1]//img")
	public WebElement MostOrderedProductsImage;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//li[@class='p3-plp__product-item'])[1]//h2")
	public WebElement MostOrderedProductsName;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//li[@class='p3-plp__product-item'])[1]//div[@class='p3-plp__product-description']")
	public WebElement MostOrderedProductSummary;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//li[@class='p3-plp__product-item'])[1]//span")
	public WebElement MostOrderedProductPrice;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//li[@class='p3-plp__product-item'])[1]//input")
	public WebElement MostOrderedProductQTYBox;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//li[@class='p3-plp__product-item'])[1]//button")
	public WebElement MostOrderedProductCTA;
	
	public MostOrderedProductsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
