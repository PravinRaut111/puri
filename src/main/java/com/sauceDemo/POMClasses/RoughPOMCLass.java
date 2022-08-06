package com.sauceDemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RoughPOMCLass 
{
	WebDriver driver;
	
	@FindBy(xpath="//form//div[2]//input")
	private WebElement frameEle;
	
	public WebElement getElement()
	{
		return frameEle;	
	}
	
	
	public RoughPOMCLass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	

}
