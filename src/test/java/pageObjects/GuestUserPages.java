package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import baseClass.BaseClass;

public class GuestUserPages extends BaseClass{
	
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Become a Partner')])[1]")
	public WebElement BecomeApartnerLinkPLP;
	
	@FindBy(how = How.XPATH, using = "(//a[contains(text(),'Become a Partner')])[1]")
	public WebElement BecomeApartnerPDP;
	
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Become a Partner')]")
	public WebElement BecomeApartnerPDPsticky;
	
	public GuestUserPages(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 20);
		PageFactory.initElements(this.driver, this);
	}
}
