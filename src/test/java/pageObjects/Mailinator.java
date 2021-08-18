package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class Mailinator extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Remove Item(s) & Continue Shopping')]")
	public WebElement RemoveItemsContinueShopping;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Remove Item(s) & View Cart')]")
	public WebElement RemoveItemsViewCart;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'FOLLOWING ITEMS ARE NOT AVAILABLE IN CALIFORNIA')]")
	public WebElement NonBBUModalHeader;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Non-battery backup openers are not available for sale or installation in California on or after July 1, 2019 per SB-969.')]")
	public WebElement NonBBUModalStaticText;
	
	@FindBy(how = How.XPATH, using = "(//p[contains(@class,'p3-dialog__item-name')]//parent::li)[1]")
	public WebElement NonBBUModalProductImage;
	
	@FindBy(how = How.XPATH, using = "(//p[contains(@class,'p3-dialog__item-name')]//parent::li)[2]")
	public WebElement NonBBUModalProductImage2;
	
	@FindBy(how = How.CLASS_NAME, using = "p3-page-cart__order-details-checkout-message")
	public WebElement CartPageCheckOutMessage;
	
	@FindBy(how = How.CLASS_NAME, using = "p3-page-cart__promo-code-title")
	public WebElement CartPagePromoCodeTitle;
	
	@FindBy(how = How.ID, using = "p3-input__promo-code")
	public WebElement CartPagePromoCodeTexBox;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Clear Cart')]")
	public WebElement CartPageClearCartPopUPButton;
	
	@FindBy(how = How.XPATH, using = "//button[contains(@class,'p3-button__primary p3-page-cart__promo-apply-btn')]")
	public WebElement CartPagePromoCodeApplyButton;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Checkout')]")
	public WebElement CartPageCheckoutButton;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Continue shopping')]")
	public WebElement CartPageContinueshoppingLink;
	
	@FindBy(how = How.XPATH, using = "//button[contains(@data-dialog,'save-cart')]")
	public WebElement CartPageSavecartIcon;
	
	@FindBy(how = How.XPATH, using = "//button[contains(@data-dialog,'clear-cart')]")
	public WebElement CartPageClearcartIcon;
	
	@FindBy(how = How.XPATH, using = "(//p[contains(@class,'p3-product__total-price')])[1]")
	public WebElement CartPageProductPriceTot1;
	
	@FindBy(how = How.XPATH, using = "(//button[contains(@class,'p3-product__button-remove')])[1]")
	public WebElement CartPageProductDelIcon1;
	
	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'p3-product__quantity-input')])[1]")
	public WebElement CartPageProductQTYBox1;
	
	@FindBy(how = How.XPATH, using = "(//a[contains(@class,'p3-product__name')])[1]")
	public WebElement CartPageProductName1;
	
	@FindBy(how = How.XPATH, using = "(//p[contains(@class,'p3-product__price')])[1]")
	public WebElement CartPageEachProdPrice1;
	
	@FindBy(how = How.XPATH, using = "(//p[contains(@class,'p3-product__description')])[1]")
	public WebElement CartPageEachProdSummary1;
	
	@FindBy(how = How.XPATH, using = "(//img[contains(@class,'p3-header__cart-dialog-product-preview-image')])[1]")
	public WebElement CartPageGallerImage1;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Order Total *')]")
	public WebElement CartPageOrderTotal;
	
	public Mailinator(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
