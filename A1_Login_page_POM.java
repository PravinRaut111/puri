package soucedemo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A1_Login_page_POM 
 {

    private WebDriver driver ;
	
	@FindBy(xpath = "(//input [@class='input_error form_input'])[1]") private WebElement username;
	
	@FindBy(xpath ="(//input [@class='input_error form_input'])[2]") private WebElement password;
	
	@FindBy(xpath ="/html/body/div/div/div[2]/div[1]/div/div/form/input") private WebElement login;
	
	
	public void username()
	{
		username.sendKeys("standard_user");
		System.out.println("pass username Successfully");
	}
	
	public void password()
	{
		password.sendKeys("secret_sauce");
		System.out.println("pass password Successfully");

	}
	
	public void login()
	{
		login.click();
		System.out.println("click on login button Successfully");

	}
	
	

	
	public A1_Login_page_POM(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
 }
