package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class OrderManagementPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using = "//h1[text()='Order Management']")
	public WebElement OrderManagementTitle;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Saved Carts']")
	public WebElement OrderManagementSavedCartLink;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Submit claim']")
	public WebElement OrderManagementSubmitClaimLink;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Order History']")
	public WebElement OrderManagementOrderHistoryLink;
	
	@FindBy(how = How.XPATH, using = "//a[text()='Return Items']")
	public WebElement OrderManagementRGASubmissionPageLink;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Please contact Customer Care at (800) 323-2276 for any orders older than 120 days.')]")
	public WebElement OrderHistoryCustomerDesc;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Please contact Customer Care at (800) 323-2276 for any returns older than 90 days.')]")
	public WebElement ReturnHistoryCustCareDesc;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Return History')]")
	public WebElement ReturnHistoryLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Return Items')]")
	public WebElement ReturnItemsLink;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Warranty Claims')]")
	public WebElement WarrantyClaimsHeaderText;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Submit claim')]")
	public WebElement WarrantyClaimLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Saved Carts')]")
	public WebElement SavedCartLink;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'You can save items in your cart at anytime by clicking on the cart and selecting the “Save for later” button.')]")
	public WebElement SavedCartDesc;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'My Templates')]")
	public WebElement MyTemplatesLink;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'You can save a template once you have configured an operator from the product details page of an operator family of your choice.')]")
	public WebElement MyTemplatesDesc;
	
	public OrderManagementPage(WebDriver driver) {

		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
