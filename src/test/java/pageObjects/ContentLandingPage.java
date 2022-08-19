package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class ContentLandingPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Looking to advertise in your local market? You came to the right place')]")
	public WebElement CoOpLabel;
	
	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Visit the Co-Op Portal')])[1]")
	public WebElement CoOpLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Shop Now')]")
	public WebElement ShopNowLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'LiftMaster Partner Rewards')]")
	public WebElement PartnerRewardsLink;
	
	@FindBy(how = How.XPATH, using = "//a[contains(@class,'forceCommunityThemeLogo')]")
	public WebElement LiftMasterLogo;
	
	@FindBy(how = How.XPATH, using = "//div[contains(@id,'g-recaptcha_widget')]")
	public WebElement Captcha;
	
	public ContentLandingPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
