package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class SearchResultsPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.CLASS_NAME, using = "p3-plp__search-term")
	public WebElement SearchText;
	
	@FindBy(how = How.CLASS_NAME, using = "p3-plp__search-message")
	public WebElement SearchResultsPriceDisc;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'You searched for')]")
	public WebElement SearchLabel;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__heading']//li[contains(text(),'Products')]//span)[1]")
	public WebElement SearchResultsProductTabcount;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__heading']//li[contains(text(),'Resources')]//span)[1]")
	public WebElement SearchResultsResourcesTabcount;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@class,'p3-plp__heading')]//span[contains(text(),'All prices shown are')]//parent::li")
	public WebElement PriceDiscText;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//button[contains(text(),'Category')]")
	public WebElement FacetCategoryLabel;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//button[contains(text(),'Price')]")
	public WebElement FacetPriceLabel;
	
	@FindBy(how = How.XPATH, using = "(//li[@class='p3-plp__product-item'])[1]")
	public WebElement FirstProduct;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Category')]//following-sibling::ul//li//input)[1]")
	public WebElement CategoryFacet1CheckBox;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Category')]//following-sibling::ul//li//input)[2]")
	public WebElement CategoryFacet2CheckBox;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Category')]//following-sibling::ul//li//input)[3]")
	public WebElement CategoryFacet3CheckBox;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Category')]//following-sibling::ul//li//span[1])[1]")
	public WebElement CategoryFacet1Label;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Category')]//following-sibling::ul//li//span[1])[2]")
	public WebElement CategoryFacet2Label;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Category')]//following-sibling::ul//li//span[1])[3]")
	public WebElement CategoryFacet3Label;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Price')]//following-sibling::ul//li//input)[1]")
	public WebElement PriceFacet1CheckBox;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Price')]//following-sibling::ul//li//input)[2]")
	public WebElement PriceFacet2CheckBox;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Price')]//following-sibling::ul//li//input)[3]")
	public WebElement PriceFacet3CheckBox;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Price')]//following-sibling::ul//li//span[1])[1]")
	public WebElement PriceFacet1Label;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Price')]//following-sibling::ul//li//span[1])[2]")
	public WebElement PriceFacet2Label;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Price')]//following-sibling::ul//li//span[1])[3]")
	public WebElement PriceFacet3Label;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Rail Length')]//following-sibling::ul//li//span[1])[1]")
	public WebElement RailLengthFacet1Label;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Rail Length')]//following-sibling::ul//li//span[1])[2]")
	public WebElement RailLengthFacet2Label;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Rail Length')]//following-sibling::ul//li//span[1])[3]")
	public WebElement RailLengthFacet3Label;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Rail Length')]//following-sibling::ul//li//input)[1]")
	public WebElement RailLengthFacet1CheckBox;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Rail Length')]//following-sibling::ul//li//input)[2]")
	public WebElement RailLengthFacet2CheckBox;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Rail Length')]//following-sibling::ul//li//input)[3]")
	public WebElement RailLengthFacet3CheckBox;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs-content']//li[@class='p3-plp__product-item'])[1]//img")
	public WebElement FirstProdImage;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs-content']//li[@class='p3-plp__product-item'])[1]//h2")
	public WebElement FirstProdName;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs-content']//li[@class='p3-plp__product-item'])[1]//div[@class='p3-plp__product-description']")
	public WebElement FirstProdSummary;
	
	@FindBy(how = How.XPATH, using = "(//div[contains(@class,'p3-plp__tabs-content')]//li[@class='p3-plp__product-item'])[1]//span[contains(@class,'price')]")
	public WebElement FirstProdPrice;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs-content']//li[@class='p3-plp__product-item'])[1]//button")
	public WebElement FirstProdCTA;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs-content']//li[@class='p3-plp__product-item'])[1]//input")
	public WebElement FirstProdQTYBox;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//button[contains(text(),'Document type')]")
	public WebElement LiteratureTypeLabel;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Document type')]//following-sibling::ul//li//span[1])[1]")
	public WebElement LiteratureTypeFacet1Label;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Document type')]//following-sibling::ul//li//span[1])[2]")
	public WebElement LiteratureTypeFacet2Label;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Document type')]//following-sibling::ul//li//span[1])[3]")
	public WebElement LiteratureTypeFacet3Label;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Asset type')])[1]")
	public WebElement AssetTypeLabel;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Asset type')]//following-sibling::ul//li//span[1])[1]")
	public WebElement AssetTypeFacet1Label;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Asset type')]//following-sibling::ul//li//span[1])[2]")
	public WebElement AssetTypeFacet2Label;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Asset type')]//following-sibling::ul//li//span[1])[3]")
	public WebElement AssetTypeFacet3Label;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Show more')])[1]")
	public WebElement AssetTypeShowMore;
	
	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
