package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class PDPPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.ID, using = "addGroupToCartButton")
	public WebElement HeadandRailsAddToCartCTA;
	
	@FindBy(how = How.ID, using = "addToCartButton")
	public WebElement ProductAddToCartCTA;

	@FindBy(how = How.XPATH, using = "//button[@class='add-to-cart__p3-dialog__close']")
	public WebElement AddToCartPoPUp;

	@FindBy(how = How.XPATH, using = "//input[@class='p3-subsection-row-box__row-count js-qty']")
	public WebElement AddRails;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Add to cart')]")
	public WebElement ProductAddToCartCTAXPATH;
	
	@FindBy(how = How.CLASS_NAME, using = "p3-single-sku-pdp__overview-product-title")
	public WebElement ProductTitle;
	
	@FindBy(how = How.CLASS_NAME, using = "p3-single-sku-pdp__overview-product-description")
	public WebElement ProductSummary;
	
	@FindBy(how = How.CLASS_NAME, using = "p3-carousel__pagination")
	public WebElement ProductThumbnailImage;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-carousel__slider']//div)[1]")
	public WebElement ProductHeroImage;
	
	@FindBy(how = How.ID, using = "qtyInput")
	public WebElement ProductQTYBox;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Also known as:')]")
	public WebElement AlsoKnownAs;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Color')]")
	public WebElement ColorEL25;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Grey')]")
	public WebElement GreyButtonEL25;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Nickel')]")
	public WebElement NickelButtonEL25;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Silver')]")
	public WebElement SilverButtonEL25;
	
	@FindBy(how = How.XPATH, using = "//button[contains(@class,'p3-carousel__download-button cboxElement')]")
	public WebElement ProductGalleryDownloadIcon;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Marketing Assets')]")
	public WebElement MarketingAssets;
	
	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'JPEG')])[1]")
	public WebElement JPEG1;
	
	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'PNG')])[1]")
	public WebElement PNG1;
	
	@FindBy(how = How.XPATH, using = "(//ul[contains(@class,'p3-single-sku-pdp__marketing-assets-list')]//li)[1]")
	public WebElement DownloadImage1;
	
	@FindBy(how = How.ID, using = "logo1_title")
	public WebElement Logo1Heading;
	
	@FindBy(how = How.ID, using = "logo2_title")
	public WebElement Logo2Heading;
	
	@FindBy(how = How.ID, using = "logo3_title")
	public WebElement Logo3Heading;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Included')]")
	public WebElement IncludedHeading;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Incentives Program')]")
	public WebElement IncentivesHeading;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Connect to MyQ + Key Program')]")
	public WebElement MyQHeading;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Residential Operator Quantity Incentive Program')]")
	public WebElement QuantityIncentiveHeading;
	
	@FindBy(how = How.ID, using = "linkToCLP")
	public WebElement LearnMoreCTA;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Add more units >')]")
	public WebElement AddMoreCTA;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Description')]")
	public WebElement DescHeading;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Specifications')]")
	public WebElement SpecificationsHeading;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Warranty')]")
	public WebElement WarrantyHeading;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Warranty')]//following-sibling::div")
	public WebElement WarrantyTable;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Specifications')]//following-sibling::div")
	public WebElement specsTable;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Resources')]")
	public WebElement ResourcesHeading;
	
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Technical')]")
	public WebElement TechnicalTab;
	
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Sales & Marketing')]")
	public WebElement SalesMarketingTab;
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@id,'p3-gallery__what-is-included')]//a)[1]")
	public WebElement IncludesProduct1;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Overview')]")
	public WebElement OverviewLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Included')]")
	public WebElement WhatsIncludedlink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Description')]")
	public WebElement Descriptionlink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Incentives Program')]")
	public WebElement Incentivelink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Specs')]")
	public WebElement specsandwarrlink;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-single-sku-pdp__nav-wrapper']//a[contains(text(),'Resources')]")
	public WebElement Resourceslink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'You May Also Like')]")
	public WebElement YouMayAlsolike;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Proposition 65 WARNING')]")
	public WebElement CA65Warning;
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@data-tab,'resources-0')]//div[@class='p3-single-sku-pdp__resources-section'])[1]")
	public WebElement Resourcessection1;
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@data-tab,'resources-0')]//div[@class='p3-single-sku-pdp__resources-section'])[2]")
	public WebElement Resourcessection2;
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@data-tab,'resources-1')]//div[@class='p3-single-sku-pdp__resources-section'])[1]")
	public WebElement SalesTab1;
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@data-tab,'resources-1')]//div[@class='p3-single-sku-pdp__resources-section'])[2]")
	public WebElement SalesTab2;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Parts')]")
	public WebElement PartsHeading;
	
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'In Diagram')]")
	public WebElement InDiagramLink;
	
	@FindBy(how = How.XPATH, using = "//li[contains(text(),'Not in Diagram')]")
	public WebElement NotInDiagramLink;
	
	@FindBy(how = How.XPATH, using = "(//li[contains(@class,'p3-single-sku-pdp__parts-part')])[1]")
	public WebElement InDiagramProd1;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'You May Also Like')]")
	public WebElement YouMayAlsoLikeHeading;
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@id,'p3-gallery__you-may-also-like')]//a)[1]")
	public WebElement YouMayAlsoLikeProd1;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Click here for more information')]")
	public WebElement NonBBUClickHere;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'CALIFORNIA SENATE BILL 969')]")
	public WebElement CA969Heading;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'WHAT YOU NEED TO KNOW')]")
	public WebElement WhatYouHeadingNonBBU;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'LIFTMASTER COMPLIANCE')]")
	public WebElement LMCHeadingNonBBU;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Rail Selection')]")
	public WebElement RailSelectionHeader;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement RailLengthSelectDD;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Templates')]//parent::div[@class='p3-single-sku-pdp__overview-product-configurable-templates']")
	public WebElement TemplatesHeading;
	
	@FindBy(how = How.XPATH, using = "(//div[@data-group-dropdown='template']//div)[2]")
	public WebElement TemplatesDD;
	
	@FindBy(how = How.XPATH, using = "//div[@data-group-dropdown='template']//h4[contains(text(),'My Templates')]")
	public WebElement LMTemplatesHeading;
	
	@FindBy(how = How.XPATH, using = "(//div[@data-group-dropdown='template']//li)[2]")
	public WebElement LMTemplates2;
	
	@FindBy(how = How.XPATH, using = "(//div[@data-group-dropdown='template']//li)[3]")
	public WebElement LMTemplates3;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Voltage, phase & frequency')]")
	public WebElement TVoltagePhaseLabel;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='T-VOLTAGE-PHASE-FREQUENCY']//label)[1]")
	public WebElement TVoltagePhaseLabel3;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Horse Power')]")
	public WebElement THorsePowerLabel;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='T-HP']//label)[1]")
	public WebElement THorsePowerLabel3;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Special Modification')]")
	public WebElement SpecialModificationLabel;
	
	@FindBy(how = How.XPATH, using = "//*[@id='modifications1']/div/div")
	public WebElement Modification1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='modifications1']/div/ul/li[1]")
	public WebElement Option1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='modifications2']/div/div")
	public WebElement Modification2;
	
	@FindBy(how = How.XPATH, using = "//*[@id='modifications2']/div/ul/li/label")
	public WebElement Modification2Option1;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='T-SPECIAL']//label)[1]")
	public WebElement DAMPENVButton;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Safety Device N4')]")
	public WebElement TSafetyDeviceN4;
	
	@FindBy(how = How.XPATH, using = "(//div[@data-dropdown='SAFETY_DEVICE_N4']//div)[1]")
	public WebElement TSafetyDeviceN4DD;
	
	@FindBy(how = How.XPATH, using = "(//div[@data-dropdown='SAFETY_DEVICE_N4']//li)[1]")
	public WebElement TSafetyDeviceN4Label1;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Door Height')]")
	public WebElement TDoorHeight;
	
	@FindBy(how = How.XPATH, using = "(//div[@data-dropdown='T_DOOR_HEIGHT']//div)[1]")
	public WebElement TDoorHeightLabel;
	
	@FindBy(how = How.XPATH, using = "(//div[@data-dropdown='T_DOOR_HEIGHT']//li)[1]")
	public WebElement TDoorHeightLabel1;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Field Installed Modifications')]")
	public WebElement FIModifications;
	
	@FindBy(how = How.XPATH, using = "(//div[@data-dropdown='secondary']//div)[1]")
	public WebElement FIModificationsLabel;
	
	@FindBy(how = How.XPATH, using = "(//div[@data-dropdown='secondary']//li)[2]")
	public WebElement FIModificationsLabel1;
		
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Starting at')]")
	public WebElement CDOProductStartingatLabel;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(@class,'p3-single-sku-pdp__overview-product-configurable-templates-title')]")
	public WebElement CDOProductTemplateLabel;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Configure')]")
	public WebElement CDOProductConfigureLabel;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Install')]")
	public WebElement CDOProductInstallLabel;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Rail Selection')]")
	public WebElement GDOProductRailLength;
	
	@FindBy(how = How.CLASS_NAME, using = "p3-single-sku-pdp__overview-product-price-amount")
	public WebElement ProductPrice;
	
	@FindBy(how = How.CLASS_NAME, using = "p3-single-sku-pdp__overview-product-price-text")
	public WebElement ProductPriceDisclaimer;
	
	@FindBy(how = How.XPATH, using = "(//div[@id='DOOR_TYPE']//label)[1]")
	public WebElement CDORollingButton;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='H_DOOR_HEIGHT']")
	public WebElement CDODoorHeightDD;
	
	@FindBy(how = How.XPATH, using = "(//div[@data-dropdown='H_DOOR_HEIGHT']//li)[1]")
	public WebElement CDODoorHeightDDVal1;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='H_KEYWAY_SIZE']")
	public WebElement CDOKeywaySizeDD;
	
	@FindBy(how = How.XPATH, using = "(//div[@data-dropdown='H_KEYWAY_SIZE']//ul//li)[1]")
	public WebElement CDOKeywaySizeDDVal1;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='H_SHAFT_SIZE']")
	public WebElement CDOShaftSizeDD;
	
	@FindBy(how = How.XPATH, using = "(//div[@data-dropdown='H_SHAFT_SIZE']//ul//li)[1]")
	public WebElement CDOShaftSizeDDVal1;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='SAFETY_DEVICE_EYE_EDGE']")
	public WebElement CDOSafetyDeiceDD;
	
	@FindBy(how = How.XPATH, using = "(//div[@data-dropdown='SAFETY_DEVICE_EYE_EDGE']//ul//li)[1]")
	public WebElement CDOSafetyDeiceDDVal1;
	
	@FindBy(how = How.XPATH, using = "//*[@id='addToCartLayer']/div[2]/a")
	public WebElement CDOPopUPNOButton;
	
	@FindBy(how = How.ID, using = "saveToTemplateButton")
	public WebElement TemplateSaveButton;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'* Required')]")
	public WebElement SaveTemplatereqLabel;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Save Template')]")
	public WebElement SaveTemplateHeading;
	
	@FindBy(how = How.ID, using = "save-template-form__name")
	public WebElement SaveTemplateTB;
	
	@FindBy(how = How.ID, using = "save-template-form__notes")
	public WebElement SaveTemplateNotesTB;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Maximum 255 characters')]")
	public WebElement NotesTBMaxLimit;
	
	@FindBy(how = How.ID, using = "dialog-body__save-templateCancel")
	public WebElement SaveTemplateCancelButton;
	
	@FindBy(how = How.ID, using = "dialog-body__save-templateSave")
	public WebElement SaveTemplateSaveButton;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Template Saved')]")
	public WebElement TemplateToastMsg;
	
	public PDPPage(WebDriver driver) {

		this.driver = driver;
		new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(this.driver, this);
	}
}
