package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class PLPPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__heading']//li[contains(text(),'Products')]//span")
	public WebElement PLPproductcount;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Show more')])[1]")
	public WebElement PLPShowMoreLink;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Garage Door Opener Systems')]")
	public WebElement GDOTitle;
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'All prices shown are')]")
	public WebElement PriceDisclaimerPLP;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//button[contains(text(),'Remove')]")
	public WebElement PLPRemoveFacet;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Garage Door Opener Systems')]")
	public WebElement GDOFacetRemove;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//button[contains(text(),'Category')]")
	public WebElement PLPCategory;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'GDO Accessories')]")
	public WebElement GDOAccFacet;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'GDO Openers')]")
	public WebElement GDOOperatorFacet;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'GDO Finishing')]")
	public WebElement GDOFinisFacet;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//button[contains(text(),'Price')]")
	public WebElement PLPPriceFacet;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Price')]//following-sibling::ul//li)[1]")
	public WebElement PLPPriceFacet1;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Price')]//following-sibling::ul//li)[2]")
	public WebElement PLPPriceFacet2;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Price')]//following-sibling::ul//li)[3]")
	public WebElement PLPPriceFacet3;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Price')]//following-sibling::ul//li)[4]")
	public WebElement PLPPriceFacet4;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//button[contains(text(),'Rail Length')]")
	public WebElement PLPRailLength;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Rail Length')]//following-sibling::ul//li)[1]")
	public WebElement PLPRailLength1;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Rail Length')]//following-sibling::ul//li)[2]")
	public WebElement PLPRailLength2;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-plp__tabs']//button[contains(text(),'Rail Length')]//following-sibling::ul//li)[3]")
	public WebElement PLPRailLength3;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-plp__products']//li[4])//img")
	public WebElement PLPproductimage;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-plp__products']//li[4])//h2")
	public WebElement PLPproductName;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-plp__products']//li[4])//div[@class='p3-plp__product-description']")
	public WebElement PLPproductSumm;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-plp__products']//li[4])//span")
	public WebElement PLPproductprice;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-plp__products']//li[4])//input")
	public WebElement PLPproductQTYBOX;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-plp__products']//li[4])//button")
	public WebElement PLPproductAddtoCartCTA;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Commercial Door Operator Systems')]")
	public WebElement CDOTilte;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'CDO Accessories')]")
	public WebElement CDOAccFacet;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'CDO Operators')]")
	public WebElement CDOOperatorFacet;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'CDO Finishing')]")
	public WebElement CDOFinisFacet;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Gates Operator Systems and Accessories')]")
	public WebElement GateOpTitle;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Gate Accessories')]")
	public WebElement GateAccFacet;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Gate Operators')]")
	public WebElement GateOperatorFacet;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Gate Operator Finishing')]")
	public WebElement GateFinisFacet;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Gate Hardware')]")
	public WebElement GateHardwareFacet;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Access Control Systems')]")
	public WebElement AccessControlSystemTitle;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Access Control Accessories')]")
	public WebElement AccessControlAccFacet;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Access Controls')]")
	public WebElement AccessControlsFacet;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Accessories')]")
	public WebElement AccessoriesTitle;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'CDO Accessories')]")
	public WebElement AccessoriesCDOFacet;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Garage Door Opener Parts')]")
	public WebElement GDOPartsTitle;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Residential Light Lens')]")
	public WebElement GDOPartsLightLens;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Residential Electrical')]")
	public WebElement GDOPartsElectrical;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Residential Brackets and')]")
	public WebElement GDOPartsBrackets;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Residential Logic Boards')]")
	public WebElement GDOPartsLogicBoards;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Commercial Door Operator Parts')]")
	public WebElement CDOPartsTitle;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Commercial Brackets')]")
	public WebElement CDOPartsBrackets;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Commercial Electrical')]")
	public WebElement CDOPartsElectricals;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Commercial Panels')]")
	public WebElement CDOPartsPanels;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Gate Operator Parts')]")
	public WebElement GatePartsTitle;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Gate Operator Electrical')]")
	public WebElement GatePartsElectrical;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Gate Operator Brackets')]")
	public WebElement GatePartsBrackets;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Gate Operator Panels')]")
	public WebElement GatePartsPanels;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Gate Operator Logic')]")
	public WebElement GatePartsLogicBoards;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Telephone Entry and Access Control Parts')]")
	public WebElement TelephonePartsTitle;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Access Control Logic')]")
	public WebElement AccessPartsLogicBoards;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Access Control Electrical')]")
	public WebElement AccessPartsElectricals;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Access Control Audio')]")
	public WebElement AccessPartsAudio;
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),'Parts')]")
	public WebElement AllPartsTitle;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Commercial Door Operator Parts')]")
	public WebElement CDOPartsFacet;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-plp__tabs']//span[contains(text(),'Gate Operator Parts')]")
	public WebElement GatePartsFacet;
	
	public PLPPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
