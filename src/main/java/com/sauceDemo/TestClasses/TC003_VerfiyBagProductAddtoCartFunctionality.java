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

public class TC003_VerfiyBagProductAddtoCartFunctionality extends TestBaseClass 
{ 
	
	@Test
	public void bagProductAddTOCartFunctionality()
	{  
	    //homePage
	    HomePOMClass hp = new HomePOMClass(driver);
	    hp.clickOnBagButton();
	    
	   String actaulCount =  hp.getTextFromCartButton();
	    
	   String expectedCount = "1";
	   
	   Assert.assertEquals(actaulCount, expectedCount);
	}
	
	 
		
	

}
