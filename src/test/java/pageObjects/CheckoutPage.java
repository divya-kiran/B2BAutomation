package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class CheckoutPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.ID, using = "deliveryDetailsFormSave")
	public WebElement ShippingandDeliverySaveButton;
	
	@FindBy(how = How.ID, using = "addGuestAddressButton")
	public WebElement GuestAddnewAddress;
	
	@FindBy(how = How.XPATH, using = "//select[@id='c-ct']")
	public WebElement PaymentSectionCardType;
	
	@FindBy(how = How.XPATH, using = "//div[contains(text(),'Per SB-969, the following item(s) are not available in California: 8155W. Please remove the item(s) from cart or select an address outside of California.')]")
	public WebElement NonBBUErrorMessage;
	
	@FindBy(how = How.ID, using = "c-cardnumber")
	public WebElement PaymentSectionCardNumber;
	
	@FindBy(how = How.ID, using = "c-exmth")
	public WebElement PaymentSectionExpMonth;
	
	@FindBy(how = How.ID, using = "c-exyr")
	public WebElement PaymentSectionExpYear;
	
	@FindBy(how = How.ID, using = "c-cvv")
	public WebElement PaymentSectionCVV;
	
	@FindBy(how = How.ID, using = "c-cardname")
	public WebElement PaymentSectionCardName;
	
	@FindBy(how = How.ID, using = "paymentDetailsFormSave")
	public WebElement PaymentSectionSaveButton;
	
	@FindBy(how = How.ID, using = "checkoutPlaceOrder")
	public WebElement CheckoutStickyPlaceOrderButton;
	
	@FindBy(how = How.NAME, using = "JobName")
	public WebElement ReviewDetailsJobNameTextBox;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'PO Number')]")
	public WebElement ReviewDetailsPONumberTextBox;
	
	@FindBy(how = How.NAME, using = "purchaseOrderNumber")
	public WebElement frReviewDetailsPONumberTextBox;
	
	@FindBy(how = How.XPATH, using = "//input[contains(@placeholder,'Attention of')]")
	public WebElement ReviewDetailsAttentionOfTextBox;
	
	@FindBy(how = How.NAME, using = "AttentionOf")
	public WebElement frReviewDetailsAttentionOfTextBox;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Checkout')]")
	public WebElement CheckoutPageHeader;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Caisse')]")
	public WebElement frCheckoutPageHeader;
	
	@FindBy(how = How.NAME, using = "firstName")
	public WebElement DropShipAddressFirstName;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Add drop-ship address']")
	public WebElement AddDropshipAddressLink;
	
	@FindBy(how = How.NAME, using = "lastName")
	public WebElement DropShipAddressLastName;
	
	@FindBy(how = How.XPATH, using = "//span[text()='Select Country']")
	public WebElement DropShipAddressCountryName;
	
	@FindBy(how = How.ID, using = "p3-checkout-form__manage-address-address-one")
	public WebElement DropShipAddressLine1;
	
	@FindBy(how = How.ID, using = "p3-checkout-form__manage-address-address-two")
	public WebElement DropShipAddressLine2;
	
	@FindBy(how = How.ID, using = "p3-checkout-form__manage-address-city")
	public WebElement DropShipAddressCityName;
	
	@FindBy(how = How.XPATH, using = "//input[@value='US-CA']//parent::label")
	public WebElement SelectCAState;
	
	@FindBy(how = How.CLASS_NAME, using = "p3-dropdown__button")
	public WebElement DropShipAddressStateDD;
	
	@FindBy(how = How.NAME, using = "postcode")
	public WebElement DropShipAddressPostalCode;
	
	@FindBy(how = How.ID, using = "deliveryAddressFormSave")
	public WebElement DropShipAddressSaveButton;
	
	@FindBy(how = How.ID, using = "deliveryAddressFormCancel")
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
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Shipping & Delivery')]")
	public WebElement ShippingandDeliveryHeading;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Select Ship-To Address')]")
	public WebElement SelectShipToAddLabel;
	
	@FindBy(how = How.XPATH, using = "//p[contains(.,'to add a new Ship-To address for LiftMaster approval')]")
	public WebElement MyAccountLabel;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'My Account')]")
	public WebElement MyAccountLink;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-page-checkout__ship-to-section-body'])[1]")
	public WebElement ShipToAddress1;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Select drop-ship address')]")
	public WebElement SelectDropShipLabel;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Shipping to a drop-ship address will result in a fee of 25% of the order total')]")
	public WebElement DropShipAddText;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Select Shipping Method')]")
	public WebElement SelectShippingMethodLabel;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Pro 3')]")
	public WebElement Pro3;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Pro 3')]//following-sibling::span")
	public WebElement Pro3Desc;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'See eligible states')]")
	public WebElement Pro3EligibleStates;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Two-Day Air')]")
	public WebElement TwoDayAir;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Two-Day Air')]//following-sibling::span")
	public WebElement TwoDayAirDesc;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Three-Day Air')]")
	public WebElement ThreeDayAir;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Three-Day Air')]//following-sibling::span")
	public WebElement ThreeDayAirDesc;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Ground')]//following-sibling::span")
	public WebElement GroundDesc;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Ground')]")
	public WebElement Ground;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Shipping Zone Map')]")
	public WebElement GroundShippingZone;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Common Carrier - TL')]")
	public WebElement CommonCarrierTL;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Common Carrier - TL')]//following-sibling::span")
	public WebElement CommonCarrierTLDesc;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customer Pickup')]")
	public WebElement CustomerPickUP;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Customer Pickup')]//following-sibling::span")
	public WebElement CustomerPickUPDesc;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Account Payment')]")
	public WebElement AccountPaymentLabel;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Review Order')]")
	public WebElement ReviewOrderLabel;
	
	@FindBy(how = How.XPATH, using = "//p[@class='p3-page-checkout__review-content-message']")
	public WebElement reviewContentMsg;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'LiftMaster Policies and Procedures')]")
	public WebElement reviewContentMsgLink;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Shipping from:')]")
	public WebElement ShippingFromCheckoutLabel;
	
	@FindBy(how = How.XPATH, using = "(//a[@class='p3-product__name'])[1]")
	public WebElement ProductNameCheckoutPage;
	
	@FindBy(how = How.XPATH, using = "(//p[@class='p3-product__description'])[1]")
	public WebElement ProductDescCheckoutPage;
	
	@FindBy(how = How.XPATH, using = "(//p[@class='p3-product__price'])[1]")
	public WebElement ProductEachPriceCheckoutPage;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-product__quantity'])[1]")
	public WebElement ProductQTYCheckoutPage;
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@class,'p3-product__total-price')])[1]//p[@class='p3-product__my-price']")
	public WebElement ProductTotPrice;
	
	@FindBy(how = How.ID, using = "summaryStepPlaceOrderBtn")
	public WebElement SummaryPlaceOrderBtn;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Order Total *')]")
	public WebElement OrderTotalLabel;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Order Total *')]//following-sibling::span")
	public WebElement OrderTotalPrice;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'No shipping costs or tax are included in the total')]")
	public WebElement OrderTotStickyMsg;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Back to cart')]")
	public WebElement BackToCartLink;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Billing Address')]")
	public WebElement BillingAddress;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'If your Credit Card billing address is different than your delivery address, please use this form to enter a different billing address')]")
	public WebElement BillingAddresMsg;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Enter a different billing address')]")
	public WebElement BillingAddresCheckBox;
	
	@FindBy(how = How.ID, using = "p3-checkout-form__billing-address-first-last-name")
	public WebElement BillingAddressFname;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__paymentDetailsForm_country']//div[@class='p3-dropdown__button']")
	public WebElement BillingCountryDD;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__paymentDetailsForm_country-0']//parent::label")
	public WebElement BillingAddresCountrySelect;
	
	@FindBy(how = How.ID, using = "p3-checkout-form__billing-address-address-one")
	public WebElement BillingAddLane1;
	
	@FindBy(how = How.ID, using = "p3-checkout-form__billing-address-address-two")
	public WebElement BillingAddLane2;
	
	@FindBy(how = How.ID, using = "p3-checkout-form__billing-address-city")
	public WebElement BillingAddCity;
	
	@FindBy(how = How.XPATH, using = "//div[@data-dropdown='p3-dropdown__paymentDetailsForm_region']//div[@class='p3-dropdown__button']")
	public WebElement BillingAddStateDD;
	
	@FindBy(how = How.XPATH, using = "//input[@id='p3-dropdown__paymentDetailsForm_region-0']//parent::label")
	public WebElement BillingAddStateDD1;
	
	@FindBy(how = How.ID, using = "p3-checkout-form__billing-address-zip-code")
	public WebElement BillingAddZipCode;
	
	@FindBy(how = How.ID, using = "paymentDetailsFormSave")
	public WebElement BillingAddSaveBtn;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Payment')]")
	public WebElement PaymentLabel;
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(this.driver, this);
	}
}
