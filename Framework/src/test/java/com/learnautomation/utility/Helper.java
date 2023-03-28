package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	public static String captureScreenshot(WebDriver driver)  {
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		String screenshotPath = System.getProperty("user.dir")+"/Screenshots/FreeCRM_"+getCurrentDateTime()+".png";
		
		try {
			org.openqa.selenium.io.FileHandler.copy(src, new File(screenshotPath));
			
			System.out.println("Screenshot captured");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to capture screenshot " +e.getMessage());
			e.printStackTrace();
		}
		return screenshotPath;			
	}
	
	public static String getCurrentDateTime() {
		
	DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	Date currentDate = new Date();
	return customFormat.format(currentDate);
	}
	
	public void hangleFrames() {
		
	}
	
	public void handleAlets() {
		
	}
}
