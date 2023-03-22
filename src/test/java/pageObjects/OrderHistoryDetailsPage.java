package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class OrderHistoryDetailsPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Order #')]")
	public WebElement OrderDetailsOrderNumberTitle;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'p3-page-order-details__status')]")
	public WebElement OrderStatus;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Order History']")
	public WebElement OrderHistoryLink;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'p3-page-order-details__date')]")
	public WebElement OrderedDateText;
	
	@FindBy(how = How.ID, using = "reorderButton")
	public WebElement ReorderLink;
	
	@FindBy(how = How.XPATH, using = "//h4[text()='Delivery Address']")
	public WebElement DeliveryAddressTitle;
	
	@FindBy(how = How.XPATH, using = "//h4[text()='Invoice(s)']")
	public WebElement InvoiceTitle;
	
	@FindBy(how = How.XPATH, using = "//span[contains(@class,'p3-page-order-details__delivery-methods') and not (contains(text(),'Selected')) ]")
	public WebElement DeliveryMethodsVal;
	
	@FindBy(how = How.XPATH, using = "((//ul[@class='p3-page-order-details__items-list'])[1]//h4)[1]")
	public WebElement OrderDetailCardTitle;
	
	@FindBy(how = How.XPATH, using = "((//ul[@class='p3-page-order-details__items-list'])[1]//h4//span)[1]")
	public WebElement OrderDetailCardProductIndex;
	
	@FindBy(how = How.XPATH, using = "((//ul[@class='p3-page-order-details__items-list'])[1]//h4//a)[1]")
	public WebElement OrderDetailsCardProductNameLink;
	
	@FindBy(how = How.XPATH, using = "((//ul[@class='p3-page-order-details__items-list'])[1]//p)[1]")
	public WebElement OrderDetailsProductSummary;
	
	@FindBy(how = How.XPATH, using = "((//ul[@class='p3-page-order-details__items-list'])[1]//span[contains(text(),'QTY Requested:')])[1]")
	public WebElement QTYRequestedAttribute;
	
	@FindBy(how = How.XPATH, using = "((//ul[@class='p3-page-order-details__items-list'])[1]//span[contains(text(),'QTY Requested:')]//following-sibling::span)[1]")
	public WebElement QTYRequestedAttributeVal;
	
	@FindBy(how = How.XPATH, using = "((//ul[@class='p3-page-order-details__items-list'])[1]//span[contains(text(),'QTY Shipped:')])[1]")
	public WebElement QTYShippedAttribute;
	
	@FindBy(how = How.XPATH, using = "((//ul[@class='p3-page-order-details__items-list'])[1]//span[contains(text(),'QTY Shipped:')]//following-sibling::span)[1]")
	public WebElement QTYShippedAttributeVal;
	
	@FindBy(how = How.XPATH, using = "((//ul[@class='p3-page-order-details__items-list'])[1]//span[contains(text(),'Price EA:')])[1]")
	public WebElement EachProdPriceAttribute;
	
	@FindBy(how = How.XPATH, using = "((//ul[@class='p3-page-order-details__items-list'])[1]//span[contains(text(),'Price EA:')]//following-sibling::span)[1]")
	public WebElement EachProdPriceAttributeVal;
	
	@FindBy(how = How.XPATH, using = "((//ul[@class='p3-page-order-details__items-list'])[1]//span[contains(text(),'Total:')])[1]")
	public WebElement TotProdPriceAttribute;
	
	@FindBy(how = How.XPATH, using = "((//ul[@class='p3-page-order-details__items-list'])[1]//span[contains(text(),'Total:')]//following-sibling::span)[1]")
	public WebElement TotProdPriceAttributeVal;
	
	@FindBy(how = How.XPATH, using = "((//ul[@class='p3-page-order-details__items-list'])[1]//a[contains(text(),'Return Items')])[1]")
	public WebElement ReturnItemsLink;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Items')]")
	public WebElement OrderDetailPageItems;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Order #')]")
	public WebElement OrderDetailPageTitle;
	
	public OrderHistoryDetailsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
		new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(this.driver, this);
	}
}
