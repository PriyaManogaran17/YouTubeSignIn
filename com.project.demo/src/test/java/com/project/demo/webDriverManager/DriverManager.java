package com.project.demo.webDriverManager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.demo.constants.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;


public class DriverManager {

	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void launchBrowser() {

		try{
			switch(Constants.BROWSER) {
			case "chrome" :
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("incognito");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(chromeOptions);
				break;

			case "firefox":
				FirefoxOptions firefoxoptions = new FirefoxOptions();
				firefoxoptions.addArguments("-private");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver(firefoxoptions);
				break;

			default:
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void doWait(WebElement webElement) {
		wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(webElement));
	}


}
