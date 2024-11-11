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
public class HomePageTest extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	LoginPageTest lpt;
	
	
	@Test(priority = 0,dataProvider = "validUserandPwd",dataProviderClass = DataProviders.class, groups = "Smoke")
	public void verifyUsernameText(HashMap<String,String> hashMapValue) throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyUsernameText");
		Log.info("Verifying the logged in username is displayed in the Home page");
		String usrName = homepage.getUsernameText();
		Assert.assertEquals(usrName,hashMapValue.get("Username") );
		Log.info("The logged in username is displayed successfully in the Home page");
		Log.endTestCase("verifyUsernameText");
		}
	
	@Test(priority = 1,groups = "Smoke")
	public void verifyOrgDetailsText() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyOrgDetailsText");
		Log.info("Verifying the Organization details text is displayed in the Home page");
		String orgdetailstext = homepage.getorgDetailsText();
		Assert.assertEquals(orgdetailstext,prop.getProperty("orgabizationdetailstext"));
		Log.info("The Organization details text is displayed successfully in the Home page");
		Log.endTestCase("verifyOrgDetailsText");
		}
	
	@Test(priority = 2,groups = "Smoke")
	public void verifyOrganizationSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyOrganizationSidemenu");
		Log.info("Verifying the Organization side menu in the Home page");
		String orgtext = homepage.getorgsidemenuText();
		homepage.clickonorgarrowButton();
		Assert.assertEquals(orgtext,prop.getProperty("orgtext"));
		Log.info("The Organization side menu is verified successfully in the Home page");
		Log.endTestCase("verifyOrganizationSidemenu");
		}
	
	@Test(priority = 3,groups = "Smoke")
	public void verifyOrganizationInfoSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyOrganizationInfoSidemenu");
		Log.info("Verifying the Organization Info side menu in the Home page");
		String orginfotext = homepage.getorgInfosidemenuText();
		homepage.clickorgInfoMenu();
		Assert.assertEquals(orginfotext,prop.getProperty("orginfotext"));
		Log.info("The Organization Info side menu is verified successfully in the Home page");
		Log.endTestCase("verifyOrganizationInfoSidemenu");
		}
	
	@Test(priority = 4,groups = "Smoke")
	public void verifyDocControlSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyDocControlSidemenu");
		Log.info("Verifying the Document Control side menu in the Home page");
		String doccontrltext = homepage.getdoccontrolsidemenuText();
		homepage.clickdocControlMenu();
		Assert.assertEquals(doccontrltext,prop.getProperty("doccontroltext"));
		Log.info("The Document Control side menu is verified successfully in the Home page");
		Log.endTestCase("verifyDocControlSidemenu");
		}
	
	@Test(priority = 5,groups = "Smoke")
	public void verifyTaxMasterSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyTaxMasterSidemenu");
		Log.info("Verifying the Tax Master side menu in the Home page");
		String taxmastertext = homepage.gettaxmastersidemenuText();
		homepage.clicktaxMasterMenu();
		Assert.assertEquals(taxmastertext,prop.getProperty("taxmastertext"));
		Log.info("The Tax Master side menu is verified successfully in the Home page");
		Log.endTestCase("verifyTaxMasterSidemenu");
		}
	
	@Test(priority = 6,groups = "Smoke")
	public void verifyBrandMasterSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyBrandMasterSidemenu");
		Log.info("Verifying the Brand Master side menu in the Home page");
		String brandmastertext = homepage.getbrandmastersidemenuText();
		homepage.clickbrandMasterMenu();
		Assert.assertEquals(brandmastertext,prop.getProperty("brandmastertext"));
		Log.info("The Brand Master side menu is verified successfully in the Home page");
		Log.endTestCase("verifyBrandMasterSidemenu");
		}
	
	@Test(priority = 7,groups = "Smoke")
	public void verifyMailConfigSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyMailConfigSidemenu");
		Log.info("Verifying the Mail Config side menu in the Home page");
		String mailconfigtext = homepage.getmailconfigsidemenuText();
		homepage.clickmailConfigMenu();
		Assert.assertEquals(mailconfigtext,prop.getProperty("mailconfigtext"));
		Log.info("The Mail Config side menu is verified successfully in the Home page");
		Log.endTestCase("verifyMailConfigSidemenu");
		}
	
	@Test(priority = 8,groups = "Smoke")
	public void verifyMasterMngmtSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyMasterMngmtSidemenu");
		Log.info("Verifying the Master Management side menu in the Home page");
		String mastermngmttext = homepage.getmastermngmtsidemenuText();
		homepage.clickonmastermngmntarrowButton();
		Assert.assertEquals(mastermngmttext,prop.getProperty("mastermngmttext"));
		Log.info("The Master Management side menu is verified successfully in the Home page");
		Log.endTestCase("verifyMasterMngmtSidemenu");
		}
	
	@Test(priority = 9,groups = "Smoke")
	public void verifyAirLineSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyAirLineSidemenu");
		Log.info("Verifying the Air Line side menu in the Home page");
		String airlinetext = homepage.getairlinesidemenuText();
		homepage.clickairLineMenu();
		Assert.assertEquals(airlinetext,prop.getProperty("airlinetext"));
		Log.info("The Air Line side menu is verified successfully in the Home page");
		Log.endTestCase("verifyAirLineSidemenu");
		}
	
	@Test(priority = 10,groups = "Smoke")
	public void verifyAirPortSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyAirPortSidemenu");
		Log.info("Verifying the Air Port side menu in the Home page");
		String airporttext = homepage.getairportsidemenuText();
		homepage.clickairPorteMenu();
		Assert.assertEquals(airporttext,prop.getProperty("airporttext"));
		Log.info("The Air Port side menu is verified successfully in the Home page");
		Log.endTestCase("verifyAirPortSidemenu");
		}
	
	@Test(priority = 11,groups = "Smoke")
	public void verifyPromoCodeSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyPromoCodeSidemenu");
		Log.info("Verifying the Promo Code side menu in the Home page");
		String promocodetext = homepage.getpromocodesidemenuText();
		homepage.clickpromocodeMenu();
		Assert.assertEquals(promocodetext,prop.getProperty("promocodetext"));
		Log.info("The Promo Code side menu is verified successfully in the Home page");
		Log.endTestCase("verifyPromoCodeSidemenu");
		}
	
	@Test(priority = 12,groups = "Smoke")
	public void verifyAirLinecommSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyAirLinecommSidemenu");
		Log.info("Verifying the Air Line Commission side menu in the Home page");
		String airlinecommtext = homepage.getairlineCommsidemenuText();
		homepage.clickairlineCommMenu();
		Assert.assertEquals(airlinecommtext,prop.getProperty("airlinecommtext"));
		Log.info("The Air Line Commission side menu is verified successfully in the Home page");
		Log.endTestCase("verifyAirLinecommSidemenu");
		}
	
	@Test(priority = 13,groups = "Smoke")
	public void verifyDealCodesSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyDealCodesSidemenu");
		Log.info("Verifying the Deal Codes side menu in the Home page");
		String dealcodestext = homepage.getdealCodesidemenuText();
		homepage.clickdealCodeMenu();
		Assert.assertEquals(dealcodestext,prop.getProperty("dealcodestext"));
		Log.info("The Deal Codes side menu is verified successfully in the Home page");
		Log.endTestCase("verifyDealCodesSidemenu");
		}
	
	@Test(priority = 14,groups = "Smoke")
	public void verifyCorpCatMstrSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyCorpCatMstrSidemenu");
		Log.info("Verifying the Corporate Category Master side menu in the Home page");
		String corpcattext = homepage.getcorpcatsidemenuText();
		homepage.clickcorcatMenu();
		Assert.assertEquals(corpcattext,prop.getProperty("corcatmastertext"));
		Log.info("The Corporate Category Master menu is verified successfully in the Home page");
		Log.endTestCase("verifyCorpCatMstrSidemenu");
		}
	
	@Test(priority = 15,groups = "Smoke")
	public void verifyCustGrpMstrSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyCustGrpMstrSidemenu");
		Log.info("Verifying the Customer Group Master side menu in the Home page");
		String corpcattext = homepage.getcusgrpmstrsidemenuText();
		homepage.clickcusmstrMenu();
		Assert.assertEquals(corpcattext,prop.getProperty("custgrpmastertext"));
		Log.info("The Customer Group Master menu is verified successfully in the Home page");
		Log.endTestCase("verifyCustGrpMstrSidemenu");
		}
	
	@Test(priority = 16,groups = "Smoke")
	public void verifyCompChnlMstrSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyCompChnlMstrSidemenu");
		Log.info("Verifying the Company Channel Master side menu in the Home page");
		String compchntext = homepage.getcompchnlsidemenuText();
		homepage.clickcmpchnMenu();
		Assert.assertEquals(compchntext,prop.getProperty("cmpchnmastertext"));
		Log.info("The Company Channel Master menu is verified successfully in the Home page");
		Log.endTestCase("verifyCompChnlMstrSidemenu");
		}
	
	@Test(priority = 17,groups = "Smoke")
	public void verifyCostCntrMstrSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyCostCntrMstrSidemenu");
		Log.info("Verifying the Cost Center Master side menu in the Home page");
		String costcntrtext = homepage.getcostcntrsidemenuText();
		homepage.clickcostcntrMenu();
		Assert.assertEquals(costcntrtext,prop.getProperty("costcentermastertext"));
		Log.info("The Cost Center Master menu is verified successfully in the Home page");
		Log.endTestCase("verifyCostCntrMstrSidemenu");
		}
	
	@Test(priority = 18,groups = "Smoke")
	public void verifyRoleMngmtSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyRoleMngmtSidemenu");
		Log.info("Verifying the Role Management side menu in the Home page");
		String rolemngmttext = homepage.getrolemngmtsidemenuText();
		homepage.clickonrolemngmntarrowButton();
		Assert.assertEquals(rolemngmttext,prop.getProperty("rolemngmttext"));
		Log.info("The Role Management menu is verified successfully in the Home page");
		Log.endTestCase("verifyRoleMngmtSidemenu");
		}
	
	@Test(priority = 19,groups = "Smoke")
	public void verifyRoleCreationSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyRoleCreationSidemenu");
		Log.info("Verifying the Role Creation side menu in the Home page");
		String rolecreationtext = homepage.getrolecrtnsidemenuText();
		homepage.clickrolecrtnMenu();
		Assert.assertEquals(rolecreationtext,prop.getProperty("rolecreationtext"));
		Log.info("The Role Creation menu is verified successfully in the Home page");
		Log.endTestCase("verifyRoleCreationSidemenu");
		}
	
	@Test(priority = 20,groups = "Smoke")
	public void verifyRoleProgramsSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyRoleProgramsSidemenu");
		Log.info("Verifying the Role program side menu in the Home page");
		String roleprogramtext = homepage.getroleprogmssidemenuText();
		homepage.clickroleprogrmMenu();
		Assert.assertEquals(roleprogramtext,prop.getProperty("roleprogramtext"));
		Log.info("The Role program menu is verified successfully in the Home page");
		Log.endTestCase("verifyRoleProgramsSidemenu");
		}
	
	@Test(priority = 21,groups = "Smoke")
	public void verifyProviderMngmtSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyProviderMngmtSidemenu");
		Log.info("Verifying the Provider Management side menu in the Home page");
		String providermngmttext = homepage.getprvdrmngmtsidemenuText();
		homepage.clickonprvdrmngmntarrowButton();
		Assert.assertEquals(providermngmttext,prop.getProperty("providermngmttext"));
		Log.info("The Provider Management menu is verified successfully in the Home page");
		Log.endTestCase("verifyProviderMngmtSidemenu");
		}
	
	@Test(priority = 22,groups = "Smoke")
	public void verifyProviderSetupSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyProviderSetupSidemenu");
		Log.info("Verifying the Provider SetUp side menu in the Home page");
		String providersetuptext = homepage.getprvdrsetupsidemenuText();
		homepage.clickprvdrsetupMenu();
		Assert.assertEquals(providersetuptext,prop.getProperty("providersetuptext"));
		Log.info("The Provider SetUp menu is verified successfully in the Home page");
		Log.endTestCase("verifyProviderSetupSidemenu");
		}
	
	@Test(priority = 23,groups = "Smoke")
	public void verifyServiceChargeSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyServiceChargeSidemenu");
		Log.info("Verifying the Service Charge side menu in the Home page");
		String servicechargetext = homepage.getservicechargesidemenuText();
		homepage.clickonservicechargearrowButton();
		Assert.assertEquals(servicechargetext,prop.getProperty("servivechanrgetext"));
		Log.info("The Servive Charge menu is verified successfully in the Home page");
		Log.endTestCase("verifyServiceChargeSidemenu");
		}
	
	@Test(priority = 24,groups = "Smoke")
	public void verifyFlightRuleSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyFlightRuleSidemenu");
		Log.info("Verifying the Flight Rule side menu in the Home page");
		String flightruletext = homepage.getflightrulesidemenuText();
		homepage.clickflightruleMenu();
		Assert.assertEquals(flightruletext,prop.getProperty("flightruletext"));
		Log.info("The Flight Rule side menu is verified successfully in the Home page");
		Log.endTestCase("verifyFlightRuleSidemenu");
		}
	
	@Test(priority = 25,groups = "Smoke")
	public void verifyFlightTmpltSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyFlightTmpltSidemenu");
		Log.info("Verifying the Flight Template side menu in the Home page");
		String flighttmplttext = homepage.getflighttempltsidemenuText();
		homepage.clickflighttmpltMenu();
		Assert.assertEquals(flighttmplttext,prop.getProperty("flighttemplatetext"));
		Log.info("The Flight Template side menu is verified successfully in the Home page");
		Log.endTestCase("verifyFlightTmpltSidemenu");
		}
	
	@Test(priority = 26,groups = "Smoke")
	public void verifyHotelRuleSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyHotelRuleSidemenu");
		Log.info("Verifying the Hotel Rule side menu in the Home page");
		String hotelruletext = homepage.gethotelRulesidemenuText();
		homepage.clickhotelruleMenu();
		Assert.assertEquals(hotelruletext,prop.getProperty("hotelruletext"));
		Log.info("The Hotel Rule side menu is verified successfully in the Home page");
		Log.endTestCase("verifyHotelRuleSidemenu");
		}
	
	@Test(priority = 27,groups = "Smoke")
	public void verifyHotelTmpltSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyHotelTmpltSidemenu");
		Log.info("Verifying the Hotel Template side menu in the Home page");
		String hoteltmplttext = homepage.gethoteltempltsidemenuText();
		homepage.clickhoteltmpltMenu();
		Assert.assertEquals(hoteltmplttext,prop.getProperty("hoteltemplatetext"));
		Log.info("The Hotel Template side menu is verified successfully in the Home page");
		Log.endTestCase("verifyHotelTmpltSidemenu");
		}
	
	@Test(priority = 28,groups = "Smoke")
	public void verifyInsuranceRuleSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyInsuranceRuleSidemenu");
		Log.info("Verifying the Insurance Rule side menu in the Home page");
		String insuranceruletext = homepage.getinsuranceRulesidemenuText();
		homepage.clickinsuranceruleMenu();
		Assert.assertEquals(insuranceruletext,prop.getProperty("insuranceruletext"));
		Log.info("The Insurance Rule side menu is verified successfully in the Home page");
		Log.endTestCase("verifyInsuranceRuleSidemenu");
		}
	
	@Test(priority = 29,groups = "Smoke")
	public void verifyInsuranceTmpltSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyInsuranceTmpltSidemenu");
		Log.info("Verifying the Insurance Template side menu in the Home page");
		String insurancetmplttext = homepage.getinsurancetempltsidemenuText();
		homepage.clickinsurancetempltMenu();
		Assert.assertEquals(insurancetmplttext,prop.getProperty("insurancetemplatetext"));
		Log.info("The Insurance Template side menu is verified successfully in the Home page");
		Log.endTestCase("verifyInsuranceTmpltSidemenu");
		}
	
	@Test(priority = 30,groups = "Smoke")
	public void verifyRailRuleSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyRailRuleSidemenu");
		Log.info("Verifying the Rail Rule side menu in the Home page");
		String railruletext = homepage.getrailrulesidemenuText();
		homepage.clickrailruleMenu();
		Assert.assertEquals(railruletext,prop.getProperty("railruletext"));
		Log.info("The Rail Rule side menu is verified successfully in the Home page");
		Log.endTestCase("verifyRailRuleSidemenu");
		}
	
	@Test(priority = 31,groups = "Smoke")
	public void verifyRailTempltSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyRailTempltSidemenu");
		Log.info("Verifying the Rail Template side menu in the Home page");
		String railtemplttext = homepage.getrailTempltsidemenuText();
		homepage.clickrailTmpltMenu();
		Assert.assertEquals(railtemplttext,prop.getProperty("railtemplatetext"));
		Log.info("The Rail Template side menu is verified successfully in the Home page");
		Log.endTestCase("verifyRailTempltSidemenu");
		}
	
	@Test(priority = 32,groups = "Smoke")
	public void verifyTransferRuleSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyTransferRuleSidemenu");
		Log.info("Verifying the Transfer Rule side menu in the Home page");
		String transferruletext = homepage.gettransferRulesidemenuText();
		homepage.clicktransferRuleMenu();
		Assert.assertEquals(transferruletext,prop.getProperty("transferruletext"));
		Log.info("The Transfer Rule side menu is verified successfully in the Home page");
		Log.endTestCase("verifyTransferRuleSidemenu");
		}
	
	@Test(priority = 33,groups = "Smoke")
	public void verifyTransferTmpltSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyTransferTmpltSidemenu");
		Log.info("Verifying the Transfer Template side menu in the Home page");
		String transfertmplttext = homepage.gettransferTempltsidemenuText();
		homepage.clicktransferTmpltMenu();
		Assert.assertEquals(transfertmplttext,prop.getProperty("transfertemplatetext"));
		Log.info("The Transfer Template side menu is verified successfully in the Home page");
		Log.endTestCase("verifyTransferTmpltSidemenu");
		}
	
	@Test(priority = 34,groups = "Smoke")
	public void verifyRailPAssRuleSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyRailPAssRuleSidemenu");
		Log.info("Verifying the Rail Pass Rule side menu in the Home page");
		String railpassruletext = homepage.getrailPassrulesidemenuText();
		homepage.clickrailPassruleMenu();
		Assert.assertEquals(railpassruletext,prop.getProperty("railpassruletext"));
		Log.info("The Rail PAss Rule side menu is verified successfully in the Home page");
		Log.endTestCase("verifyRailPAssRuleSidemenu");
		}
	
	@Test(priority = 35,groups = "Smoke")
	public void verifyRailPAssTmpltSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyRailPAssTmpltSidemenu");
		Log.info("Verifying the Rail Pass Template side menu in the Home page");
		String railpasstmplttext = homepage.getrailPassTmpltsidemenuText();
		homepage.clickrailpassTmpltMenu();
		Assert.assertEquals(railpasstmplttext,prop.getProperty("railpasstemplatetext"));
		Log.info("The Rail PAss Template side menu is verified successfully in the Home page");
		Log.endTestCase("verifyRailPAssTmpltSidemenu");
		}
	
	@Test(priority = 36,groups = "Smoke")
	public void verifyCompanySidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyCompanySidemenu");
		Log.info("Verifying the Company side menu in the Home page");
		String companytext = homepage.getcompanysidemenuText();
		homepage.clickoncompanyarrowButton();
		Assert.assertEquals(companytext,prop.getProperty("companytext"));
		Log.info("The Company side menu is verified successfully in the Home page");
		Log.endTestCase("verifyCompanySidemenu");
		}
	
	@Test(priority = 37,groups = "Smoke")
	public void verifyCompanyListSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyCompanyListSidemenu");
		Log.info("Verifying the Company List side menu in the Home page");
		String companylisttext = homepage.getcompanyListsidemenuText();
		homepage.clickCompanyListMenu();
		Assert.assertEquals(companylisttext,prop.getProperty("companylisttext"));
		Log.info("The Company List side menu is verified successfully in the Home page");
		Log.endTestCase("verifyCompanyListSidemenu");
		}
	
	@Test(priority = 38,groups = "Smoke")
	public void verifyBranchListSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyBranchListSidemenu");
		Log.info("Verifying the Branch List side menu in the Home page");
		String branchlisttext = homepage.getbranchListsidemenuText();
		homepage.clickbranchListMenu();
		Assert.assertEquals(branchlisttext,prop.getProperty("branchlisttext"));
		Log.info("The Branch List side menu is verified successfully in the Home page");
		Log.endTestCase("verifyBranchListSidemenu");
		}
	
	@Test(priority = 39,groups = "Smoke")
	public void verifyCopanySearchSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyCopanySearchSidemenu");
		Log.info("Verifying the Company Search side menu in the Home page");
		String companysearchtext = homepage.getCompanysearchsidemenuText();
		homepage.clickCompanysearcgMenu();
		Assert.assertEquals(companysearchtext,prop.getProperty("companysearchtext"));
		Log.info("The Company Search side menu is verified successfully in the Home page");
		Log.endTestCase("verifyCopanySearchSidemenu");
		}
	
	@Test(priority = 40,groups = "Smoke")
	public void verifyUserBranchSearchSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyUserBranchSearchSidemenu");
		Log.info("Verifying the User Branch Search side menu in the Home page");
		String userbrnchsearchtext = homepage.getUserbranchsidemenuText();
		homepage.clickUserbrnchMenu();
		Assert.assertEquals(userbrnchsearchtext,prop.getProperty("userbranchsearchtext"));
		Log.info("The User Branch Search side menu is verified successfully in the Home page");
		Log.endTestCase("verifyUserBranchSearchSidemenu");
		}
	
	@Test(priority = 41,groups = "Smoke")
	public void verifyCompExcelUploadSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyCompExcelUploadSidemenu");
		Log.info("Verifying the Company Excel Upload side menu in the Home page");
		String compexluploadtext = homepage.getCompanyExcelsidemenuText();
		homepage.clickcopanyExcelMenu();
		Assert.assertEquals(compexluploadtext,prop.getProperty("companyexceluploadtext"));
		Log.info("The Company Excel Upload side menu is verified successfully in the Home page");
		Log.endTestCase("verifyCompExcelUploadSidemenu");
		}
	
	@Test(priority = 42,groups = "Smoke")
	public void verifyPaymentApprovalSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyPaymentApprovalSidemenu");
		Log.info("Verifying the Payment Approval side menu in the Home page");
		String paymentapprotext = homepage.getpaymentApprovalsidemenuText();
		homepage.clickpaymentApproMenu();
		Assert.assertEquals(paymentapprotext,prop.getProperty("paymentapprovaltext"));
		Log.info("The Payment Approval side menu is verified successfully in the Home page");
		Log.endTestCase("verifyPaymentApprovalSidemenu");
		}
	
	@Test(priority = 43,groups = "Smoke")
	public void verifyPaymentSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyPaymentSidemenu");
		Log.info("Verifying the Payment side menu in the Home page");
		String paymenttext = homepage.getpaymentsidemenuText();
		homepage.clickpaymentMenu();
		Assert.assertEquals(paymenttext,prop.getProperty("paymenttext"));
		Log.info("The Payment side menu is verified successfully in the Home page");
		Log.endTestCase("verifyPaymentSidemenu");
		}
	
	@Test(priority = 44,groups = "Smoke")
	public void verifyReportsSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyReportsSidemenu");
		Log.info("Verifying the Reports side menu in the Home page");
		String reportstext = homepage.getReportssidemenuText();
		homepage.clickonReportsarrowButton();
		Assert.assertEquals(reportstext,prop.getProperty("reportstext"));
		Log.info("The Reports side menu is verified successfully in the Home page");
		Log.endTestCase("verifyReportsSidemenu");
		}
	
	@Test(priority = 45,groups = "Smoke")
	public void verifyRegisteredUsrSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyRegisteredUsrSidemenu");
		Log.info("Verifying the Registered Users side menu in the Home page");
		String registeredusrtext = homepage.getregiseredUserssidemenuText();
		homepage.clickregisteruserMenu();
		Assert.assertEquals(registeredusrtext,prop.getProperty("registereduserstext"));
		Log.info("The Registered Users side menu is verified successfully in the Home page");
		Log.endTestCase("verifyRegisteredUsrSidemenu");
		}
	
	@Test(priority = 46,groups = "Smoke")
	public void verifyGuestUsrTransSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyGuestUsrTransSidemenu");
		Log.info("Verifying the Guest USer Transaction side menu in the Home page");
		String guestusrtranstext = homepage.getguestUsersidemenuText();
		homepage.clickguestUserMenu();
		Assert.assertEquals(guestusrtranstext,prop.getProperty("guestusertransctntext"));
		Log.info("The Guest User Transaction side menu is verified successfully in the Home page");
		Log.endTestCase("verifyGuestUsrTransSidemenu");
		}
	
	@Test(priority = 47,groups = "Smoke")
	public void verifyNewsLetterSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyNewsLetterSidemenu");
		Log.info("Verifying the News Letter side menu in the Home page");
		String newslettertext = homepage.getnewsLettersidemenuText();
		homepage.clicknewsLetterMenu();
		Assert.assertEquals(newslettertext,prop.getProperty("newslettersubscrtext"));
		Log.info("The News Letter side menu is verified successfully in the Home page");
		Log.endTestCase("verifyNewsLetterSidemenu");
		}
	
	@Test(priority = 48,groups = "Smoke")
	public void verifyCurrencyMngmtSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyCurrencyMngmtSidemenu");
		Log.info("Verifying the Currency Management side menu in the Home page");
		String currencymngmttext = homepage.getcurrencyMngmtsidemenuText();
		homepage.clickonCurrencyMngmtarrowButton();
		Assert.assertEquals(currencymngmttext,prop.getProperty("currencymngmttext"));
		Log.info("The Currency Management side menu is verified successfully in the Home page");
		Log.endTestCase("verifyCurrencyMngmtSidemenu");
		}
	
	@Test(priority = 49,groups = "Smoke")
	public void verifyCurrencyConvSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyCurrencyConvSidemenu");
		Log.info("Verifying the Currency Conversion side menu in the Home page");
		String currencyconvtext = homepage.getcurrencyConvrsnsidemenuText();
		homepage.clickcurrencyConvrMenu();
		Assert.assertEquals(currencyconvtext,prop.getProperty("currencyconvrsntext"));
		Log.info("The Currency Conversion side menu is verified successfully in the Home page");
		Log.endTestCase("verifyCurrencyConvSidemenu");
		}
	
	@Test(priority = 50,groups = "Smoke")
	public void verifyRoeMarginSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyRoeMarginSidemenu");
		Log.info("Verifying the Roe Margin side menu in the Home page");
		String roemargintext = homepage.getroeMarginsidemenuText();
		homepage.clickroeMarginMenu();
		Assert.assertEquals(roemargintext,prop.getProperty("roemargintext"));
		Log.info("The Roe Margin side menu is verified successfully in the Home page");
		Log.endTestCase("verifyRoeMarginSidemenu");
		}
	
	@Test(priority = 51,groups = "Smoke")
	public void verifyCategoryMstrSidemenu() throws InterruptedException {
		homepage = new HomePage();
		Log.startTestCase("verifyCategoryMstrSidemenu");
		Log.info("Verifying the Category MAster side menu in the Home page");
		String categorymstrtext = homepage.getcategoryMastersidemenuText();
		homepage.clickcategoryMasterMenu();
		Assert.assertEquals(categorymstrtext,prop.getProperty("categorymastertext"));
		Log.info("The Category Master side menu is verified successfully in the Home page");
		Log.endTestCase("verifyCategoryMstrSidemenu");
		}
	
	@Test(priority = 52,groups = "Smoke")
	public void verifyclickLogout() throws InterruptedException {
		homepage = new HomePage();
		lpt = new LoginPageTest();
		Log.startTestCase("verifyclickLogout");
		Log.info("Verifying the Logout functionality");
		homepage.clickonLogoutbutton();
		lpt.verifyAIroastamaniLogo();
		Log.info("The Logout button has been clicked successfully");
		Log.endTestCase("verifyclickLogout");
		}

}
