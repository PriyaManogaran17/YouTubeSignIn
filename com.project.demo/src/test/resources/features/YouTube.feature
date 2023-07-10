Feature: This feature is to check the you tube video functionality
Scenario: This test is to verify sign in functionality
 	Given User navigate to the url
 	When User clicks on sign in button
 	And User enters the mail id and clicks on next button
 	And User enters the password and clicks on next button
 	Then User should see the dashboard page with username "DummyMail"
 	
Scenario: This test is to search for a movie and go to detail page
	Given User is on youtube and click on search button
	When User search for a song name "leo song" and go to detail page by pressing enter key
	Then video should play when user clicks on it