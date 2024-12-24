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
import dnata.admin.pageobjects.CarRentalRulePage;
import dnata.admin.pageobjects.CompanyListPage;
import dnata.admin.pageobjects.HomePage;
import dnata.admin.pageobjects.LoginPage;
import dnata.admin.utility.Log;

/**
 * 
 */
public class CarRentalRuleTest extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	CompanyListPage complistpage;
	CarRentalRulePage carrentalrule;
	Random random;
	SoftAssert softAssert;
	String ruleName;
	
	

	
	@Test(priority = 0,groups = "Smoke")
	public void verifyCarRentalRuleCreationListheadingText() throws InterruptedException {
		homepage = new HomePage();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyCarRentalRuleCreationListheadingText");
		Log.info("Verifying the Car Rental Rule Creation List text is displayed in the Home page");
		homepage.clickonServiceChargearrowButton();
		homepage.clickCarRentalRuleMenu();
		homepage.clickonServiceChargearrowButton();
		String carrentalrulelistheadingText = homepage.getCarRentalRuleCreationListheadingText();
		softAssert.assertEquals(carrentalrulelistheadingText,prop.getProperty("carrentalrulelistheadingtext"));
		Log.info("The Car Rental Rule Creation List text is displayed successfully in the Home page");
		Log.endTestCase("verifyCarRentalRuleCreationListheadingText");
		softAssert.assertAll();
		}
	
	@Test(priority = 1, dataProvider = "carRentalRuleCreation", dataProviderClass = DataProviders.class, groups = "Smoke")
	public void verifyCarRentalRuleCreation(HashMap<String,String> hashMapValue) throws InterruptedException {
		carrentalrule = new CarRentalRulePage();
		random = new Random();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyCarRentalRuleCreation");
		Log.info("Verifying the user can be able to create the Car Rental Rule");
		carrentalrule.clickonAddNewButton();
		ruleName = random.nextInt(10000)+hashMapValue.get("Rule Name");
		carrentalrule.enterRuleName(ruleName);
		carrentalrule.clickBookingTypeDropdownButton();
		carrentalrule.selectBookingType(hashMapValue.get("Booking Type"));
		carrentalrule.clickSupplierDropdownButton();
		carrentalrule.selectSupplier(hashMapValue.get("Supplier"));
		carrentalrule.clickRegionDropdownButton();
		carrentalrule.selectSupplier(hashMapValue.get("Region"));
		carrentalrule.clickCarRentalRuleSaveButton();
		String successText = carrentalrule.getSuccessText();
		softAssert.assertEquals(successText,prop.getProperty("savedsuccesstext"));
		carrentalrule.clickSuccessText();
		String ruleNameText = carrentalrule.getCarRentalRuleNameText(ruleName);
		softAssert.assertEquals(ruleNameText,ruleName);
		String bookingtype = hashMapValue.get("Booking Type").trim();
		String bookingType = carrentalrule.getCarRentalRuleBookingTypeText(ruleName);
		softAssert.assertEquals(bookingType,bookingtype);
		String suppliertext = hashMapValue.get("Supplier").trim();
		String supplier = carrentalrule.getCarRentalRuleSupplierText(ruleName);
		softAssert.assertEquals(supplier,suppliertext);
		String status = carrentalrule.getCarRentalRuleStatusText(ruleName);
		softAssert.assertEquals(status,prop.getProperty("active"));
		Log.info("The user successfully created the Car Rental Rule");
		Log.endTestCase("verifyCarRentalRuleCreation");
		softAssert.assertAll();
		}
	
	@Test(priority = 2,groups = "Smoke")
	public void verifyCarRentalRuleEditCancelButton() throws InterruptedException {
		homepage = new HomePage();
		carrentalrule = new CarRentalRulePage();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyCarRentalRuleEditCancelButton");
		Log.info("Verifying the user can be able to click the Cancel button");
		carrentalrule.clickCarRentalRuleEditButton(ruleName);
		String carrentalruleformheadingText = carrentalrule.getCarRentalRuleCreationFormText();
		softAssert.assertEquals(carrentalruleformheadingText,prop.getProperty("carrentalruleformheadingtext"));
		carrentalrule.clickEditCancelButton();
		String carrentalrulelistheadingText = homepage.getCarRentalRuleCreationListheadingText();
		softAssert.assertEquals(carrentalrulelistheadingText,prop.getProperty("carrentalrulelistheadingtext"));
		Log.info("The user successfully clicked the Cancel button");
		Log.endTestCase("verifyCarRentalRuleEditCancelButton");
		softAssert.assertAll();
		}
	
	@Test(priority = 3, dataProvider = "carRentalRuleCreationEdit", dataProviderClass = DataProviders.class, groups = "Smoke")
	public void verifyCarRentalRuleEdit(HashMap<String,String> hashMapValue) throws InterruptedException {
		carrentalrule = new CarRentalRulePage();
		random = new Random();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyCarRentalRuleEdit");
		Log.info("Verifying the user can be able to edit the Car Rental Rule");
		carrentalrule.clickCarRentalRuleEditButton(ruleName);
		ruleName = random.nextInt(10000)+hashMapValue.get("Rule Name");
		carrentalrule.clearRuleNameInputField();
		carrentalrule.enterRuleName(ruleName);
		carrentalrule.clickBookingTypeDropdownButton();
		carrentalrule.selectBookingType(hashMapValue.get("Booking Type"));
		carrentalrule.clickSupplierDropdownButton();
		carrentalrule.selectSupplier(hashMapValue.get("Supplier"));
		carrentalrule.clickRegionDropdownButton();
		carrentalrule.selectSupplier(hashMapValue.get("Region"));
		carrentalrule.clickCarRentalRuleUpdateButton();
		String successText = carrentalrule.getUpdateSuccessText();
		softAssert.assertEquals(successText,prop.getProperty("updatesuccesstext"));
		carrentalrule.clickUpdateSuccessText();
		String ruleNameText = carrentalrule.getCarRentalRuleNameText(ruleName);
		softAssert.assertEquals(ruleNameText,ruleName);
		String bookingtype = hashMapValue.get("Booking Type").trim();
		String bookingType = carrentalrule.getCarRentalRuleBookingTypeText(ruleName);
		softAssert.assertEquals(bookingType,bookingtype);
		String suppliertext = hashMapValue.get("Supplier").trim();
		String supplier = carrentalrule.getCarRentalRuleSupplierText(ruleName);
		softAssert.assertEquals(supplier,suppliertext);
		String status = carrentalrule.getCarRentalRuleStatusText(ruleName);
		softAssert.assertEquals(status,prop.getProperty("active"));
		Log.info("The user successfully edited the Car Rental Rule");
		Log.endTestCase("verifyCarRentalRuleEdit");
		softAssert.assertAll();
		}
	
	@Test(priority = 4, dataProvider = "carRentalRuleCreationEdit", dataProviderClass = DataProviders.class, groups = "Smoke")
	public void verifyCarRentalRuleView(HashMap<String,String> hashMapValue) throws InterruptedException {
		carrentalrule = new CarRentalRulePage();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyCarRentalRuleView");
		Log.info("Verifying the user can be able to view the Car Rental Rule");
		carrentalrule.clickCarRentalRuleViewButton(ruleName);
		softAssert.assertFalse(carrentalrule.ruleNamefieldDisabled());
		String ruleNameText = carrentalrule.getRuleNameText();
		softAssert.assertEquals(ruleNameText,ruleName);
		String bookingtype = hashMapValue.get("Booking Type").trim();
		String bookingType = carrentalrule.getBookingTypeText();
		softAssert.assertEquals(bookingType,bookingtype);
		String suppliertext = hashMapValue.get("Supplier").trim();
		String supplier = carrentalrule.getSupplierText();
		softAssert.assertEquals(supplier,suppliertext);
		String regiontext = hashMapValue.get("Region").trim();
		String region = carrentalrule.getRegionText();
		softAssert.assertEquals(region,regiontext);
		carrentalrule.clickCarRentalRulePopupcloseButton();
		Log.info("The user successfully view the Car Rental Rule");
		Log.endTestCase("verifyCarRentalRuleView");
		softAssert.assertAll();
		}
	
	@Test(priority = 5, groups = "Smoke")
	public void verifyCarRentalRuleDeletePopup() throws InterruptedException {
		carrentalrule = new CarRentalRulePage();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyCarRentalRuleDeletePopupText");
		Log.info("Verifying the user can be able to click on the Delete button of the Car Rental Rule");
		carrentalrule.clickCarRentalRuleDeleteButton(ruleName);
		String dltPopupText = carrentalrule.getDeletePopupText();
		softAssert.assertEquals(dltPopupText,prop.getProperty("deletepopuptext"));
		Log.info("The user successfully clicked on the Delete button of the Car Rental Rule");
		Log.endTestCase("verifyCarRentalRuleDeletePopupText");
		softAssert.assertAll();
		}
	
	@Test(priority = 6, groups = "Smoke")
	public void verifyCarRentalRuleDeletePopupNoButton() throws InterruptedException {
		carrentalrule = new CarRentalRulePage();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyCarRentalRuleDeletePopupNoButton");
		Log.info("Verifying the user can be able to click on the Delete popup No button of the Car Rental Rule");
		carrentalrule.clickDeleteNoButton();
		String ruleNameText = carrentalrule.getCarRentalRuleNameText(ruleName);
		softAssert.assertEquals(ruleNameText,ruleName);
		Log.info("The user successfully clicked on the Delete popup no button of the Car Rental Rule");
		Log.endTestCase("verifyCarRentalRuleDeletePopupNoButton");
		softAssert.assertAll();
		}
	
	@Test(priority = 7, groups = "Smoke")
	public void verifyCarRentalRuleDelete() throws InterruptedException {
		carrentalrule = new CarRentalRulePage();
		softAssert = new SoftAssert();
		Log.startTestCase("verifyCarRentalRuleDelete");
		Log.info("Verifying the user can be able to Delete the Car Rental Rule");
		carrentalrule.clickCarRentalRuleDeleteButton(ruleName);
		carrentalrule.clickDeleteYesButton();
		String deleteSuccessText = carrentalrule.getDeleteSuccessText();
		softAssert.assertEquals(deleteSuccessText,prop.getProperty("deletesuccesstext"));
		carrentalrule.clickDeleteSuccessText();
		String ruleNameText = carrentalrule.getCarRentalRuleNameText(ruleName);
		softAssert.assertNotEquals(ruleNameText, ruleName);
		Log.info("The user successfully Deleted the car Rental Rule");
		Log.endTestCase("verifyCarRentalRuleDelete");
		softAssert.assertAll();
		}
	

	


}
