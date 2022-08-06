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

public class TC004_VerifyMultipleproductAddtoCartFunctionality extends TestBaseClass
{
	
	@Test
	public void mutipleProductAddToCartFunctionality()
	{
		   
	    //homePage
	    HomePOMClass hp = new HomePOMClass(driver);
	    hp.clickAllProduct();
	    
	    String actualCount = hp.getTextFromCartButton();
		String expectedCount = "6";
		
		Assert.assertEquals(actualCount, expectedCount);
	}
	
		

}
