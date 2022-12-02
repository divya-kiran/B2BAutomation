package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class LoginPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.NAME, using = "j_username")
	public WebElement userName;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Do not show again')]")
	public WebElement acceptBrowser;
	
	@FindBy(how = How.NAME, using = "j_password")
	public WebElement password;
	
	@FindBy(how = How.ID, using = "loginFormSave")
	public WebElement signinButton;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Partner Account Sign In')]")
	public WebElement PartnerAccountSignInHeader;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Connexion au compte partenaire')]")
	public WebElement PartnerAccountSignInHeaderfr;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Inicio de sesión de cuenta de socio')]")
	public WebElement PartnerAccountSignInHeaderesp;
	
	@FindBy(how = How.XPATH, using = "//button[@class='p3-authentication__header-language-select-toggle']")
	public WebElement LanguageSelector;
	
	@FindBy(how = How.XPATH, using = "//input[@id='lang-selection-text-en']//parent::label")
	public WebElement EnglishLang;
	
	@FindBy(how = How.XPATH, using = "//input[@id='lang-selection-text-fr']//parent::label")
	public WebElement FrenchLang;
	
	@FindBy(how = How.XPATH, using = "//input[@id='lang-selection-text-es']//parent::label")
	public WebElement SpanishLang;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Remember me')]")
	public WebElement RememberMeCheckBox;
	
	@FindBy(how = How.ID, using = "openForgotPasswordDialogBtn")
	public WebElement ForgotPasswordButton;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Forgot password?')]")
	public WebElement ForgotPwdPopupHeader;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Forgot password?')]//following-sibling::span[contains(text(),'* Required')]")
	public WebElement ForgotPwdPopupReqLabel;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Please enter the email address for your account. A link to change your password will be emailed to you')]")
	public WebElement ForgotPwdPopupText;
	
	@FindBy(how = How.ID, using = "forgottenPwdEmail")
	public WebElement EmailAdd;
	
	@FindBy(how = How.ID, using = "forgottenPwdFormSave")
	public WebElement ForgotPwdSendEmailBtn;
	
	@FindBy(how = How.ID, using = "forgottenPwdFormClose")
	public WebElement ForgotPwdCancelBtn;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Don’t have an account?')]")
	public WebElement DontHaveAccountLabel;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign up now')]")
	public WebElement SignUpLink;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Sign up for the LiftMaster Partner Portal')]")
	public WebElement RegisterSplashPageHeading;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Does your company already have a LiftMaster partner account')]")
	public WebElement RegisterSplashPageLabel;
	
	@FindBy(how = How.XPATH, using = "//strong[contains(text(),'I know')]")
	public WebElement IKnowbtn;
	
	@FindBy(how = How.XPATH, using = "//strong[contains(text(),'I don')]")
	public WebElement IdontKnowbtn;
	
	@FindBy(how = How.XPATH, using = "//li[@class = 'p3-registration-splash__item']//a[strong = 'Create Guest Account']")
	public WebElement GuestRegBtn;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Partner Account Sign up')]")
	public WebElement RegisterPageHeader;
	
	@FindBy(how = How.NAME, using = "accountNumber")
	public WebElement AccountNumberTB;
	
	@FindBy(how = How.NAME, using = "companyAddressPostalCode")
	public WebElement PostalCodeTB;
	
	@FindBy(how = How.NAME, using = "name")
	public WebElement FNameandLName;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__registrationForm_position']//div[@class='p3-dropdown__button']")
	public WebElement PositionDD;
	
	@FindBy(how = How.XPATH, using = "//input[@value='b2bposition_owner']//parent::label")
	public WebElement PositionDDOwnerVal;
	
	@FindBy(how = How.XPATH, using = "//input[@value='b2bposition_purchasing']//parent::label")
	public WebElement PositionDDPurchasingVal;
	
	@FindBy(how = How.XPATH, using = "//input[@value='b2bposition_sales']//parent::label")
	public WebElement PositionDDSalesVal;
	
	@FindBy(how = How.XPATH, using = "//input[@value='b2bposition_branch']//parent::label")
	public WebElement PositionDDBranchVal;
	
	@FindBy(how = How.XPATH, using = "//input[@value='b2bposition_marketing']//parent::label")
	public WebElement PositionDDMarketingVal;
	
	@FindBy(how = How.XPATH, using = "//input[@value='b2bposition_service']//parent::label")
	public WebElement PositionDDServiceVal;
	
	@FindBy(how = How.XPATH, using = "//input[@value='b2bposition_tech']//parent::label")
	public WebElement PositionDDTechVal;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__registrationForm_country']//div[@class='p3-dropdown__button']")
	public WebElement CountryDD;
	
	@FindBy(how = How.XPATH, using = "//input[@value='US']//parent::label")
	public WebElement CountryDDUSVal;
	
	@FindBy(how = How.NAME, using = "phone")
	public WebElement PrimaryPhoneTB;
	
	@FindBy(how = How.NAME, using = "cellphone")
	public WebElement SecondaryPhnTB;
	
	@FindBy(how = How.NAME, using = "email")
	public WebElement EmailAddTB;
	
	@FindBy(how = How.NAME, using = "emailConfirmation")
	public WebElement EmailConfTB;
	
	@FindBy(how = How.NAME, using = "password")
	public WebElement PasswordTB;
	
	@FindBy(how = How.NAME, using = "passwordConfirmation")
	public WebElement ConfirmPwbTB;
	
	@FindBy(how = How.ID, using = "recaptcha-accessible-status")
	public WebElement ReCaptcha;
	
	@FindBy(how = How.ID, using = "cancelRegistrationForm")
	public WebElement RegFormCancelBtn;
	
	@FindBy(how = How.ID, using = "registerFormSave")
	public WebElement RegFormSignUPBtn;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Request Access')]")
	public WebElement RequestAccessPopUP;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Please contact your Business Owner to request access or to learn your company') and contains(text(),'s 6-digit account number')]")
	public WebElement RequestAccessPopUPText;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Guest Registration')]")
	public WebElement GuestRegHeading;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Guest Registration')]//following-sibling::span[contains(text(),'* Required')]")
	public WebElement GuestRegReqLabel;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Please fill in the information below to register for the LiftMaster Partner Portal')]")
	public WebElement GuestRegLabel;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'m interested in becoming a LiftMaster partner. Please check this box if you') and contains(text(),'d like our Sales team to reach out to you')]")
	public WebElement GuestRegInterestedMsg;
	
	@FindBy(how = How.NAME, using = "company")
	public WebElement BusinessNameTB;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__guestRegistrationForm_country']//div[@class='p3-dropdown__button']")
	public WebElement GuestCountryDD;
	
	@FindBy(how = How.NAME, using = "line1")
	public WebElement GuestLine1TB;
	
	@FindBy(how = How.NAME, using = "line2")
	public WebElement GuestLine2TB;
	
	@FindBy(how = How.NAME, using = "townCity")
	public WebElement GuestCityTB;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__guestRegistrationForm_state']//div[@class='p3-dropdown__button']")
	public WebElement GuestStateDD;
	
	@FindBy(how = How.XPATH, using = "//input[@value='US-AZ']//parent::label")
	public WebElement GuestStateDDVal;
	
	@FindBy(how = How.NAME, using = "postcode")
	public WebElement GuestPostCodeTB;
	
	@FindBy(how = How.ID, using = "cancelRegistrationForm")
	public WebElement GuestCancelBtn;
	
	@FindBy(how = How.ID, using = "registerFormSave")
	public WebElement GuestSaveBtn;
				
	@FindBy(how = How.NAME, using = "cellPhone")
	public WebElement GuestSecondaryPhnTB;
	/*
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;
	
	@FindBy(how = How.XPATH, using = "")
	public WebElement ;*/
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
