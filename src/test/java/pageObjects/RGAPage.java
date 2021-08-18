package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class RGAPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using = "//h2[text()='Items to Return']")
	public WebElement RGAItemToReturnTitle;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Return History')]")
	public WebElement RGAHistoryTitle;
	
	@FindBy(how = How.XPATH, using = "//h4[text()='Sold-To']")
	public WebElement RGAPageSoldTOTitle;
	
	@FindBy(how = How.XPATH, using = "//h4[text()='Sold-To']//following-sibling::div")
	public WebElement RGAPageSoldTOAddress;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add Address')]")
	public WebElement AddAddressButton;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Select Ship-To Address')]")
	public WebElement SelectShiptoAddress;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'My Account')]")
	public WebElement MyAccountLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'My Account')]//parent::p")
	public WebElement GoToMyaccountText;
	
	@FindBy(how = How.XPATH, using = "(//label[@for='p3-page-rga__ship-to-address-0'])[1]")
	public WebElement ShipToAddressSelect;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Select drop-ship address')]")
	public WebElement SelectDropshipAddressTitle;
	
	@FindBy(how = How.ID, using = "addDropshipAddressButton")
	public WebElement AddDropShipLink;
	
	@FindBy(how = How.NAME, using = "firstName")
	public WebElement DropShipAddressFirstName;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Add drop-ship address']")
	public WebElement AddDropshipAddressLink;
	
	@FindBy(how = How.NAME, using = "lastName")
	public WebElement DropShipAddressLastName;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Select Country']")
	public WebElement DropShipAddressCountryName;
	
	@FindBy(how = How.ID, using = "p3-rga-form__manage-address-address-one")
	public WebElement DropShipAddressLine1;
	
	@FindBy(how = How.ID, using = "p3-rga-form__manage-address-address-two")
	public WebElement DropShipAddressLine2;
	
	@FindBy(how = How.ID, using = "p3-rga-form__manage-address-city")
	public WebElement DropShipAddressCityName;
	
	@FindBy(how = How.NAME, using = "postcode")
	public WebElement DropShipAddressPostalCode;
	
	@FindBy(how = How.ID, using = "dropshipAddressFormSave")
	public WebElement DropShipAddressSaveButton;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Cancel')]//following-sibling::button[@id='dropshipAddressFormSave']")
	public WebElement DropShipAddressCancelButton;
	
	@FindBy(how = How.XPATH, using = "//span[text()='First Name *']")
	public WebElement DropShipAddressFirstNameLabel;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Last Name *']")
	public WebElement DropShipAddressLastNameLabel;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__deliveryAddressForm_country']")
	public WebElement DropShipAddressCountryNameLabel;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Address 1 *']")
	public WebElement DropShipAddressAddress1Label;
	
	@FindBy(how = How.XPATH, using = "//span[text()='City *']")
	public WebElement DropShipAddressCityNameLabel;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__deliveryAddressForm_region']")
	public WebElement DropShipAddressStateNameLabel;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Postal Code *']")
	public WebElement DropShipAddressPostalCodeLabel;
	
	@FindBy(how = How.XPATH, using = "//span[text()='* Required']")
	public WebElement DropShipAddressRequiredLabel;
	
	@FindBy(how = How.XPATH, using = "//h4[text()='Add Address']")
	public WebElement DropShipAddressHeaderLabel;
	
	@FindBy(how = How.ID, using = "rgaSelectShipToAddressFormSave")
	public WebElement RGAShipToSaveButton;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Requested by')]")
	public WebElement RequestedByLabel;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Requested by')]//following-sibling::span")
	public WebElement RequestedByVal;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Primary Phone')]//following-sibling::span")
	public WebElement PrimaryPhnVal;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Primary Phone')]")
	public WebElement PrimaryPhnLabel;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Email Address')]")
	public WebElement EmailAddLabel;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Email Address')]//following-sibling::span")
	public WebElement EmailAddVal;
	
	@FindBy(how = How.ID, using = "p3-page-rga__po-number")
	public WebElement PONumberTB;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customer Ref / PO Number *')]")
	public WebElement PONumberLabel;
	
	@FindBy(how = How.NAME, using = "originalOrderNumber")
	public WebElement OrderNumberTB;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Original Order #')]")
	public WebElement OrderNumberVal;
	
	@FindBy(how = How.ID, using = "p3-page-rga__notes")
	public WebElement NotesTB;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Notes / Special Instructions')]")
	public WebElement NotesLabel;
	
	@FindBy(how = How.NAME, using = "materialNumber")
	public WebElement MaterialVal;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Material / Part # *')]")
	public WebElement MaterialLabel;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Return Reason Code *')]")
	public WebElement ReturnReasonLabel;
	
	@FindBy(how = How.XPATH, using = "//div[@id='p3-dropdown__form-item-return-reason-code']//div[@class='p3-dropdown__button']")
	public WebElement ReturnReasonDD;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Defective – Already Replaced']//parent::label")
	public WebElement ReturnReasonDD1;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@value,'Defective – In Warranty – Issue Credit')]//parent::label")
	public WebElement ReturnReasonDD2;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Defective – In Warranty – Replace']//parent::label")
	public WebElement ReturnReasonDD3;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Advance Replace in Warranty']//parent::label")
	public WebElement ReturnReasonDD4;
	
	@FindBy(how = How.XPATH, using = "//input[@value='Other']//parent::label")
	public WebElement ReturnReasonDD5;
	
	@FindBy(how = How.NAME, using = "quantity")
	public WebElement QtyTB;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'QTY *')]")
	public WebElement QtyLabel;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Return Reason Symptom')]")
	public WebElement ReturnReasonSympLabel;
	
	@FindBy(how = How.NAME, using = "returnReasonSymptom")
	public WebElement ReturnReasonSympTB;
	
	@FindBy(how = How.NAME, using = "serialNumber")
	public WebElement SerialNumTB;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Serial # *')]")
	public WebElement SerailNumLabel;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Maximum 255 characters')]")
	public WebElement ReturnReasonSympCharacterLimit;
	
	@FindBy(how = How.ID, using = "rgaItemFormSave")
	public WebElement RGAItemSaveButton;
	
	@FindBy(how = How.ID, using = "addAnotherRgaItemButton")
	public WebElement AddAnotherRGA;
	
	@FindBy(how = How.ID, using = "returnedGoodsAuthorizationFormSubmit")
	public WebElement RGASubmit;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),' Your Return Goods Authorization (RGA) has been submitted.')]")
	public WebElement ToastMsgRGA;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Next Steps')]")
	public WebElement RGANextSteps;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'TSCOrders@chamberlain.com')]")
	public WebElement RGASupportMail;
	
	@FindBy(how = How.XPATH, using = "(//ul//li[@class='p3-page-rga__items-item']//button[@class='p3-popup-menu__toggle'])[1]")
	public WebElement RGAItemToggleButton;
	
	@FindBy(how = How.XPATH, using = "(//ul//li[@class='p3-page-rga__items-item']//button[contains(text(),'Edit')])[1]")
	public WebElement RGAEditToggleButton;
	
	@FindBy(how = How.XPATH, using = "(//ul//li[@class='p3-page-rga__items-item']//button[contains(text(),'Delete')])[1]")
	public WebElement RGADeleteToggleButton;
	
	@FindBy(how = How.XPATH, using = "//h4[text()='Ship-To']")
	public WebElement RGAPageShipTOTitle;
	
	@FindBy(how = How.XPATH, using = "//h1[text()='Return Goods Authorization (RGA)']")
	public WebElement RGAPageTitle;
	
	public RGAPage(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
