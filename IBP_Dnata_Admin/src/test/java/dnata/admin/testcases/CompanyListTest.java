/**
 * 
 */
package dnata.admin.testcases;


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
	public void verifyBranchCompanyCreation(HashMap<String,String> hashMapValue) throws InterruptedException {
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
		complistpage.logoUpload(System.getProperty("user.dir") + "\\AutoIT\\UploadFile.exe");
		complistpage.companyDocUpload(System.getProperty("user.dir") + "\\AutoIT\\UploadFile.exe");
		complistpage.clickSave();
		String successText = complistpage.getSuccessText();
		Assert.assertEquals(successText,prop.getProperty("savedsuccessfully"));
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
		complistpage.logoUpload(System.getProperty("user.dir") + "\\AutoIT\\UploadFile.exe");
		complistpage.companyDocUpload(System.getProperty("user.dir") + "\\AutoIT\\UploadFile.exe");
		complistpage.clickSave();
		String successText = complistpage.getSuccessText();
		Assert.assertEquals(successText,prop.getProperty("savedsuccessfully"));
		complistpage.clickFirstTMCexpandButton();
		B2BCompany = complistpage.getCompanyCrationText(name);
		Assert.assertEquals(B2BCompany,name);
		Log.info("The user successfully created the B2B Company");
		Log.endTestCase("verifyB2BCompanyCreation");
		}
	


}
