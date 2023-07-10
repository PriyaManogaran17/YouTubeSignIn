package com.project.demo.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.project.demo.constants.Constants;
import com.project.demo.pageObject.DashboardPageObject;
import com.project.demo.pageObject.SignInPageObject;
import com.project.demo.webDriverManager.DriverManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Verify_Signin_StepDefinition {
	
	WebDriverWait wait;
	String accountNameDisplay;
	
	@Given("^User navigate to the url$")
	public void user_navigate_to_the_url() {
		DriverManager.getDriver().get(Constants.APP_URL);
		Common_StepDefinition.extentReport("TC_001","User navigated to you tube url");
	}

	@When("^User clicks on sign in button$")
	public void user_clicks_on_sign_in_button(){
		SignInPageObject.signIn.click();
		Common_StepDefinition.extentReport("TC_002","User clicks on sign in button to enter user credentials");
	}

	@When("^User enters the mail id and clicks on next button$")
	public void user_enters_the_mail_id_and_clicks_on_next_button(){
		SignInPageObject.emailId.sendKeys(Constants.EMAIL_ID);
		SignInPageObject.nextButton.click();
		Common_StepDefinition.extentReport("TC_003", "User enters mail id and clicks on next button");
	}

	@When("^User enters the password and clicks on next button$")
	public void user_enters_the_password_and_clicks_on_next_button(){
		DriverManager.doWait(SignInPageObject.password);
		SignInPageObject.password.sendKeys(Constants.PASSWORD);
		SignInPageObject.pswdNextButton.click();
		Common_StepDefinition.extentReport("TC_004", "User enters password and clicks on next button");
	}

	@Then("^User should see the dashboard page with username \"([^\"]*)\"$")
	public void user_should_see_the_dashboard_page_with_username(String accountNameExpected){
		try {
		DriverManager.doWait(DashboardPageObject.profileButton);
		DashboardPageObject.profileButton.click();
		Common_StepDefinition.extentReport("TC_005", "Sign in successful and user clicks on profile button");
		DriverManager.doWait(DashboardPageObject.accountName);
		accountNameDisplay = DashboardPageObject.accountName.getText();
		Assert.assertEquals(accountNameExpected, accountNameDisplay);
		Common_StepDefinition.extentReport("TC_005", "Account name is displayed as expected");
		}catch(Exception exception) {
			Common_StepDefinition.failReport("TC_005", "Sign in not successful");
		}

	}
	
}
