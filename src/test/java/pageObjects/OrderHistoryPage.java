package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class OrderHistoryPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.CLASS_NAME, using = "p3-page-order-history__text-title")
	public WebElement OrderHistoryTitle;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Show More')]")
	public WebElement ShowMoreLink;
	
	@FindBy(how = How.CLASS_NAME, using = "p3-page-order-history__search-input")
	public WebElement OrderHistoryPONumberTB;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__ship-to-name']")
	public WebElement OrderHistoryShipToDD;
	
	@FindBy(how = How.CLASS_NAME, using = "p3-page-order-history__filter-toggle")
	public WebElement OrderHistoryFilterOption;
	
	@FindBy(how = How.ID, using = "search-go")
	public WebElement OrderHistoryGoButton;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-page-order-history__orders']//a)[1]")
	public WebElement OrderHistoryFirstOrder;
	
	@FindBy(how = How.XPATH, using = "//li[@data-status='CREATED' and @class='p3-page-order-history__filter-item']")
	public WebElement FilterByCreatedStatus;
	
	@FindBy(how = How.XPATH, using = "//li[@data-status='CREATED' and @class='p3-page-order-history__filter-item']//span[@class='order-count']")
	public WebElement FilterByCreatedStatusVal;
	
	
	@FindBy(how = How.XPATH, using = "//li[@data-status='BEING_PROCESSED' and @class='p3-page-order-history__filter-item']")
	public WebElement FilterByBeingProcessedStatus;
	
	@FindBy(how = How.XPATH, using = "//li[@data-status='SHIPPED' and @class='p3-page-order-history__filter-item']")
	public WebElement FilterByShippedStatus;
	
	@FindBy(how = How.XPATH, using = "//li[@data-status='COMPLETED' and @class='p3-page-order-history__filter-item']")
	public WebElement FilterByCompletedStatus;
	
	@FindBy(how = How.XPATH, using = "//input[@value='CREATED']//following-sibling::span[@class='p3-checkbox__checkmark']")
	public WebElement FilterByCreatedCheckBox;
	
	@FindBy(how = How.XPATH, using = "//input[@value='BEING_PROCESSED']//following-sibling::span[@class='p3-checkbox__checkmark']")
	public WebElement FilterByBeingProcessedCheckBox;
	
	@FindBy(how = How.XPATH, using = "//input[@value='SHIPPED']//following-sibling::span[@class='p3-checkbox__checkmark']")
	public WebElement FilterByShippedCheckBox;
	
	@FindBy(how = How.XPATH, using = "//input[@value='COMPLETED']//following-sibling::span[@class='p3-checkbox__checkmark']")
	public WebElement FilterByCompletedCheckBox;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Filter By Status')]")
	public WebElement FilterByStatusToggleButton;
	
	@FindBy(how = How.XPATH, using = "//button[@class='p3-page-order-history__filter-toggle']")
	public WebElement FilterToggleButton;
	
	@FindBy(how = How.XPATH, using = "//li[@data-start='0' and @data-end='31']")
	public WebElement FilterByOrders1to30days;
	
	@FindBy(how = How.XPATH, using = "//li[@data-start='30' and @data-end='61']")
	public WebElement FilterByOrders30to60days;
	
	@FindBy(how = How.XPATH, using = "//li[@data-start='60' and @data-end='91']")
	public WebElement FilterByOrders60to90days;
	
	@FindBy(how = How.XPATH, using = "//li[@data-start='90' and @data-end='121']")
	public WebElement FilterByOrders90to120days;
	
	@FindBy(how = How.XPATH, using = "//li[@data-start='0' and @data-end='31']//span[@class='p3-checkbox__checkmark']")
	public WebElement FilterByOrders1to30daysCheckBox;
	
	@FindBy(how = How.XPATH, using = "//li[@data-start='30' and @data-end='61']//span[@class='p3-checkbox__checkmark']")
	public WebElement FilterByOrders30to60daysCheckBox;
	
	@FindBy(how = How.XPATH, using = "//li[@data-start='60' and @data-end='91']//span[@class='p3-checkbox__checkmark']")
	public WebElement FilterByOrders60to90daysCheckBox;
	
	@FindBy(how = How.XPATH, using = "//li[@data-start='90' and @data-end='121']//span[@class='p3-checkbox__checkmark']")
	public WebElement FilterByOrders90to120daysCheckBox;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Filter By Orders')]")
	public WebElement FilterByOrderToggleButton;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Newest')]")
	public WebElement OrderHistoryToggleButtonNewest;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Oldest')]")
	public WebElement OrderHistoryToggleButtonOldest;
	
	@FindBy(how = How.XPATH, using = "(//li[@class='p3-page-order-history__order'])[1]//p[contains(text(),'Order #:')]")
	public WebElement OrderCardOrderNumber;
	
	@FindBy(how = How.XPATH, using = "(//li[@class='p3-page-order-history__order'])[1]")
	public WebElement OrderHistoryFirstOrderNew;
	
	@FindBy(how = How.XPATH, using = "(//li[@class='p3-page-order-history__order'])[1]//a")
	public WebElement OrderCardOrderNumberVal;
	
	@FindBy(how = How.XPATH, using = "(//li[@class='p3-page-order-history__order'])[1]//p[contains(text(),'PO #:')]")
	public WebElement OrderCardPONumber;
	
	@FindBy(how = How.XPATH, using = "(//li[@class='p3-page-order-history__order'])[1]//p[contains(text(),'Placed:')]")
	public WebElement OrderCardOrderDate;
	
	@FindBy(how = How.XPATH, using = "(//li[@class='p3-page-order-history__order'])[1]//p[contains(text(),'Placed:')]//parent::div//following-sibling::div//p")
	public WebElement OrderCardOrderDateVal;
	
	@FindBy(how = How.ID, using = "order-count")
	public WebElement OrderHistoryTotOrders;
	
	@FindBy(how = How.XPATH, using = "(//li[@class='p3-page-order-history__order'])[1]//span[contains(@class,'order-status')]")
	public WebElement OrderCardOrderStatusCard;
			
	
	public OrderHistoryPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
