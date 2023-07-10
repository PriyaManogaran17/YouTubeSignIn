package com.project.demo.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.project.demo.constants.Constants;
import com.project.demo.pageObject.DashboardPageObject;
import com.project.demo.webDriverManager.DriverManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Verify_Search_StepDefinition {

	String urlName;

	@Given("^User is on youtube and click on search button$")
	public void user_is_on_youtube_and_click_on_search_button(){
		DriverManager.getDriver().navigate().to(Constants.APP_URL);
		DashboardPageObject.searchBox.click();
		Common_StepDefinition.extentReport("TC_0001","User navigated to you tube url & search button is clicked");
	}

	@When("^User search for a song name \"([^\"]*)\" and go to detail page by pressing enter key$")
	public void user_search_for_a_song_name_and_go_to_detail_page_by_pressing_enter_key(String songName) {
		DashboardPageObject.searchBox.sendKeys(songName+Keys.ENTER);
		Common_StepDefinition.extentReport("TC_0002","User enters song name & enter key is pressed");
		urlName = DriverManager.getDriver().getCurrentUrl();
			if(urlName.contains("leo")) {
				Common_StepDefinition.extentReport("TC_0002","Search reslt is displayed & user is on detail page");
			}else {
				Common_StepDefinition.extentReport("TC_0002","User is not on detail page");
			}
	}

	@Then("^video should play when user clicks on it$")
	public void video_should_play_when_user_clicks_on_it() {
		try {
			DriverManager.doWait(DashboardPageObject.videoFile);
			DashboardPageObject.videoFile.click();
			Common_StepDefinition.extentReport("TC_0003","Video file is clicked & it is playing now");
		}catch(Exception exception) {
			Common_StepDefinition.failReport("TC_0003", "Video file is not available");
		}
	}
}
