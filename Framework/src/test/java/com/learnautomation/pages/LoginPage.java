package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//span[@class='icon icon-xs mdi-chart-bar']") WebElement login;
		
	@FindBy(xpath="//input[@name='email']") WebElement uname; // to pass the test case
	
	//@FindBy(name="username1") WebElement uname; // to fail the test case
	
	@FindBy(xpath="//input[@name='password']") WebElement pass;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']") WebElement loginButton;
	
	public void loginToCRM(String usernameApplication, String passwordApplication)
	{
		try
		{
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		login.click();
		uname.sendKeys(usernameApplication);
		pass.sendKeys(passwordApplication);
		loginButton.click();	
	}
}
