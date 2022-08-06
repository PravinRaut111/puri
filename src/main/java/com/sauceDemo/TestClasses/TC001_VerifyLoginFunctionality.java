package com.sauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.LoginPOMClass;
import com.sauceDemo.UtilityClasses.ScreenshotClass;



public class TC001_VerifyLoginFunctionality extends TestBaseClass
{

	@Test
	public void loginFuntionality() throws IOException
	{ 
		//screenshot
	    ScreenshotClass.takeScreenshot(driver);
	    log.info("screenshot is taken");
	    
		//validation
        String expectedTitle = "Swag Labs";	   //given	
		
		String actualTitle = driver.getTitle();  //actual
		
		log.info("doing validation-for login functionality");
		Assert.assertEquals(actualTitle, expectedTitle,"title not matched");
		
	}
	
	

}
