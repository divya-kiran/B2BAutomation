package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class HomePage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using = "//img[contains(@alt,'My Account')]")
	public WebElement MyAccountLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Announcements')]")
	public WebElement AnnouncementsFooterLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Contact Us')]")
	public WebElement ContactUSFooterLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Partner Support') and contains (@title,'Partner Support')]")
	public WebElement PartnerSupportFooterLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'FAQ')]")
	public WebElement FAQFooterLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Legal Disclaimer')]")
	public WebElement LegalDiscFooterLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Privacy Policy') and contains(@title,'Privacy Policy')]")
	public WebElement PrivacyPolicyFooterLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Social Terms & Conditions')]")
	public WebElement SocialTermsFooterLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Policies & Procedures')]")
	public WebElement PolicyandProcedureFooterLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Terms & Conditions') and @title = 'Terms & Conditions']")
	public WebElement TermsandConditionFooterLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Do Not Sell My Personal Information')]//parent::div")
	public WebElement DonotSellMyPersonalInfoFooterLink;
	
	@FindBy(how = How.XPATH, using = "//img[contains(@alt,'YouTube')]//parent::a")
	public WebElement FooterYouTubeLink;
	
	@FindBy(how = How.XPATH, using = "//img[contains(@alt,'Facebook')]//parent::a")
	public WebElement FooterFaceboobLink;
	
	@FindBy(how = How.XPATH, using = "//img[contains(@alt,'Instagram')]//parent::a")
	public WebElement FooterInstagramLink;
	
	@FindBy(how = How.XPATH, using = "//img[contains(@alt,'Twitter')]//parent::a")
	public WebElement FooterTwitterLink;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'© 2021')]")
	public WebElement FooterCopyright;
	
	@FindBy(how = How.XPATH, using = "//img[@alt='LiftMaster']")
	public WebElement LiftMasterLogo;
	
	@FindBy(how = How.ID, using = "search")
	public WebElement HeaderSearchTextBox;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Partner Programs']")
	public WebElement PartnerProgramsMenu;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Products']//parent::a[contains(@href,'products')]")
	public WebElement ProductsMenu;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Parts']//parent::a[contains(@href,'parts')]")
	public WebElement PartsMenu;
	
	@FindBy(how = How.XPATH, using = "//span[text()='myQ Connectivity Solutions']")
	public WebElement myQconnectivitysolutionsMenu;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Resources']")
	public WebElement ResourcesMenu;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@href,'my-account/orders')]")
	public WebElement Orderstatuslink;
	
	@FindBy(how = How.XPATH, using = "//img[@alt='Order Status']//parent::a")
	public WebElement OrderstatuslinkNew;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Garage Door Opener Systems')]//parent::li")
	public WebElement HeaderGarageDoorOpenerSystemsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Commercial Door Operator Systems')]//parent::li")
	public WebElement HeaderCommercialDoorOperatorSystemsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Gate Operator Systems')]//parent::li")
	public WebElement HeaderGateDoorOperatorSystemsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Access Control Systems')]//parent::li")
	public WebElement HeaderAccessControlSystemsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'All Accessories')]//parent::li")
	public WebElement HeaderAllAccessoriesLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'My Most Ordered Products')]//parent::li")
	public WebElement HeaderMostOrderedLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Garage Door Opener Parts')]//parent::li")
	public WebElement PartsGarageDoorOpenerPartsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Commercial Door Operator Parts')]//parent::li")
	public WebElement PartsCommercialDoorPartsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Gate Operator Parts')]//parent::li")
	public WebElement PartsGateOperatorPartsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Access Control Parts')]//parent::li")
	public WebElement PartsAccessControlPartsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'All Parts')]//parent::li")
	public WebElement PartsMenuAllPartsLink;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Partner Programs')]")
	public WebElement PartnerProgramsTab;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Partner Connect')]")
	public WebElement PartnerCnctHeading;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'About Partner Connect')]")
	public WebElement AboutPconnectLink;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Partner Rewards')]")
	public WebElement PartnerRewardsHeading;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Connect to myQ & Key')]")
	public WebElement ConnectToMyQKey;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Connect to Key for Technicians')]")
	public WebElement ConnectToKeyForTech;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Partner Discounts')]")
	public WebElement PartnerDiscHeader;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Quantity Discount & Free Freight')]")
	public WebElement QAandFreeFreight;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Garage Door Opener Systems')]")
	public WebElement GDOLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Commercial Door Operator Systems')]")
	public WebElement CDOLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Gate Operator Systems')]")
	public WebElement GateOperatorsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Access Control Systems')]")
	public WebElement AccessControlSystemsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'All Accessories')]")
	public WebElement AllAccessoriesLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'My Most Ordered Products')]")
	public WebElement MostOrderedProductsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Products & Accessories Price Lists')]")
	public WebElement ProductsAndAccessoriesPriceLink;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Products')]")
	public WebElement ProductTab;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Parts')]")
	public WebElement PartsTab;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Garage Door Opener Parts')]")
	public WebElement GDOPartsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Commercial Door Operator Parts')]")
	public WebElement CDOPartsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Gate Operator Parts')]")
	public WebElement GateOperatorPartsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Access Control Parts')]")
	public WebElement AccessControlPartsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'All Parts')]")
	public WebElement AllPartsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Parts Price Lists')]")
	public WebElement PartsPriceListLink;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'myQ Connectivity Solutions')]")
	public WebElement myQConnectivitySolutionTab;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'myQ Smart Home')]")
	public WebElement myQSmartHomeLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'In-Garage Delivery')]")
	public WebElement InGarageDeliveryLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'myQ Smart Community Access')]")
	public WebElement myQSmartCommAccessLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'myQ Smart Facility Access')]")
	public WebElement myQSmartFacilityAccessLink;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Resources')]")
	public WebElement ResourcesTab;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Sales & Marketing')]")
	public WebElement SalesMarketingHeader;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Commercial Services & Solutions')]")
	public WebElement CommServiceSolutionLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Co Op Advertising Program')]")
	public WebElement CoOpAdvProgramLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'LiftMaster Merchandise & Collateral')]")
	public WebElement LiftMasterMerchandCollLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'LiftMaster Logo Downloads')]")
	public WebElement LMLogoDownloadsLink;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Technical')]")
	public WebElement TechnicalTab;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Partner Support') and @class='p3-link-external']")
	public WebElement ResourcesPartnerSupportLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Master Code Reset Utility')]")
	public WebElement MasterCodeResetUtitlityLink;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Training')]")
	public WebElement TrainingHeading;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Training Videos')]")
	public WebElement TrainingVideosLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Live and On-Demand Webinars')]")
	public WebElement LiveOnDemandWebinarsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Training Academy')]")
	public WebElement TrainingAcademyLinks;

	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Safety')]")
	public WebElement SafetyHeading;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Commercial Safety')]")
	public WebElement CommercialSafetyLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Garage Safety')]")
	public WebElement GarageSafetyLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(.,'État de la commande')]")
	public WebElement frOrderStatusLink;
	
	@FindBy(how = How.XPATH, using = "//button[contains(.,'Commande rapide')]")
	public WebElement frquickOrderLink;
	
	@FindBy(how = How.XPATH, using = "//button[contains(@class,'p3-header__navigation-cart p3-button__text miniCart')]")
	public WebElement frMiniCartFlyer;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Programmes partenaires')]")
	public WebElement frPartnerProgmTab;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Produits')]")
	public WebElement frProductsTab;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Pièces')]")
	public WebElement frPartsTab;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Ressources')]")
	public WebElement frResources;
	
	@FindBy(how = How.XPATH, using = "//a[contains(.,'Estado del pedido')]")
	public WebElement espOrderStatusLink;
	
	@FindBy(how = How.XPATH, using = "//button[contains(.,'PEDIDO RÁPIDO')]")
	public WebElement espquickOrderLink;
	
	@FindBy(how = How.XPATH, using = "//button[contains(@class,'p3-header__navigation-cart p3-button__text miniCart')]")
	public WebElement espMiniCartFlyer;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Programas de socios')]")
	public WebElement espPartnerProgmTab;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Productos')]")
	public WebElement espProductsTab;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Refacciones')]")
	public WebElement espPartsTab;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Recursos')]")
	public WebElement espResources;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
