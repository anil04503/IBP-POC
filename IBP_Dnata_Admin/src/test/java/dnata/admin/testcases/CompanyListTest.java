/**
 * 
 */
package dnata.admin.testcases;


import java.awt.AWTException;
import java.util.HashMap;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;

import dnata.admin.actiondriver.Action;
import dnata.admin.base.BaseClass;
import dnata.admin.dataprovider.DataProviders;
import dnata.admin.pageobjects.CompanyListPage;
import dnata.admin.pageobjects.HomePage;
import dnata.admin.pageobjects.LoginPage;
import dnata.admin.utility.Log;

/**
 * 
 */
public class CompanyListTest extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	CompanyListPage complistpage;
	Random random;
	String branchCompany;
	String B2BCompany;
	
	

	
	@Test(priority = 0, dataProvider = "branchaddcompany", dataProviderClass = DataProviders.class, groups = "Smoke")
	public void verifyBranchCompanyCreation(HashMap<String,String> hashMapValue) throws InterruptedException{
		complistpage = new CompanyListPage();
		random = new Random();
		Log.startTestCase("verifyBranchCompanyCreation");
		Log.info("Verifying the user can be able to create the Branch Company");
		complistpage.clickonfirstTMCaddButton();
		String addcompanytext = complistpage.getAddCompanyText();
		Assert.assertEquals(addcompanytext,prop.getProperty("addcompanytext"));
		String name = hashMapValue.get("Name")+random.nextInt(10000);
		complistpage.enterName(name);
		complistpage.enterShortName(hashMapValue.get("Short Name"));
		complistpage.clickCompanyTypeDropdownButton();
		complistpage.selectCopanyType(hashMapValue.get("Company Type"));
		complistpage.clickBranchDropdownButton();
		complistpage.selectBranch(hashMapValue.get("Branch"));
		complistpage.enterCity(hashMapValue.get("City"));
		complistpage.enterAddress(hashMapValue.get("Address"));
		complistpage.enterMobileNo(hashMapValue.get("Mobile No"));
		complistpage.enterEmail(hashMapValue.get("Email"));
		complistpage.enterBranchEmail(hashMapValue.get("Staff Email"));
		complistpage.clickCountryDropdownButton();
		complistpage.selectCountry(hashMapValue.get("Country"));
		complistpage.clickMobileCodeDropdownButton();
		complistpage.selectMobileCode(hashMapValue.get("Mobile Code"));
		complistpage.clickBOproviderDropdownButton();
		complistpage.selectBOprovider(hashMapValue.get("Back Office Provider"));
		complistpage.clickCustomerGroupDropdownButton();
		complistpage.selectCustomerGroup(hashMapValue.get("Customer Group"));
		complistpage.clickChannelNameDropdownButton();
		complistpage.selectChannelName(hashMapValue.get("Channel Name"));
		complistpage.enterAccountCode(hashMapValue.get("Account Code"));
		complistpage.selectLimit(hashMapValue.get("Limit Type"));
		complistpage.logoUpload(System.getProperty("user.dir") + "\\Logo\\jpg.jpg");
		complistpage.companyDocUpload(System.getProperty("user.dir") + "\\Logo\\jpg.jpg");
		complistpage.clickSave();
		String successText = complistpage.getSuccessText();
		Assert.assertEquals(successText,prop.getProperty("savedsuccessfully"));
		complistpage.clickSuccessText();
		complistpage.clickFirstTMCexpandButton();
		branchCompany = complistpage.getCompanyCrationText(name);
		complistpage.clickFirstTMCexpandButton();
		Assert.assertEquals(branchCompany,name);
		Log.info("The user successfully created the Branch Company");
		Log.endTestCase("verifyBranchCompanyCreation");
		}
	
	@Test(priority = 1, dataProvider = "B2Baddcompany", dataProviderClass = DataProviders.class, groups = "Smoke")
	public void verifyB2BCompanyCreation(HashMap<String,String> hashMapValue) throws InterruptedException {
		complistpage = new CompanyListPage();
		random = new Random();
		Log.startTestCase("verifyB2BCompanyCreation");
		Log.info("Verifying the user can be able to create the B2B Company");
		complistpage.clickonfirstTMCaddButton();
		String addcompanytext = complistpage.getAddCompanyText();
		Assert.assertEquals(addcompanytext,prop.getProperty("addcompanytext"));
		String name = hashMapValue.get("Name")+random.nextInt(10000);
		complistpage.enterName(name);
		complistpage.enterShortName(hashMapValue.get("Short Name"));
		complistpage.clickCompanyTypeDropdownButton();
		complistpage.selectCopanyType(hashMapValue.get("Company Type"));
		complistpage.clickBranchDropdownButton();
		complistpage.selectBranch(hashMapValue.get("Branch"));
		complistpage.enterCity(hashMapValue.get("City"));
		complistpage.enterAddress(hashMapValue.get("Address"));
		complistpage.enterMobileNo(hashMapValue.get("Mobile No"));
		complistpage.enterEmail(hashMapValue.get("Email"));
		complistpage.enterBranchEmail(hashMapValue.get("Staff Email"));
		complistpage.clickCountryDropdownButton();
		complistpage.selectCountry(hashMapValue.get("Country"));
		complistpage.clickMobileCodeDropdownButton();
		complistpage.selectMobileCode(hashMapValue.get("Mobile Code"));
		complistpage.clickBOproviderDropdownButton();
		complistpage.selectBOprovider(hashMapValue.get("Back Office Provider"));
		complistpage.clickCustomerGroupDropdownButton();
		complistpage.selectCustomerGroup(hashMapValue.get("Customer Group"));
		complistpage.clickChannelNameDropdownButton();
		complistpage.selectChannelName(hashMapValue.get("Channel Name"));
		complistpage.enterAccountCode(hashMapValue.get("Account Code"));
		complistpage.selectLimit(hashMapValue.get("Limit Type"));
		complistpage.logoUpload(System.getProperty("user.dir") + "\\Logo\\jpg.jpg");
		complistpage.companyDocUpload(System.getProperty("user.dir") + "\\Logo\\jpg.jpg");
		complistpage.clickSave();
		String successText = complistpage.getSuccessText();
		Assert.assertEquals(successText,prop.getProperty("savedsuccessfully"));
		complistpage.clickSuccessText();
		complistpage.clickFirstTMCexpandButton();
		B2BCompany = complistpage.getCompanyCrationText(name);
		Assert.assertEquals(B2BCompany,name);
		Log.info("The user successfully created the B2B Company");
		Log.endTestCase("verifyB2BCompanyCreation");
		}
	
	@Test(priority = 2, groups = "Smoke")
	public void VerifyProductConfigurationSetup() throws InterruptedException {
		complistpage = new CompanyListPage();
		Log.startTestCase("VerifyProductConfigurationSetup");
		Log.info("Adding the Product Configuration to the Company created");
		complistpage.clickCompanyCreation(B2BCompany);
		complistpage.clickProductConfigGearIcon();
		complistpage.clickAddNewButton();
		complistpage.clickProductConfigRailCheckbox();
		complistpage.clickProductConfigCarRentalCheckbox();
		complistpage.clickProductConfigResortsandToursCheckbox();
		complistpage.clickSaveButton();
		String successText = complistpage.getSuccessText();
		Assert.assertEquals(successText,prop.getProperty("savedsuccessfully"));
		complistpage.clickSuccessText();
		String railText = complistpage.getProductConfigAddedText(prop.getProperty("railtext"));
		Assert.assertEquals(railText,prop.getProperty("railtext"));
		String carRentalText = complistpage.getProductConfigAddedText(prop.getProperty("carrentaltext"));
		Assert.assertEquals(carRentalText,prop.getProperty("carrentaltext"));
		String resortsAndToursText = complistpage.getProductConfigAddedText(prop.getProperty("resortsandtourstext"));
		Assert.assertEquals(resortsAndToursText,prop.getProperty("resortsandtourstext"));
		complistpage.clickCloseButton();
		Log.info("The user successfully added the Product Configuration to the Company created");
		Log.endTestCase("VerifyProductConfigurationSetup");
		}
	
	@Test(priority = 3, groups = "Smoke")
	public void VerifyCarRentalServiceChargeSetup() throws InterruptedException {
		complistpage = new CompanyListPage();
		Log.startTestCase("VerifyCarRentalServiceChargeSetup");
		Log.info("Adding the Car Rental serive charge to the Company created");
		complistpage.clickServiceChargeGearIcon();
		complistpage.clickServiceChargeCarRentalButton();
		complistpage.clickAddNewButton();
		complistpage.clickServiceChargeTemplateCheckbox(prop.getProperty("newrulemarantext"));
		complistpage.clickSaveButton();
		String successText = complistpage.getSuccessText();
		Assert.assertEquals(successText,prop.getProperty("savedsuccessfully"));
		complistpage.clickSuccessText();
		String serviceChargeTemp = complistpage.getServiceChargeAddedText(prop.getProperty("newrulemarantext"));
		Assert.assertEquals(serviceChargeTemp,prop.getProperty("newrulemarantext"));
		complistpage.clickCloseButton();
		Log.info("The user successfully added the Car Rental service charge to the Company created");
		Log.endTestCase("VerifyCarRentalServiceChargeSetup");
		}
	
	@Test(priority = 4, dataProvider = "compUserCreation", dataProviderClass = DataProviders.class, groups = "Smoke")
	public void verifyCompanyUserCreation(HashMap<String,String> hashMapValue) throws InterruptedException {
		complistpage = new CompanyListPage();
		random = new Random();
		Log.startTestCase("verifyCompanyUserCreation");
		Log.info("Verifying the user can be able to create the Company User");
		String lastName = hashMapValue.get("Last Name")+random.nextInt(10000);
		complistpage.clickuserCreationIcon();
		complistpage.clickAddNewButton();
		complistpage.clickuserCreationSalutationDropdown();
		complistpage.selectuserCreationSalutation(hashMapValue.get("Salutation"));
		System.out.println(hashMapValue.get("Salutation"));
		complistpage.enterUserCreationFirstname(hashMapValue.get("First Name"));
		complistpage.enterUserCreationLastname(lastName);
		String email = random.nextInt(10000)+hashMapValue.get("Email");
		complistpage.enterUserCreationEmail(email);
		complistpage.enterUserCreationPassword(hashMapValue.get("Password"));
		complistpage.enterUserCreationOfficephone(hashMapValue.get("Office Phone"));
		complistpage.clickSave();
		String successText = complistpage.getuserCreationSuccessText();
		Assert.assertEquals(successText,prop.getProperty("successtext"));
		complistpage.clickuserCreationSuccessText();
		String firstName = complistpage.getUserCreationFirstnameText(hashMapValue.get("First Name"));
		Assert.assertEquals(firstName,hashMapValue.get("First Name"));
		String lastname = complistpage.getUserCreationLastnameText(lastName);
		Assert.assertEquals(lastname,lastName);
		complistpage.clickCloseButton();
		Log.info("The user successfully created the Company User");
		Log.endTestCase("verifyCompanyUserCreation");
		}
	
	@Test(priority = 5, dataProvider = "compUserCreation", dataProviderClass = DataProviders.class, groups = "Smoke")
	public void verifyCompanyUserCreationAssignRole(HashMap<String,String> hashMapValue) throws InterruptedException {
		complistpage = new CompanyListPage();
		random = new Random();
		Log.startTestCase("verifyCompanyUserCreationAssignRole");
		Log.info("Verifying the user can be able to create the Company User and Assign a Role");
		complistpage.clickuserCreationAssignRoleIcon();
		complistpage.clickuserCreationAssignRoleButton();
		complistpage.clickuserCreationRoleDropdown();
		complistpage.selectuserCreationRoleOption(hashMapValue.get("Role"));
		complistpage.selectUserRoleModule(hashMapValue.get("Module"));
		complistpage.clickSave();
		String successText = complistpage.getSuccessText();
		Assert.assertEquals(successText,prop.getProperty("savedsuccessfully"));
		complistpage.clickSuccessText();
		String module = hashMapValue.get("Module");
		String[] moduleText = module.split("[,]",0);
		for(int i=0;i<moduleText.length;i++) {
            String moduletext = complistpage.getUserCreationModuleText(moduleText[i]);
            System.out.println(moduletext);
            System.out.println(moduleText[i]);
            Assert.assertEquals(moduletext,moduleText[i]);
            String roletext = complistpage.getUserCreationRoleText(moduleText[i]);
            Assert.assertEquals(roletext,hashMapValue.get("Role"));
         }
		complistpage.clickCloseButton();
		Log.info("The user successfully created the Company User and Assigned a Role");
		Log.endTestCase("verifyCompanyUserCreationAssignRole");
		}
	


}
