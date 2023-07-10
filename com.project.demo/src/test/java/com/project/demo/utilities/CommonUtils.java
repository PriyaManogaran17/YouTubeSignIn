package com.project.demo.utilities;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.support.PageFactory;

import com.project.demo.constants.Constants;
import com.project.demo.pageObject.DashboardPageObject;
import com.project.demo.pageObject.SignInPageObject;
import com.project.demo.webDriverManager.DriverManager;

public class CommonUtils {
	
	public void loadProperties() {
		Properties properties = new Properties();
		
		try {
			properties.load(getClass().getResourceAsStream("/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Constants.BROWSER = properties.getProperty("BROWSER");
		Constants.APP_URL = properties.getProperty("APP_URL");
		Constants.EMAIL_ID = properties.getProperty("EMAIL_ID");
		Constants.PASSWORD = properties.getProperty("PASSWORD");
		
	}
	
	public void initElements() {
		PageFactory.initElements(DriverManager.getDriver(), SignInPageObject.class);
		PageFactory.initElements(DriverManager.getDriver(), DashboardPageObject.class);
	}

}
