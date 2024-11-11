package com.dryrun.base;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;  
  
public class TestPurpose {  
  
    public static void main(String[] args) throws InterruptedException {  
    	WebDriver driver; 
    	
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	driver.get("https://art-sit-admin.convergentechnologies.com/#/auth/login");
    	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.manage().window().maximize();
    	boolean result = driver.findElement(By.className("mainPage-logo")).isDisplayed();
    	System.out.println(result);
    	String str = driver.findElement(By.xpath("//input[@formcontrolname=\"email\"]")).getAttribute("formcontrolname");
    	System.out.println(str);
    	String str1 = driver.findElement(By.xpath("//input[@formcontrolname=\"password\"]")).getAttribute("formcontrolname");
    	System.out.println(str1);
    	String str6 = driver.findElement(By.xpath("//*[@id=\"mat-form-field-label-1\"]/mat-label")).getText();
    	System.out.println(str6);
    	driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("cjr@convergentechnologies.com");
    	driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Test@123");
    	try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	driver.findElement(By.xpath("//button[@id='kt_login_signin_submit']")).click();
    	Thread.sleep(5000);
    	String str5 = driver.findElement(By.xpath("//*[text()=' LoggedIn Successfully ']")).getText();
    	System.out.println(str5);
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
    	Thread.sleep(10000);
//    	String stru = driver.findElement(By.xpath("//*[contains(text(),'@convergentechnologies')]")).getText();
//    	System.out.println(stru);
//    	Thread.sleep(3000);
//    	driver.findElement(By.xpath("//*[contains(text(),'@convergentechnologies')]")).click();
    	String rolemng = driver.findElement(By.xpath("//*[text()='Role Management']")).getText();
    	System.out.println(rolemng);
    }  
  
}  