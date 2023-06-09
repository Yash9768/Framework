package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;
import com.learnautomation.utility.ExcelDataProvider;
import com.learnautomation.utility.Helper;

public class LoginTestCRM extends BaseClass {
	
	
	@Test
	public void loginApp() throws Exception {
		//ExcelDataProvider excel = new ExcelDataProvider();
		//excel.getStringData("Login", 0, 0);
		
		logger = report.createTest("Login to CRM");
		
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		
		logger.info("Starting application");
		
		loginPage.loginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));
		
		logger.pass("Login Success");
		
		//loginPage.loginToCRM("Selenium_50", "Abcd@123456");
		
	}

}

