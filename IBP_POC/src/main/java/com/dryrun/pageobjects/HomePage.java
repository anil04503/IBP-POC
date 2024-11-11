/**
 * 
 */
package com.dryrun.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dryrun.actiondriver.Action;
import com.dryrun.base.BaseClass;

/**
 * 
 */
public class HomePage extends BaseClass {
	
	@FindBy(xpath = "//*[text()=' LoggedIn Successfully ']")
	WebElement loginsuccessText;
	
	@FindBy(xpath = "//*[contains(text(),'@convergentechnologies')]")
	WebElement usernameText;
	
	@FindBy(xpath = "//*[text()='Organization Details']")
	WebElement orgDetailsText;
	
	@FindBy(xpath = "//*[text()='Organisation']")
	WebElement orgsideMenuText;
	
	@FindBy(xpath = "//*[@id='kt_aside_menu']/ul/li[1]/a/i[2]")
	WebElement orgsideMenuarrowButton;
	
	@FindBy(xpath = "//*[text()='Organisation Info']")
	WebElement orgInfosidmenuText;
	
	@FindBy(xpath = "//*[text()='Document Control']")
	WebElement docControlsidmenuText;
	
	@FindBy(xpath = "//*[text()='Tax Master']")
	WebElement taxMastersidmenuText;
	
	@FindBy(xpath = "//*[text()='Brand Master']")
	WebElement brandMastersidmenuText;
	
	@FindBy(xpath = "//*[text()='Mail Config']")
	WebElement mailConfigsidmenuText;
	
	@FindBy(xpath = "//*[text()='Master Management']")
	WebElement masterMngmtsideMenuText;
	
	@FindBy(xpath = "//*[@id='kt_aside_menu']/ul/li[2]/a/i[2]")
	WebElement masterMngmtsideMenuarrowButton;
	
	@FindBy(xpath = "//*[text()='Airline']")
	WebElement airLinesideMenuText;
	
	@FindBy(xpath = "//*[text()='Airport']")
	WebElement airPortsideMenuText;
	
	@FindBy(xpath = "//*[text()='Promo Code Details']")
	WebElement promoCodesideMenuText;
	
	@FindBy(xpath = "//*[text()='Airline Commission']")
	WebElement airlineCommsideMenuText;
	
	@FindBy(xpath = "//*[text()='Deal Codes ']")
	WebElement dealCodesideMenuText;
	
	@FindBy(xpath = "//*[text()='corporate Category Master']")
	WebElement corcatMstrsideMenuText;
	
	@FindBy(xpath = "//*[text()='Customer Group Master']")
	WebElement corgrpMastersideMenuText;
	
	@FindBy(xpath = "//*[text()='Company Channel Master']")
	WebElement cmpchnMastersideMenuText;
	
	@FindBy(xpath = "//*[text()='Cost Center Master']")
	WebElement costcntrMastersideMenuText;
	
	@FindBy(xpath = "//*[text()='Role Management']")
	WebElement rolemngmtsideMenuText;
	
	@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[3]/a/i[2]")
	WebElement roleMngmtsideMenuarrowButton;
	
	@FindBy(xpath = "//*[text()='Role Creation']")
	WebElement rolecreationsideMenuText;
	
	@FindBy(xpath = "//*[text()='Role programs']")
	WebElement roleprogramssideMenuText;
	
	@FindBy(xpath = "//*[text()='Provider Management']")
	WebElement providermngmtsideMenuText;
	
	@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[4]/a/i[2]")
	WebElement providerMngmtsideMenuarrowButton;
	
	@FindBy(xpath = "//*[text()='Provider Setup']")
	WebElement providersetUpsideMenuText;
	
	@FindBy(xpath = "//*[text()='Service Charge']")
	WebElement serviceChargesideMenuText;
	
	@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[5]/a/i[2]")
	WebElement serviceChargessideMenuarrowButton;
	
	@FindBy(xpath = "//*[text()='Flight Rule']")
	WebElement flightRulesideMenuText;
	
	@FindBy(xpath = "//*[text()='Flight Template']")
	WebElement flightTemplatesideMenuText;
	
	@FindBy(xpath = "//*[text()='Hotel Rule']")
	WebElement hotelRulesideMenuText;
	
	@FindBy(xpath = "//*[text()='Hotel Template']")
	WebElement hotelTemplatesideMenuText;
	
	@FindBy(xpath = "//*[text()='Insurance Rule']")
	WebElement insuranceRulesideMenuText;
	
	@FindBy(xpath = "//*[text()='Insurance Template']")
	WebElement insuranceTemplatesideMenuText;
	
	@FindBy(xpath = "//*[text()='Rail Rule']")
	WebElement railRulesideMenuText;
	
	@FindBy(xpath = "//*[text()='Rail Template']")
	WebElement railTemplatesideMenuText;
	
	@FindBy(xpath = "//*[text()='Transfer Rule']")
	WebElement transferRulesideMenuText;
	
	@FindBy(xpath = "//*[text()='Transfer Template']")
	WebElement transferTemplatesideMenuText;
	
	@FindBy(xpath = "//*[text()='Rail Pass Rule']")
	WebElement railPassrulesideMenuText;
	
	@FindBy(xpath = "//*[text()='Rail Pass Template']")
	WebElement railPassTempsideMenuText;
	
	@FindBy(xpath = "//*[text()='Company']")
	WebElement companysideMenuText;
	
	@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[6]/a/i[2]")
	WebElement companysideMenuarrowButton;
	
	@FindBy(xpath = "//*[text()='Company List']")
	WebElement companyListsideMenuText;
	
	@FindBy(xpath = "//*[text()='Branch List']")
	WebElement branchListsideMenuText;
	
	@FindBy(xpath = "//*[text()='Company Search']")
	WebElement companySearchsideMenuText;
	
	@FindBy(xpath = "//*[text()='User Branch Search']")
	WebElement usrbrchSearchsideMenuText;
	
	@FindBy(xpath = "//*[text()='Company Excel Upload']")
	WebElement compexlUploadsideMenuText;
	
	@FindBy(xpath = "//*[text()='Payment Approval']")
	WebElement paymentApprovalsideMenuText;
	
	@FindBy(xpath = "//*[text()='Payment ']")
	WebElement paymentsideMenuText;
	
	@FindBy(xpath = "//*[text()='Reports']")
	WebElement reportssideMenuText;
	
	@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[7]/a/i[2]")
	WebElement reportssideMenuarrowButton;
	
	@FindBy(xpath = "//*[text()='Registered Users']")
	WebElement registerUsersideMenuText;
	
	@FindBy(xpath = "//*[text()='Guest User Transaction']")
	WebElement guestuserTransideMenuText;
	
	@FindBy(xpath = "//*[text()='Newsletter Subscription ']")
	WebElement newslettersideMenuText;
	
	@FindBy(xpath = "//*[text()='Currency Management']")
	WebElement currencyMngmtsideMenuText;
	
	@FindBy(xpath = "//*[@id=\"kt_aside_menu\"]/ul/li[8]/a/i[2]")
	WebElement currencyMngmtsideMenuarrowButton;
	
	@FindBy(xpath = "//*[text()='Currency Conversion']")
	WebElement currencyConvrsnsideMenuText;
	
	@FindBy(xpath = "//*[text()='Roe Margin']")
	WebElement roeMarginsideMenuText;
	
	@FindBy(xpath = "//*[text()='Category Master']")
	WebElement categoryMastersideMenuText;
	
	@FindBy(xpath = "//*[text()='Logout ']")
	WebElement LogoutButton;
	
	public HomePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public String getloginsuccessText() {
		Action.explicitWaitVisibility(getDriver(), loginsuccessText, 20);
		String loginSuccesstext = loginsuccessText.getText();
		return loginSuccesstext;
	}
	
	public String getUsernameText() {
		String usrnametext = usernameText.getText();
		return usrnametext;
	}
	
	public String getorgDetailsText() {
		String orgdetailstext = orgDetailsText.getText();
		return orgdetailstext;
	}
	
	public String getorgsidemenuText() {
		String orgsidemenustext = orgsideMenuText.getText();
		return orgsidemenustext;
	}
	
	public void clickonorgarrowButton() {
		Action.click(orgsideMenuarrowButton);	
	}
	
	public String getorgInfosidemenuText() {
		Action.explicitWaitVisibility(getDriver(), orgInfosidmenuText, 20);
		String orgInfosidemenustext = orgInfosidmenuText.getText();
		return orgInfosidemenustext;
	}
	
	public void clickorgInfoMenu() throws InterruptedException {
		Action.click(orgInfosidmenuText);
		Thread.sleep(1000);
	}
	
	public String getdoccontrolsidemenuText() {
		String doccntrlsidemenustext = docControlsidmenuText.getText();
		return doccntrlsidemenustext;
	}
	
	public void clickdocControlMenu() throws InterruptedException {
		Action.click(docControlsidmenuText);
		Thread.sleep(1000);
	}
	
	public String gettaxmastersidemenuText() {
		String taxmastersidemenustext = taxMastersidmenuText.getText();
		return taxmastersidemenustext;
	}
	
	public void clicktaxMasterMenu() throws InterruptedException {
		Action.click(taxMastersidmenuText);
		Thread.sleep(1000);
	}
	
	public String getbrandmastersidemenuText() {
		String brandmastersidemenustext = brandMastersidmenuText.getText();
		return brandmastersidemenustext;
	}
	
	public void clickbrandMasterMenu() throws InterruptedException {
		Action.click(brandMastersidmenuText);
		Thread.sleep(1000);
	}
	
	public String getmailconfigsidemenuText() {
		String mailconfigsidemenustext = mailConfigsidmenuText.getText();
		return mailconfigsidemenustext;
	}
	
	public void clickmailConfigMenu() throws InterruptedException {
		Action.click(mailConfigsidmenuText);
		Thread.sleep(1000);
	}
	
	public String getmastermngmtsidemenuText() {
		String mastermngmntsidemenustext = masterMngmtsideMenuText.getText();
		return mastermngmntsidemenustext;
	}
	
	public void clickonmastermngmntarrowButton() {
		Action.click(masterMngmtsideMenuarrowButton);	
	}
	
	public String getairlinesidemenuText() {
		Action.explicitWaitVisibility(getDriver(), airLinesideMenuText, 20);
		String airlinesidemenustext = airLinesideMenuText.getText();
		return airlinesidemenustext;
	}
	
	public void clickairLineMenu() throws InterruptedException {
		Action.click(airLinesideMenuText);
		Thread.sleep(1000);
	}
	
	public String getairportsidemenuText() {
		String airportsidemenustext = airPortsideMenuText.getText();
		return airportsidemenustext;
	}
	
	public void clickairPorteMenu() throws InterruptedException {
		Action.click(airPortsideMenuText);
		Thread.sleep(1000);
	}
	
	public String getpromocodesidemenuText() {
		String promocodesidemenustext = promoCodesideMenuText.getText();
		return promocodesidemenustext;
	}
	
	public void clickpromocodeMenu() throws InterruptedException {
		Action.click(promoCodesideMenuText);
		Thread.sleep(1000);
	}
	
	public String getairlineCommsidemenuText() {
		String airlinecommsidemenustext = airlineCommsideMenuText.getText();
		return airlinecommsidemenustext;
	}
	
	public void clickairlineCommMenu() throws InterruptedException {
		Action.click(airlineCommsideMenuText);
		Thread.sleep(1000);
	}
	
	public String getdealCodesidemenuText() {
		String dealcodesidemenustext = dealCodesideMenuText.getText();
		return dealcodesidemenustext;
	}
	
	public void clickdealCodeMenu() throws InterruptedException {
		Action.click(dealCodesideMenuText);
		Thread.sleep(1000);
	}
	
	public String getcorpcatsidemenuText() {
		String corpcatsidemenustext = corcatMstrsideMenuText.getText();
		return corpcatsidemenustext;
	}
	
	public void clickcorcatMenu() throws InterruptedException {
		Action.click(corcatMstrsideMenuText);
		Thread.sleep(1000);
	}
	
	public String getcusgrpmstrsidemenuText() {
		String cusgrpmastersidemenustext = corgrpMastersideMenuText.getText();
		return cusgrpmastersidemenustext;
	}
	
	public void clickcusmstrMenu() throws InterruptedException {
		Action.click(corgrpMastersideMenuText);
		Thread.sleep(1000);
	}
	
	public String getcompchnlsidemenuText() {
		String compchnmastersidemenustext = cmpchnMastersideMenuText.getText();
		return compchnmastersidemenustext;
	}
	
	public void clickcmpchnMenu() throws InterruptedException {
		Action.click(cmpchnMastersideMenuText);
		Thread.sleep(1000);
	}
	
	public String getcostcntrsidemenuText() {
		String costcntrmastersidemenustext = costcntrMastersideMenuText.getText();
		return costcntrmastersidemenustext;
	}
	
	public void clickcostcntrMenu() throws InterruptedException {
		Action.click(costcntrMastersideMenuText);
		Thread.sleep(1000);
	}
	
	public String getrolemngmtsidemenuText() {
		String rolemngmtsidemenustext = Action.getText(rolemngmtsideMenuText);
		return rolemngmtsidemenustext;
	}
	
	public void clickonrolemngmntarrowButton() {
		Action.click(roleMngmtsideMenuarrowButton);	
	}
	
	public String getrolecrtnsidemenuText() {
		Action.explicitWaitVisibility(getDriver(), rolecreationsideMenuText, 20);
		String rolecrtnsidemenustext = rolecreationsideMenuText.getText();
		return rolecrtnsidemenustext;
	}
	
	public void clickrolecrtnMenu() throws InterruptedException {
		Action.click(rolecreationsideMenuText);
		Thread.sleep(1000);
	}
	
	public String getroleprogmssidemenuText() {
		String roleprogrmsidemenustext = roleprogramssideMenuText.getText();
		return roleprogrmsidemenustext;
	}
	
	public void clickroleprogrmMenu() throws InterruptedException {
		Action.click(roleprogramssideMenuText);
		Thread.sleep(1000);
	}
	
	public String getprvdrmngmtsidemenuText() {
		String prvdrmngmtsidemenustext = providermngmtsideMenuText.getText();
		return prvdrmngmtsidemenustext;
	}
	
	public void clickonprvdrmngmntarrowButton() {
		Action.click(providerMngmtsideMenuarrowButton);	
	}
	
	public String getprvdrsetupsidemenuText() {
		Action.explicitWaitVisibility(getDriver(), providersetUpsideMenuText, 20);
		String prvdrsetupsidemenustext = providersetUpsideMenuText.getText();
		return prvdrsetupsidemenustext;
	}
	
	public void clickprvdrsetupMenu() throws InterruptedException {
		Action.click(providersetUpsideMenuText);
		Thread.sleep(1000);
	}
	
	public String getservicechargesidemenuText() {
		String servicechargesidemenustext = serviceChargesideMenuText.getText();
		return servicechargesidemenustext;
	}
	
	public void clickonservicechargearrowButton() {
		Action.click(serviceChargessideMenuarrowButton);	
	}
	
	public String getflightrulesidemenuText() {
		Action.elementFocus(flightRulesideMenuText);
		Action.explicitWaitVisibility(getDriver(), flightRulesideMenuText, 20);
		String flightrulesidemenustext = flightRulesideMenuText.getText();
		return flightrulesidemenustext;
	}
	
	public void clickflightruleMenu() throws InterruptedException {
		Action.click(flightRulesideMenuText);
		Thread.sleep(1000);
	}
	
	public String getflighttempltsidemenuText() {
		Action.elementFocus(flightTemplatesideMenuText);
		String flgttmpltsidemenustext = flightTemplatesideMenuText.getText();
		return flgttmpltsidemenustext;
	}
	
	public void clickflighttmpltMenu() throws InterruptedException {
		Action.click(flightTemplatesideMenuText);
		Thread.sleep(1000);
	}
	
	public String gethotelRulesidemenuText() {
		Action.elementFocus(hotelRulesideMenuText);
		String hotelrulesidemenustext = hotelRulesideMenuText.getText();
		return hotelrulesidemenustext;
	}
	
	public void clickhotelruleMenu() throws InterruptedException {
		Action.click(hotelRulesideMenuText);
		Thread.sleep(1000);
	}
	
	public String gethoteltempltsidemenuText() {
		Action.elementFocus(hotelTemplatesideMenuText);
		String hoteltmpltsidemenustext = hotelTemplatesideMenuText.getText();
		return hoteltmpltsidemenustext;
	}
	
	public void clickhoteltmpltMenu() throws InterruptedException {
		Action.click(hotelTemplatesideMenuText);
		Thread.sleep(1000);
	}
	
	public String getinsuranceRulesidemenuText() {
		Action.elementFocus(insuranceRulesideMenuText);
		String insurancerulesidemenustext = insuranceRulesideMenuText.getText();
		return insurancerulesidemenustext;
	}
	
	public void clickinsuranceruleMenu() throws InterruptedException {
		Action.click(insuranceRulesideMenuText);
		Thread.sleep(1000);
	}
	
	public String getinsurancetempltsidemenuText() {
		Action.elementFocus(insuranceTemplatesideMenuText);
		String insuranceTmpltsidemenustext = insuranceTemplatesideMenuText.getText();
		return insuranceTmpltsidemenustext;
	}
	
	public void clickinsurancetempltMenu() throws InterruptedException {
		Action.click(insuranceTemplatesideMenuText);
		Thread.sleep(1000);
	}
	
	public String getrailrulesidemenuText() {
		Action.elementFocus(railRulesideMenuText);
		String railrulesidemenustext = railRulesideMenuText.getText();
		return railrulesidemenustext;
	}
	
	public void clickrailruleMenu() throws InterruptedException {
		Action.click(railRulesideMenuText);
		Thread.sleep(1000);
	}
	
	public String getrailTempltsidemenuText() {
		Action.elementFocus(railTemplatesideMenuText);
		String railTmpltmenustext = railTemplatesideMenuText.getText();
		return railTmpltmenustext;
	}
	
	public void clickrailTmpltMenu() throws InterruptedException {
		Action.click(railTemplatesideMenuText);
		Thread.sleep(1000);
	}
	
	public String gettransferRulesidemenuText() {
		Action.elementFocus(transferRulesideMenuText);
		String transferRulemenustext = transferRulesideMenuText.getText();
		return transferRulemenustext;
	}
	
	public void clicktransferRuleMenu() throws InterruptedException {
		Action.click(transferRulesideMenuText);
		Thread.sleep(1000);
	}
	
	public String gettransferTempltsidemenuText() {
		Action.elementFocus(transferTemplatesideMenuText);
		String transferTmpltmenustext = transferTemplatesideMenuText.getText();
		return transferTmpltmenustext;
	}
	
	public void clicktransferTmpltMenu() throws InterruptedException {
		Action.click(transferTemplatesideMenuText);
		Thread.sleep(1000);
	}
	
	public String getrailPassrulesidemenuText() {
		Action.elementFocus(railPassrulesideMenuText);
		String railpassrulemenustext = railPassrulesideMenuText.getText();
		return railpassrulemenustext;
	}
	
	public void clickrailPassruleMenu() throws InterruptedException {
		Action.click(railPassrulesideMenuText);
		Thread.sleep(1000);
	}
	
	public String getrailPassTmpltsidemenuText() {
		Action.elementFocus(railPassTempsideMenuText);
		String railpassTmpltmenustext = railPassTempsideMenuText.getText();
		return railpassTmpltmenustext;
	}
	
	public void clickrailpassTmpltMenu() throws InterruptedException {
		Action.click(railPassTempsideMenuText);
		Thread.sleep(1000);
	}
	
	public String getcompanysidemenuText() {
		Action.elementFocus(companysideMenuText);
		String companysidemenustext = companysideMenuText.getText();
		return companysidemenustext;
	}
	
	public void clickoncompanyarrowButton() {
		Action.click(companysideMenuarrowButton);	
	}
	
	public String getcompanyListsidemenuText() {
		Action.elementFocus(companyListsideMenuText);
		Action.explicitWaitVisibility(getDriver(), companyListsideMenuText, 20);
		String companylistsidemenustext = companyListsideMenuText.getText();
		return companylistsidemenustext;
	}
	
	public void clickCompanyListMenu() throws InterruptedException {
		Action.click(companyListsideMenuText);
		Thread.sleep(1000);
	}
	
	public String getbranchListsidemenuText() {
		Action.elementFocus(branchListsideMenuText);
		String branchListtmenustext = branchListsideMenuText.getText();
		return branchListtmenustext;
	}
	
	public void clickbranchListMenu() throws InterruptedException {
		Action.click(branchListsideMenuText);
		Thread.sleep(1000);
	}
	
	public String getCompanysearchsidemenuText() {
		Action.elementFocus(companySearchsideMenuText);
		String compnaySearchmenustext = companySearchsideMenuText.getText();
		return compnaySearchmenustext;
	}
	
	public void clickCompanysearcgMenu() throws InterruptedException {
		Action.click(companySearchsideMenuText);
		Thread.sleep(1000);
	}
	
	public String getUserbranchsidemenuText() {
		Action.elementFocus(usrbrchSearchsideMenuText);
		String userBranchmenustext = usrbrchSearchsideMenuText.getText();
		return userBranchmenustext;
	}
	
	public void clickUserbrnchMenu() throws InterruptedException {
		Action.click(usrbrchSearchsideMenuText);
		Thread.sleep(1000);
	}
	
	public String getCompanyExcelsidemenuText() {
		Action.elementFocus(compexlUploadsideMenuText);
		String companyExcelmenustext = compexlUploadsideMenuText.getText();
		return companyExcelmenustext;
	}
	
	public void clickcopanyExcelMenu() throws InterruptedException {
		Action.click(compexlUploadsideMenuText);
		Thread.sleep(1000);
	}
	
	public String getpaymentApprovalsidemenuText() {
		Action.elementFocus(paymentApprovalsideMenuText);
		String paymentAppromenustext = paymentApprovalsideMenuText.getText();
		return paymentAppromenustext;
	}
	
	public void clickpaymentApproMenu() throws InterruptedException {
		Action.click(paymentApprovalsideMenuText);
		Thread.sleep(1000);
	}
	
	public String getpaymentsidemenuText() {
		Action.elementFocus(paymentsideMenuText);
		String paymentmenustext = paymentsideMenuText.getText();
		return paymentmenustext;
	}
	
	public void clickpaymentMenu() throws InterruptedException {
		Action.click(paymentsideMenuText);
		Thread.sleep(1000);
	}
	
	public String getReportssidemenuText() {
		Action.elementFocus(reportssideMenuText);
		String reportsmenustext = reportssideMenuText.getText();
		return reportsmenustext;
	}
	
	public void clickonReportsarrowButton() {
		Action.click(reportssideMenuarrowButton);	
	}
	
	public String getregiseredUserssidemenuText() {
		Action.elementFocus(registerUsersideMenuText);
		Action.explicitWaitVisibility(getDriver(), registerUsersideMenuText, 20);
		String registeredUserssidemenustext = registerUsersideMenuText.getText();
		return registeredUserssidemenustext;
	}
	
	public void clickregisteruserMenu() throws InterruptedException {
		Action.click(registerUsersideMenuText);
		Thread.sleep(1000);
	}
	
	public String getguestUsersidemenuText() {
		Action.elementFocus(guestuserTransideMenuText);
		String guestUsermenustext = guestuserTransideMenuText.getText();
		return guestUsermenustext;
	}
	
	public void clickguestUserMenu() throws InterruptedException {
		Action.click(guestuserTransideMenuText);
		Thread.sleep(1000);
	}
	
	public String getnewsLettersidemenuText() {
		Action.elementFocus(newslettersideMenuText);
		String newsLettermenustext = newslettersideMenuText.getText();
		return newsLettermenustext;
	}
	
	public void clicknewsLetterMenu() throws InterruptedException {
		Action.click(newslettersideMenuText);
		Thread.sleep(1000);
	}
	
	public String getcurrencyMngmtsidemenuText() {
		Action.elementFocus(currencyMngmtsideMenuText);
		String currencyMngmtmenustext = currencyMngmtsideMenuText.getText();
		return currencyMngmtmenustext;
	}
	
	public void clickonCurrencyMngmtarrowButton() {
		Action.click(currencyMngmtsideMenuarrowButton);	
	}
	
	public String getcurrencyConvrsnsidemenuText() {
		Action.elementFocus(currencyConvrsnsideMenuText);
		Action.explicitWaitVisibility(getDriver(), currencyConvrsnsideMenuText, 20);
		String currencyConvsidemenustext = currencyConvrsnsideMenuText.getText();
		return currencyConvsidemenustext;
	}
	
	public void clickcurrencyConvrMenu() throws InterruptedException {
		Action.click(currencyConvrsnsideMenuText);
		Thread.sleep(1000);
	}
	
	public String getroeMarginsidemenuText() {
		Action.elementFocus(roeMarginsideMenuText);
		String roeMarginmenustext = roeMarginsideMenuText.getText();
		return roeMarginmenustext;
	}
	
	public void clickroeMarginMenu() throws InterruptedException {
		Action.click(roeMarginsideMenuText);
		Thread.sleep(1000);
	}
	
	public String getcategoryMastersidemenuText() {
		Action.elementFocus(categoryMastersideMenuText);
		String categoryMastermenustext = categoryMastersideMenuText.getText();
		return categoryMastermenustext;
	}
	
	public void clickcategoryMasterMenu() throws InterruptedException {
		Action.elementFocus(categoryMastersideMenuText);
		Action.click(categoryMastersideMenuText);
		Thread.sleep(1000);
	}
	
	public void clickonLogoutbutton() throws InterruptedException {
		Action.click(usernameText);
		Action.explicitWaitVisibility(getDriver(), LogoutButton, 20);
		Action.click(LogoutButton);
	}
	
	


}
