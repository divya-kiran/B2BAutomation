package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class WarrantyClaimPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using = "//h2[text()='Homeowner']")
	public WebElement WarrantyClaimHomeOwner;
	
	@FindBy(how = How.XPATH, using = "//form[@id='warrantyClaimForm']//h1[contains(text(),'Warranty Support Claim Processing')]")
	public WebElement WarrantyClaimTitle;
	
	@FindBy(how = How.XPATH, using = "//h2[text()='Service Call Info']")
	public WebElement WarrantyClaimServiceCallInfo;
	
	@FindBy(how = How.XPATH, using = "//span[contains(@class,'p3-checkbox__checkmark')]")
	public WebElement WarrantyClaimCheckMark;
	
	@FindBy(how = How.ID, using = "agreeToTermsNext")
	public WebElement WarrantyClaimCheckNextButton;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Warranty Support Program')]")
	public WebElement WsupportProgramTCPage;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'If you have any questions about the warranty support claim process, please contact Customer Care at (800) 323-2276, or')]")
	public WebElement WContactTextTCPage;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'customer.service@chamberlain.com')]")
	public WebElement WContactLinkTCPage;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Your Warranty Support Claim has been submitted')]")
	public WebElement ToastMessage;
	
	@FindBy(how = How.NAME, using = "serviceDate")
	public WebElement WCServiceDate;
	
	@FindBy(how = How.NAME, using = "contactPerson")
	public WebElement ContactPersonTB;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Contact Person *')]")
	public WebElement ContactPersonLabel;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Is the product in warranty? *')]")
	public WebElement WarrantyProductYesorNo;
	
	@FindBy(how = How.XPATH, using = "//input[@value='true' and @name='inWarranty']//following-sibling::span")
	public WebElement WarrantyClaimYesButton;
	
	@FindBy(how = How.XPATH, using = "//input[@value='false' and @name='inWarranty']//following-sibling::span")
	public WebElement WarrantyClaimNoButton;
	
	@FindBy(how = How.XPATH, using = "//input[@value='false' and @name='isResidentialOpener']//following-sibling::span")
	public WebElement CDORadioButton;
	
	@FindBy(how = How.XPATH, using = "//input[@value='true' and @name='isResidentialOpener']//following-sibling::span")
	public WebElement ResidentialRadioButton;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Which product did you service? *')]")
	public WebElement ProductDidYouService;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__deliveryAddressForm_country']//div[@class='p3-dropdown__button']")
	public WebElement CountryDD;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__deliveryAddressForm_country-0']//parent::label")
	public WebElement CountryDDCA;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__deliveryAddressForm_country-1']//parent::label")
	public WebElement CountryDDUSA;
	
	@FindBy(how = How.NAME, using = "line1")
	public WebElement Address1;
	
	@FindBy(how = How.NAME, using = "line2")
	public WebElement Address2;
	
	@FindBy(how = How.NAME, using = "townCity")
	public WebElement CityName;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__deliveryAddressForm_region']//div[@class='p3-dropdown__button']")
	public WebElement StateDD;
	
	@FindBy(how = How.XPATH, using = "//input[@value='US-AZ']//parent::label")
	public WebElement StateDDAZ;
	
	@FindBy(how = How.NAME, using = "postcode")
	public WebElement PostCode;
	
	@FindBy(how = How.NAME, using = "modelNumber")
	public WebElement OpenerModelNum;
	
	@FindBy(how = How.NAME, using = "serialNumber")
	public WebElement OpenerSerialNum;
	
	@FindBy(how = How.NAME, using = "originalInstallationDate")
	public WebElement OriginalInstalDate;
	
	@FindBy(how = How.NAME, using = "problem")
	public WebElement ProblemTextBox;
	
	@FindBy(how = How.NAME, using = "remedy")
	public WebElement RemedyTextArea;
	
	@FindBy(how = How.NAME, using = "partsReplaced")
	public WebElement PartsReplacedTB;
	
	@FindBy(how = How.ID, using = "warrantyClaimFormSave")
	public WebElement warrantyClaimSaveButton;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Your Warranty Support Claim has been submitted')]")
	public WebElement ToastMsgWarrantyClaim;
	
	public WarrantyClaimPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
