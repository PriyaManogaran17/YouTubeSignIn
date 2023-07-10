$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("YouTube.feature");
formatter.feature({
  "line": 1,
  "name": "This feature is to check the you tube video functionality",
  "description": "",
  "id": "this-feature-is-to-check-the-you-tube-video-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2181579000,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "This test is to verify sign in functionality",
  "description": "",
  "id": "this-feature-is-to-check-the-you-tube-video-functionality;this-test-is-to-verify-sign-in-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User navigate to the url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "User clicks on sign in button",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enters the mail id and clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User enters the password and clicks on next button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should see the dashboard page with username \"DummyMail\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Verify_Signin_StepDefinition.user_navigate_to_the_url()"
});
formatter.result({
  "duration": 5504053800,
  "status": "passed"
});
formatter.match({
  "location": "Verify_Signin_StepDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 7027824100,
  "status": "passed"
});
formatter.match({
  "location": "Verify_Signin_StepDefinition.user_enters_the_mail_id_and_clicks_on_next_button()"
});
formatter.result({
  "duration": 291398800,
  "status": "passed"
});
formatter.match({
  "location": "Verify_Signin_StepDefinition.user_enters_the_password_and_clicks_on_next_button()"
});
formatter.result({
  "duration": 4498237800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "DummyMail",
      "offset": 50
    }
  ],
  "location": "Verify_Signin_StepDefinition.user_should_see_the_dashboard_page_with_username(String)"
});
formatter.result({
  "duration": 6302544000,
  "status": "passed"
});
formatter.after({
  "duration": 1042467000,
  "status": "passed"
});
formatter.before({
  "duration": 714312400,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "This test is to search for a movie and go to detail page",
  "description": "",
  "id": "this-feature-is-to-check-the-you-tube-video-functionality;this-test-is-to-search-for-a-movie-and-go-to-detail-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User is on youtube and click on search button",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "User search for a song name \"leo song\" and go to detail page by pressing enter key",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "video should play when user clicks on it",
  "keyword": "Then "
});
formatter.match({
  "location": "Verify_Search_StepDefinition.user_is_on_youtube_and_click_on_search_button()"
});
formatter.result({
  "duration": 9729849100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "leo song",
      "offset": 29
    }
  ],
  "location": "Verify_Search_StepDefinition.user_search_for_a_song_name_and_go_to_detail_page_by_pressing_enter_key(String)"
});
formatter.result({
  "duration": 132080400,
  "status": "passed"
});
formatter.match({
  "location": "Verify_Search_StepDefinition.video_should_play_when_user_clicks_on_it()"
});
formatter.result({
  "duration": 1920482200,
  "status": "passed"
});
formatter.after({
  "duration": 888239200,
  "status": "passed"
});
});