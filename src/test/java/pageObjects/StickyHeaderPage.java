package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class StickyHeaderPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Profile') and @class='p3-account__nav-link']")
	public WebElement ProfileStickyLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Company Information') and @class='p3-account__nav-link']")
	public WebElement CompanyInfoStickyLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Manage Users') and @class='p3-account__nav-link']")
	public WebElement ManageUserStickyLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Manage Invitation') and @class='p3-account__nav-link']")
	public WebElement ManageInvitationStickyLink;
	
	@FindBy(how = How.XPATH, using = "//nav[@id='sticky-navbar']")
	public WebElement StickyNavigBar;
	
	@FindBy(how = How.XPATH, using = "//nav[@id='sticky-navbar']//img")
	public WebElement StickyNavImage;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-single-sku-pdp__product-short-info-text-wrapper']/div[1]")
	public WebElement StickyNavPName;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-single-sku-pdp__product-short-info-text-wrapper']/div[2]")
	public WebElement StickyNavSummary;
	
	@FindBy(how = How.XPATH, using = "//nav[@id='sticky-navbar']//p[contains(text(),'List price')]")
	public WebElement ListPriceDisc;
	
	@FindBy(how = How.XPATH, using = "//nav[@id='sticky-navbar']//p[@class='p3-single-sku-pdp__product-short-info-price-value']")
	public WebElement PriceVal;
	
	@FindBy(how = How.XPATH, using = "//nav[@id='sticky-navbar']//label[@for='qtyInput']")
	public WebElement QTYBox;
	
	@FindBy(how = How.XPATH, using = "//nav[@id='sticky-navbar']//button[@id='addToCartButton']")
	public WebElement StickyNavAddToCartBtn;
	
	@FindBy(how = How.XPATH, using = "//nav[@id='sticky-navbar']//div[@class='p3-single-sku-pdp__product-short-info-image-wrapper']//img")
	public WebElement NotifyMEimg;
	
	@FindBy(how = How.XPATH, using = "//nav[@id='sticky-navbar']//div[@class='p3-product__notify-me']//button")
	public WebElement NotifyMEBtn;
	
	@FindBy(how = How.XPATH, using = "//nav[@id='sticky-navbar']//button[@id='addToCartButton']")
	public WebElement CustomCTAbtn;
		
	@FindBy(how = How.XPATH, using = "//nav[@id='sticky-navbar']//div[@class='pdpCTA']//a[contains(text(),'Get Support')]")
	public WebElement GetSupportCTAbtn;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Commercial Door Operator Systems')]")
	public WebElement CDOStickyTitle;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'All prices shown are')]")
	public WebElement PLPStickyPriceDisc;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__heading p3-plp__heading-sticky']//li[contains(text(),'Products')]")
	public WebElement ProductsTabSticky;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Gate Operator Parts')]")
	public WebElement GatePartsStickytitle;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__heading p3-plp__heading-sticky']//p[contains(text(),'You searched for:')]")
	public WebElement Yousearchedfor;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__heading p3-plp__heading-sticky']//h2")
	public WebElement SearchString;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__heading p3-plp__heading-sticky']//li[contains(text(),'Resources')]")
	public WebElement ResourceTabSticky;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-page-cart__heading p3-heading__sticky']//h1[contains(text(),'My Cart')]")
	public WebElement MyCartTitle;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-page-cart__heading p3-heading__sticky']//a[contains(text(),'Continue shopping')]")
	public WebElement ContinueShopping;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-page-cart__heading p3-heading__sticky']//button[contains(text(),'Save Cart')]")
	public WebElement SaveCart;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-page-cart__heading p3-heading__sticky']//button[contains(text(),'Clear cart')]")
	public WebElement ClearCart;
	
	@FindBy(how = How.XPATH, using = "//section[@class='p3-page-order-history__heading p3-heading__sticky']//h1[contains(text(),'Order History')]")
	public WebElement OrderHistoryLabel;
	
	@FindBy(how = How.XPATH, using = "//section[@class='p3-page-order-history__heading p3-heading__sticky']//p[contains(text(),'Please contact Customer Care at (800) 323-2276 for any orders older than 120 days')]")
	public WebElement OrderHistoryMsg;
	
	@FindBy(how = How.XPATH, using = "//section[@class='p3-page-order-history__heading p3-heading__sticky']//input[@id='p3-page-order-history__search-input']")
	public WebElement POorOrderNum;
	
	@FindBy(how = How.XPATH, using = "//section[@class='p3-page-order-history__heading p3-heading__sticky']//button[@class='p3-page-order-history__filter-toggle']")
	public WebElement FilterOption;
	
	@FindBy(how = How.XPATH, using = "//section[@class='p3-page-order-history__heading p3-heading__sticky']//div[@data-dropdown='p3-dropdown__ship-to-name']")
	public WebElement ShipTo;
	
	@FindBy(how = How.XPATH, using = "//section[@class='p3-page-order-history__heading p3-heading__sticky']//span[@id='order-count']")
	public WebElement OrderCount;
	
	@FindBy(how = How.XPATH, using = "//section[@class='p3-page-order-history__heading p3-heading__sticky']//button[@id='search-go']")
	public WebElement SearchGo;
	
	@FindBy(how = How.XPATH, using = "//section[@class='p3-page-order-history__heading p3-heading__sticky']//button[contains(@class,'sorting-button')]")
	public WebElement SortingToggleBtn;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-page-saved-carts__heading p3-heading__sticky']//span[contains(text(),'Saved Carts')]")
	public WebElement SavedCart;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-page-saved-carts__heading p3-heading__sticky']//p[contains(text(),'Sort by')]")
	public WebElement SortBy;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-page-saved-carts__heading p3-heading__sticky']//div[@data-dropdown='p3-dropdown__sort-by']")
	public WebElement SortByDD;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-templates__heading p3-heading__sticky']//h1[contains(text(),'My Templates')]")
	public WebElement MyTemplates;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-templates__heading p3-heading__sticky']//p[contains(text(),'Templates can be saved from product detail pages. Please visit the product details page of an operator family of your choice to configure and save your template')]")
	public WebElement MyTemplatesDesc;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-templates__heading p3-heading__sticky']//span[@class='p3-templates__amount']")
	public WebElement NumTemplates;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-templates__heading p3-heading__sticky']//button[contains(text(),'Select')]")
	public WebElement SelectBtn;
	
	public StickyHeaderPage(WebDriver driver) {
		this.driver = driver;
		new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(this.driver, this);
	}
}
