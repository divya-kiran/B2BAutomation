package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class OrderConfirmationPage extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Order Status')]")
	public WebElement OrderStatusLink;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Thank you! Order')]")
	public WebElement OrderConfMessageText;
	
	@FindBy(how = How.XPATH, using = "//p[contains(text(),'Merci! Order')]")
	public WebElement frOrderConfMessageText;
	
	public OrderConfirmationPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
