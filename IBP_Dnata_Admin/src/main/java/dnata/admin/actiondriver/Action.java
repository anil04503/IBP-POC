/**
 * 
 */
package dnata.admin.actiondriver;


import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.w3c.dom.Document;

import dnata.admin.base.BaseClass;
import dnata.admin.utility.Log;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Action extends BaseClass{
	
	
	public static void openBrowser(String browserName) {
		
		try {
			Log.info("Executing the openBrowser keyword");
			Log.info("The " +browserName+ " browser is opening");
		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver.set(new ChromeDriver());
		}else if(browserName.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver.set(new FirefoxDriver());
		}else if(browserName.equalsIgnoreCase("IE")) {
			WebDriverManager.edgedriver().setup();
			driver.set(new EdgeDriver());
		}
		Log.info("The " +browserName+ " browser is opened successfully");
		Log.info("The openBrowser keyword executed successfully");
		}
		catch(Throwable t){
			Log.info("The " +browserName+ " browser is not opened successfully"+t.getMessage());
			Log.info("The openBrowser keyword not executed successfully");
		}
		
	}
	
	public static void openHeadlessBrowser(String browserName) {
		
		try {
			Log.info("Executing the openHeadlessBrowser keyword");
			Log.info("The headless " +browserName+ " browser is opening");
		if(browserName.equalsIgnoreCase("HeadlessChrome")) {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("headless");
			driver.set(new ChromeDriver(options));
		}else if(browserName.equalsIgnoreCase("HeadlessFirefox")) {
			FirefoxOptions options =new FirefoxOptions();
			options.addArguments("-headless");
			driver.set(new FirefoxDriver(options));
		}else if(browserName.equalsIgnoreCase("HeadlessIE")) {
			EdgeOptions options = new EdgeOptions();
			options.addArguments("headless");
			driver.set(new EdgeDriver(options));
		}
			Log.info("The headless " +browserName+ " browser is opened successfully");
			Log.info("The openHeadlessBrowser keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("The headless " +browserName+ " browser is not opened successfully"+t.getMessage());
			Log.info("The openHeadlessBrowser keyword not executed successfully");
		}
		
	}
	
	public static void openURL(String url) {
		
		try {
			Log.info("Executing the openURL keyword");
			Log.info("The url " +url+ " is opening");
			getDriver().get(url);
			Log.info("The url " +url+ " is opened successfully");
			Log.info("The openURL keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("The url " +url+ " is not opened successfully"+t.getMessage());
			Log.info("The openURL keyword not executed successfully");
		}
		
	}

	public static void click(WebElement ele) {
		
		try {
			Log.info("Executing the click keyword");
			Log.info("The "+ele+ " is trying to click");
			Actions act = new Actions(getDriver());
			act.moveToElement(ele).click().build().perform();
			Log.info("The element " +ele+ " is clicked successfully");
			Log.info("The click keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("The element "+ele+ " is not clicked successflly"+t.getMessage());
			Log.info("The click keyword not executed successfully");
		}

	}
	
	
	public static String getText(WebElement ele) {
		String gettext = null;
		try {
			Log.info("Executing the getText keyword");
			Log.info("Getting the text for the element "+ele);
			Actions act = new Actions(getDriver());
			act.moveToElement(ele).build().perform();
			gettext = ele.getText();
			Log.info("The text has been fetched successfully for the element "+ele);
			Log.info("The getText keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("The text has been not fetched successfully for the element "+ele+ t.getMessage());
			Log.info("The getText keyword not executed successfully");
		}
		return gettext;
		
	}
	
	public static void elementFocus(WebElement ele) {
		
		try {
			Log.info("Executing the elementFocus keyword");
			Log.info("The " +ele+ " is focusing");
			Actions act = new Actions(getDriver());
			act.moveToElement(ele).build().perform();
			Log.info("The element " +ele+ " is focused successfully");
			Log.info("The elementFocus keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("The element " +ele+ " is not focused successfully"+t.getMessage());
			Log.info("The elementFocus keyword not executed successfully");
		}

	}
	
	public static void enterData(WebElement ele, String data) {
		
		try {
			Log.info("Executing the enterData keyword");
			Log.info("The " +data+ " is trying to enter for the element "+ele);
			Actions act = new Actions(getDriver());
			act.moveToElement(ele).build().perform();
			ele.clear();
			Thread.sleep(1000);
			ele.sendKeys(data);
			Log.info("The " +data+ " is entered successfully for the element "+ele);
			Log.info("The enterData keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("The " +data+ " is not entered successfully for the element "+ele+t.getMessage());
			Log.info("The enterData keyword not executed successfully");
		}

	}

	public static void clearData(WebElement ele) {
	
		try {
			Log.info("Executing the clearData keyword");
			Log.info("The data is clearing for the element "+ele);
			Actions act = new Actions(getDriver());
			act.moveToElement(ele).build().perform();
			ele.clear();
			Log.info("The data is cleared successfully for the element "+ele);
			Log.info("The clearData keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("The data is not cleared successfully for the element "+ele+t.getMessage());
			Log.info("The clearData keyword not executed successfully");
		}

	}
	
	public static void JSelementFocus(WebElement ele) {
		
		try {
			Log.info("Executing the JSelementFocus keyword");
			Log.info("The " +ele+ " is focusing");
			((JavascriptExecutor)getDriver()).executeScript("arguments[0].focus();", ele);
			Log.info("The element " +ele+ " is focused successfully");
			Log.info("The JSelementFocus keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("The element " +ele+ " is not focused successfully "+ele+t.getMessage());
			Log.info("The JSelementFocus keyword not executed successfully");
		}

	}
	
	public static void JSelementScrollView(WebElement ele) {
		
		try {
			Log.info("Executing the JSelementScrollView keyword");
			Log.info("The " +ele+ " is view to scroll");
			((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView(false);", ele);
			Log.info("The element " +ele+ " is scrolled in to view successfully");
			Log.info("The JSelementScrollView keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("The element " +ele+ " is not scrolled in to view successfully "+ele+t.getMessage());
			Log.info("The JSelementScrollView keyword not executed successfully");
		}

	}
	
	public static void JSwindowScrollUp() {
		
		try {
			Log.info("Executing the JSwindowScrollUp keyword");
			Log.info("The window is scrolling up");
			((JavascriptExecutor)getDriver()).executeScript("window.scrollBy(0, -1000);");
			Log.info("The window scrolled up successfully");
			Log.info("The JSwindowScrollUp keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("The wndow is not scrolled up successfully " +t.getMessage());
			Log.info("The JSwindowScrollUp keyword not executed successfully");
		}

	}
	
	public static void JSwindowScrollDown() {
		
		try {
			Log.info("Executing the JSwindowScrollDown keyword");
			Log.info("The window is scrolling down");
			((JavascriptExecutor)getDriver()).executeScript("window.scrollBy(0, 1000);");
			Log.info("The window scrolled down successfully");
			Log.info("The JSwindowScrollDown keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("The wndow is not scrolled down successfully " +t.getMessage());
			Log.info("The JSwindowScrollDown keyword not executed successfully");
		}

	}
	
	public static void implicitWait(int timeOut) {
		try {
			Log.info("Executing the implicitWait keyword");
			getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));
			Log.info("The implicitWait keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("There is an error while setting the implicit wait "+t.getMessage());
			Log.info("The implicitWait keyword not executed successfully");
		}
	}
	
	public static void explicitWaitVisibility(WebElement ele, int timeOut ) {
		try {
			Log.info("Executing the explicitWaitVisibility keyword");
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.visibilityOf(ele));
			Log.info("The system successfully waits until the element " +ele+ " is visible");
			Log.info("The explicitWaitVisibility keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("There is an error while waiting for the visibility of the element "+ele+t.getMessage());
			Log.info("The explicitWaitVisibility keyword not executed successfully");
			
		}
	}
	
	public static void explicitWaitInVisibility(WebElement ele, int timeOut ) {
		try {
			Log.info("Executing the explicitWaitinVisibility keyword");
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.invisibilityOf(ele));
			Log.info("The system successfully waits until the element " +ele+ " is invisible");
			Log.info("The explicitWaitinVisibility keyword executed successfully");
		}
		catch(Throwable t){
			Log.info("There is an error while waiting for the invisibility of the element "+ele+t.getMessage());
			Log.info("The explicitWaitinVisibility keyword not executed successfully");
		}
	}
	
	public static void explicitWaitClickable(WebElement ele, int timeOut ) {
		try {
			Log.info("Executing the explicitWaitClickable keyword");
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.elementToBeClickable(ele));
			Log.info("The system successfully waits until the element " +ele+ " is clickable");
			Log.info("The explicitWaitClickable keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("There is an error while waiting for the clickable of the element "+ele+t.getMessage());
			Log.info("The explicitWaitClickable keyword not executed successfully");
		}
	}
	
	public static void explicitWaitAlertPresent(int timeOut) {
		try {
			Log.info("Executing the explicitWaitAlertPresent keyword");
			WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(timeOut));
			wait.until(ExpectedConditions.alertIsPresent());
			Log.info("The system successfully waits until the Alert is displayed");
			Log.info("The explicitWaitAlertPresent keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("There is an error while waiting for the Alert displayed "+t.getMessage());
			Log.info("The explicitWaitAlertPresent keyword not executed successfully");
		}
	}
	
	public static void alertAceept() {
		try {
			Log.info("Executing the alertAceept keyword");
			Alert alert = getDriver().switchTo().alert();
			alert.accept();
			Log.info("The system successfully clicked on the Alert Ok button");
			Log.info("The alertAceept keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("There is an error while clicking on Alert Ok button "+t.getMessage());
			Log.info("The alertAceept keyword not executed successfully");
		}
	}
	
	public static void alertDismiss() {
		try {
			Log.info("Executing the alertDismiss keyword");
			Alert alert = getDriver().switchTo().alert();
			alert.dismiss();
			Log.info("The system successfully clicked on the Alert Cancel button");
			Log.info("The alertDismiss keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("There is an error while clicking on Alert Cancel button "+t.getMessage());
			Log.info("The alertDismiss keyword not executed successfully");
		}
	}
	
	public static String getAlertText() {
		
		String alertText = null;
		try {
			Log.info("Executing the getAlertText keyword");
			Alert alert = getDriver().switchTo().alert();
			alertText = alert.getText();
			Log.info("The system successfully fetched the text of an Alert");
			Log.info("The getAlertText keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("There is an error while fetching the text of an Alert "+t.getMessage());
			Log.info("The getAlertText keyword not executed successfully");
		}
		return alertText;
	}
	
	public static void pageLoadWait(int timeOut) {
		try {
			Log.info("Executing the pageLoadWait keyword");
			getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(timeOut));
			Log.info("The system successfully waits until the page loads");
			Log.info("The pageLoadWait keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("There is an error while waiting for page to load "+t.getMessage());
			Log.info("The pageLoadWait keyword not executed successfully");
		}
	}
	
	public static void windowMaximize() {
		try {
			Log.info("Executing the windowMaximize keyword");
			getDriver().manage().window().maximize();
			Log.info("The window has been maximized successfully");
			Log.info("The windowMaximize keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("There is an error while maximizing the window "+t.getMessage());
			Log.info("The windowMaximize keyword not executed successfully");
		}
	}
	
	public static void pageRefresh() {
		try {
			Log.info("Executing the pageRefresh keyword");
			getDriver().navigate().refresh();
			Log.info("The window has been refreshed successfully");
			Log.info("The pageRefresh keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("There is an error while refreshing the window "+t.getMessage());
			Log.info("The pageRefresh keyword not executed successfully");
		}
	}
	
	public static String takeScreenshot(String filename) {
		String newImageString = null;
		String destination = null;
		try {
			Log.info("Executing the takeScreenshot keyword");
			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
			TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
			File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
			destination = System.getProperty("user.dir") + "\\ScreenShots\\" + filename + "_" + dateName + ".png";
			FileUtils.copyFile(source, new File(destination));
			// This new path for jenkins
			newImageString = "http://localhost:8080/job/IBP_POC1/ws/IBP_POC/ScreenShots/" + filename + "_"
				+ dateName + ".png";
			Log.info("The screenshot has been taken successfully");
			Log.info("The takeScreenshot keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("There is an error while taking the screenshot "+t.getMessage());
			Log.info("The takeScreenshot keyword not executed successfully");
		}
		return destination;
	}
	
	public static boolean isDisplayed(WebElement ele) {
		boolean flag = false;
		try {
			Log.info("Executing the isDisplayed keyword");
			flag = ele.isDisplayed();
			if(flag = true)
			{
			Log.info("The element "+ele+" is displayed successfully");
			}else if(flag = false) {
				Log.info("The element "+ele+" is not displayed successfully");
			}
			Log.info("The isDisplayed keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("There is an error while checking the "+ele+ " is displayed"+t.getMessage());
			Log.info("The isDisplayed keyword not executed successfully");
		}
		return flag;
	}
	
	public static boolean isSelected(WebElement ele) {
		boolean flag = false;
		try {
			Log.info("Executing the isSelected keyword");
			Actions act = new Actions(getDriver());
			act.moveToElement(ele).build().perform();
			flag = ele.isSelected();
			if(flag = true)
			{
			Log.info("The element "+ele+" is selected successfully");
			}else if(flag = false) {
				Log.info("The element "+ele+" is not selected successfully");
			}
			Log.info("The isSelected keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("There is an error while checking the "+ele+ " is selected"+t.getMessage());
			Log.info("The isSelected keyword not executed successfully");
		}
		return flag;
	}
	
	public static boolean isEnabled(WebElement ele) {
		boolean flag = false;
		try {
			Log.info("Executing the isEnabled keyword");
			Actions act = new Actions(getDriver());
			act.moveToElement(ele).build().perform();
			flag = ele.isEnabled();
			if(flag = true)
			{
			Log.info("The element "+ele+" is enabled successfully");
			}else if(flag = false) {
				Log.info("The element "+ele+" is not enabled successfully");
			}
			Log.info("The isEnabled keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("There is an error while checking the "+ele+ " is enabled"+t.getMessage());
			Log.info("The isEnabled keyword not executed successfully");
		}
		return flag;
	}
	
	public static String getTextfromList(List<WebElement> ele, String text) {

		String elementText = null;
		int i = 0;
		try {
			Log.info("Executing the getTextfromList keyword");
			Log.info("Getting the text for the list of elements for the "+ele);
			for(i =0;i<ele.size();i++) {
			Actions act = new Actions(getDriver());
			act.moveToElement(ele.get(i)).build().perform();
			elementText = ele.get(i).getText();
			Log.info(elementText);
			 if(elementText.equals(text))
			 {
				 Log.info("The expected text " +text+ "is fetched successfully for the element");
				 break;
			 }
			 else if(i==ele.size()-1)
			 {
				 Log.info("The expected text " +text+ " is not displayed in the list");
			 }
			}
			
			Log.info("The getTextfromList keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("The text "+text+" has been not fetched successfully for the element "+t.getMessage());
			Log.info("The getTextfromList keyword not executed successfully");
		}
		return elementText;
		
	}
	
	public static void clickfromList(List<WebElement> ele, String text) {

		try {
			Log.info("Executing the clickfromList keyword");
			Log.info("Clciking the element from the list of "+ele);
			for(int i =0;i<ele.size();i++) {
			Actions act = new Actions(getDriver());
			act.moveToElement(ele.get(i)).build().perform();
			 String elementText = ele.get(i).getText();
			 Log.info(elementText);
			 if(elementText.equals(text))
			 {
				 ele.get(i).click();
				 Log.info(text +"Clicked successfully");
				 break;
			 }
			 else if(i==ele.size()-1)
			 {
				 Log.info("The expected text "+text+" is not displayed to click in the list");
			 }
			}
			
			Log.info("The clickfromList keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("The element has not been clicked successfully "+t.getMessage());
			Log.info("The clickfromList keyword not executed successfully");
		}
		
	}
	
	public static String getTitle() {
		
		String gettitle = null;
		try {
			Log.info("Executing the getTitle keyword");
			gettitle = getDriver().getTitle();
			Log.info("The system successfully fetched the title of the application");
			Log.info("The getTitle keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("There is an error while fetching the title of the application "+t.getMessage());
			Log.info("The getTitle keyword not executed successfully");
		}
		return gettitle;
	}
	
	public static void uploadFileAutoIT(String autoITexe) {
		
		try {
			Log.info("Executing the uploadFileAutoIT keyword");
			String[] path = {autoITexe};
	    	Runtime.getRuntime().exec(path);
			Log.info("The system successfully fetched the title of the application");
			Log.info("The uploadFileAutoIT keyword executed successfully");
		}
		catch(Throwable t) {
			Log.info("There is an error while fetching the autoIT exe file "+t.getMessage());
			Log.info("The uploadFileAutoIT keyword not executed successfully");
		}
	}
	

	/**
	 * Type text at location
	 * 
	 * @param locatorName
	 * @param text
	 * @return - true/false
	 */
	public static boolean type(WebElement ele, String text) {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			// logger.info("Entered text :"+text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location Not found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println("Successfully entered value");
			} else {
				System.out.println("Unable to enter value");
			}

		}
		return flag;
	}

	public static boolean selectBySendkeys(String value,WebElement ele) {
		boolean flag = false;
		try {
			ele.sendKeys(value);
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("Select value from the DropDown");		
			} else {
				System.out.println("Not Selected value from the DropDown");
				// throw new ElementNotFoundException("", "", "")
			}
		}
	}

	/**
	 * select value from DropDown by using selectByIndex
	 * 
	 * @param locator     : Action to be performed on element (Get it from Object
	 *                    repository)
	 * 
	 * @param index       : Index of value wish to select from dropdown list.
	 * 
	 * @param locatorName : Meaningful name to the element (Ex:Year Dropdown, items
	 *                    Listbox etc..)
	 * 
	 */
	public static boolean selectByIndex(WebElement element, int index) {
		boolean flag = false;
		try {
			Select s = new Select(element);
			s.selectByIndex(index);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Option selected by Index");
			} else {
				System.out.println("Option not selected by Index");
			}
		}
	}

	/**
	 * select value from DD by using value
	 * 
	 * @param locator     : Action to be performed on element (Get it from Object
	 *                    repository)
	 * 
	 * @param value       : Value wish to select from dropdown list.
	 * 
	 * @param locatorName : Meaningful name to the element (Ex:Year Dropdown, items
	 *                    Listbox etc..)
	 */

	public static boolean selectByValue(WebElement element,String value) {
		boolean flag = false;
		try {
			Select s = new Select(element);
			s.selectByValue(value);
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("Option selected by Value");
			} else {
				System.out.println("Option not selected by Value");
			}
		}
	}

	/**
	 * select value from DropDown by using selectByVisibleText
	 * 
	 * @param locator     : Action to be performed on element (Get it from Object
	 *                    repository)
	 * 
	 * @param visibletext : VisibleText wish to select from dropdown list.
	 * 
	 * @param locatorName : Meaningful name to the element (Ex:Year Dropdown, items
	 *                    Listbox etc..)
	 */

	public static boolean selectByVisibleText(String visibletext, WebElement ele) {
		boolean flag = false;
		try {
			Select s = new Select(ele);
			s.selectByVisibleText(visibletext);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Option selected by VisibleText");
			} else {
				System.out.println("Option not selected by VisibleText");
			}
		}
	}

	public static boolean mouseHoverByJavaScript(WebElement ele) {
		boolean flag = false;
		try {
			WebElement mo = ele;
			String javaScript = "var evObj = document.createEvent('MouseEvents');"
					+ "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, false, false, false, false, 0, null);"
					+ "arguments[0].dispatchEvent(evObj);";
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(javaScript, mo);
			flag = true;
			return true;
		}

		catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("MouseOver Action is performed");
			} else {
				System.out.println("MouseOver Action is not performed");
			}
		}
	}

	public static boolean JSClick(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			// WebElement element = driver.findElement(locator);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", ele);
			// driver.executeAsyncScript("arguments[0].click();", element);

			flag = true;

		}

		catch (Exception e) {
			throw e;

		} finally {
			if (flag) {
				System.out.println("Click Action is performed");
			} else if (!flag) {
				System.out.println("Click Action is not performed");
			}
		}
		return flag;
	}

	public static boolean switchToFrameByIndex(WebDriver driver,int index) {
		boolean flag = false;
		try {
			new WebDriverWait(driver,Duration.ofSeconds(15) ).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe")));
			//new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe")));
			driver.switchTo().frame(index);
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("Frame with index \"" + index + "\" is selected");
			} else {
				System.out.println("Frame with index \"" + index + "\" is not selected");
			}
		}
	}

	/**
	 * This method switch the to frame using frame ID.
	 * 
	 * @param idValue : Frame ID wish to switch
	 * 
	 */
	public static boolean switchToFrameById(WebDriver driver,String idValue) {
		boolean flag = false;
		try {
			driver.switchTo().frame(idValue);
			flag = true;
			return true;
		} catch (Exception e) {

			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println("Frame with Id \"" + idValue + "\" is selected");
			} else {
				System.out.println("Frame with Id \"" + idValue + "\" is not selected");
			}
		}
	}

	/**
	 * This method switch the to frame using frame Name.
	 * 
	 * @param nameValue : Frame Name wish to switch
	 * 
	 */
	public static boolean switchToFrameByName(WebDriver driver,String nameValue) {
		boolean flag = false;
		try {
			driver.switchTo().frame(nameValue);
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("Frame with Name \"" + nameValue + "\" is selected");
			} else if (!flag) {
				System.out.println("Frame with Name \"" + nameValue + "\" is not selected");
			}
		}
	}

	public static boolean switchToDefaultFrame(WebDriver driver) {
		boolean flag = false;
		try {
			driver.switchTo().defaultContent();
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				// SuccessReport("SelectFrame ","Frame with Name is selected");
			} else if (!flag) {
				// failureReport("SelectFrame ","The Frame is not selected");
			}
		}
	}

	public static void mouseOverElement(WebDriver driver,WebElement element) {
		boolean flag = false;
		try {
			new Actions(driver).moveToElement(element).build().perform();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				System.out.println(" MouserOver Action is performed on ");
			} else {
				System.out.println("MouseOver action is not performed on");
			}
		}
	}

	public static boolean moveToElement(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			// WebElement element = driver.findElement(locator);
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true);", ele);
			Actions actions = new Actions(driver);
			// actions.moveToElement(driver.findElement(locator)).build().perform();
			actions.moveToElement(ele).build().perform();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static boolean mouseover(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			new Actions(driver).moveToElement(ele).build().perform();
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			/*
			 * if (flag) {
			 * SuccessReport("MouseOver ","MouserOver Action is performed on \""+locatorName
			 * +"\""); } else {
			 * failureReport("MouseOver","MouseOver action is not performed on \""
			 * +locatorName+"\""); }
			 */
		}
	}
	public static boolean draggable(WebDriver driver,WebElement source, int x, int y) {
		boolean flag = false;
		try {
			new Actions(driver).dragAndDropBy(source, x, y).build().perform();
			Thread.sleep(5000);
			flag = true;
			return true;

		} catch (Exception e) {
		
			return false;
			
		} finally {
			if (flag) {
				System.out.println("Draggable Action is performed on \""+source+"\"");			
			} else if(!flag) {
				System.out.println("Draggable action is not performed on \""+source+"\"");
			}
		}
	}
	public static boolean draganddrop(WebDriver driver,WebElement source, WebElement target) {
		boolean flag = false;
		try {
			new Actions(driver).dragAndDrop(source, target).perform();
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("DragAndDrop Action is performed");
			} else if(!flag) {
				System.out.println("DragAndDrop Action is not performed");
			}
		}
	}
	
	public static boolean slider(WebDriver driver,WebElement ele, int x, int y) {
		boolean flag = false;
		try {
			// new Actions(driver).dragAndDropBy(dragitem, 400, 1).build()
			// .perform();
			new Actions(driver).dragAndDropBy(ele, x, y).build().perform();// 150,0
			Thread.sleep(5000);
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("Slider Action is performed");
			} else {
				System.out.println("Slider Action is not performed");
			}
		}
	}
	
	public static boolean rightclick(WebDriver driver,WebElement ele) {
		boolean flag = false;
		try {
			Actions clicker = new Actions(driver);
			clicker.contextClick(ele).perform();
			flag = true;
			return true;
			// driver.findElement(by1).sendKeys(Keys.DOWN);
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("RightClick Action is performed");
			} else {
				System.out.println("RightClick Action is not performed");
			}
		}
	}
	
	public static boolean switchWindowByTitle(WebDriver driver,String windowTitle, int count) {
		boolean flag = false;
		try {
			Set<String> windowList = driver.getWindowHandles();

			String[] array = windowList.toArray(new String[0]);

			driver.switchTo().window(array[count-1]);

			if (driver.getTitle().contains(windowTitle)){
				flag = true;
			}else{
				flag = false;
			}
			return flag;
		} catch (Exception e) {
			//flag = true;
			return false;
		} finally {
			if (flag) {
				System.out.println("Navigated to the window with title");
			} else {
				System.out.println("The Window with title is not Selected");
			}
		}
	}
	public static boolean switchToNewWindow(WebDriver driver) {
		boolean flag = false;
		try {

			Set<String> s=driver.getWindowHandles();
			Object popup[]=s.toArray();
			driver.switchTo().window(popup[1].toString());
			flag = true;
			return flag;
		} catch (Exception e) {
			flag = false;
			return flag;
		} finally {
			if (flag) {
				System.out.println("Window is Navigated with title");				
			} else {
				System.out.println("The Window with title: is not Selected");
			}
		}
	}
	public static boolean switchToOldWindow(WebDriver driver) {
		boolean flag = false;
		try {

			Set<String> s=driver.getWindowHandles();
			Object popup[]=s.toArray();
			driver.switchTo().window(popup[0].toString());
			flag = true;
			return flag;
		} catch (Exception e) {
			flag = false;
			return flag;
		} finally {
			if (flag) {
				System.out.println("Focus navigated to the window with title");			
			} else {
				System.out.println("The Window with title: is not Selected");
			}
		}
	}
	public static int getColumncount(WebElement row) {
		List<WebElement> columns = row.findElements(By.tagName("td"));
		int a = columns.size();
		System.out.println(columns.size());
		for (WebElement column : columns) {
			System.out.print(column.getText());
			System.out.print("|");
		}
		return a;
	}
	
	public static int getRowCount(WebElement table) {
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int a = rows.size() - 1;
		return a;
	}
	
	
	/**
	 * Verify alert present or not
	 * 
	 * @return: Boolean (True: If alert preset, False: If no alert)
	 * 
	 */
	public static boolean Alert(WebDriver driver) {
		boolean presentFlag = false;
		Alert alert = null;

		try {
			// Check the presence of alert
			alert = driver.switchTo().alert();
			// if present consume the alert
			alert.accept();
			presentFlag = true;
		} catch (NoAlertPresentException ex) {
			// Alert present; set the flag

			// Alert not present
			ex.printStackTrace();
		} finally {
			if (!presentFlag) {
				System.out.println("The Alert is handled successfully");		
			} else{
				System.out.println("There was no alert to handle");
			}
		}

		return presentFlag;
	}
	public static boolean launchUrl(WebDriver driver,String url) {
		boolean flag = false;
		try {
			driver.navigate().to(url);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Successfully launched \""+url+"\"");				
			} else {
				System.out.println("Failed to launch \""+url+"\"");
			}
		}
	}
	
	public static boolean isAlertPresent(WebDriver driver) 
	{ 
		try 
		{ 
			driver.switchTo().alert(); 
			return true; 
		}   // try 
		catch (NoAlertPresentException Ex) 
		{ 
			return false; 
		}   // catch 
	}
	
	public static String getCurrentURL(WebDriver driver)  {
		boolean flag = false;

		String text = driver.getCurrentUrl();
		if (flag) {
			System.out.println("Current URL is: \""+text+"\"");
		}
		return text;
	}
	
	public static boolean click1(WebElement locator, String locatorName) {
		boolean flag = false;
		try {
			locator.click();
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Able to click on \""+locatorName+"\"");
			} else {
				System.out.println("Click Unable to click on \""+locatorName+"\"");
			}
		}

	}
	
	public static void fluentWait(WebDriver driver,WebElement element, int timeOut) {
	    Wait<WebDriver> wait = null;
	    try {
	        wait = new FluentWait<WebDriver>((WebDriver) driver)
	        		.withTimeout(Duration.ofSeconds(timeOut))
	        	    .pollingEvery(Duration.ofSeconds(2))
	        	    .ignoring(Exception.class);
	        wait.until(ExpectedConditions.visibilityOf(element));
	        element.click();
	    }catch(Exception e) {
	    }
	}

	public static String getCurrentTime() {
		String currentDate = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
		return currentDate;
	}

}
