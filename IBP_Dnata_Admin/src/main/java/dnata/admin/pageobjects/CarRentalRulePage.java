/**
 * 
 */
package dnata.admin.pageobjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import dnata.admin.actiondriver.Action;
import dnata.admin.base.BaseClass;
import dnata.admin.utility.Log;

/**
 * 
 */
public class CarRentalRulePage extends BaseClass {
	
	String nextButtonAttribute = "aria-disabled";
	
	
	@FindBy(xpath = "//*[text()='Add new']")
	WebElement carRentalRuleAddNewButton;
	
	@FindBy(xpath = "//*[text()=' Save ']")
	WebElement carRentalRuleSaveButton;
	
	@FindBy(xpath = "//input[@formcontrolname='ruleName']")
	WebElement carRentalRuleNameInput;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='bookingType']/div/div[2]")
	WebElement carRentalRuleBookingTypeDropdownButton;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='supplier']/div/div[2]")
	WebElement carRentalRuleSupplierDropdownButton;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='region']/div/div[2]")
	WebElement carRentalRuleRegionDropdownButton;
	
	@FindBy(xpath = "//*[text()=' Save Success ']")
	WebElement carRentalRuleSaveSuccessText;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[1]")
	WebElement carRentalRuleCreationGridListElement;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[1]")
	List<WebElement> carRentalRuleCreationnameGridList;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[2]")
	List<WebElement> carRentalRuleCreationsupplierGridList;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[3]")
	List<WebElement> carRentalRuleCreationbookingTypeGridList;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[4]/span/div/span")
	List<WebElement> carRentalRuleCreationStatusGridList;
	
	@FindBy(xpath = "//*[@aria-label='Next Page']/span")
	WebElement carRentalRuleCreationGridNextPageButton;
	
	@FindBy(xpath = "//*[@aria-label='Next Page']")
	WebElement carRentalRuleCreationGridNextPage;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[5]/span/span[1]")
	List<WebElement> carRentalRuleCreationGridListView;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[5]/span/span[2]")
	List<WebElement> carRentalRuleCreationGridListEdit;
	
	@FindBy(xpath = "//*[@class='ag-center-cols-container']/div/div[5]/span/span[3]")
	List<WebElement> carRentalRuleCreationGridListDelete;
	
	@FindBy(xpath = "//*[text()=' Update ']")
	WebElement carRentalRuleUpdateButton;
	
	@FindBy(xpath = "//*[text()=' Update Success ']")
	WebElement carRentalRuleUpdateSuccessText;
	
	@FindBy(xpath = "//*[text()='Cancel ']")
	WebElement carRentalRuleCancelButton;
	
	@FindBy(xpath = "//h4[text()='CarRental Rule Creation ']")
	WebElement carRentalRuleCreationFormheadingText;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='bookingType']")
	WebElement carRentalRuleBookingTypeInputText;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='supplier'][@aria-disabled='true']")
	WebElement carRentalRuleSupplierInputText;
	
	@FindBy(xpath = "//mat-select[@formcontrolname='region']")
	WebElement carRentalRuleRegionInputText;
	
	@FindBy(xpath = "//div[contains(@class,'modal-header')]/button")
	WebElement carRentalRuleCreationPopupCloseButton;
	
	@FindBy(xpath = "//*[text()=' Are you Sure Want to delete ']")
	WebElement carRentalRuleDeletePopupText;
	
	@FindBy(xpath = "//*[text()=' Yes ']")
	WebElement carRentalRuleDeletePopupYesButton;
	
	@FindBy(xpath = "//*[text()=' No ']")
	WebElement carRentalRuleDeletePopupNoButton;
	
	@FindBy(xpath = "//*[text()=' Deleted successfully ']")
	WebElement carRentalRuleDeleteSuccessText;
	
	
	
	
	
	
	
	
	
	public CarRentalRulePage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	
	
	
	public void clickonAddNewButton() throws InterruptedException {
		Thread.sleep(2000);
		Action.explicitWaitVisibility(carRentalRuleAddNewButton, 20);
		Action.click(carRentalRuleAddNewButton);
	}
	
	public void enterRuleName(String rulename) {
		Action.explicitWaitVisibility(carRentalRuleNameInput, 20);
		Action.enterData(carRentalRuleNameInput, rulename);
	}
	
	public void clickBookingTypeDropdownButton() {
		Action.explicitWaitVisibility(carRentalRuleBookingTypeDropdownButton, 20);
		Action.click(carRentalRuleBookingTypeDropdownButton);
	}
	
	public void selectBookingType(String bookingtype) throws InterruptedException {
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+bookingtype+"']")), 20);
		Action.click(getDriver().findElement(By.xpath("//*[text()='"+bookingtype+"']")));
	}
	
	public void clickRegionDropdownButton() {
		Action.explicitWaitVisibility(carRentalRuleRegionDropdownButton, 20);
		Action.click(carRentalRuleRegionDropdownButton);
	}
	
	public void selectRegion(String region) throws InterruptedException {
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+region+"']")), 20);
		Action.click(getDriver().findElement(By.xpath("//*[text()='"+region+"']")));
	}
	
	public void clickSupplierDropdownButton() {
		Action.explicitWaitVisibility(carRentalRuleSupplierDropdownButton, 20);
		Action.click(carRentalRuleSupplierDropdownButton);
	}
	
	public void selectSupplier(String supplier) throws InterruptedException {
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+supplier+"']")), 20);
		Action.click(getDriver().findElement(By.xpath("//*[text()='"+supplier+"']")));
	}
	
	public void clickCarRentalRuleSaveButton() {
		Action.explicitWaitVisibility(carRentalRuleSaveButton, 20);
		Action.click(carRentalRuleSaveButton);
	}
	
	public String getSuccessText() {
		Action.explicitWaitVisibility(carRentalRuleSaveSuccessText, 20);
		String success = Action.getText(carRentalRuleSaveSuccessText);
		return success;
	}
	
	public void clickSuccessText() {
		Action.explicitWaitVisibility(carRentalRuleSaveSuccessText, 20);
		Action.click(carRentalRuleSaveSuccessText);
	}
	
	public String getCarRentalRuleNameText(String carrentalRule) throws InterruptedException {
		Action.explicitWaitVisibility(carRentalRuleCreationGridListElement, 20);
		String ruleText=null;
		for(int i=0;i<carRentalRuleCreationnameGridList.size();i++)
		{
			ruleText = Action.getText(carRentalRuleCreationnameGridList.get(i));
			Log.info(ruleText);
    	    if(ruleText.equals(carrentalRule))
    	    {
    	    	Log.info("The created car rent rule  is "+ruleText);
    	    	break;
    	    }
    	    else if(i==carRentalRuleCreationnameGridList.size()-1 && Action.getAttribute(carRentalRuleCreationGridNextPage, nextButtonAttribute).equals("false")) {
    	    	Action.click(carRentalRuleCreationGridNextPageButton);
    	    	Log.info("The Next Page button clicked successfully");
    	    	Thread.sleep(2000);
    	    	i=-1;
    	    }
    	    else if(i==carRentalRuleCreationnameGridList.size()-1 && Action.getAttribute(carRentalRuleCreationGridNextPage, nextButtonAttribute).equals("true")) {
    	    	Log.info("The Next Page is not available");
    	    	break;
    	    }
		}
		return ruleText;
	}
	
	public String getCarRentalRuleSupplierText(String carrentalRule) throws InterruptedException {
		Action.explicitWaitVisibility(carRentalRuleCreationGridListElement, 20);
		String supplier=null;
		for(int i=0;i<carRentalRuleCreationnameGridList.size();i++)
		{
			String ruleText = Action.getText(carRentalRuleCreationnameGridList.get(i));
			Log.info(ruleText);
    	    if(ruleText.equals(carrentalRule))
    	    {
    	    	supplier = Action.getText(carRentalRuleCreationsupplierGridList.get(i));
    	    	Log.info("The supplier is "+supplier);
    	    	break;
    	    }
    	    else if(i==carRentalRuleCreationnameGridList.size()-1 && Action.getAttribute(carRentalRuleCreationGridNextPage, nextButtonAttribute).equals("false")) {
    	    	carRentalRuleCreationGridNextPageButton.click();
    	    	Log.info("The Next Page button clicked successfully");
    	    	Thread.sleep(2000);
    	    	i=-1;
    	    }
    	    else if(i==carRentalRuleCreationnameGridList.size()-1 && Action.getAttribute(carRentalRuleCreationGridNextPage, nextButtonAttribute).equals("true")) {
    	    	Log.info("The Next Page is not available");
    	    	break;
    	    }
		}
		return supplier;
	}
	
	public String getCarRentalRuleBookingTypeText(String carrentalRule) throws InterruptedException {
		Action.explicitWaitVisibility(carRentalRuleCreationGridListElement, 20);
		String bookingType=null;
		for(int i=0;i<carRentalRuleCreationnameGridList.size();i++)
		{
			String ruleText = Action.getText(carRentalRuleCreationnameGridList.get(i));
			Log.info(ruleText);
    	    if(ruleText.equals(carrentalRule))
    	    {
    	    	bookingType = Action.getText(carRentalRuleCreationbookingTypeGridList.get(i));
    	    	Log.info("The booking type is "+bookingType);
    	    	break;
    	    }
    	    else if(i==carRentalRuleCreationnameGridList.size()-1 && Action.getAttribute(carRentalRuleCreationGridNextPage, nextButtonAttribute).equals("false")) {
    	    	carRentalRuleCreationGridNextPageButton.click();
    	    	Log.info("The Next Page button clicked successfully");
    	    	Thread.sleep(2000);
    	    	i=-1;
    	    }
    	    else if(i==carRentalRuleCreationnameGridList.size()-1 && Action.getAttribute(carRentalRuleCreationGridNextPage, nextButtonAttribute).equals("true")) {
    	    	Log.info("The Next Page is not available");
    	    	break;
    	    }
		}
		return bookingType;
	}
	
	public String getCarRentalRuleStatusText(String carrentalRule) throws InterruptedException {
		Action.explicitWaitVisibility(carRentalRuleCreationGridListElement, 20);
		String status=null;
		for(int i=0;i<carRentalRuleCreationnameGridList.size();i++)
		{
			String ruleText = Action.getText(carRentalRuleCreationnameGridList.get(i));
			Log.info(ruleText);
    	    if(ruleText.equals(carrentalRule))
    	    {
    	    	status = Action.getText(carRentalRuleCreationStatusGridList.get(i));
    	    	Log.info("The status is "+status);
    	    	break;
    	    }
    	    else if(i==carRentalRuleCreationnameGridList.size()-1 && Action.getAttribute(carRentalRuleCreationGridNextPage, nextButtonAttribute).equals("false")) {
    	    	carRentalRuleCreationGridNextPageButton.click();
    	    	Log.info("The Next Page button clicked successfully");
    	    	Thread.sleep(2000);
    	    	i=-1;
    	    }
    	    else if(i==carRentalRuleCreationnameGridList.size()-1 && Action.getAttribute(carRentalRuleCreationGridNextPage, nextButtonAttribute).equals("true")) {
    	    	Log.info("The Next Page is not available");
    	    	break;
    	    }
		}
		return status;
	}
	
	public void clickCarRentalRuleEditButton(String carrentalRule) throws InterruptedException {
		Action.explicitWaitVisibility(carRentalRuleCreationGridListElement, 20);
		for(int i=0;i<carRentalRuleCreationnameGridList.size();i++)
		{
			String ruleText = Action.getText(carRentalRuleCreationnameGridList.get(i));
			Log.info(ruleText);
    	    if(ruleText.equals(carrentalRule))
    	    {
    	    	Action.click(carRentalRuleCreationGridListEdit.get(i));
    	    	Log.info("The edit button is clicked");
    	    	break;
    	    }
    	    else if(i==carRentalRuleCreationnameGridList.size()-1 && Action.getAttribute(carRentalRuleCreationGridNextPage, nextButtonAttribute).equals("false")) {
    	    	carRentalRuleCreationGridNextPageButton.click();
    	    	Log.info("The Next Page button clicked successfully");
    	    	Thread.sleep(2000);
    	    	i=-1;
    	    }
    	    else if(i==carRentalRuleCreationnameGridList.size()-1 && Action.getAttribute(carRentalRuleCreationGridNextPage, nextButtonAttribute).equals("true")) {
    	    	Log.info("The Next Page is not available");
    	    	break;
    	    }
		}
	}
	
	public void clickCarRentalRuleUpdateButton() {
		Action.explicitWaitVisibility(carRentalRuleUpdateButton, 20);
		Action.click(carRentalRuleUpdateButton);
	}
	
	public void clearRuleNameInputField() throws InterruptedException {
		Action.explicitWaitVisibility(carRentalRuleNameInput, 20);
		Thread.sleep(1000);
		Action.clearData(carRentalRuleNameInput);
		Thread.sleep(1000);
	}
	
	public String getUpdateSuccessText() {
		Action.explicitWaitVisibility(carRentalRuleUpdateSuccessText, 20);
		String success = Action.getText(carRentalRuleUpdateSuccessText);
		return success;
	}
	
	public void clickUpdateSuccessText() {
		Action.explicitWaitVisibility(carRentalRuleUpdateSuccessText, 20);
		Action.click(carRentalRuleUpdateSuccessText);
	}
	
	public void clickEditCancelButton() {
		Action.explicitWaitVisibility(carRentalRuleCancelButton, 20);
		Action.click(carRentalRuleCancelButton);
	}
	
	public String getCarRentalRuleCreationFormText() {
		Action.explicitWaitVisibility(carRentalRuleCreationFormheadingText, 20);
		String carRentlFormText = Action.getText(carRentalRuleCreationFormheadingText);
		return carRentlFormText;
	}
	
	public void clickCarRentalRuleViewButton(String carrentalRule) throws InterruptedException {
		Action.explicitWaitVisibility(carRentalRuleCreationGridListElement, 20);
		for(int i=0;i<carRentalRuleCreationnameGridList.size();i++)
		{
			String ruleText = Action.getText(carRentalRuleCreationnameGridList.get(i));
			Log.info(ruleText);
    	    if(ruleText.equals(carrentalRule))
    	    {
    	    	Action.click(carRentalRuleCreationGridListView.get(i));
    	    	Log.info("The View button is clicked");
    	    	break;
    	    }
    	    else if(i==carRentalRuleCreationnameGridList.size()-1 && Action.getAttribute(carRentalRuleCreationGridNextPage, nextButtonAttribute).equals("false")) {
    	    	carRentalRuleCreationGridNextPageButton.click();
    	    	Log.info("The Next Page button clicked successfully");
    	    	Thread.sleep(2000);
    	    	i=-1;
    	    }
    	    else if(i==carRentalRuleCreationnameGridList.size()-1 && Action.getAttribute(carRentalRuleCreationGridNextPage, nextButtonAttribute).equals("true")) {
    	    	Log.info("The Next Page is not available");
    	    	break;
    	    }
		}
	}
	
	public String getRuleNameText() {
		Action.explicitWaitVisibility(carRentalRuleNameInput, 20);
		String rulename = Action.getInputValue(carRentalRuleNameInput);
		return rulename;
	}
	
	public boolean ruleNamefieldDisabled() {
		Action.explicitWaitVisibility(carRentalRuleNameInput, 20);
		boolean result = Action.isEnabled(carRentalRuleNameInput);
		return result;
	}
	
	public String getBookingTypeText() {
		Action.explicitWaitVisibility(carRentalRuleBookingTypeInputText, 20);
		String bookingtype = Action.getText(carRentalRuleBookingTypeInputText);
		return bookingtype;
	}
	
	public String getSupplierText() {
		Action.explicitWaitVisibility(carRentalRuleSupplierInputText, 20);
		String supplier = Action.getText(carRentalRuleSupplierInputText);
		return supplier;
	}
	
	public String getRegionText() {
		Action.explicitWaitVisibility(carRentalRuleRegionInputText, 20);
		String region = Action.getText(carRentalRuleRegionInputText);
		return region;
	}
	
	public void clickCarRentalRulePopupcloseButton() {
		Action.explicitWaitVisibility(carRentalRuleCreationPopupCloseButton, 20);
		Action.click(carRentalRuleCreationPopupCloseButton);
	}
	
	public void clickCarRentalRuleDeleteButton(String carrentalRule) throws InterruptedException {
		Action.explicitWaitVisibility(carRentalRuleCreationGridListElement, 20);
		for(int i=0;i<carRentalRuleCreationnameGridList.size();i++)
		{
			String ruleText = Action.getText(carRentalRuleCreationnameGridList.get(i));
			Log.info(ruleText);
    	    if(ruleText.equals(carrentalRule))
    	    {
    	    	Action.click(carRentalRuleCreationGridListDelete.get(i));
    	    	Log.info("The Delete button is clicked");
    	    	break;
    	    }
    	    else if(i==carRentalRuleCreationnameGridList.size()-1 && Action.getAttribute(carRentalRuleCreationGridNextPage, nextButtonAttribute).equals("false")) {
    	    	carRentalRuleCreationGridNextPageButton.click();
    	    	Log.info("The Next Page button clicked successfully");
    	    	Thread.sleep(2000);
    	    	i=-1;
    	    }
    	    else if(i==carRentalRuleCreationnameGridList.size()-1 && Action.getAttribute(carRentalRuleCreationGridNextPage, nextButtonAttribute).equals("true")) {
    	    	Log.info("The Next Page is not available");
    	    	break;
    	    }
		}
	}
	
	public String getDeletePopupText() {
		Action.explicitWaitVisibility(carRentalRuleDeletePopupText, 20);
		String deletetext = Action.getText(carRentalRuleDeletePopupText);
		return deletetext;
	}
	
	public void clickDeleteNoButton() throws InterruptedException {
		Action.explicitWaitVisibility(carRentalRuleDeletePopupNoButton, 20);
		Action.click(carRentalRuleDeletePopupNoButton);
		Thread.sleep(1000);
	}
	
	public void clickDeleteYesButton() throws InterruptedException {
		Action.explicitWaitVisibility(carRentalRuleDeletePopupYesButton, 20);
		Action.click(carRentalRuleDeletePopupYesButton);
		Thread.sleep(1000);
	}
	
	public String getDeleteSuccessText() {
		Action.explicitWaitVisibility(carRentalRuleDeleteSuccessText, 20);
		String deletesuccesstext = Action.getText(carRentalRuleDeleteSuccessText);
		return deletesuccesstext;
	}
	
	public void clickDeleteSuccessText() throws InterruptedException {
		Action.explicitWaitVisibility(carRentalRuleDeleteSuccessText, 20);
		Action.click(carRentalRuleDeleteSuccessText);
	}
	
	public boolean rulenameNotDisplayed(String carrentalRule) throws InterruptedException {
		Action.explicitWaitVisibility(getDriver().findElement(By.xpath("//*[text()='"+carrentalRule+"']")), 20);
		boolean result = Action.isDisplayed(getDriver().findElement(By.xpath("//*[text()='"+carrentalRule+"']")));
		return result;
	}
	

	
	
	
	
	

	
	

	
	
	

	
	


}
