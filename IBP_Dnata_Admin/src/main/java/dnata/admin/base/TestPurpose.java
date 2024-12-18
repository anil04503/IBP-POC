package dnata.admin.base;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dnata.admin.actiondriver.Action;
import dnata.admin.pageobjects.HomePage;
import dnata.admin.utility.Log;
import io.github.bonigarcia.wdm.WebDriverManager;  
  
public class TestPurpose extends BaseClass{  
  
    public static void main(String[] args) throws InterruptedException, IOException {  
    	WebDriver driver; 
    	
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	driver.get("https://dnata-sit-admin.convergentechnologies.com/auth/login");
    	//driver.get("https://projectmanagement.convergentechnologies.com/login");
    	try {
			Thread.sleep(90000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.manage().window().maximize();
//    	boolean result = driver.findElement(By.className("mainPage-logo")).isDisplayed();
//    	System.out.println(result);
//    	String str = driver.findElement(By.xpath("//input[@formcontrolname=\"email\"]")).getAttribute("formcontrolname");
//    	System.out.println(str);
//    	String str1 = driver.findElement(By.xpath("//input[@formcontrolname=\"password\"]")).getAttribute("formcontrolname");
//    	System.out.println(str1);
//    	String str6 = driver.findElement(By.xpath("//*[@id=\"mat-form-field-label-1\"]/mat-label")).getText();
//    	System.out.println(str6);
//    	driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("cjr@convergentechnologies.com");
//    	driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Test@123");
//    	try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    	driver.findElement(By.xpath("//button[@id='kt_login_signin_submit']")).click();
//    	Thread.sleep(5000);
//    	String str5 = driver.findElement(By.xpath("//*[text()=' LoggedIn Successfully ']")).getText();
//    	System.out.println(str5);
//    	String str2 = driver.findElement(By.xpath("//*[@id='mat-error-1']/strong")).getText();
//    	System.out.println(str2);
//    	String str3 = driver.findElement(By.xpath("//*[@id='mat-error-0']/strong")).getText();
//    	System.out.println(str3);
//    	driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("cjr");
//    	Thread.sleep(2000);
//    	String str4 = driver.findElement(By.xpath("//*[text()='Field is not valid']")).getText();
//    	System.out.println(str4);
//    	int i = driver.findElements(By.xpath("/html/body/kt-base/div/div/kt-aside-left/div/div/div/ul/li")).size();
//    	System.out.println(i);
//    	List<WebElement> elements = driver.findElements(By.xpath("/html/body/kt-base/div/div/kt-aside-left/div/div/div/ul/li"));
//    	int j = elements.size();
//    	System.out.println(j);
//    	for (WebElement element : elements) {
//    	    System.out.println("text is :" + element.getText());
//    	}
//    	boolean dis = driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[1]/a/i[2]")).isDisplayed();
//    	System.out.println(dis);
//    	boolean ena=driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[1]/a/i[2]")).isEnabled();
//    	System.out.println(ena);
//    	driver.findElement(By.xpath("//*[@id=\"kt_aside_menu\"]/ul/li[1]/a/i[2]")).click();
//    	Thread.sleep(10000);
//    	String stru = driver.findElement(By.xpath("//*[contains(text(),'@convergentechnologies')]")).getText();
//    	System.out.println(stru);
//    	Thread.sleep(3000);
//    	driver.findElement(By.xpath("//*[contains(text(),'@convergentechnologies')]")).click();
//    	String rolemng = driver.findElement(By.xpath("//*[text()='Role Management']")).getText();
//    	System.out.println(rolemng);
//    	String str = driver.findElement(By.xpath("//div[@class='container']/div/h4")).getText();
//    	System.out.println(str);
//    	Actions action = new Actions(driver);
//    	action.moveToElement(driver.findElement(By.xpath("//div[@class='containers-left']/div/kendo-treeview/ul[1]/li[1]"))).build().perform();
//    	Thread.sleep(2000);
//    	action.moveToElement(driver.findElement(By.xpath("//div[@class='containers-left']/div/kendo-treeview/ul[1]/li[1]/div/span[2]/span[1]/div/span[2]/button"))).click().build().perform();
//    	Thread.sleep(4000);
//    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    	wait.until(ExpectedConditions.alertIsPresent());
//    	String str = driver.switchTo().alert().getText();
//    	System.out.println(str);
//    	String str = driver.findElement(By.xpath("//*[text()='Add Company ']")).getText();
//    	System.out.println(str);
//    	driver.findElement(By.xpath("//kendo-dropdownlist[@formcontrolname='companyTypeId']/button")).click();
//    	Thread.sleep(2000);
//    	String str2 = "BRANCH";
//    	driver.findElement(By.xpath("//*[text()='"+str2+"']")).click();
//    	driver.findElement(By.xpath("/html/body/kendo-popup/div/kendo-list/div/ul/li/span")).click();
//    	Thread.sleep(4000);
//    	/html/body/kendo-popup/div/kendo-list/div/ul/li/span
//    	try {
//    	List<WebElement> elements = driver.findElements(By.xpath("//*[i[@class='projects-table--hierarchy-icon']]/a"));
//    	System.out.println(elements.size());
//    	for (int i=0;i<elements.size();i++) {
//    		String str = elements.get(i).getText();
//    		System.out.println(str);
//    	    if(str.equals("Automation Testing199"))
//    	    {
//    	    	elements.get(i).click();
//    	    	System.out.println("has been clicked successfully");
//    	    	System.out.println(elements.get(i));
//    	    	break;
//    	    }
//    	    else if(i==elements.size()-1){
//    	    	System.out.println("else statement");
//    	    }
//    	}
//    	driver.findElement(By.xpath("//*[text()=' dnata Staff ']")).click();
//    	Thread.sleep(2000);
//    	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nagaarjunan.s@convergentechnologies.com");
//    	driver.findElement(By.xpath("//*[@value='Next']")).click();
//    	Thread.sleep(2000);
//    	driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Naga@123");
//    	driver.findElement(By.xpath("//*[@value='Sign in']")).click();
//    	Thread.sleep(2000);
//    	driver.findElement(By.xpath("//*[@value='Yes']")).click();
//    	Thread.sleep(5000);
//    	WebElement ele = driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[2]/div/form/div[1]/div[17]/input[1]"));
//    	File file = new File("C:\\Users\\anilA\\Desktop\\IBP_POC\\Logo\\logoart.gif");
//    	System.out.println(file.getAbsolutePath());
//    	ele.sendKeys(file.getAbsolutePath());
//    	Thread.sleep(5000);
//    	String[] cmd2 = {"D:\\UploadFile.exe"};
//    	Runtime.getRuntime().exec(cmd2);
//    	Random random=new Random();
//    	System.out.println(" Random Integer:"+ random.nextInt(10000));
//    	String str = driver.findElement(By.xpath("//*[@role='group']/p-treenode[2]")).getText();
//    	System.out.println(str);
//    	driver.findElement(By.id("firstname")).click();
//    	String names = "prappo";
//    	String[] res = names.split("[,]", 0);
//    	System.out.println(res.length);
//    	for(int j=0;j<res.length;j++) {
//            System.out.println(res[j]);
//         }
//    	Thread.sleep(5000);
//    	Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//button[@title='Product Configuration']"))).build().perform();
//		Thread.sleep(10000);
//		((JavascriptExecutor)driver).executeScript("arguments[0].focus();", driver.findElement(By.xpath("//button[@title='Product Configuration']")));
//		Thread.sleep(10000);
//		Actions act1 = new Actions(driver);
//		act1.moveToElement(driver.findElement(By.xpath("//button[@title='Product Configuration']"))).click().build().perform();
//    	 JavascriptExecutor js = (JavascriptExecutor) driver;
//    	 js.executeScript("window.scrollBy(0, -1000);");
    	
    }  
  
}  