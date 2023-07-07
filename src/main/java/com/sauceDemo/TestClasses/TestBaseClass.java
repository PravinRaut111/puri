package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.sauceDemo.POMClasses.LoginPOMClass;
import com.sauceDemo.UtilityClasses.ScreenshotClass;

public class TestBaseClass 
{
   WebDriver driver;
   
   Logger log = Logger.getLogger("SauceDemo16thApril");
   
 
    @Parameters("browserName")
	@BeforeMethod
	public void setUP(String browserName) 
	{
		if(browserName.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", 
				"./DriverFolder/chromedriver.exe");
			ChromeOptions Options = new ChromeOptions();
			Options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(Options);
		}
		
		else if(browserName.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver", 
				"./DriverFolder/geckodriver.exe");
		driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("throw the error");
		}
		
		PropertyConfigurator.configure("log4j.properties");
		
		log.info("Browser is opened");
	
		driver.manage().window().maximize();
		log.info("Browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		log.info("URL is opened");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//login
		LoginPOMClass lp = new LoginPOMClass(driver);
	    lp.sendUsername();
	    log.info("username is entered");
	    lp.sendPassword();
	    log.info("password is entered");
	    lp.clickOnLoginButton();
	    log.info("clicked on login button");
	}
	
	@AfterMethod
	public void tearDown()
	{
		//logOut
		
		driver.quit();
		log.info("browser is closed");
	}

}
