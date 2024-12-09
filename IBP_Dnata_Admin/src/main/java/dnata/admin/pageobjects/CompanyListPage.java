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
public class CompanyListPage extends BaseClass {
	
	
	@FindBy(xpath = "//div[@class='containers-left']/div/p-tree/div/div[@class='p-tree-wrapper ng-star-inserted']/ul/p-treenode/li[1]")
	WebElement firstTMCcompanyOption;
	
	@FindBy(xpath = "//div[@class='containers-left']/div/p-tree/div/div[@class='p-tree-wrapper ng-star-inserted']/ul/p-treenode/li[1]/div/span/span/div/span/button[1]")
	WebElement firstTMCcompanyOptionAddButton;
	
	@FindBy(xpath = "//*[text()='Add Company']")
	WebElement addCompanyText;
	
	@FindBy(xpath = "//input[@placeholder='Name']")
	WebElement addCompanyNameInput;
	
	@FindBy(xpath = "//input[@placeholder='Short Name']")
	WebElement addCompanyShortNameInput;
	
	@FindBy(xpath = "//input[@placeholder='City']")
	WebElement addCompanyCityInput;
	
	@FindBy(xpath = "//textarea[@placeholder='Address']")
	WebElement addCompanyAddressInput;
	
	@FindBy(xpath = "//input[@placeholder='Mobile No']")
	WebElement addCompanyMobileNoInput;
	
	@FindBy(xpath = "//input[@placeholder='email']")
	WebElement addCompanyEmailInput;
	
	@FindBy(xpath = "//input[@placeholder='staffEmail']")
	WebElement addCompanyStaffEmailInput;
	
	@FindBy(xpath = "//input[@placeholder='Account Code']")
	WebElement addCompanyAccountCodeInput;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='companyTypeId']/div/div[2]")
	WebElement addCompanyCompTypeDropdownButton;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	List<WebElement> addCompanyCompTypeOptions;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='country']/div/div[2]")
	WebElement addCompanyCountryDropdownButton;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	List<WebElement> addCompanyCountryOptions;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='branchId']/div/div[2]")
	WebElement addCompanyBranchDropdownButton;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	List<WebElement> addCompanyBranchOptions;
	
	@FindBy(xpath = "/html/body/ngb-modal-window/div/div/div[2]/div/form/div[1]/div[10]/div/div/mat-select/div/div[2]")
	WebElement addCompanyMobileCodeDropdownButton;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	List<WebElement> addCompanyMobileCodeOptions;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='boServiceProvider']/div/div[2]")
	WebElement addCompanyBOproviderDropdownButton;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	List<WebElement> addCompanyBOproviderOptions;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='groupId']/div/div[2]")
	WebElement addCompanyCustomerGroupDropdownButton;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	List<WebElement> addCompanyCustomerGroupOptions;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='channelId']/div/div[2]")
	WebElement addCompanyChannelNameDropdownButton;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	List<WebElement> addCompanyChannelNameOptions;
	
	@FindBy(xpath = "//*[@class='form-control form-control1 ng-star-inserted']")
	WebElement addCompanylogoChooseFileButton;
	
	@FindBy(xpath = "//*[@class='form-control form-control1']")
	WebElement addcompanyDocChooseFileButton;
	
	@FindBy(xpath = "//*[text()=' Save ']")
	WebElement addcompanySaveButton;
	
	@FindBy(xpath = "//*[@value='No Limit']")
	WebElement addcompanyNoLimitRadioButton;
	
	@FindBy(xpath = "//*[@value='Fixed']")
	WebElement addcompanyFixedRadioButton;
	
	@FindBy(xpath = "//*[contains(text(),'Saved successfully')]")
	WebElement addcompanySavedSuccessfullyText;
	
	@FindBy(xpath = "//div[@class='containers-left']/div/p-tree/div/div[@class='p-tree-wrapper ng-star-inserted']/ul/p-treenode/li[1]/div/button")
	WebElement firstTMCcompanyOptionExpandButton;
	
	@FindBy(xpath = "//*[@role='group']/p-treenode")
	List<WebElement> createdCompanyList;
	
	
	
	
	public CompanyListPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	
	public void clickonfirstTMCaddButton() {
		Action.explicitWaitVisibility(firstTMCcompanyOption, 20);
		Action.elementFocus(firstTMCcompanyOption);
		Action.explicitWaitVisibility(firstTMCcompanyOptionAddButton, 20);
		Action.click(firstTMCcompanyOptionAddButton);
	}
	
	public String getAddCompanyText() {
		Action.explicitWaitVisibility(addCompanyText, 20);
		String addcompanytext = Action.getText(addCompanyText);
		return addcompanytext;
	}
	
	public void enterName(String compname) {
		Action.explicitWaitVisibility(addCompanyNameInput, 20);
		Action.enterData(addCompanyNameInput, compname);
	}
	
	public void enterShortName(String shortname) {
		Action.explicitWaitVisibility(addCompanyShortNameInput, 20);
		Action.enterData(addCompanyShortNameInput, shortname);
	}
	
	public void enterCity(String city) {
		Action.explicitWaitVisibility(addCompanyCityInput, 20);
		Action.enterData(addCompanyCityInput, city);
	}
	
	public void enterAddress(String address) {
		Action.explicitWaitVisibility(addCompanyAddressInput, 20);
		Action.enterData(addCompanyAddressInput, address);
	}
	
	public void enterMobileNo(String mobile) {
		Action.explicitWaitVisibility(addCompanyMobileNoInput, 20);
		Action.enterData(addCompanyMobileNoInput, mobile);
	}
	
	public void enterEmail(String email) {
		Action.explicitWaitVisibility(addCompanyEmailInput, 20);
		Action.enterData(addCompanyEmailInput, email);
	}
	
	public void enterBranchEmail(String branchemail) {
		Action.explicitWaitVisibility(addCompanyStaffEmailInput, 20);
		Action.enterData(addCompanyStaffEmailInput, branchemail);
	}
	
	public void clickCompanyTypeDropdownButton() {
		Action.explicitWaitVisibility(addCompanyCompTypeDropdownButton, 20);
		Action.click(addCompanyCompTypeDropdownButton);
	}
	
	public void selectCopanyType(String companytype) throws InterruptedException {
		Thread.sleep(1000);
		Action.clickfromList(addCompanyCompTypeOptions, companytype);
	}
	
	public void clickBranchDropdownButton() {
		Action.explicitWaitVisibility(addCompanyBranchDropdownButton, 20);
		Action.click(addCompanyBranchDropdownButton);
	}
	
	public void selectBranch(String branch) throws InterruptedException {
		Thread.sleep(1000);
		Action.clickfromList(addCompanyBranchOptions, branch);
	}
	
	public void clickCountryDropdownButton() {
		Action.explicitWaitVisibility(addCompanyCountryDropdownButton, 20);
		Action.click(addCompanyCountryDropdownButton);
	}
	
	public void selectCountry(String country) throws InterruptedException {
		Thread.sleep(1000);
		Action.clickfromList(addCompanyCountryOptions, country);
	}
	
	public void clickMobileCodeDropdownButton() {
		Action.explicitWaitVisibility(addCompanyMobileCodeDropdownButton, 20);
		Action.click(addCompanyMobileCodeDropdownButton);
	}
	
	public void selectMobileCode(String mobilecode) throws InterruptedException {
		Thread.sleep(1000);
		Action.clickfromList(addCompanyMobileCodeOptions, mobilecode);
	}
	
	public void clickBOproviderDropdownButton() {
		Action.explicitWaitVisibility(addCompanyBOproviderDropdownButton, 20);
		Action.click(addCompanyBOproviderDropdownButton);
	}
	
	public void selectBOprovider(String boProvider) throws InterruptedException {
		Thread.sleep(1000);
		Action.clickfromList(addCompanyBOproviderOptions, boProvider);
	}
	
	public void clickCustomerGroupDropdownButton() {
		Action.explicitWaitVisibility(addCompanyCustomerGroupDropdownButton, 20);
		Action.click(addCompanyCustomerGroupDropdownButton);
	}
	
	public void selectCustomerGroup(String customerGrp) throws InterruptedException {
		Thread.sleep(1000);
		Action.clickfromList(addCompanyCustomerGroupOptions, customerGrp);
	}
	
	public void clickChannelNameDropdownButton() {
		Action.explicitWaitVisibility(addCompanyChannelNameDropdownButton, 20);
		Action.click(addCompanyChannelNameDropdownButton);
	}
	
	public void selectChannelName(String channelName) throws InterruptedException {
		Thread.sleep(1000);
		Action.clickfromList(addCompanyChannelNameOptions, channelName);
	}
	
	public void enterAccountCode(String accountcode) {
		Action.explicitWaitVisibility(addCompanyAccountCodeInput, 20);
		Action.enterData(addCompanyAccountCodeInput, accountcode);
	}
	
	public void logoUpload(String file) throws InterruptedException {
		Action.explicitWaitVisibility(addCompanylogoChooseFileButton, 20);
		Action.click(addCompanylogoChooseFileButton);
		Thread.sleep(2000);
		Action.uploadFileAutoIT(file);
		Thread.sleep(2000);
	}
	
	public void companyDocUpload(String file) throws InterruptedException {
		Action.explicitWaitVisibility(addcompanyDocChooseFileButton, 20);
		Action.click(addcompanyDocChooseFileButton);
		Thread.sleep(2000);
		Action.uploadFileAutoIT(file);
		Thread.sleep(2000);
	}
	
	public void clickSave() {
		Action.explicitWaitVisibility(addcompanySaveButton, 20);
		Action.click(addcompanySaveButton);
	}
	
	public void selectLimit(String limit) {
		Action.explicitWaitVisibility(addcompanyNoLimitRadioButton, 20);
		if(limit.equals("No Limit"))
		{
			Action.click(addcompanyNoLimitRadioButton);
		}
		else if(limit.equals("Fixed"))
		{
			Action.click(addcompanyFixedRadioButton);
		}	
	}
	
	public String getSuccessText() {
		Action.explicitWaitVisibility(addcompanySavedSuccessfullyText, 20);
		String success = Action.getText(addcompanySavedSuccessfullyText);
		return success;
	}
	
	public void clickFirstTMCexpandButton() {
		Action.explicitWaitVisibility(firstTMCcompanyOptionExpandButton, 20);
		Action.click(firstTMCcompanyOptionExpandButton);
	}
	
	public String getCompanyCrationText(String compyCreation) {
		String compCreationText = Action.getTextfromList(createdCompanyList, compyCreation);
		return compCreationText;
	}
	

	
	

	
	
	

	
	


}
