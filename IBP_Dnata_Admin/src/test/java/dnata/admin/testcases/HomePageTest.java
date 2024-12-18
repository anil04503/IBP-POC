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
public class HomePageTest extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	SoftAssert softAssert;
	
	

	
	@Test(priority = 0,groups = "Smoke")
	public void verifyOrgDetailsText() {
		homepage = new HomePage();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyOrgDetailsText");
		Log.info("Verifying the Organization Details text is displayed in the Home page");
		String orgdetailstext = homepage.getorganizationDetailsText();
		softAssert.assertEquals(orgdetailstext,prop.getProperty("orgabizationdetailstext"));
		Log.info("The Organization Details text is displayed successfully in the Home page");
		Log.endTestCase("verifyOrgDetailsText");
		softAssert.assertAll();
		}
	
	@Test(priority = 1,groups = "Smoke")
	public void verifyOrgDetailsParameters() {
		homepage = new HomePage();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyOrgDetailsParameters");
		Log.info("Verifying the Organization Details parameters are displayed in the Home page");
		String nametext = homepage.getorgdetailsNameText();
		softAssert.assertEquals(nametext,prop.getProperty("nametext"));
		String shortnametext = homepage.getorgdetailsShortNameText();
		softAssert.assertEquals(shortnametext,prop.getProperty("shortnametext"));
		String countrytext = homepage.getorgdetailsCountryText();
		softAssert.assertEquals(countrytext,prop.getProperty("countrytext"));
		String citytext = homepage.getorgdetailsCityText();
		softAssert.assertEquals(citytext,prop.getProperty("citytext"));
		String zipcodetext = homepage.getorgdetailsZipcodeText();
		softAssert.assertEquals(zipcodetext,prop.getProperty("zipcodetext"));
		String addresstext = homepage.getorgdetailsAddressText();
		softAssert.assertEquals(addresstext,prop.getProperty("addresstext"));
		String phonenumbertext = homepage.getorgdetailsPhoeNoText();
		softAssert.assertEquals(phonenumbertext,prop.getProperty("phonenumbertext"));
		String emailtext = homepage.getorgdetailsEmailText();
		softAssert.assertEquals(emailtext,prop.getProperty("emailtext"));
		String Websitetext = homepage.getorgdetailsWebsiteText();
		softAssert.assertEquals(Websitetext,prop.getProperty("Websitetext"));
		String namevaluetext = homepage.getorgdetailsNameValueText();
		softAssert.assertEquals(namevaluetext,prop.getProperty("namevaluetext"));
		String shortnamevaluetext = homepage.getorgdetailsShortNameValueText();
		softAssert.assertEquals(shortnamevaluetext,prop.getProperty("shortnamevaluetext"));
		String countryvaluetext = homepage.getorgdetailsCountryValueText();
		softAssert.assertEquals(countryvaluetext,prop.getProperty("countryvaluetext"));
		String cityvaluetext = homepage.getorgdetailsCityValueText();
		softAssert.assertEquals(cityvaluetext,prop.getProperty("cityvaluetext"));
		String zipcodevaluetext = homepage.getorgdetailsZipcodeValueText();
		softAssert.assertEquals(zipcodevaluetext,prop.getProperty("zipcodevaluetext"));
		String addressvaluetext = homepage.getorgdetailsAddressValueText();
		softAssert.assertEquals(addressvaluetext,prop.getProperty("addressvaluetext"));
		String phonenumbervaluetext = homepage.getorgdetailsPhoeNoValueText();
		softAssert.assertEquals(phonenumbervaluetext,prop.getProperty("phonenumbervaluetext"));
		String emailvaluetext = homepage.getorgdetailsEmailValueText();
		softAssert.assertEquals(emailvaluetext,prop.getProperty("emailvaluetext"));
		String Websitevaluetext = homepage.getorgdetailsWebsiteValueText();
		softAssert.assertEquals(Websitevaluetext,prop.getProperty("Websitevaluetext"));
		Log.info("The Organization Details parameters are displayed successfully in the Home page");
		Log.endTestCase("verifyOrgDetailsParameters");
		softAssert.assertAll();
		}
	
	@Test(priority = 2,groups = "Smoke")
	public void verifyCompanyListheadingText() {
		homepage = new HomePage();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyCompanyListheadingText");
		Log.info("Verifying the Company List text is displayed in the Home page");
		homepage.clickoncompanyarrowButton();
		homepage.clickCompanyListMenu();
		String companylistheadingText = homepage.getCompanyListheadingText();
		softAssert.assertEquals(companylistheadingText,prop.getProperty("companylistheadingtext"));
		Log.info("The Company List text is displayed successfully in the Home page");
		Log.endTestCase("verifyCompanyListheadingText");
		softAssert.assertAll();
		}
	


}
