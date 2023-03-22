package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class MyTemplatesPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'My Templates')]")
	public WebElement PageTitle;
	
	@FindBy(how = How.XPATH, using = "//span[@class='p3-templates__amount']")
	public WebElement Templatescount;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Templates can be saved from product detail pages. Please visit the product details page of an operator family of your choice to configure and save your template')]")
	public WebElement MyTemplatesdesc;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-templates__heading']//button[contains(text(),'Select')]")
	public WebElement SelectButton;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-templates__heading-footer']//button[contains(text(),'Cancel')]")
	public WebElement SelectCancelButton;
	
	@FindBy(how = How.XPATH, using = "//div[@class='p3-templates__heading-footer']//button[contains(text(),'Delete')]")
	public WebElement SelectDeleteButton;
	
	@FindBy(how = How.XPATH, using = "(//span[@class='p3-checkbox__checkmark'])[1]")
	public WebElement TemplateCheckBox;
	
	@FindBy(how = How.XPATH, using = "(//h3[@class='p3-templates__template-name'])[1]")
	public WebElement TemplateName1;
	
	@FindBy(how = How.XPATH, using = "(//h3[@class='p3-templates__template-name'])[1]//following-sibling::p")
	public WebElement ProuctNameTemplate;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-templates__template-head'])[1]//span[contains(text(),'Created')]")
	public WebElement CreatedLabel;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-templates__template-head'])[1]//button")
	public WebElement DelButton1;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-templates__template-overview'])[1]//button[@class='p3-button__text p3-templates__template-toggle-details']//span[1]")
	public WebElement ShowDetails;
	
	@FindBy(how = How.XPATH, using = "(//div[@class='p3-templates__template-overview'])[1]//button[@class='p3-button__text p3-templates__template-toggle-details']//span[2]")
	public WebElement HideDetails;
	
	@FindBy(how = How.XPATH, using = "(//p[@class='p3-templates__template-details-text'])[1]")
	public WebElement DetailTemplateName;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-templates__template-details-table'])[1]//li[1]")
	public WebElement DetailTemplateName1;
	
	@FindBy(how = How.XPATH, using = "(//ul[@class='p3-templates__template-details-table'])[1]//li[2]")
	public WebElement DetailTemplateName2;
	
	public MyTemplatesPage(WebDriver driver) {
		this.driver = driver;
		new WebDriverWait(driver, Duration.ofSeconds(30));
		PageFactory.initElements(this.driver, this);
	}
}
