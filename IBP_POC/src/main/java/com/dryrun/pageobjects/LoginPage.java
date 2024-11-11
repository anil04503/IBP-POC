package com.dryrun.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dryrun.actiondriver.Action;
import com.dryrun.base.BaseClass;

public class LoginPage extends BaseClass {
	
	@FindBy(className  = "mainPage-logo")
	WebElement AIRostamaniLogo;
	
	@FindBy(xpath = "//*[@id='mat-form-field-label-1']/mat-label")
	WebElement emailtextininputfield;
	
	@FindBy(xpath = "//*[@id='mat-form-field-label-3']/mat-label")
	WebElement passwordtextininputfield;
	
	@FindBy(xpath = "//input[@formcontrolname='email']")
	WebElement emailInput;
	
	@FindBy(xpath = "//input[@formcontrolname='password']")
	WebElement passwordInput;
	
	@FindBy(xpath = "//button[@id='kt_login_signin_submit']")
	WebElement signInButton;
	
	@FindBy(xpath = "//*[@id='mat-error-0']/strong")
	WebElement usernameRequiredtext;
	
	@FindBy(xpath = "//*[@id='mat-error-1']/strong")
	WebElement passwordRequiredtext;
	
	@FindBy(xpath = "//*[text()='Field is not valid']")
	WebElement usernameNotvalidtext;
	
	@FindBy(xpath = "//*[text()='Login failed; Invalid user ID or password']")
	WebElement invalidUsrandPwdtext;
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public boolean getAIRostamaniLogo() {
		Action.explicitWaitVisibility(getDriver(), AIRostamaniLogo, 20);
		return Action.isDisplayed(getDriver(), AIRostamaniLogo);
	}
	
	public String getTitle() {
		String title = Action.getTitle(getDriver());
		return title;
	}
	
	public String getemailtext() {
		String emailtext = emailtextininputfield.getText();
		return emailtext;
	}
	
	public String getpasswordtext() {
		String passwordtext = passwordtextininputfield.getText();
		return passwordtext;
	}
	
	public void clickonSignInbutton() {
		Action.click(signInButton);
	}
	
	public void enterUsername(String username) {
		//Action.type(emailInput, username);
		Action.enterData(emailInput, username);
	}
	
	public void enterPassword(String password) {
		//Action.type(passwordInput, password);
		Action.enterData(passwordInput, password);
	}
	
	public String getusernameRequiredtext() {
		Action.explicitWaitVisibility(getDriver(), usernameRequiredtext, 20);
		String usrRequiredtext = usernameRequiredtext.getText();
		return usrRequiredtext;
	}
	
	public String getpasswordRequiredtext() {
		Action.explicitWaitVisibility(getDriver(), passwordRequiredtext, 20);
		String pwdRequiredtext = passwordRequiredtext.getText();
		return pwdRequiredtext;
	}
	
	public String getusrnotvalidtext() {
		Action.explicitWaitVisibility(getDriver(), usernameNotvalidtext, 20);
		String usrnotvaldtext = usernameNotvalidtext.getText();
		return usrnotvaldtext;
	}
	
	public String getInvalidusrandpwdtext() {
		Action.explicitWaitVisibility(getDriver(), invalidUsrandPwdtext, 20);
		String invalidusrandpwdtext = invalidUsrandPwdtext.getText();
		return invalidusrandpwdtext;
	}
	

}
