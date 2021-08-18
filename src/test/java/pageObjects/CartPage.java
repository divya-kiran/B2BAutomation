package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class CartPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.CLASS_NAME, using = "p3-page-cart__heading-title")
	public WebElement CartPageTitle;
	
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
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Caisse')]")
	public WebElement frCartPageCheckoutButton;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Finalizar la compra')]")
	public WebElement espCartPageCheckoutButton;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Continue shopping')]")
	public WebElement CartPageContinueshoppingLink;
	
	@FindBy(how = How.XPATH, using = "//button[contains(@data-dialog,'save-cart')]")
	public WebElement CartPageSavecartIcon;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Save')]")
	public WebElement SaveCartSaveTitle;
	
	@FindBy(how = How.XPATH, using = "//h4[contains(text(),'Save')]//following-sibling::span")
	public WebElement SaveCartPOPUPReqLabel;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Your cart will be moved to your')]")
	public WebElement SaveCartStaticText;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Your cart will be moved to your')]//following-sibling::a[contains(text(),'Saved Carts')]")
	public WebElement SaveCartSavedCartsLink;
	
	@FindBy(how = How.ID, using = "save-cart-form__name")
	public WebElement SaveCartCartNameTB;
	
	@FindBy(how = How.ID, using = "save-cart-form__description")
	public WebElement SaveCartDescTB;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Save Cart') and contains(@type,'submit')]")
	public WebElement SaveCartSubmitButton;
	
	@FindBy(how = How.XPATH, using = "(//button[contains(text(),'Add job name')])[1]")
	public WebElement AddJobName1;
	
	@FindBy(how = How.XPATH, using = "(//input[contains(@name,'jobName')])[1]")
	public WebElement JobName1TB;
			
	@FindBy(how = How.XPATH, using = "(//button[contains(@class,'p3-button__primary p3-product__job-name-save')])[1]")
	public WebElement JobName1SaveButton;
	
	@FindBy(how = How.XPATH, using = "(//span[contains(@class,'p3-product__job-name-message')])[1]")
	public WebElement JobNameMsg1;
	
	@FindBy(how = How.XPATH, using = "//button[contains(@data-dialog,'clear-cart')]")
	public WebElement CartPageClearcartIcon;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-product__total-price-block'])[1]//p[2]")
	public WebElement CartPageProductPriceTot1;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-product__total-price-block'])[2]//p[2]")
	public WebElement CartPageProductPriceTot2;
	
	@FindBy(how = How.XPATH, using = "(//button[contains(@class,'p3-product__button-remove')])[1]")
	public WebElement CartPageProductDelIcon1;
	
	@FindBy(how = How.XPATH, using = "(//input[contains(@class,'p3-product__quantity-input')])[1]")
	public WebElement CartPageProductQTYBox1;
	
	@FindBy(how = How.XPATH, using = "(//a[contains(@class,'p3-product__name')])[1]")
	public WebElement CartPageProductName1;
	
	@FindBy(how = How.XPATH, using = "(//p[contains(@class,'p3-product__price')])[1]")
	public WebElement CartPageEachProdPrice1;
	
	@FindBy(how = How.XPATH, using = "(//p[contains(@class,'p3-product__price')])[2]")
	public WebElement CartPageEachProdPrice2;
	
	@FindBy(how = How.XPATH, using = "(//p[contains(@class,'p3-product__description')])[1]")
	public WebElement CartPageEachProdSummary1;
	
	@FindBy(how = How.XPATH, using = "(//img[contains(@class,'p3-header__cart-dialog-product-preview-image')])[1]")
	public WebElement CartPageGallerImage1;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Order Total *')]")
	public WebElement CartPageOrderTotal;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Order Total *')]//following-sibling::span")
	public WebElement OrderTotalPrice;
	
	@FindBy(how = How.XPATH, using = "//li[@class='p3-dropdown__item']")
	public WebElement NonBBU1;
	
	@FindBy(how = How.XPATH, using = "(//button[contains(@name,'updateCart')])[1]")
	public WebElement UpdateCart1;
	
	@FindBy(how = How.XPATH, using = "(//h4[contains(text(),'Included')])[1]")
	public WebElement CDOProductIncluded1;
	
	@FindBy(how = How.XPATH, using = "(//h4[contains(text(),'Included')])[2]")
	public WebElement CDOProductIncluded2;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-product__subcomponents'])[1]")
	public WebElement CDOProductParentSubComponent;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-product__subcomponents'])[2]")
	public WebElement CDOProductChildSubComponent;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-product__subcomponents'])[1]//li[1]//a")
	public WebElement ParentSubcomp1Link;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-product__subcomponents'])[1]//li[2]//a")
	public WebElement ParentSubcomp2Link;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-product__subcomponents'])[1]//li[1]//p")
	public WebElement ParentSubcomp1Summ;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-product__subcomponents'])[1]//li[2]//p")
	public WebElement ParentSubcomp2Summ;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-product__subcomponents'])[1]//li[1]//div[@class='p3-product__subcomponent-quantity']")
	public WebElement ParentSubcomp1QTY;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-product__subcomponents'])[1]//li[2]//div[@class='p3-product__subcomponent-quantity']")
	public WebElement ParentSubcomp2QTY;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-product__subcomponents'])[2]//li[1]//a")
	public WebElement ChildSubcomp1Link;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-product__subcomponents'])[2]//li[2]//a")
	public WebElement ChildSubcomp2Link;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-product__subcomponents'])[2]//li[1]//p")
	public WebElement ChildSubcomp1Summ;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-product__subcomponents'])[2]//li[2]//p")
	public WebElement ChildSubcomp2Summ;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-product__subcomponents'])[2]//li[1]//div[@class='p3-product__subcomponent-quantity']")
	public WebElement ChildSubcomp1QTY;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-product__subcomponents'])[2]//li[2]//div[@class='p3-product__subcomponent-quantity']")
	public WebElement ChildSubcomp2QTY;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Cart saved. Go to')]")
	public WebElement SavedCartToastMsg;
	
	@FindBy(how = How.XPATH, using = "//p[@class='p3-toast__message']//a[contains(text(),'Saved Carts')]")
	public WebElement SavedCartLinkToastMsg;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
