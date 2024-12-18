/**
 * 
 */
package dnata.admin.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import dnata.admin.actiondriver.Action;
import dnata.admin.base.BaseClass;
import dnata.admin.utility.Log;

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
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	WebElement createCompdropdownOptionsListElement;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='country']/div/div[2]")
	WebElement addCompanyCountryDropdownButton;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	List<WebElement> addCompanyCountryOptions;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='branchId']/div/div[2]")
	WebElement addCompanyBranchDropdownButton;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	List<WebElement> addCompanyBranchOptions;
	
	@FindBy(xpath = "//*[label[text()='Mobile No ']]/div/mat-select/div/div[2]")
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
	
	@FindBy(xpath = "//*[label[text()='Logo']]/input[@type='file']")
	WebElement addCompanylogoChooseFileButton;
	
	@FindBy(xpath = "//*[label[text()='Company Document Logo']]/div/input[@type='file']")
	WebElement addcompanyDocChooseFileButton;
	
	@FindBy(xpath = "//*[text()=' Save ']")
	WebElement addcompanySaveButton;
	
	@FindBy(xpath = "//*[@value='No Limit']")
	WebElement addcompanyNoLimitRadioButton;
	
	@FindBy(xpath = "//*[@value='Fixed']")
	WebElement addcompanyFixedRadioButton;
	
	@FindBy(xpath = "//*[text()=' Saved successfully ']")
	WebElement addcompanySavedSuccessfullyText;
	
	@FindBy(xpath = "//*[text()=' success ']")
	WebElement compUserCreationSuccessText;
	
	@FindBy(xpath = "//div[@class='containers-left']/div/p-tree/div/div[@class='p-tree-wrapper ng-star-inserted']/ul/p-treenode/li[1]/div/button")
	WebElement firstTMCcompanyOptionExpandButton;
	
	@FindBy(xpath = "//*[@role='group']/p-treenode")
	List<WebElement> createdCompanyList;
	
	@FindBy(xpath = "//*[@role='group']/p-treenode")
	WebElement createdCompanyListElement;
	
	@FindBy(xpath = "//button[@title='Product Configuration']")
	WebElement productConfigGeariconButton;
	
	@FindBy(xpath = "//*[text()='Add new']")
	WebElement productConfigAddNewButton;
	
	@FindBy(xpath = "//*[text()='Add New']")
	WebElement customerCreationAddNewButton;
	
	@FindBy(xpath = "//input[@name='Rail']")
	WebElement productConfigRailCheckbox;
	
	@FindBy(xpath = "//input[@name='Car Rental']")
	WebElement productConfigCarRentalCheckbox;
	
	@FindBy(xpath = "//input[@name='Resorts & Tours']")
	WebElement productConfigResortandToursCheckbox;
	
	@FindBy(xpath = "//button[text()=' Save ']")
	WebElement productConfigSaveButton;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[1]")
	List<WebElement> productConfigNameList;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[1]")
	WebElement productConfigNameListElement;
	
	@FindBy(xpath = "//div[contains(@class,'modal-header')]/button")
	WebElement productConfigCloseButton;
	
	@FindBy(xpath = "//button[@title='Service Charge']")
	WebElement serviceChargeGeariconButton;
	
	@FindBy(xpath = "//*[text()='CarRental']")
	WebElement serviceChargeCarRentalButton;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[2]")
	List<WebElement> serviceChargeNameList;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[2]")
	WebElement serviceChargeNameListElement;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[1]")
	List<WebElement> serviceChargeNameCheckboxList;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[1]")
	WebElement serviceChargeNameCheckboxListElement;
	
	@FindBy(xpath = "//*[@title='User Creation']")
	WebElement userCreationiconButton;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='salutation']/div/div[2]")
	WebElement userCreationSalutationDropdownButton;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	List<WebElement> userCreationsalutationOptions;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	WebElement userCreationsalutationOptionsElement;
	
	@FindBy(id = "firstname")
	WebElement userCreationFristnameInput;
	
	@FindBy(id = "lastname")
	WebElement userCreationLastnameInput;
	
	@FindBy(id = "email")
	WebElement userCreationEmailInput;
	
	@FindBy(id = "password")
	WebElement userCreationPasswordInput;
	
	@FindBy(xpath = "//*[@formcontrolname='officePhone']")
	WebElement userCreationOfficePhoneInput;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[2]")
	List<WebElement> userCreationLastNameList;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[1]")
	List<WebElement> userCreationFirstNameList;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[1]")
	WebElement userCreationFirstNameListElement;
	
	@FindBy(xpath = "//*[text()='person_add']")
	WebElement userCreationAssignRoleIcon;
	
	@FindBy(xpath = "//*[text()='Assign Role']")
	WebElement userCreationAssignRoleButton;
	
	@FindBy(xpath = "//*[@id='role']/div/div[2]")
	WebElement userCreationAssignRoleDropdownbutton;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	WebElement userCreationAssignRoleOptionsElement;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	List<WebElement> userCreationAssignRoleOptions;
	
	@FindBy(xpath = "//*[text()=' ADMIN ']")
	WebElement userCreationAssignRoleModuleAdmin;
	
	@FindBy(xpath = "//*[text()=' B2B ']")
	WebElement userCreationAssignRoleModuleB2B;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[2]")
	List<WebElement> userCreationModuleList;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[1]")
	List<WebElement> userCreationRoleList;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[1]")
	WebElement userCreationRoleListElement;
	
	@FindBy(xpath = "//*[@title='Customer']")
	WebElement customerCreationiconButton;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='salutation']/div/div[2]")
	WebElement customerCreationSalutationDropdownButton;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	List<WebElement> customerCreationsalutationOptions;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	WebElement customerCreationsalutationOptionsElement;
	
	@FindBy(id = "firstname")
	WebElement customerCreationFristnameInput;
	
	@FindBy(id = "lastname")
	WebElement customerCreationLastnameInput;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='nationality']/div/div[2]")
	WebElement customerCreationNationalityDropdownButton;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	List<WebElement> customerCreationNationalityOptions;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	WebElement customerCreationNationalityOptionsElement;
	
	@FindBy(xpath = "//*[label[text()='Phone Number']]/div/mat-select/div/div[2]")
	WebElement customerCreationPhoneNumberDropdownButton;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	List<WebElement> customerCreationPhoneNumberOptions;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	WebElement customerCreationPhoneNumberOptionsElement;
	
	@FindBy(xpath = "//input[@placeholder='PhoneNumber']")
	WebElement customerCreationPhoneNumberInput;
	
	@FindBy(xpath = "//input[@placeholder='PassportNo']")
	WebElement customerCreationPassportNumberInput;
	
	@FindBy(xpath = "//*[label[text()='Passport Issued Govt']]/mat-select/div/div[2]")
	WebElement customerCreationPassportIssuedDropdownButton;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	List<WebElement> customerCreationPassportIssuedOptions;
	
	@FindBy(xpath = "//*[@role='listbox']/mat-option")
	WebElement customerCreationPassportIssuedOptionsElement;
	
	@FindBy(xpath = "//input[@placeholder='Email']")
	WebElement customerCreationEmailInput;
	
	@FindBy(xpath = "//input[@placeholder='City']")
	WebElement customerCreationCityInput;
	
	@FindBy(id = "genderMale")
	WebElement customerCreationMaleRadioButton;
	
	@FindBy(id = "genderFemale")
	WebElement customerCreationFemaleRadioButton;
	
	@FindBy(id = "dateOfBirth")
	WebElement customerCreationDOBInput;
	
	@FindBy(xpath = "//input[@formcontrolname='passportIssueDate']")
	WebElement customerCreationPIDInput;
	
	@FindBy(xpath = "//input[@formcontrolname='passportExpiryDate']")
	WebElement customerCreationPEDInput;
	
	@FindBy(xpath = "//*[@title='Supplier Configuration']")
	WebElement supplierConfigiconButton;
	
	@FindBy(xpath = "//*[text()='CLUBMED SIT']/preceding-sibling::div/input")
	WebElement supplierConfigiconCLUBMEDSITCheckbox;
	
	@FindBy(xpath = "//*[text()='HertZ Test ']/preceding-sibling::div/input")
	WebElement supplierConfigiconHertZTestCheckbox;
	
	@FindBy(xpath = "//*[@title='FOP']")
	WebElement FOPiconButton;
	
	@FindBy(xpath = "//*[label[text()='FOP Type']]/mat-select/div/div[2]")
	WebElement FOPTypeDropdownButton;
	
	@FindBy(xpath = "//input[@value='true']")
	WebElement FOPTrueRadioButton;
	
	@FindBy(xpath = "//input[@value='false']")
	WebElement FOPFalseRadioButton;
	
	
	
	
	
	
	
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
//		Action.explicitWaitVisibility(createCompdropdownOptionsListElement, 20);
//		Action.clickfromList(addCompanyCompTypeOptions, companytype);
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+companytype+"']")), 20);
		Action.click(getDriver().findElement(By.xpath("//*[text()='"+companytype+"']")));
	}
	
	public void clickBranchDropdownButton() {
		Action.explicitWaitVisibility(addCompanyBranchDropdownButton, 20);
		Action.click(addCompanyBranchDropdownButton);
	}
	
	public void selectBranch(String branch) throws InterruptedException {
//		Action.explicitWaitVisibility(createCompdropdownOptionsListElement, 20);
//		Action.clickfromList(addCompanyBranchOptions, branch);
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+branch+"']")), 20);
		Action.click(getDriver().findElement(By.xpath("//*[text()='"+branch+"']")));
	}
	
	public void clickCountryDropdownButton() {
		Action.explicitWaitVisibility(addCompanyCountryDropdownButton, 20);
		Action.click(addCompanyCountryDropdownButton);
	}
	
	public void selectCountry(String country) throws InterruptedException {
//		Action.explicitWaitVisibility(createCompdropdownOptionsListElement, 20);
//		Action.clickfromList(addCompanyCountryOptions, country);
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+country+"']")), 20);
		Action.click(getDriver().findElement(By.xpath("//*[text()='"+country+"']")));
	}
	
	public void clickMobileCodeDropdownButton() {
		Action.explicitWaitVisibility(addCompanyMobileCodeDropdownButton, 20);
		Action.click(addCompanyMobileCodeDropdownButton);
	}
	
	public void selectMobileCode(String mobilecode) throws InterruptedException {
//		Action.explicitWaitVisibility(createCompdropdownOptionsListElement, 20);
//		Action.clickfromList(addCompanyMobileCodeOptions, mobilecode);
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+mobilecode+"']")), 20);
		Action.click(getDriver().findElement(By.xpath("//*[text()='"+mobilecode+"']")));
	}
	
	public void clickBOproviderDropdownButton() {
		Action.explicitWaitVisibility(addCompanyBOproviderDropdownButton, 20);
		Action.click(addCompanyBOproviderDropdownButton);
	}
	
	public void selectBOprovider(String boProvider) throws InterruptedException {
//		Action.explicitWaitVisibility(createCompdropdownOptionsListElement, 20);
//		Action.clickfromList(addCompanyBOproviderOptions, boProvider);
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+boProvider+"']")), 20);
		Action.click(getDriver().findElement(By.xpath("//*[text()='"+boProvider+"']")));
	}
	
	public void clickCustomerGroupDropdownButton() {
		Action.explicitWaitVisibility(addCompanyCustomerGroupDropdownButton, 20);
		Action.click(addCompanyCustomerGroupDropdownButton);
	}
	
	public void selectCustomerGroup(String customerGrp) throws InterruptedException {
		Action.explicitWaitVisibility(createCompdropdownOptionsListElement, 20);
		Action.clickfromList(addCompanyCustomerGroupOptions, customerGrp);
	}
	
	public void clickChannelNameDropdownButton() {
		Action.explicitWaitVisibility(addCompanyChannelNameDropdownButton, 20);
		Action.click(addCompanyChannelNameDropdownButton);
	}
	
	public void selectChannelName(String channelName) throws InterruptedException {
//		Action.explicitWaitVisibility(createCompdropdownOptionsListElement, 20);
//		Action.clickfromList(addCompanyChannelNameOptions, channelName);
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+channelName+"']")), 20);
		Action.click(getDriver().findElement(By.xpath("//*[text()='"+channelName+"']")));
	}
	
	public void enterAccountCode(String accountcode) {
		Action.explicitWaitVisibility(addCompanyAccountCodeInput, 20);
		Action.enterData(addCompanyAccountCodeInput, accountcode);
	}
	
	public void logoUpload(String file) throws InterruptedException{
		Action.explicitWaitVisibility(addCompanylogoChooseFileButton, 20);
		Action.enterData(addCompanylogoChooseFileButton, file);
		Thread.sleep(3000);
	}
	
	public void companyDocUpload(String file) throws InterruptedException{
		Action.explicitWaitVisibility(addcompanyDocChooseFileButton, 20);
		Action.enterData(addcompanyDocChooseFileButton, file);
		Thread.sleep(3000);
	}
	
	public void clickSave() {
		Action.explicitWaitVisibility(addcompanySaveButton, 20);
		Action.click(addcompanySaveButton);
	}
	
	public void selectLimit(String limit) {
		
		if(limit.equals("No Limit"))
		{
			Action.explicitWaitVisibility(addcompanyNoLimitRadioButton, 20);
			Action.click(addcompanyNoLimitRadioButton);
		}
		else if(limit.equals("Fixed"))
		{
			Action.explicitWaitVisibility(addcompanyFixedRadioButton, 20);
			Action.click(addcompanyFixedRadioButton);
		}	
	}
	
	public String getSuccessText() {
		Action.explicitWaitVisibility(addcompanySavedSuccessfullyText, 20);
		String success = Action.getText(addcompanySavedSuccessfullyText);
		return success;
	}
	
	public void clickSuccessText() throws InterruptedException {
		Action.explicitWaitVisibility(addcompanySavedSuccessfullyText, 20);
		Action.click(addcompanySavedSuccessfullyText);
		Thread.sleep(2000);
	}
	
	public void clickFirstTMCexpandButton() {
		Action.explicitWaitVisibility(firstTMCcompanyOptionExpandButton, 20);
		Action.click(firstTMCcompanyOptionExpandButton);
	}
	
	public String getCompanyCrationText(String compyCreation) throws InterruptedException {
		Action.explicitWaitVisibility(createdCompanyListElement, 20);
		String compCreationText = Action.getTextfromList(createdCompanyList, compyCreation);
		return compCreationText;
	}
	
	public void clickCompanyCreation(String compyCreation) {
		Action.explicitWaitVisibility(createdCompanyListElement, 20);
		Action.clickfromList(createdCompanyList, compyCreation);
	}
	
	public void clickProductConfigGearIcon() {
		Action.explicitWaitVisibility(productConfigGeariconButton, 20);
		Action.JSelementScrollView(productConfigGeariconButton);;
		Action.click(productConfigGeariconButton);
	}
	
	public void clickAddNewButton() {
		Action.explicitWaitVisibility(productConfigAddNewButton, 20);
		Action.click(productConfigAddNewButton);
	}
	
	public void clickProductConfigRailCheckbox() {
		Action.explicitWaitVisibility(productConfigRailCheckbox, 20);
		Action.click(productConfigRailCheckbox);
	}
	
	public void clickProductConfigCarRentalCheckbox() {
		Action.explicitWaitVisibility(productConfigCarRentalCheckbox, 20);
		Action.click(productConfigCarRentalCheckbox);
	}
	
	public void clickProductConfigResortsandToursCheckbox() {
		Action.explicitWaitVisibility(productConfigResortandToursCheckbox, 20);
		Action.click(productConfigResortandToursCheckbox);
	}
	
	public void clickSaveButton() {
		Action.explicitWaitVisibility(productConfigSaveButton, 20);
		Action.click(productConfigSaveButton);
	}
	
	public String getProductConfigAddedText(String productConfig) throws InterruptedException {
		Action.explicitWaitVisibility(productConfigNameListElement, 20);
		String productConfigText = Action.getTextfromList(productConfigNameList, productConfig);
		return productConfigText;
	}
	
	public void clickCloseButton() throws InterruptedException {
		Action.explicitWaitVisibility(productConfigCloseButton, 20);
		Action.click(productConfigCloseButton);
		Thread.sleep(2000);	
	}
	
	public void clickServiceChargeGearIcon() {
		Action.explicitWaitVisibility(serviceChargeGeariconButton, 20);
		Action.click(serviceChargeGeariconButton);
	}
	
	public void clickServiceChargeCarRentalButton() {
		Action.explicitWaitVisibility(serviceChargeCarRentalButton, 20);
		Action.click(serviceChargeCarRentalButton);
	}
	
	public void clickServiceChargeTemplateCheckbox(String serviceChargeTemplate) throws InterruptedException {
		Action.explicitWaitVisibility(serviceChargeNameListElement, 20);	
    	for (int i=0;i<serviceChargeNameList.size();i++) {
    		String serviceChargeTemp = serviceChargeNameList.get(i).getText();
    		Log.info(serviceChargeTemp);
    	    if(serviceChargeTemp.equals(serviceChargeTemplate))
    	    {
    	    	serviceChargeNameCheckboxList.get(i).click();
    	    	Log.info("The checkbox clicked");
    	    	break;
    	    }
    	}
	}
	
	public String getServiceChargeAddedText(String serviceCharge) throws InterruptedException {
		Action.explicitWaitVisibility(serviceChargeNameCheckboxListElement, 20);
		String serviceChargeText = Action.getTextfromList(serviceChargeNameCheckboxList, serviceCharge);
		return serviceChargeText;
	}
	
	public void clickuserCreationIcon() {
		Action.explicitWaitVisibility(userCreationiconButton, 20);
		Action.click(userCreationiconButton);
	}
	
	public void clickuserCreationSalutationDropdown() {
		Action.explicitWaitVisibility(userCreationSalutationDropdownButton, 20);
		Action.click(userCreationSalutationDropdownButton);
	}
	
	public void selectuserCreationSalutation(String salutation) throws InterruptedException {
//		Action.explicitWaitVisibility(userCreationsalutationOptionsElement, 20);
//		Action.clickfromList(userCreationsalutationOptions, salutation);
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+salutation+"']")), 20);
		Action.click(getDriver().findElement(By.xpath("//*[text()='"+salutation+"']")));
	}
	
	public void enterUserCreationFirstname(String firstname) {
		Action.explicitWaitVisibility(userCreationFristnameInput, 20);
		Action.enterData(userCreationFristnameInput, firstname);
	}
	
	public void enterUserCreationLastname(String lastname) {
		Action.explicitWaitVisibility(userCreationLastnameInput, 20);
		Action.enterData(userCreationLastnameInput, lastname);
	}
	
	public void enterUserCreationEmail(String email) {
		Action.explicitWaitVisibility(userCreationEmailInput, 20);
		Action.enterData(userCreationEmailInput, email);
	}
	
	public void enterUserCreationPassword(String password) {
		Action.explicitWaitVisibility(userCreationPasswordInput, 20);
		Action.enterData(userCreationPasswordInput, password);
	}
	
	public void enterUserCreationOfficephone(String phone) {
		Action.explicitWaitVisibility(userCreationOfficePhoneInput, 20);
		Action.enterData(userCreationOfficePhoneInput, phone);
	}
	
	public String getUserCreationFirstnameText(String firstname) throws InterruptedException {
		Action.explicitWaitVisibility(userCreationFirstNameListElement, 20);
		String firstName = Action.getTextfromList(userCreationFirstNameList, firstname);
		return firstName;
	}
	
	public String getUserCreationLastnameText(String lastname) throws InterruptedException {
		String lastName = Action.getTextfromList(userCreationLastNameList, lastname);
		return lastName;
	}
	
	public String getuserCreationSuccessText() {
		Action.explicitWaitVisibility(compUserCreationSuccessText, 20);
		String success = Action.getText(compUserCreationSuccessText);
		return success;
	}
	
	public void clickuserCreationSuccessText() throws InterruptedException {
		Action.explicitWaitVisibility(compUserCreationSuccessText, 20);
		Action.click(compUserCreationSuccessText);
		Thread.sleep(2000);
	}
	
	public void clickuserCreationAssignRoleIcon() throws InterruptedException {
		Action.explicitWaitVisibility(userCreationAssignRoleIcon, 20);
		Action.click(userCreationAssignRoleIcon);
	}
	
	public void clickuserCreationAssignRoleButton() throws InterruptedException {
		Action.explicitWaitVisibility(userCreationAssignRoleButton, 20);
		Action.click(userCreationAssignRoleButton);
	}
	
	public void clickuserCreationRoleDropdown() throws InterruptedException {
		Action.explicitWaitVisibility(userCreationAssignRoleDropdownbutton, 20);
		Action.click(userCreationAssignRoleDropdownbutton);
	}
	
	public void selectuserCreationRoleOption(String role) throws InterruptedException {
//		Action.explicitWaitVisibility(userCreationAssignRoleOptionsElement, 20);
//		Action.clickfromList(userCreationAssignRoleOptions, role);
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+role+"']")), 20);
		Action.click(getDriver().findElement(By.xpath("//*[text()='"+role+"']")));
	}
	
	public void selectUserRoleModule(String module) {
		
		if(module.equals("ADMIN"))
		{
			Action.explicitWaitVisibility(userCreationAssignRoleModuleAdmin, 20);
			Action.click(userCreationAssignRoleModuleAdmin);
		}
		else if(module.equals("B2B"))
		{
			Action.explicitWaitVisibility(userCreationAssignRoleModuleB2B, 20);
			Action.click(userCreationAssignRoleModuleB2B);
		}
		else if(module.equals("ADMIN,B2B"))
		{
			Action.explicitWaitVisibility(userCreationAssignRoleModuleB2B, 20);
			Action.click(userCreationAssignRoleModuleAdmin);
			Action.click(userCreationAssignRoleModuleB2B);
		}	
	}
	
	public String getUserCreationModuleText(String module) throws InterruptedException {
		Action.explicitWaitVisibility(userCreationRoleListElement, 20);
		String moduleText = Action.getTextfromList(userCreationModuleList, module);
		return moduleText;
	}
	
	public String getUserCreationRoleText(String module) throws InterruptedException {
		Action.explicitWaitVisibility(userCreationRoleListElement, 20);
		String role=null;
		for(int i=0;i<userCreationModuleList.size();i++)
		{
			String moduleText = userCreationModuleList.get(i).getText();
			Log.info(moduleText);
    	    if(moduleText.equals(module))
    	    {
    	    	role = userCreationRoleList.get(i).getText();
    	    	Log.info("The role is "+role);
    	    	break;
    	    }
		}
		return role;
	}
	
	public void clickCustomerCreationIcon() {
		Action.explicitWaitVisibility(customerCreationiconButton, 20);
		Action.click(customerCreationiconButton);
	}
	
	public void clickCustomerCreationAddnewButton() {
		Action.explicitWaitVisibility(customerCreationAddNewButton, 20);
		Action.click(customerCreationAddNewButton);
	}
	
	public void clickCustomerCreationSalutationDropdown() {
		Action.explicitWaitVisibility(customerCreationSalutationDropdownButton, 20);
		Action.click(customerCreationSalutationDropdownButton);
	}
	
	public void selectCustomerCreationSalutation(String salutation) throws InterruptedException {
//		Action.explicitWaitVisibility(customerCreationsalutationOptionsElement, 20);
//		Action.clickfromList(customerCreationsalutationOptions, salutation);
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+salutation+"']")), 20);
		Action.click(getDriver().findElement(By.xpath("//*[text()='"+salutation+"']")));
	}
	
	public void enterCustomerCreationFirstname(String firstname) {
		Action.explicitWaitVisibility(customerCreationFristnameInput, 20);
		Action.enterData(customerCreationFristnameInput, firstname);
	}
	
	public void enterCustomerCreationLastname(String lastname) {
		Action.explicitWaitVisibility(customerCreationLastnameInput, 20);
		Action.enterData(customerCreationLastnameInput, lastname);
	}
	
	public void enterCustomerCreationDOB(String DOB) {
		Action.explicitWaitVisibility(customerCreationDOBInput, 20);
		Action.enterData(customerCreationDOBInput, DOB);
	}
	
	public void selectCustomerCreationGender(String gender) {
		
		if(gender.equals("Male"))
		{
			Action.explicitWaitVisibility(customerCreationMaleRadioButton,20);
			Action.click(customerCreationMaleRadioButton);
		}
		else if(gender.equals("Female"))
		{
			Action.explicitWaitVisibility(customerCreationFemaleRadioButton, 20);
			Action.click(customerCreationFemaleRadioButton);
		}	
	}
	
	public void clickCustomerCreationNationalityDropdown() {
		Action.explicitWaitVisibility(customerCreationNationalityDropdownButton, 20);
		Action.click(customerCreationNationalityDropdownButton);
	}
	
	public void selectCustomerCreationNationality(String nationality) throws InterruptedException {
//		Action.explicitWaitVisibility(customerCreationNationalityOptionsElement, 20);
//		Action.clickfromList(customerCreationNationalityOptions, nationality);
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+nationality+"']")), 20);
		Action.click(getDriver().findElement(By.xpath("//*[text()='"+nationality+"']")));
	}
	
	public void clickCustomerCreationPhoneNumberDropdown() {
		Action.explicitWaitVisibility(customerCreationPhoneNumberDropdownButton, 20);
		Action.click(customerCreationPhoneNumberDropdownButton);
	}
	
	public void selectCustomerCreationPhoneNumber(String phoneCode) throws InterruptedException {
//		Action.explicitWaitVisibility(customerCreationPhoneNumberOptionsElement, 20);
//		Action.clickfromList(customerCreationPhoneNumberOptions, phoneCode);
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+phoneCode+"']")), 20);
		Action.click(getDriver().findElement(By.xpath("//*[text()='"+phoneCode+"']")));
	}
	
	public void enterCustomerCreationPhoneNumber(String phoneNumber) {
		Action.explicitWaitVisibility(customerCreationPhoneNumberInput, 20);
		Action.enterData(customerCreationPhoneNumberInput, phoneNumber);
	}
	
	public void enterCustomerCreationPassportNumber(String passportNumber) {
		Action.explicitWaitVisibility(customerCreationPassportNumberInput, 20);
		Action.enterData(customerCreationPassportNumberInput, passportNumber);
	}
	
	public void enterCustomerCreationPID(String PID) {
		Action.explicitWaitVisibility(customerCreationPIDInput, 20);
		Action.enterData(customerCreationPIDInput, PID);
	}
	
	public void enterCustomerCreationPED(String PED) {
		Action.explicitWaitVisibility(customerCreationPEDInput, 20);
		Action.enterData(customerCreationPEDInput, PED);
	}
	
	public void clickCustomerCreationPassportIssuedDropdown() {
		Action.explicitWaitVisibility(customerCreationPassportIssuedDropdownButton, 20);
		Action.click(customerCreationPassportIssuedDropdownButton);
	}
	
	public void selectCustomerCreationPassportIssued(String passportIssued) throws InterruptedException {
//		Action.explicitWaitVisibility(customerCreationPassportIssuedOptionsElement, 20);
//		Action.clickfromList(customerCreationPassportIssuedOptions, passportIssued);
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+passportIssued+"']")), 20);
		Action.click(getDriver().findElement(By.xpath("//*[text()='"+passportIssued+"']")));
	}
	
	public void enterCustomerCreationEmail(String email) {
		Action.explicitWaitVisibility(customerCreationEmailInput, 20);
		Action.enterData(customerCreationEmailInput, email);
	}
	
	public void enterCustomerCreationCity(String city) {
		Action.explicitWaitVisibility(customerCreationCityInput, 20);
		Action.enterData(customerCreationCityInput, city);
	}
	
	public void clickSupplierConfigIcon() {
		Action.explicitWaitVisibility(supplierConfigiconButton, 20);
		Action.click(supplierConfigiconButton);
	}
	
	public void selectSupplierConfigName(String supplierConfig) {
		
		if(supplierConfig.equals("CLUBMED SIT"))
		{
			Action.explicitWaitVisibility(supplierConfigiconCLUBMEDSITCheckbox, 20);
			Action.click(supplierConfigiconCLUBMEDSITCheckbox);
		}
		else if(supplierConfig.equals("HertZ Test"))
		{
			Action.explicitWaitVisibility(supplierConfigiconHertZTestCheckbox, 20);
			Action.click(supplierConfigiconHertZTestCheckbox);
		}
		else if(supplierConfig.equals("CLUBMED SIT,HertZ Test"))
		{
			Action.explicitWaitVisibility(supplierConfigiconCLUBMEDSITCheckbox, 20);
			Action.click(supplierConfigiconCLUBMEDSITCheckbox);
			Action.click(supplierConfigiconHertZTestCheckbox);
		}	
	}
	
	public void clickFOPIcon() {
		Action.explicitWaitVisibility(FOPiconButton, 20);
		Action.click(FOPiconButton);
	}
	
	public void clickFOPTypeDropdown() {
		Action.explicitWaitVisibility(FOPTypeDropdownButton, 20);
		Action.click(FOPTypeDropdownButton);
	}
	
	public void selectFOPType(String FOPType) throws InterruptedException {
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+FOPType+"']")), 20);
		Action.click(getDriver().findElement(By.xpath("//*[text()='"+FOPType+"']")));
	}
	
	public void selectFOPDefault(String FOPDefault) {
		
		if(FOPDefault.equals("True"))
		{
			Action.explicitWaitVisibility(FOPTrueRadioButton, 20);
			Action.click(FOPTrueRadioButton);
		}
		else if(FOPDefault.equals("False"))
		{
			Action.explicitWaitVisibility(FOPFalseRadioButton, 20);
			Action.click(FOPFalseRadioButton);
		}
	}
	
	
	
	
	

	
	

	
	
	

	
	


}
