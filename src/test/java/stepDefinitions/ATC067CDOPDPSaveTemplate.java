package stepDefinitions;

import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.PDPPage;

public class ATC067CDOPDPSaveTemplate extends BaseClass {
	PDPPage pdpPage = PageFactory.initElements(driver, PDPPage.class);
	Random rnd = new Random();
    int templatenumber = rnd.nextInt(999999);
    String MyTemplateName = "MyTemplate"+templatenumber; 
    
	@Given("^Click on Save template in CDO PDP page$")
	public void click_on_Save_template_in_CDO_PDP_page() throws Throwable {
	    jsClick(pdpPage.TemplateSaveButton);
	    Thread.sleep(1000);
	}

	@Given("^Fill details in Save template form and click on Save$")
	public void fill_details_in_Save_template_form_and_click_on_Save() throws Throwable {
	    isElementDisplayed(pdpPage.SaveTemplatereqLabel, true);
	    isElementDisplayed(pdpPage.SaveTemplateHeading,true);
	    sendKeys(pdpPage.SaveTemplateTB, MyTemplateName);
	    sendKeys(pdpPage.SaveTemplateNotesTB, "Automation user entering text");
	    isElementDisplayed(pdpPage.SaveTemplateCancelButton, true);
	    jsClick(pdpPage.SaveTemplateSaveButton);
	}

	@Given("^verify success toast message in CDO PDP Page$")
	public void verify_success_toast_message_in_CDO_PDP_Page() throws Throwable {
	    isElementDisplayed(pdpPage.TemplateToastMsg, true);	    
	}

	@Given("^Navigate to My templates and verify template created successfully$")
	public void navigate_to_My_templates_and_verify_template_created_successfully() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"my-company/account-product-config-templates");	
		isElementDisplayed("//h3[contains(text(),'"+MyTemplateName+"')]", true);
		try {		
			explicitWaitVisible(driver.findElement(By.xpath("//h3[contains(text(),'"+MyTemplateName+"')]//parent::div//div[@class='p3-templates__template-head']//button")));
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//h3[contains(text(),'"+MyTemplateName+"')]//parent::div//div[@class='p3-templates__template-head']//button")));
			pageLoadTimeout();
		} catch (Exception e) {
			e.printStackTrace();
			Assert.assertTrue("Element Not Found" + driver.findElement(By.xpath("//h3[contains(text(),'"+MyTemplateName+"')]//parent::div//div[@class='p3-templates__template-head']//button")) + "| Error - " + e,false);
		} 
		isElementDisplayed("//div[contains(text(),'Template(s):')]", true);
	}
}