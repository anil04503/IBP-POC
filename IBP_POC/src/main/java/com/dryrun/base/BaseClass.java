package com.dryrun.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.dryrun.actiondriver.Action;
import com.dryrun.utility.ExtentManager;

import io.github.bonigarcia.wdm.WebDriverManager;




public class BaseClass {
	public static Properties prop;
	//public static WebDriver driver;
	
	public static ThreadLocal<RemoteWebDriver> driver = new ThreadLocal<>();
	
	public static WebDriver getDriver() {
		return driver.get();
	}
	
	@BeforeSuite(groups = {"Smoke","Sanity","Regression"})
	public void loadConfig() throws IOException {
		ExtentManager.setExtent();
		DOMConfigurator.configure("log4j.xml");
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "\\Configuration\\config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Parameters("browser")
	@BeforeTest(groups = {"Smoke","Sanity","Regression"})
	public static void launchApp(String browserName) {
		if(!browserName.contains("Head"))
		{
			Action.openBrowser(browserName);
		}
		if(browserName.contains("Head"))
		{
			Action.openHeadlessBrowser(browserName);
		}
		Action.implicitWait(getDriver(), 60);
		Action.pageLoadTimeOut(getDriver(), 60);
		Action.openURL(prop.getProperty("url"));
		getDriver().manage().window().maximize();
	}
	
	@AfterTest(groups = {"Smoke","Sanity","Regression"})
	public static void closeApp() {
		getDriver().quit();
	}
	
	@AfterSuite(groups = {"Smoke","Sanity","Regression"})
	public void afterSuite() {
		ExtentManager.endReport();
	}

}
