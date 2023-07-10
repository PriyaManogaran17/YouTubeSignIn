package com.project.demo.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPageObject {
	
	@FindBy(id="avatar-btn")
	public static WebElement profileButton;
	
	@FindBy(id="account-name")
	public static WebElement accountName;
	
	@FindBy(xpath="//input[@id='search']")
	public static WebElement searchBox;
	
	@FindBy(xpath = "(//*[contains(text(),'Naa Ready Lyric Video')])[1]")
	public static WebElement videoFile;

}
