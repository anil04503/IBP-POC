/**
 * 
 */
package dnata.admin.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import dnata.admin.actiondriver.Action;
import dnata.admin.base.BaseClass;

/**
 * 
 */
public class HomePage extends BaseClass {
	
	
	@FindBy(xpath = "//div[@class='container']/div/h4")
	WebElement organizationdetailsheadingText;
	
	@FindBy(xpath = "//*[@id='kt_content']/div/kt-org-update/div/div[2]/div/div/div[1]/h6")
	List<WebElement> orgdetailsParaText;
	
	@FindBy(xpath = "//*[text()='Name']")
	WebElement orgdetailsNameText;
	
	@FindBy(xpath = "//*[text()='ShortName']")
	WebElement orgdetailsShortNameText;
	
	@FindBy(xpath = "//*[text()='Country']")
	WebElement orgdetailsCountryText;
	
	@FindBy(xpath = "//*[text()='City']")
	WebElement orgdetailsCityText;
	
	@FindBy(xpath = "//*[text()='Zipcode']")
	WebElement orgdetailsZipCodeText;
	
	@FindBy(xpath = "//*[text()='Address']")
	WebElement orgdetailsAddressText;
	
	@FindBy(xpath = "//*[text()='Phone Number']")
	WebElement orgdetailsPhoneNoText;
	
	@FindBy(xpath = "//*[text()='Email']")
	WebElement orgdetailsEmailText;
	
	@FindBy(xpath = "//*[text()='Website']")
	WebElement orgdetailsWebsiteText;
	
	@FindBy(xpath = "//*[@id='kt_content']/div/kt-org-update/div/div[2]/div/div/div[3]")
	List<WebElement> orgdetailsParavalueText;
	
	@FindBy(xpath = "//div[@class='container']/div[2]/div[1]/div/div[3]")
	WebElement orgdetailsNameValueText;
	
	@FindBy(xpath = "//div[@class='container']/div[2]/div[2]/div/div[3]")
	WebElement orgdetailsShortNameValueText;
	
	@FindBy(xpath = "//div[@class='container']/div[2]/div[3]/div/div[3]")
	WebElement orgdetailsCountryValueText;
	
	@FindBy(xpath = "//div[@class='container']/div[2]/div[4]/div/div[3]")
	WebElement orgdetailsCityValueText;
	
	@FindBy(xpath = "//div[@class='container']/div[2]/div[5]/div/div[3]")
	WebElement orgdetailsZipcodeValueText;
	
	@FindBy(xpath = "//div[@class='container']/div[2]/div[6]/div/div[3]")
	WebElement orgdetailsAddressValueText;
	
	@FindBy(xpath = "//div[@class='container']/div[2]/div[7]/div/div[3]")
	WebElement orgdetailsPhoneNoValueText;
	
	@FindBy(xpath = "//div[@class='container']/div[2]/div[8]/div/div[3]")
	WebElement orgdetailsEmailValueText;
	
	@FindBy(xpath = "//div[@class='container']/div[2]/div[9]/div/div[3]")
	WebElement orgdetailsWebsiteValueText;
	
	@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/i")
	WebElement companysideMenuarrowButton;
	
	@FindBy(xpath = "//*[text()='Company List']")
	WebElement companyListsideMenu;
	
	@FindBy(xpath = "//h4[text()='Company ']")
	WebElement companylistheadingText;
	
	
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public String getorganizationDetailsText() {
		Action.explicitWaitVisibility(organizationdetailsheadingText, 20);
		String organizationdetailsheadingtext = Action.getText(organizationdetailsheadingText);
		return organizationdetailsheadingtext;
	}
	
	public String getorgdetailsNameText() {
		String nametext = Action.getText(orgdetailsNameText);
		return nametext;
	}
	
	public String getorgdetailsShortNameText() {
		String shortnametext = Action.getText(orgdetailsShortNameText);
		return shortnametext;
	}
	
	public String getorgdetailsCountryText() {
		String countrytext = Action.getText(orgdetailsCountryText);
		return countrytext;
	}
	
	public String getorgdetailsCityText() {
		String citytext = Action.getText(orgdetailsCityText);
		return citytext;
	}
	
	public String getorgdetailsZipcodeText() {
		String zipcodetext = Action.getText(orgdetailsZipCodeText);
		return zipcodetext;
	}
	
	public String getorgdetailsAddressText() {
		String addresstext = Action.getText(orgdetailsAddressText);
		return addresstext;
	}
	
	public String getorgdetailsPhoeNoText() {
		String phonenotext = Action.getText(orgdetailsPhoneNoText);
		return phonenotext;
	}
	
	public String getorgdetailsEmailText() {
		String emailtext = Action.getText(orgdetailsEmailText);
		return emailtext;
	}
	
	public String getorgdetailsWebsiteText() {
		String websitetext = Action.getText(orgdetailsWebsiteText);
		return websitetext;
	}
	
	public String getorgdetailsNameValueText() {
		String nameValuetext = Action.getText(orgdetailsNameValueText);
		return nameValuetext;
	}
	
	public String getorgdetailsShortNameValueText() {
		String shortnameValuetext = Action.getText(orgdetailsShortNameValueText);
		return shortnameValuetext;
	}
	
	public String getorgdetailsCountryValueText() {
		String countryValuetext = Action.getText(orgdetailsCountryValueText);
		return countryValuetext;
	}
	
	public String getorgdetailsCityValueText() {
		String cityValuetext = Action.getText(orgdetailsCityValueText);
		return cityValuetext;
	}
	
	public String getorgdetailsZipcodeValueText() {
		String zipcodeValuetext = Action.getText(orgdetailsZipcodeValueText);
		return zipcodeValuetext;
	}
	
	public String getorgdetailsAddressValueText() {
		String addressValuetext = Action.getText(orgdetailsAddressValueText);
		return addressValuetext;
	}
	
	public String getorgdetailsPhoeNoValueText() {
		String phonenoValuetext = Action.getText(orgdetailsPhoneNoValueText);
		return phonenoValuetext;
	}
	
	public String getorgdetailsEmailValueText() {
		String emailValuetext = Action.getText(orgdetailsEmailValueText);
		return emailValuetext;
	}
	
	public String getorgdetailsWebsiteValueText() {
		String websiteValuetext = Action.getText(orgdetailsWebsiteValueText);
		return websiteValuetext;
	}
	
	public void clickoncompanyarrowButton() {
		Action.click(companysideMenuarrowButton);	
	}
	
	public void clickCompanyListMenu() {
		Action.explicitWaitVisibility(companyListsideMenu, 20);
		Action.click(companyListsideMenu);
	}
	
	public String getCompanyListheadingText() {
		Action.explicitWaitVisibility(companylistheadingText, 20);
		String companytext = Action.getText(companylistheadingText);
		return companytext;
	}
	
	
	

	
	


}
