package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class ProfilePage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Name & contact information saved')]")
	public WebElement ToastMsgNameandContact;

	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Password Updated')]")
	public WebElement ToastMsgPassword;
	
	@FindBy(how = How.XPATH, using = "//div[contains(.,'Name is too long')]")
	public WebElement ToastMsgLongName;
	
	@FindBy(how = How.XPATH, using = "//div[contains(.,'Invalid phone number')]")
	public WebElement ToastMsgPriPhoneNum;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Sold-To information submitted to Liftmaster for approval.')]")
	public WebElement ToastMsgSoldToAccount;
	
	@FindBy(how = How.XPATH, using = "//p[text()='Ship-To information submitted to Liftmaster for approval.']")
	public WebElement ToastMsgEditShipToAccount;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Invitation Sent')]")
	public WebElement ToastMsgInvitation;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Invalid phone number')]")
	public WebElement ErrorMsgInvalidPhnNum;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Name is too long')]")
	public WebElement ErrorMsgLongName;
	
	@FindBy(how = How.XPATH, using = "//span[contains(.,'Wrong Password')]")
	public WebElement ErrorMsgWrongPass;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Medium Security')]")
	public WebElement ErrorMsgMedSec;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Weak Security')]")
	public WebElement ErrorMsgWeakSec;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Strong Security')]")
	public WebElement ErrorMsgStrongSec;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Passwords do not match')]")
	public WebElement ErrorMsgPassDonotMatch;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Passwords do match')]")
	public WebElement ErrorMsgPassDoMatch;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Too Short')]")
	public WebElement ErrorMsgTooShort;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__addShipToAddressForm_country']//input[@value='US']//parent::label")
	public WebElement CountryAddNewshipto;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Name & Contact')]")
	public WebElement NameandContactHeading;

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Profile')]")
	public WebElement ProfileHeading;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'First and Last Name*')]")
	public WebElement FirstNameAndLastNameLabel;

	@FindBy(how = How.ID, using = "account-form__name")
	public WebElement FirstNameAndLastNameTextBox;
	
	@FindBy(how = How.XPATH, using = "//input[@id='account-form__name']//parent::label//span[contains(text(),'Required')]")
	public WebElement FirstNameAndLastNameReqMsg;

	@FindBy(how = How.ID, using = "account-form__company")
	public WebElement CompanyNameTB;
	
	@FindBy(how = How.XPATH, using = "//input[@id='account-form__company']//following-sibling::span")
	public WebElement CompanyNameLabel;

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Position')]")
	public WebElement PositionLabel;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__account-form-position']//div")
	public WebElement PositionDD;

	@FindBy(how = How.XPATH, using = "(//div[@data-dropdown='p3-dropdown__account-form-position']//ul//li)[1]")
	public WebElement PositionDD1;
	
	@FindBy(how = How.XPATH, using = "(//div[@data-dropdown='p3-dropdown__account-form-position']//ul//li)[2]")
	public WebElement PositionDD2;

	@FindBy(how = How.XPATH, using = "(//div[@data-dropdown='p3-dropdown__account-form-position']//ul//li)[3]")
	public WebElement PositionDD3;
	
	@FindBy(how = How.XPATH, using = "(//div[@data-dropdown='p3-dropdown__account-form-position']//ul//li)[4]")
	public WebElement PositionDD4;

	@FindBy(how = How.XPATH, using = "(//div[@data-dropdown='p3-dropdown__account-form-position']//ul//li)[5]")
	public WebElement PositionDD5;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Primary Phone*')]")
	public WebElement PrimaryPhoneLabel;

	@FindBy(how = How.ID, using = "account-form__primary-phone")
	public WebElement PrimaryPhoneTB;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Secondary Phone')]")
	public WebElement SecondaryPhoneLabel;

	@FindBy(how = How.ID, using = "account-form__secondary-phone")
	public WebElement SecondaryPhoneTB;
	
	@FindBy(how = How.ID, using = "myAccountProfileFormCancel")
	public WebElement ProfileCancelButton;

	@FindBy(how = How.ID, using = "myAccountProfileFormSave")
	public WebElement ProfileSaveButton;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Name & Contact')]//following-sibling::p[contains(text(),'*Required')]")
	public WebElement NameandcontactRequiredLabel;

	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Update Password')]//following-sibling::p[contains(text(),'* Required')]")
	public WebElement UpdatePassReqLabel;
	
	@FindBy(how = How.ID, using = "updatePasswordForm__old-password")
	public WebElement OldPasswordTB;

	@FindBy(how = How.ID, using = "updatePasswordForm__new-password")
	public WebElement NewPasswordTB;
	
	@FindBy(how = How.ID, using = "updatePasswordForm__confirm-new-password")
	public WebElement ConfirmNewPasswordTB;

	@FindBy(how = How.ID, using = "updatePasswordFormCancel")
	public WebElement UpdatePasswordCancelButton;
	
	@FindBy(how = How.ID, using = "updatePasswordFormSave")
	public WebElement UpdatePassSaveButton;

	@FindBy(how = How.ID, using = "communicationPreferencesLink")
	public WebElement CommunicationPrefLink;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Communication Preferences')]")
	public WebElement CommunicationPrefHeading;
	
	@FindBy(how = How.XPATH, using = "//iframe[contains(@src,'emailPreference')]")
	public WebElement CommunicationPrefiFrame;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Sold To')]//following-sibling::p")
	public WebElement SoldToReqLabel;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'Partner ID')]")
	public WebElement SoldToDealerLabel;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'Partner ID')]//following-sibling::p")
	public WebElement SoldToDealerIDVal;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'Customer Number')]")
	public WebElement SoldToCustomerNumberLabel;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'Customer Number')]//following-sibling::p")
	public WebElement SoldToCustomerNumberVal;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'Company Name')]")
	public WebElement SoldToCompanyNameLabel;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'Company Name')]//following-sibling::p")
	public WebElement SoldToCompanyNameVal;
	
	@FindBy(how = How.ID, using = "account-form__company-name")
	public WebElement SoldToCompanyNameTB;

	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'Address 1')]")
	public WebElement SoldToAddressLabel;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'Address 1')]//following-sibling::p")
	public WebElement SoldToAddressVal;
	
	@FindBy(how = How.ID, using = "account-form__address-1")
	public WebElement SoldToAddressTB;
	
	@FindBy(how = How.XPATH, using = "//form[@id='soldToAddressForm']//input[@placeholder='Address 1*']//parent::label//span[contains(text(),'Required')]")
	public WebElement SoldToAddressReqLabel;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'Address 2')]")
	public WebElement SoldToAddress2Label;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'City')]")
	public WebElement SoldToCityLabel;

	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'City')]//following-sibling::p")
	public WebElement SoldToCityVal;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'Country')]")
	public WebElement SoldToCountryLabel;

	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'Country')]//following-sibling::p")
	public WebElement SoldToCountryVal;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'Zip Code')]")
	public WebElement SoldToZipCodeLabel;

	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'Zip Code')]//following-sibling::p")
	public WebElement SoldToZipCodeVal;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'State')]")
	public WebElement SoldToStateLabel;

	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__sold-to-view']//p[contains(text(),'State')]//following-sibling::p")
	public WebElement SoldToStateVal;
	
	@FindBy(how = How.ID, using = "soldToAddressFormCancel")
	public WebElement SoldToCancelButton;

	@FindBy(how = How.ID, using = "soldToAddressFormSave")
	public WebElement SoldToSaveButton;
	
	@FindBy(how = How.XPATH, using = "//button[@data-dialog='ship-to-add']")
	public WebElement NewShipToAddButton;

	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__company-info-ship-to-view']//p[contains(text(),'Ship-to Number')]")
	public WebElement ShipToNumberLabel;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__company-info-ship-to-view']//p[contains(text(),'Ship-to Number')]//following-sibling::p")
	public WebElement ShipToNumberVal;

	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__company-info-ship-to-view']//p[contains(text(),'Partner ID')]")
	public WebElement ShipToDealerExtLabel;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__company-info-ship-to-view']//p[contains(text(),'Partner ID')]//following-sibling::p")
	public WebElement ShipToDealerExtVal;

	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__company-info-ship-to-view']//p[contains(text(),'Company Name')]")
	public WebElement ShipToCompNameLabel;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__company-info-ship-to-view']//p[contains(text(),'Company Name')]//following-sibling::p")
	public WebElement ShipToCompNameVal;

	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__company-info-ship-to-view']//p[contains(text(),'State')]")
	public WebElement ShipToStateLabel;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__company-info-ship-to-view']//p[contains(text(),'State')]//following-sibling::p")
	public WebElement ShipToStateVal;
	
	@FindBy(how = How.XPATH, using = "//h1[text()='Edit Ship-To Address']")
	public WebElement EditShipToHeading;

	@FindBy(how = How.XPATH, using = "//h1[text()='Edit Ship-To Address']//following-sibling::p[text()='* Required']")
	public WebElement EditShipToReqLabel;
	
	@FindBy(how = How.XPATH, using = "//div[@id='dialog-body__ship-to-edit']//p[contains(text(),'Ship-to Number')]")
	public WebElement EditShipToNumberLabel;

	@FindBy(how = How.XPATH, using = "//div[@id='dialog-body__ship-to-edit']//p[contains(text(),'Ship-to Number')]//following-sibling::p")
	public WebElement EditShipToNumberVal;
	
	@FindBy(how = How.XPATH, using = "//div[@id='dialog-body__ship-to-edit']//p[contains(text(),'Partner ID')]//following-sibling::p")
	public WebElement EditDealerExtIDVal;

	@FindBy(how = How.XPATH, using = "//div[@id='dialog-body__ship-to-edit']//p[contains(text(),'Partner ID')]")
	public WebElement EditDealerExtIDLabel;
	
	@FindBy(how = How.XPATH, using = "//form[@id='editShipToAddressForm']//span[contains(text(),'Company Name*')]")
	public WebElement EditShipToCompNameLabel;

	@FindBy(how = How.XPATH, using = "//form[@id='editShipToAddressForm']//input[@placeholder='Company Name*']")
	public WebElement EditShipToCompNameVal;
	
	@FindBy(how = How.XPATH, using = "//form[@id='editShipToAddressForm']//input[@placeholder='Address 1*']")
	public WebElement EditShipToAddressVal;

	@FindBy(how = How.XPATH, using = "//form[@id='editShipToAddressForm']//span[contains(text(),'Address 1*')]")
	public WebElement EditShipToAddressLabel;
	
	@FindBy(how = How.XPATH, using = "//form[@id='editShipToAddressForm']//span[contains(text(),'City')]")
	public WebElement EditShipToCityLabel;

	@FindBy(how = How.XPATH, using = "//form[@id='editShipToAddressForm']//input[@id='add-ship-to-form__city']")
	public WebElement EditShipToCityVal;
	
	@FindBy(how = How.XPATH, using = "//form[@id='editShipToAddressForm']//input[@id='add-ship-to-form__city']")
	public WebElement EditShipToCityTB;
	
	@FindBy(how = How.XPATH, using = "//form[@id='editShipToAddressForm']//span[contains(text(),'State*')]")
	public WebElement EditShipToStateLabel;

	@FindBy(how = How.XPATH, using = "//form[@id='editShipToAddressForm']//input[@value='US-AZ']//parent::label")
	public WebElement EditShipToStateVal;
	
	@FindBy(how = How.XPATH, using = "//form[@id='editShipToAddressForm']//span[contains(text(),'Zip Code*')]")
	public WebElement EditShipToZipCodeLabel;

	@FindBy(how = How.XPATH, using = "//form[@id='editShipToAddressForm']//input[@id='add-ship-to-form__zip']")
	public WebElement EditShipToZipCodeVal;
	
	@FindBy(how = How.XPATH, using = "//button[@class='p3-button__icon p3-account__company-info-ship-to-edit-button']")
	public WebElement EditShipToPencilIcon;
	
	@FindBy(how = How.ID, using = "editShipToAddressFormCancel")
	public WebElement EditShipToCancelButton;

	@FindBy(how = How.ID, using = "editShipToAddressFormSave")
	public WebElement EditShipToAddButton;
	
	@FindBy(how = How.XPATH, using = "//h1[text()='Add Ship-To Address']")
	public WebElement AddShipToHeading;
	
	@FindBy(how = How.XPATH, using = "//button[text()='Add']")
	public WebElement AddNewShipToButton;
	
	@FindBy(how = How.XPATH, using = "//h1[text()='Add Ship-To Address']//following-sibling::p[text()='* Required']")
	public WebElement AddShipToReqLabel;
	
	@FindBy(how = How.XPATH, using = "//form[@id='addShipToAddressForm']//span[contains(text(),'Company Name*')]")
	public WebElement AddShipToCompNameLabel;

	@FindBy(how = How.XPATH, using = "//form[@id='addShipToAddressForm']//input[@placeholder='Company Name*']")
	public WebElement addShipToCompNameVal;
	
	@FindBy(how = How.XPATH, using = "//form[@id='addShipToAddressForm']//input[@placeholder='Address 1*']")
	public WebElement addShipToAddressVal;

	@FindBy(how = How.XPATH, using = "//form[@id='addShipToAddressForm']//span[contains(text(),'Address 1*')]")
	public WebElement addShipToAddressLabel;
	
	@FindBy(how = How.XPATH, using = "//form[@id='addShipToAddressForm']//span[contains(text(),'City')]")
	public WebElement addShipToCityLabel;

	@FindBy(how = How.XPATH, using = "//form[@id='addShipToAddressForm']//input[@id='add-ship-to-form__city']")
	public WebElement addShipToCityVal;
	
	@FindBy(how = How.XPATH, using = "//form[@id='addShipToAddressForm']//span[contains(text(),'State*')]")
	public WebElement addShipToStateLabel;

	@FindBy(how = How.XPATH, using = "//form[@id='addShipToAddressForm']//input[@value='US-AZ']//parent::label")
	public WebElement addShipToStateVal;
	
	@FindBy(how = How.XPATH, using = "//form[@id='addShipToAddressForm']//span[contains(text(),'Zip Code*')]")
	public WebElement addShipToZipCodeLabel;

	@FindBy(how = How.XPATH, using = "//form[@id='addShipToAddressForm']//input[@id='add-ship-to-form__zip']")
	public WebElement addShipToZipCodeVal;
	
	@FindBy(how = How.XPATH, using = "//form[@id='addShipToAddressForm']//span[contains(text(),'Country*')]")
	public WebElement addShipToCountryLabel;

	@FindBy(how = How.XPATH, using = "//form[@id='addShipToAddressForm']//input[@value='US']//parent::label")
	public WebElement addShipToCountryVal;
	
	@FindBy(how = How.ID, using = "addShipToAddressFormCancel")
	public WebElement addShipToCancelButton;

	@FindBy(how = How.ID, using = "addShipToAddressFormSave")
	public WebElement addShipToAddButton;
	
	@FindBy(how = How.XPATH, using = "(//li[contains(@class,'p3-account__manage-users-user p3-account__card pageable-item')])[1]")
	public WebElement ManageUser1;

	@FindBy(how = How.XPATH, using = "(//li[contains(@class,'p3-account__manage-users-user p3-account__card pageable-item')]//p[contains(text(),'Email')])[1]")
	public WebElement ManageUserEmail;
	
	@FindBy(how = How.XPATH, using = "(//li[contains(@class,'p3-account__manage-users-user p3-account__card pageable-item')]//p[contains(text(),'Access Rights')])[1]")
	public WebElement ManageUserAccessRights;

	@FindBy(how = How.XPATH, using = "(//li[contains(@class,'p3-account__manage-users-user p3-account__card pageable-item')]//p[contains(text(),'Status')])[1]")
	public WebElement ManageUserStatus;
	
	@FindBy(how = How.XPATH, using = "(//li[contains(@class,'p3-account__manage-users-user p3-account__card pageable-item')]//button)[1]")
	public WebElement ManageUserEditButton;

	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Edit User')]")
	public WebElement ManageUserPopUPHeading;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Edit User')]//following-sibling::p[contains(text(),'* Required')]")
	public WebElement ManageUserReqLabel;
	
	@FindBy(how = How.XPATH, using = "//input[@id='edit-user-form__email']//following-sibling::span[contains(text(),'Email Address*')]")
	public WebElement ManageUserEmailAddLabel;

	@FindBy(how = How.ID, using = "edit-user-form__email")
	public WebElement ManageUserEmailAddTB;
	
	@FindBy(how = How.ID, using = "edit-user-form__phone")
	public WebElement ManageUserPhoneTB;
	
	@FindBy(how = How.XPATH, using = "//input[@id='edit-user-form__phone']//following-sibling::span[contains(text(),'Phone*')]")
	public WebElement ManageUserPhoneLabel;

	@FindBy(how = How.XPATH, using = "//div[@id='editUserStatusActiveSection']//span")
	public WebElement ManageUserActiveStatus;
	
	@FindBy(how = How.XPATH, using = "//div[@id='editUserStatusActiveSection']//button")
	public WebElement ManageUserDeactivateButton;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__edit-user-row']//p[contains(text(),'Password')]")
	public WebElement ManageUserPasswordLbl;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Reset')]")
	public WebElement ManageUserResetButton;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__edit-user-row']//p[contains(text(),'Role*')]")
	public WebElement ManageUserRole;
	
	@FindBy(how = How.XPATH, using = "//input[@value='b2badmingroup' and  @id='manageUserForm_role_0']")
	public WebElement ManageUserCompanyAdminCheckBox;

	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__manageUserForm_role']//div[@class='p3-dropdown__button']//strong[contains(text(),'Company Administrator')]")
	public WebElement ManageUserCompanySelectAdmText;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__manageUserForm_role']//span[@class='p3-dropdown__item-content']//strong[contains(text(),'Company Employee') and not (contains(text(),'Diagnostics'))]")
	public WebElement ManageUserCompanyEmpText;
	
	@FindBy(how = How.XPATH, using = "//input[@value='b2bcustomergroup' and  @id='manageUserForm_role_1']")
	public WebElement ManageUserCompanyEmpCheckBox;

	@FindBy(how = How.XPATH, using = "//input[@value='DIAGNOSTICS_DEALER' and  @id='manageUserForm_role_2']")
	public WebElement ManageUserDiagCheckBox;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__manageUserForm_role']//span[@class='p3-dropdown__item-content']//strong[contains(text(),'Company Employee with Diagnostics')]")
	public WebElement ManageUserDiagText;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__edit-user-row']//p[contains(text(),'Access Rights*')]")
	public WebElement ManageUserAccessRightsLbl;

	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__manageUserForm_accessRights']//div[@class='p3-dropdown__button']")
	public WebElement ManageUserAccessRightsDD;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__manageUserForm_role']//div[@class='p3-dropdown__button']")
	public WebElement ManageUserAccessRolesDD;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__manageUserForm_accessRights-0' and @value='fullAccess']")
	public WebElement ManageUserAccessRightsDDFullaccess;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__manageUserForm_accessRights-1' and @value='noOrdering']//parent::label//parent::li")
	public WebElement MUAccessRightsDDNoOrderingwithlimitedpricing;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__manageUserForm_accessRights-2' and @value='noOrderingOrPricing']//parent::label//parent::li")
	public WebElement MUAccessRightsDDNoOrderingorpricing;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__manageUserForm_accessRights-3' and @value='noOrderingWithPricing']//parent::label//parent::li")
	public WebElement MUAccessRightsDDNoOrderingwithpricing;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Position*')]")
	public WebElement ManageUserPositionLbl;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__manageUserForm_position']//div[@class='p3-dropdown__button']")
	public WebElement ManageUserPositionDD;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__manageUserForm_position-1' and @value='b2bposition_purchasing']//parent::label")
	public WebElement ManageUserPositionDDPurchDirector;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__manageUserForm_position-2' and @value='b2bposition_sales']//parent::label")
	public WebElement ManageUserPositionDDSalesVP;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__manageUserForm_position-3' and @value='b2bposition_branch']//parent::label")
	public WebElement ManageUserPositionDDBranch;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__manageUserForm_position-4' and @value='b2bposition_marketing']//parent::label")
	public WebElement ManageUserPositionDDMarketing;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__manageUserForm_position-5' and @value='b2bposition_service']//parent::label")
	public WebElement ManageUserPositionDDService;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__manageUserForm_position-6' and @value='b2bposition_tech']//parent::label")
	public WebElement ManageUserPositionDDTech;
	
	@FindBy(how = How.ID, using = "manageUserFormCancel")
	public WebElement ManageUserCancelButton;
	
	@FindBy(how = How.ID, using = "manageUserFormSave")
	public WebElement ManageUserSaveButton;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Deactivate User?')]")
	public WebElement ManageUserDeactiveUserHeading;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Doing this will prevent customer')]")
	public WebElement ManageUserDeactiveUserText;
	
	@FindBy(how = How.XPATH, using = "//div[@id='dialog-body__deactivate-user']//button[contains(text(),'Deactivate')]")
	public WebElement ManageUserDeactivateWindowButton;
	
	@FindBy(how = How.XPATH, using = "//div[@id='dialog-body__deactivate-user']//button[contains(text(),'Cancel')]")
	public WebElement ManageUserDeactivateWindowCancelButton;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Reset Password')]")
	public WebElement ManageUserResetPassword;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Reset Password')]//following-sibling::p")
	public WebElement ManageUserResetPasswordReqLbl;
	
	@FindBy(how = How.ID, using = "account-edit-user-form__new-password")
	public WebElement ManageUserNewPassword;
	
	@FindBy(how = How.ID, using = "account-edit-user-form__confirm-new-password")
	public WebElement ManageUserConfirmNewPassword;
	
	@FindBy(how = How.ID, using = "customerResetPasswordFormClose")
	public WebElement ManageUserResetPWDCancelButton;
	
	@FindBy(how = How.ID, using = "customerResetPasswordFormSave")
	public WebElement ManageUserResetPWDUpdateButton;

	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Invitations')]//following-sibling::p")
	public WebElement Invitationsrecordcount;
	
	@FindBy(how = How.XPATH, using = "(//li[@class='p3-account__invitation p3-account__card pageable-item '])[1]")
	public WebElement Invitationcard1;
	
	@FindBy(how = How.XPATH, using = "(//li[@class='p3-account__invitation p3-account__card pageable-item '])[1]//p[contains(text(),'Email')]")
	public WebElement InvitationcardEmail;
	
	@FindBy(how = How.XPATH, using = "(//li[@class='p3-account__invitation p3-account__card pageable-item '])[1]//p[contains(text(),'Role')]")
	public WebElement InvitationcardRole;
	
	@FindBy(how = How.XPATH, using = "(//li[@class='p3-account__invitation p3-account__card pageable-item '])[1]//p[contains(text(),'Status')]")
	public WebElement InvitationcardStatus;
	
	@FindBy(how = How.XPATH, using = "(//li[@class='p3-account__invitation p3-account__card pageable-item '])[1]//button[@class='p3-button__icon p3-account__invitation-remove-button']")
	public WebElement InvitationcardDelButton;
	
	@FindBy(how = How.XPATH, using = "//section[@class='p3-account__invitations']//button[contains(text(),'Invite')]")
	public WebElement InviteButton;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Invite User')]")
	public WebElement InviteUserheading;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Invite User')]//following-sibling::p[contains(text(),'* Required')]")
	public WebElement InviteUserReqLabel;
	
	@FindBy(how = How.XPATH, using = "//input[@id='invite-user-form__email']//following-sibling::span[contains(text(),'Email Address*')]")
	public WebElement InviteUserEmailAddLabel;

	@FindBy(how = How.ID, using = "invite-user-form__email")
	public WebElement InviteUserEmailAddTB;
	
	@FindBy(how = How.ID, using = "invite-user-form__email-confirm")
	public WebElement InviteUserConfEmailAddTB;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Account*')]")
	public WebElement InviteUserAccount;

	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Account*')]//parent::div//following-sibling::div")
	public WebElement InviteUserAccountInfo;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Role*')]")
	public WebElement InviteUserRole;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__issueInvitationForm_role']//div[@class='p3-dropdown__button']")
	public WebElement InviteUserRoleDD;

	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__issueInvitationForm_role-0' and @value='b2badmingroup']//parent::label")
	public WebElement InviteUserRoleDDCompAdmin;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__issueInvitationForm_role']//div[@class='p3-dropdown__button']//strong[contains(text(),'Company Employee') and not (contains(text(),'Diagnostics'))]")
	public WebElement InviteUserRoleDDCompEmp;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__issueInvitationForm_role-1' and @value='DIAGNOSTICS_DEALER']//parent::label")
	public WebElement InviteUserRoleDDDiag;

	@FindBy(how = How.XPATH, using = "//div[@class='p3-account__invite-user-row']//p[contains(text(),'Access Rights*')]")
	public WebElement InviteUserAccessRights;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__issueInvitationForm_accessRights']//div")
	public WebElement InviteUserAccessRightsDD;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__issueInvitationForm_accessRights-0' and @value='fullAccess']//parent::label//parent::li")
	public WebElement InviteUserAccessRightsFullaccess;

	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__issueInvitationForm_accessRights-1' and @value='noOrdering']//parent::label//parent::li")
	public WebElement InviteUserAccessRightsNoorderwithLimPricing;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__issueInvitationForm_accessRights-2' and @value='noOrderingOrPricing']//parent::label//parent::li")
	public WebElement InviteUserAccessRightsNoorderorPricing;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__issueInvitationForm_accessRights-3' and @value='noOrderingWithPricing']//parent::label//parent::li")
	public WebElement InviteUserAccessRightsNoorderWithPricing;

	@FindBy(how = How.ID, using = "issueInvitationFormCancel")
	public WebElement InviteUserCancelButton;
	
	@FindBy(how = How.ID, using = "issueInvitationFormSave")
	public WebElement InviteUserInviteButton;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'My Sales Rep')]")
	public WebElement SalesRepHeading;
	
	@FindBy(how = How.XPATH, using = "//section[contains(@id,'p3-all__sales-rep')]//div[1]")
	public WebElement SalesRepName;
	
	@FindBy(how = How.XPATH, using = "//section[contains(@id,'p3-all__sales-rep')]//div[2]//a")
	public WebElement SalesRepemailID;
	
	@FindBy(how = How.XPATH, using = "//section[contains(@id,'p3-all__sales-rep')]//div[3]")
	public WebElement SalesRepMobNum;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Update Password')]")
	public WebElement UpdatePasswordHeading;

	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Company Information')]")
	public WebElement CompanyInfoHeading;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Sold To')]")
	public WebElement SoldToHeading;

	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Ship To')]")
	public WebElement ShipToHeading;
	
	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Manage Users')]")
	public WebElement ManageUsersHeading;

	@FindBy(how = How.XPATH, using = "//h3[contains(text(),'Invitations')]")
	public WebElement InvitationHeadings;
	
	public ProfilePage(WebDriver driver) {
		this.driver = driver;
		new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(this.driver, this);
	}
}
