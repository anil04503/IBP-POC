/**
 * 
 */
package dnata.admin.testcases;


import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

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
	
	

	
	@Test(priority = 0,groups = "Smoke")
	public void verifyOrgDetailsText() {
		homepage = new HomePage();
		Log.startTestCase("verifyOrgDetailsText");
		Log.info("Verifying the Organization Details text is displayed in the Home page");
		String orgdetailstext = homepage.getorganizationDetailsText();
		Assert.assertEquals(orgdetailstext,prop.getProperty("orgabizationdetailstext"));
		Log.info("The Organization Details text is displayed successfully in the Home page");
		Log.endTestCase("verifyOrgDetailsText");
		}
	
	@Test(priority = 1,groups = "Smoke")
	public void verifyOrgDetailsParameters() {
		homepage = new HomePage();
		Log.startTestCase("verifyOrgDetailsParameters");
		Log.info("Verifying the Organization Details parameters are displayed in the Home page");
		String nametext = homepage.getorgdetailsNameText();
		Assert.assertEquals(nametext,prop.getProperty("nametext"));
		String shortnametext = homepage.getorgdetailsShortNameText();
		Assert.assertEquals(shortnametext,prop.getProperty("shortnametext"));
		String countrytext = homepage.getorgdetailsCountryText();
		Assert.assertEquals(countrytext,prop.getProperty("countrytext"));
		String citytext = homepage.getorgdetailsCityText();
		Assert.assertEquals(citytext,prop.getProperty("citytext"));
		String zipcodetext = homepage.getorgdetailsZipcodeText();
		Assert.assertEquals(zipcodetext,prop.getProperty("zipcodetext"));
		String addresstext = homepage.getorgdetailsAddressText();
		Assert.assertEquals(addresstext,prop.getProperty("addresstext"));
		String phonenumbertext = homepage.getorgdetailsPhoeNoText();
		Assert.assertEquals(phonenumbertext,prop.getProperty("phonenumbertext"));
		String emailtext = homepage.getorgdetailsEmailText();
		Assert.assertEquals(emailtext,prop.getProperty("emailtext"));
		String Websitetext = homepage.getorgdetailsWebsiteText();
		Assert.assertEquals(Websitetext,prop.getProperty("Websitetext"));
		String namevaluetext = homepage.getorgdetailsNameValueText();
		Assert.assertEquals(namevaluetext,prop.getProperty("namevaluetext"));
		String shortnamevaluetext = homepage.getorgdetailsShortNameValueText();
		Assert.assertEquals(shortnamevaluetext,prop.getProperty("shortnamevaluetext"));
		String countryvaluetext = homepage.getorgdetailsCountryValueText();
		Assert.assertEquals(countryvaluetext,prop.getProperty("countryvaluetext"));
		String cityvaluetext = homepage.getorgdetailsCityValueText();
		Assert.assertEquals(cityvaluetext,prop.getProperty("cityvaluetext"));
		String zipcodevaluetext = homepage.getorgdetailsZipcodeValueText();
		Assert.assertEquals(zipcodevaluetext,prop.getProperty("zipcodevaluetext"));
		String addressvaluetext = homepage.getorgdetailsAddressValueText();
		Assert.assertEquals(addressvaluetext,prop.getProperty("addressvaluetext"));
		String phonenumbervaluetext = homepage.getorgdetailsPhoeNoValueText();
		Assert.assertEquals(phonenumbervaluetext,prop.getProperty("phonenumbervaluetext"));
		String emailvaluetext = homepage.getorgdetailsEmailValueText();
		Assert.assertEquals(emailvaluetext,prop.getProperty("emailvaluetext"));
		String Websitevaluetext = homepage.getorgdetailsWebsiteValueText();
		Assert.assertEquals(Websitevaluetext,prop.getProperty("Websitevaluetext"));
		Log.info("The Organization Details parameters are displayed successfully in the Home page");
		Log.endTestCase("verifyOrgDetailsParameters");
		}
	
	@Test(priority = 2,groups = "Smoke")
	public void verifyCompanyListheadingText() {
		homepage = new HomePage();
		Log.startTestCase("verifyCompanyListheadingText");
		Log.info("Verifying the Company List text is displayed in the Home page");
		homepage.clickoncompanyarrowButton();
		homepage.clickCompanyListMenu();
		String companylistheadingText = homepage.getCompanyListheadingText();
		Assert.assertEquals(companylistheadingText,prop.getProperty("companylistheadingtext"));
		Log.info("The Company List text is displayed successfully in the Home page");
		Log.endTestCase("verifyCompanyListheadingText");
		}
	


}
