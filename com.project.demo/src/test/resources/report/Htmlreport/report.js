$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("YouTube.feature");
formatter.feature({
  "line": 1,
  "name": "This feature is to check the you tube video functionality",
  "description": "",
  "id": "this-feature-is-to-check-the-you-tube-video-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2230947200,
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
  "duration": 5883412900,
  "status": "passed"
});
formatter.match({
  "location": "Verify_Signin_StepDefinition.user_clicks_on_sign_in_button()"
});
formatter.result({
  "duration": 2634766300,
  "status": "passed"
});
formatter.match({
  "location": "Verify_Signin_StepDefinition.user_enters_the_mail_id_and_clicks_on_next_button()"
});
formatter.result({
  "duration": 238670200,
  "status": "passed"
});
formatter.match({
  "location": "Verify_Signin_StepDefinition.user_enters_the_password_and_clicks_on_next_button()"
});
formatter.result({
  "duration": 3371817400,
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
  "duration": 5024184100,
  "status": "passed"
});
});