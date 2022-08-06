package com.sauceDemo.TestClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sauceDemo.POMClasses.RoughPOMCLass;



public class RoughTestClass 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Back-up Data\\Desktop-Backup\\Pavan Velo\\Automation Batch Material\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Browser is opened");
	
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");
		
		driver.get("https://www.saucedemo.com/");
		System.out.println("URL is opened");
		
		RoughPOMCLass rp= new RoughPOMCLass(driver);
		WebElement frameEle = rp.getElement();
		//switch TO frame
		driver.switchTo().frame(frameEle);
		
	}

}
