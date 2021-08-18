package stepDefinitions;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import baseClass.BaseClass;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.ProfilePage;

public class ATC041InviteUserEmailvalidation extends BaseClass {
	ProfilePage profilePage= PageFactory.initElements(driver, ProfilePage.class);
	String emailadd;
	@Given("^User invite new user with email address$")
	public void user_invite_new_user_with_email_address() throws Throwable {
		Random rnd = new Random();
	    int number = rnd.nextInt(999999);
	    emailadd = "autoinviteuser"+number+"@mailinator.com";
	    sendKeys(profilePage.InviteUserEmailAddTB, emailadd);
	    sendKeys(profilePage.InviteUserConfEmailAddTB, emailadd);
	}

	@Given("^clicks on invite button in the form$")
	public void clicks_on_invite_button_and_verifies_success_toast_message() throws Throwable {
	    ScrollToElement(profilePage.InviteUserInviteButton);
	    jsClick(profilePage.InviteUserInviteButton);
	    isElementDisplayed(profilePage.ToastMsgInvitation, true);
	}

	@Given("^verifies new invitation email receipt and navigate to mail body$")
	public void verifies_new_invitation_email_receipt_and_navigate_to_mail_body() throws Throwable {
		isElementDisplayed("(//td[contains(text(),'LiftMaster Partner Account Invitation')])[1]", true);
	    click("(//td[contains(text(),'LiftMaster Partner Account Invitation')])[1]");
	}
	
	@Given("^navigates to newly invited users email box$")
	public void navigates_to_newly_invited_users_email_box() throws Throwable {
		Thread.sleep(30000);
		driver.navigate().to("https://www.mailinator.com/v4/public/inboxes.jsp?to="+emailadd);
	    pageLoadTimeout();
	}

	@Given("^verifies web elements in email confirmation body for new invitation email$")
	public void verifies_web_elements_in_email_confirmation_body_for_new_invitation_email() throws Throwable {
		driver.switchTo().frame("html_msg_body");
		Thread.sleep(3000);
		isElementDisplayed("//span[contains(text(),'Account Invitation')]", true);
		isElementDisplayed("//a[contains(text(),' REGISTER NOW ')]", true);
		try {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath("//span[contains(text(),'300 Windsor Drive Oak Brook, IL')]")));
		} catch (Exception e) {
			e.printStackTrace();
			driver.navigate().to(configFileReader.getApplicationUrl());
		}
		isElementDisplayed("//span[contains(text(),'2021 Chamberlain Group')]", true);
		isElementDisplayed("//span[contains(text(),'300 Windsor Drive Oak Brook, IL')]", true);
		driver.navigate().to(configFileReader.getApplicationUrl());
	}
}
