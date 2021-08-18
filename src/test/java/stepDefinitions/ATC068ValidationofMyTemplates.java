package stepDefinitions;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.MyTemplatesPage;
import pageObjects.PDPPage;

public class ATC068ValidationofMyTemplates extends BaseClass {
	MyTemplatesPage myTemplates = PageFactory.initElements(driver, MyTemplatesPage.class);

	@Then("^User navigates to my templates page$")
	public void user_navigates_to_my_templates_page() throws Throwable {
		driver.navigate().to(configFileReader.getApplicationUrl()+"my-company/account-product-config-templates");	    
	}

	@Then("^Verifies header elements in my templates page$")
	public void verifies_header_elements_in_my_templates_page() throws Throwable {
	    isElementDisplayed(myTemplates.PageTitle, true);
	    isElementDisplayed(myTemplates.Templatescount, true);
	    isElementDisplayed(myTemplates.MyTemplatesdesc, true);
	    isElementDisplayed(myTemplates.SelectButton, true);
	    jsClick(myTemplates.SelectButton);
	    isElementDisplayed(myTemplates.SelectCancelButton, true);
	    isElementDisplayed(myTemplates.SelectDeleteButton, true);
	    isElementDisplayed(myTemplates.TemplateCheckBox, true);
	    jsClick(myTemplates.SelectCancelButton);
	}

	@Then("^verifies first template card details$")
	public void verifies_first_template_card_details() throws Throwable {
		isElementDisplayed(myTemplates.CreatedLabel, true);
	    isElementDisplayed(myTemplates.DelButton1, true);
	    isElementDisplayed(myTemplates.TemplateName1, true);
	    isElementDisplayed(myTemplates.ProuctNameTemplate, true);
	    isElementDisplayed(myTemplates.ShowDetails, true);	    
	}

	@Then("^click on show detail and verify details$")
	public void click_on_show_detail_and_verify_details() throws Throwable {
		jsClick(myTemplates.ShowDetails);
	    ScrollToElement(myTemplates.TemplateName1);
	    isElementDisplayed(myTemplates.HideDetails, true);
	    isElementDisplayed(myTemplates.DetailTemplateName, true);
	    isElementDisplayed(myTemplates.DetailTemplateName1, true);
	    isElementDisplayed(myTemplates.DetailTemplateName2, true);	    
	}

	@Then("^click on template name and verify user navigated to PDP page successfully$")
	public void click_on_template_name_and_verify_user_navigated_to_PDP_page_successfully() throws Throwable {
		ScrollToElement(myTemplates.PageTitle);
		jsClick(myTemplates.TemplateName1);
		verifypageURL("/p/");
	    
	}
}