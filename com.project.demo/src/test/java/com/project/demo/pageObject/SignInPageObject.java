package com.project.demo.pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPageObject {
	

	@FindBy(xpath = "(//a[@aria-label='Sign in']//div[@class='yt-spec-touch-feedback-shape__fill'])[1]")
	public static WebElement signIn;
	
	@FindBy(id = "identifierId")
	public static WebElement emailId;
	
	@FindBy(id = "identifierNext")
	public static WebElement nextButton;
	
	@FindBy(xpath = "//input[@type='password']")
	public static WebElement password;
	
	@FindBy(xpath="//*[text()='Next']")
	public static WebElement pswdNextButton;

}
