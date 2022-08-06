package com.sauceDemo.TestClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauceDemo.POMClasses.HomePOMClass;
import com.sauceDemo.POMClasses.LoginPOMClass;

public class TC002_VerifyLogOutFunctionality extends TestBaseClass
{
        @Test
        public void logOutFunctionality()
        {
	
		//homePage
		//logOutActivity
		
		HomePOMClass hp = new HomePOMClass(driver);
		hp.clickOnSettingButton();
		System.out.println("Click on SettingButton");
		hp.clickOnLogOutButton();
		System.out.println("Click on LogOutButton");
		
		System.out.println("Applying the validation");
		
		//loginpage
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
        }
        
		
	

}
