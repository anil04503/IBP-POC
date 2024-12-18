/**
 * 
 */
package dnata.admin.testcases;


import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import dnata.admin.actiondriver.Action;
import dnata.admin.base.BaseClass;
import dnata.admin.dataprovider.DataProviders;
import dnata.admin.pageobjects.HomePage;
import dnata.admin.pageobjects.LoginPage;
import dnata.admin.utility.Log;

/**
 * 
 */
public class LoginPageTest extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	SoftAssert softAssert;
	
	
	@Test(priority = 0, dataProvider = "ValidUserandPwd", dataProviderClass = DataProviders.class, groups = "Smoke")
	public void verifyLoginSuccess(HashMap<String,String> hashMapValue) throws InterruptedException {
		loginpage = new LoginPage();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyLoginSuccess");
		Log.info("Verifying the Application is logged in successfully");
		loginpage.clickDnataStaffLink();
		loginpage.enterEmail(hashMapValue.get("Username"));
		loginpage.clickNextButton();
		loginpage.enterPassword(hashMapValue.get("Password"));
		loginpage.clickSiginButton();
		loginpage.clickYesButton();
		String title = Action.getTitle();
		softAssert.assertEquals(title, prop.getProperty("title"));
		Log.info("The Applicaton is logged in successfully");
		Log.endTestCase("verifyLoginSuccess");
		softAssert.assertAll();
		}
	


}
