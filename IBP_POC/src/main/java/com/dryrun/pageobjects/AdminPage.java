package com.dryrun.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dryrun.base.BaseClass;

public class AdminPage extends BaseClass{
	
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6[2]")
	WebElement userManagementTexttop;
	
	
	public AdminPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public String getuserManagementTexttop() {
		String userManagementText = userManagementTexttop.getText();
		return userManagementText;
	}

	

}
