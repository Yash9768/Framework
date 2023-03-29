package com.learnautomation.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ConfigDataProvider {
	
	Properties pro;
	

	public ConfigDataProvider()   
	{
		//File src = new File(Syst"./Config.properties");
		String path = System.getProperty("user.dir") + "\\Configuration\\Config.properties";
		FileInputStream fis;
		
		try {
			fis = new FileInputStream(path);
			pro = new Properties();
			pro.load(fis);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Not able to load config file>>" + e.getMessage());
			e.printStackTrace();
		}	
	}
	
	public String getDataFromConfig(String keyToSearch) {
		return pro.getProperty(keyToSearch);
	}
	public String getBrowser() {
		return pro.getProperty("Browser");
	}
	public String getStagingURL() {
		return pro.getProperty("qaURL");
		
	}
	 
}

