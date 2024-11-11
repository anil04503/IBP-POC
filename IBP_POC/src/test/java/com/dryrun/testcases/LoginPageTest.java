/**
 * 
 */
package com.dryrun.testcases;


import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dryrun.base.BaseClass;
import com.dryrun.dataprovider.DataProviders;
import com.dryrun.pageobjects.HomePage;
import com.dryrun.pageobjects.LoginPage;
import com.dryrun.utility.Log;

/**
 * 
 */
public class LoginPageTest extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	
	
	@Test(priority = 0,groups = "Regression")
	public void verifyAIroastamaniLogo() {
		loginpage = new LoginPage();
		Log.startTestCase("verifyAIroastamaniLogo");
		Log.info("Verifying the AI Roastamani Logo is Displayed in the Login Page");
		boolean result = loginpage.getAIRostamaniLogo();
		Assert.assertTrue(result);
		Log.info("The AI Roastamani Logo is Displayed successfully in the Login Page");
		Log.endTestCase("verifyAIroastamaniLogo");
		}
	
	@Test(priority = 1,groups = "Smoke")
	public void verifyTitle() {
		loginpage = new LoginPage();
		Log.startTestCase("verifyTitle");
		Log.info("Verifying the Title \"ART - ADMIN\" of the page is displayed");
		String title = loginpage.getTitle();
		Assert.assertEquals(title, prop.getProperty("title"));
		Log.info("The Title \"ART - ADMIN\" is displayed successfully");
		Log.endTestCase("verifyTitle");
		}
	
	@Test(priority = 2,groups = {"Regression","Sanity"})
	public void verifyemailtext() {
		loginpage = new LoginPage();
		Log.startTestCase("verifyemailtext");
		Log.info("Verifying the \"Email\" text is displayed in the username field");
		String emailtext = loginpage.getemailtext();
		Assert.assertEquals(emailtext, prop.getProperty("emailtext"));
		Log.info("The \"Email\" text is displayed successfully in the username field");
		Log.endTestCase("verifyemailtext");
		}
	
	@Test(priority = 3,groups = {"Smoke","Sanity"})
	public void verifypasswordtext() {
		loginpage = new LoginPage();
		Log.startTestCase("verifypasswordtext");
		Log.info("Verifying the \"password\" text is displayed in the username field");
		String passwordtext = loginpage.getpasswordtext();
		Assert.assertEquals(passwordtext, prop.getProperty("passwordtext"));
		Log.info("The \"password\" text is displayed successfully in the username field");
		Log.endTestCase("verifypasswordtext");
		}
	
	@Test(priority = 4,groups = {"Regression","Sanity"})
	public void verifyusrnameRequiredtext() {
		loginpage = new LoginPage();
		Log.startTestCase("verifyusrnameRequiredtext");
		Log.info("Verifying the required field text is displayed for the username field");
		loginpage.clickonSignInbutton();
		String userRequired = loginpage.getusernameRequiredtext();
		Assert.assertEquals(userRequired, prop.getProperty("requiredfieldtext"));
		Log.info("The required field text is displayed successfully for the username field");
		Log.endTestCase("verifyusrnameRequiredtext");
		}
	
	@Test(priority = 5,groups = {"Regression","Sanity"})
	public void verifypasswordRequiredtext() {
		loginpage = new LoginPage();
		Log.startTestCase("verifypasswordRequiredtext");
		Log.info("Verifying the required field text is displayed for the password field");
		loginpage.clickonSignInbutton();
		String pwdRequired = loginpage.getpasswordRequiredtext();
		Assert.assertEquals(pwdRequired, prop.getProperty("requiredfieldtext"));
		Log.info("The required field text is displayed successfully for the password field");
		Log.endTestCase("verifypasswordRequiredtext");
		}
	
	@Test(priority = 6,dataProvider = "wrongUser", dataProviderClass = DataProviders.class, groups = {"Smoke","Sanity"})
	public void verifyusernamenotvalidtext(HashMap<String,String> hashMapValue) throws InterruptedException {
		loginpage = new LoginPage();
		Log.startTestCase("verifyusernamenotvalidtext");
		Log.info("Verifying the username not valid text is displayed for the username field");
		loginpage.enterUsername(hashMapValue.get("Username"));
		Thread.sleep(2000);
		String userNotvalid = loginpage.getusrnotvalidtext();
		Assert.assertEquals(userNotvalid, prop.getProperty("fieldisnotvalidtext"));
		Log.info("The username not valid text is displayed successfully for the username field");
		Log.endTestCase("verifyusernamenotvalidtext");
		}
	
	@Test(priority = 7,dataProvider = "wrongUserandPwd", dataProviderClass = DataProviders.class, groups = {"Regression","Sanity"})
	public void verifyInvalidUserandPwdtext(HashMap<String,String> hashMapValue) throws InterruptedException {
		loginpage = new LoginPage();
		Log.startTestCase("verifyInvalidUserandPwdtext");
		Log.info("Verifying the username and password are invalid text is displayed");
		loginpage.enterUsername(hashMapValue.get("Username"));
		loginpage.enterPassword(hashMapValue.get("Password"));
		Thread.sleep(2000);
		loginpage.clickonSignInbutton();
		Thread.sleep(3000);
		String invalidUsrandPwd = loginpage.getInvalidusrandpwdtext();
		Assert.assertEquals(invalidUsrandPwd, prop.getProperty("invaliduserandpwd"));
		Log.info("The username and password are invalid text is displayed successfully");
		Log.endTestCase("verifyInvalidUserandPwdtext");
		}
	
	@Test(priority = 8,dataProvider = "validUserandPwd", dataProviderClass = DataProviders.class, groups = {"Smoke","Sanity"})
	public void verifyLoginsuccess(HashMap<String,String> hashMapValue) throws InterruptedException {
		loginpage = new LoginPage();
		homepage = new HomePage();
		Log.startTestCase("verifyLoginsuccess");
		Log.info("Verifying the user has been logged in");
		loginpage.enterUsername(hashMapValue.get("Username"));
		loginpage.enterPassword(hashMapValue.get("Password"));
		Thread.sleep(2000);
		loginpage.clickonSignInbutton();
		Thread.sleep(3000);
		String loginSuccess = homepage.getloginsuccessText();
		Assert.assertEquals(loginSuccess, prop.getProperty("loginsuccesstext"));
		Log.info("The user has been logged in successfully");
		Log.endTestCase("verifyLoginsuccess");
		}

}
