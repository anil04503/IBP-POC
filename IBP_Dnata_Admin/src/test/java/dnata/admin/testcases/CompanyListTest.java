/**
 * 
 */
package dnata.admin.testcases;


import java.awt.AWTException;
import java.util.HashMap;
import java.util.Random;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

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
	SoftAssert softAssert;
	String branchCompany;
	String B2BCompany;
	
	

	
	@Test(priority = 0,groups = "Smoke")
	public void verifyCompanyListheadingText() throws InterruptedException {
		homepage = new HomePage();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyCompanyListheadingText");
		Log.info("Verifying the Company List text is displayed in the Home page");
		homepage.clickoncompanyarrowButton();
		homepage.clickCompanyListMenu();
		homepage.clickoncompanyarrowButton();
		String companylistheadingText = homepage.getCompanyListheadingText();
		softAssert.assertEquals(companylistheadingText,prop.getProperty("companylistheadingtext"));
		Log.info("The Company List text is displayed successfully in the Home page");
		Log.endTestCase("verifyCompanyListheadingText");
		softAssert.assertAll();
		}
	
	@Test(priority = 1, dataProvider = "branchaddcompany", dataProviderClass = DataProviders.class, groups = "Smoke")
	public void verifyBranchCompanyCreation(HashMap<String,String> hashMapValue) throws InterruptedException{
		complistpage = new CompanyListPage();
		random = new Random();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyBranchCompanyCreation");
		Log.info("Verifying the user can be able to create the Branch Company");
		complistpage.clickonfirstTMCaddButton();
		String addcompanytext = complistpage.getAddCompanyText();
		softAssert.assertEquals(addcompanytext, prop.getProperty("addcompanytext"));
		String name = hashMapValue.get("Name")+random.nextInt(10000);
		complistpage.enterName(name);
		complistpage.enterShortName(hashMapValue.get("Short Name"));
		complistpage.clickCompanyTypeDropdownButton();
		complistpage.selectCopanyType(hashMapValue.get("Company Type"));
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
		complistpage.clickChannelNameDropdownButton();
		complistpage.selectChannelName(hashMapValue.get("Channel Name"));
		complistpage.selectLimit(hashMapValue.get("Limit Type"));
		complistpage.logoUpload(System.getProperty("user.dir") + "\\Logo\\jpg.jpg");
		complistpage.companyDocUpload(System.getProperty("user.dir") + "\\Logo\\jpg.jpg");
		complistpage.clickSave();
		String successText = complistpage.getSuccessText();
		softAssert.assertEquals(successText, prop.getProperty("savedsuccessfully"));
		complistpage.clickSuccessText();
		complistpage.clickFirstTMCexpandButton();
		branchCompany = complistpage.getCompanyCrationText(name);
		complistpage.clickFirstTMCexpandButton();
		softAssert.assertEquals(branchCompany, name);
		Log.info("The user successfully created the Branch Company");
		Log.endTestCase("verifyBranchCompanyCreation");
		softAssert.assertAll();
		}
	
	@Test(priority = 2, dataProvider = "B2Baddcompany", dataProviderClass = DataProviders.class, groups = "Smoke")
	public void verifyB2BCompanyCreation(HashMap<String,String> hashMapValue) throws InterruptedException {
		complistpage = new CompanyListPage();
		random = new Random();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyB2BCompanyCreation");
		Log.info("Verifying the user can be able to create the B2B Company");
		complistpage.clickonfirstTMCaddButton();
		String addcompanytext = complistpage.getAddCompanyText();
		softAssert.assertEquals(addcompanytext,prop.getProperty("addcompanytext"));
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
		complistpage.clickChannelNameDropdownButton();
		complistpage.selectChannelName(hashMapValue.get("Channel Name"));
		complistpage.enterAccountCode(hashMapValue.get("Account Code"));
		complistpage.selectLimit(hashMapValue.get("Limit Type"));
		complistpage.logoUpload(System.getProperty("user.dir") + "\\Logo\\jpg.jpg");
		complistpage.companyDocUpload(System.getProperty("user.dir") + "\\Logo\\jpg.jpg");
		complistpage.clickSave();
		String successText = complistpage.getSuccessText();
		softAssert.assertEquals(successText,prop.getProperty("savedsuccessfully"));
		complistpage.clickSuccessText();
		complistpage.clickFirstTMCexpandButton();
		B2BCompany = complistpage.getCompanyCrationText(name);
		softAssert.assertEquals(B2BCompany,name);
		Log.info("The user successfully created the B2B Company");
		Log.endTestCase("verifyB2BCompanyCreation");
		softAssert.assertAll();
		}
	
	@Test(priority = 3, groups = "Smoke")
	public void VerifyProductConfigurationSetup() throws InterruptedException {
		complistpage = new CompanyListPage();
		softAssert = new SoftAssert();
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
		softAssert.assertEquals(successText,prop.getProperty("savedsuccessfully"));
		complistpage.clickSuccessText();
		String railText = complistpage.getProductConfigAddedText(prop.getProperty("railtext"));
		softAssert.assertEquals(railText,prop.getProperty("railtext"));
		String carRentalText = complistpage.getProductConfigAddedText(prop.getProperty("carrentaltext"));
		softAssert.assertEquals(carRentalText,prop.getProperty("carrentaltext"));
		String resortsAndToursText = complistpage.getProductConfigAddedText(prop.getProperty("resortsandtourstext"));
		softAssert.assertEquals(resortsAndToursText,prop.getProperty("resortsandtourstext"));
		complistpage.clickCloseButton();
		Log.info("The user successfully added the Product Configuration to the Company created");
		Log.endTestCase("VerifyProductConfigurationSetup");
		softAssert.assertAll();
		}
	
	@Test(priority = 4, groups = "Smoke")
	public void VerifyCarRentalServiceChargeSetup() throws InterruptedException {
		complistpage = new CompanyListPage();
		softAssert = new SoftAssert();
		Log.startTestCase("VerifyCarRentalServiceChargeSetup");
		Log.info("Adding the Car Rental serive charge to the Company created");
		complistpage.clickServiceChargeGearIcon();
		complistpage.clickServiceChargeCarRentalButton();
		complistpage.clickAddNewButton();
		complistpage.clickServiceChargeTemplateCheckbox(prop.getProperty("newrulemarantext"));
		complistpage.clickSaveButton();
		String successText = complistpage.getSuccessText();
		softAssert.assertEquals(successText,prop.getProperty("savedsuccessfully"));
		complistpage.clickSuccessText();
		String serviceChargeTemp = complistpage.getServiceChargeAddedText(prop.getProperty("newrulemarantext"));
		softAssert.assertEquals(serviceChargeTemp,prop.getProperty("newrulemarantext"));
		complistpage.clickCloseButton();
		Log.info("The user successfully added the Car Rental service charge to the Company created");
		Log.endTestCase("VerifyCarRentalServiceChargeSetup");
		softAssert.assertAll();
		}
	
	@Test(priority = 5, dataProvider = "compUserCreation", dataProviderClass = DataProviders.class, groups = "Smoke")
	public void verifyCompanyUserCreation(HashMap<String,String> hashMapValue) throws InterruptedException {
		complistpage = new CompanyListPage();
		random = new Random();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyCompanyUserCreation");
		Log.info("Verifying the user can be able to create the Company User");
		complistpage.clickuserCreationIcon();
		complistpage.clickAddNewButton();
		complistpage.clickuserCreationSalutationDropdown();
		complistpage.selectuserCreationSalutation(hashMapValue.get("Salutation"));
		complistpage.enterUserCreationFirstname(hashMapValue.get("First Name"));
		complistpage.enterUserCreationLastname(hashMapValue.get("Last Name"));
		String email = random.nextInt(10000)+hashMapValue.get("Email");
		complistpage.enterUserCreationEmail(email);
		complistpage.enterUserCreationPassword(hashMapValue.get("Password"));
		complistpage.enterUserCreationOfficephone(hashMapValue.get("Office Phone"));
		complistpage.clickSave();
		String successText = complistpage.getuserCreationSuccessText();
		softAssert.assertEquals(successText,prop.getProperty("successtext"));
		complistpage.clickuserCreationSuccessText();
		String firstName = complistpage.getUserCreationFirstnameText(hashMapValue.get("First Name"));
		softAssert.assertEquals(firstName,hashMapValue.get("First Name"));
		String lastname = complistpage.getUserCreationLastnameText(hashMapValue.get("Last Name"));
		softAssert.assertEquals(lastname,hashMapValue.get("Last Name"));
		Log.info("The user successfully created the Company User");
		Log.endTestCase("verifyCompanyUserCreation");
		softAssert.assertAll();
		}
	
	@Test(priority = 6, dataProvider = "compUserCreation", dataProviderClass = DataProviders.class, groups = "Smoke")
	public void verifyCompanyUserCreationAssignRole(HashMap<String,String> hashMapValue) throws InterruptedException {
		complistpage = new CompanyListPage();
		random = new Random();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyCompanyUserCreationAssignRole");
		Log.info("Verifying the user can be able to create the Company User and Assign a Role");
		complistpage.clickuserCreationAssignRoleIcon();
		complistpage.clickuserCreationAssignRoleButton();
		complistpage.clickuserCreationRoleDropdown();
		complistpage.selectuserCreationRoleOption(hashMapValue.get("Role"));
		complistpage.selectUserRoleModule(hashMapValue.get("Module"));
		complistpage.clickSave();
		String successText = complistpage.getSuccessText();
		softAssert.assertEquals(successText,prop.getProperty("savedsuccessfully"));
		complistpage.clickSuccessText();
		String[] moduleText = hashMapValue.get("Module").split("[,]",0);
		for(int i=0;i<moduleText.length;i++) {
            String moduletext = complistpage.getUserCreationModuleText(moduleText[i]);
            Log.info(moduletext);
            Log.info(moduleText[i]);
            softAssert.assertEquals(moduletext,moduleText[i]);
            String roletext = complistpage.getUserCreationRoleText(moduleText[i]);
            String roletext1 = hashMapValue.get("Role").trim();
            softAssert.assertEquals(roletext,roletext1);
         }
		complistpage.clickCloseButton();
		Log.info("The user successfully created the Company User and Assigned a Role");
		Log.endTestCase("verifyCompanyUserCreationAssignRole");
		softAssert.assertAll();
		}
	
	@Test(priority = 7, dataProvider = "compCustomerCreation", dataProviderClass = DataProviders.class, groups = "Smoke")
	public void verifyCompanyCustomerCreation(HashMap<String,String> hashMapValue) throws InterruptedException {
		complistpage = new CompanyListPage();
		random = new Random();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyCompanyCustomerCreation");
		Log.info("Verifying the user can be able to create the Company Customer");
		complistpage.clickCustomerCreationIcon();
		complistpage.clickCustomerCreationAddnewButton();
		complistpage.clickCustomerCreationSalutationDropdown();
		complistpage.selectCustomerCreationSalutation(hashMapValue.get("Salutation"));
		complistpage.enterCustomerCreationFirstname(hashMapValue.get("First Name"));
		complistpage.enterCustomerCreationLastname(hashMapValue.get("Last Name"));
		complistpage.enterCustomerCreationDOB(hashMapValue.get("DOB"));
		complistpage.selectCustomerCreationGender(hashMapValue.get("Gender"));
		complistpage.clickCustomerCreationNationalityDropdown();
		complistpage.selectCustomerCreationNationality(hashMapValue.get("Nationality"));
		complistpage.clickCustomerCreationPhoneNumberDropdown();
		complistpage.selectCustomerCreationPhoneNumber(hashMapValue.get("Phone Code"));
		complistpage.enterCustomerCreationPhoneNumber(hashMapValue.get("Phone No"));
		String passportNo = hashMapValue.get("Passport No")+random.nextInt(10000);
		complistpage.enterCustomerCreationPassportNumber(passportNo);
		complistpage.enterCustomerCreationPID(hashMapValue.get("PID"));
		complistpage.enterCustomerCreationPED(hashMapValue.get("PED"));
		complistpage.clickCustomerCreationPassportIssuedDropdown();
		complistpage.selectCustomerCreationPassportIssued(hashMapValue.get("Passport Issued"));
		String email = random.nextInt(10000)+hashMapValue.get("Email");
		complistpage.enterCustomerCreationEmail(email);
		complistpage.enterCustomerCreationCity(hashMapValue.get("City"));
		complistpage.clickSave();
		String successText = complistpage.getuserCreationSuccessText();
		softAssert.assertEquals(successText,prop.getProperty("successtext"));
		complistpage.clickuserCreationSuccessText();
		String firstname = complistpage.getUserCreationFirstnameText(hashMapValue.get("First Name"));
		softAssert.assertEquals(firstname,hashMapValue.get("First Name"));
		complistpage.clickCloseButton();
		Log.info("The user successfully created the Company Customer");
		Log.endTestCase("verifyCompanyCustomerCreation");
		softAssert.assertAll();
		}
	
	@Test(priority = 8, dataProvider = "compCustomerCreation", dataProviderClass = DataProviders.class, groups = "Smoke")
	public void verifyCompanySupplierConfig(HashMap<String,String> hashMapValue) throws InterruptedException {
		complistpage = new CompanyListPage();
		random = new Random();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyCompanySupplierConfig");
		Log.info("Verifying the user can be able to config the supplier");
		complistpage.clickSupplierConfigIcon();
		complistpage.clickAddNewButton();
		complistpage.selectSupplierConfigName(hashMapValue.get("Supplier Config"));
		complistpage.clickSave();
		String successText = complistpage.getSuccessText();
		softAssert.assertEquals(successText,prop.getProperty("savedsuccessfully"));
		complistpage.clickSuccessText();
		String[] supplierConfig = hashMapValue.get("Supplier Config").split("[,]",0);
		for(int i=0;i<supplierConfig.length;i++) {
            String configtext = complistpage.getUserCreationFirstnameText(supplierConfig[i]);
            Log.info(configtext);
            Log.info(supplierConfig[i]);
            softAssert.assertEquals(configtext,supplierConfig[i]);
         }
		complistpage.clickCloseButton();
		Log.info("The user successfully configured the supplier");
		Log.endTestCase("verifyCompanySupplierConfig");
		softAssert.assertAll();
		}
	
	@Test(priority = 9, dataProvider = "compCustomerCreation", dataProviderClass = DataProviders.class, groups = "Smoke")
	public void verifyCompanyFOP(HashMap<String,String> hashMapValue) throws InterruptedException {
		complistpage = new CompanyListPage();
		random = new Random();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyCompanyFOP");
		Log.info("Verifying the user can be able to set the FOP");
		complistpage.clickFOPIcon();
		complistpage.clickCustomerCreationAddnewButton();
		complistpage.clickFOPTypeDropdown();
		complistpage.selectFOPType(hashMapValue.get("FOP Type"));
		complistpage.selectFOPDefault(hashMapValue.get("FOP Default"));
		complistpage.clickSave();
		String successText = complistpage.getSuccessText();
		softAssert.assertEquals(successText,prop.getProperty("savedsuccessfully"));
		complistpage.clickSuccessText();
        String fopType = complistpage.getUserCreationFirstnameText(hashMapValue.get("FOP Type"));
        softAssert.assertEquals(fopType,hashMapValue.get("FOP Type"));
        String fopDefault = complistpage.getUserCreationLastnameText(hashMapValue.get("FOP Default"));
        softAssert.assertEquals(fopDefault,hashMapValue.get("FOP Default"));
		complistpage.clickCloseButton();
		Log.info("The user successfully set the FOP");
		Log.endTestCase("verifyCompanyFOP");
		softAssert.assertAll();
		}
	


}
