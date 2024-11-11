package com.dryrun.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dryrun.actiondriver.Action;
import com.dryrun.base.BaseClass;

public class IndexPage extends BaseClass {
	
	@FindBy(xpath = "//*[@name=\"username\"]")
	WebElement usernameInput;
	
	@FindBy(xpath = "//*[@name=\"password\"]")
	WebElement passwordInput;
	
	@FindBy(xpath = "//*[@type=\"submit\"]")
	WebElement signInButton;
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img")
	WebElement logoImg;
	
	public IndexPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void enterUsername(String username) {
		Action.type(usernameInput, username);
	}
	
	public void enterPassword(String password) {
		Action.type(passwordInput, password);
	}
	
	public HomePage clickonSignInbutton() {
		Action.click(signInButton);
		return new HomePage();
	}
	
	public boolean verifyLogoDisplayed() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Action.isDisplayed(getDriver(), logoImg);
	}
	
	public String getTitle() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String title = Action.getTitle(getDriver());
		return title;
		
	}

}
