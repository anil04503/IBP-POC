package dnata.admin.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dnata.admin.actiondriver.Action;
import dnata.admin.base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(xpath  = "//*[text()=' dnata Staff ']")
	WebElement dnataStaffLink;
	
	@FindBy(xpath  = "//input[@type='email']")
	WebElement emailInput;
	
	@FindBy(xpath  = "//*[@value='Next']")
	WebElement nextButton;
	
	@FindBy(xpath  = "//*[@type='password']")
	WebElement passwordInput;
	
	@FindBy(xpath  = "//*[@value='Sign in']")
	WebElement signInButton;
	
	@FindBy(xpath  = "//*[@value='Yes']")
	WebElement yesButton;
	
	
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	

	
	public void clickDnataStaffLink() {
		Action.explicitWaitVisibility(dnataStaffLink, 20);
		Action.click(dnataStaffLink);
	}
	
	public void enterEmail(String email) {
		//Action.pageLoadWait(20);
		Action.explicitWaitVisibility(emailInput, 20);
		Action.enterData(emailInput, email);
	}
	
	public void clickNextButton() {
		Action.click(nextButton);
	}
	
	public void enterPassword(String password) {
		Action.explicitWaitVisibility(passwordInput, 20);
		Action.enterData(passwordInput, password);
	}
	
	public void clickSiginButton() {
		Action.click(signInButton);
	}
	
	public void clickYesButton() throws InterruptedException {
		Action.explicitWaitVisibility(yesButton, 20);
		Action.click(yesButton);
		Thread.sleep(2000);
	}
	

}
