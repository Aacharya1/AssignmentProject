$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/backgroundcolor.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I want to change the background color;",
  "description": "",
  "id": "as-a-user-i-want-to-change-the-background-color;",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7983464132,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Valid user should be able to change background color to sky blue;",
  "description": "",
  "id": "as-a-user-i-want-to-change-the-background-color;;valid-user-should-be-able-to-change-background-color-to-sky-blue;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Set SkyBlue Background button exists;",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on the button;",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the background color will change to sky blue;",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundColorSteps.set_SkyBlue_Background_button_exists()"
});
formatter.result({
  "duration": 415178322,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundColorSteps.i_click_on_the_button()"
});
formatter.result({
  "duration": 3236742486,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundColorSteps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 178333443,
  "status": "passed"
});
formatter.after({
  "duration": 788719824,
  "status": "passed"
});
formatter.before({
  "duration": 8703298513,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Valid user should be able to change background color to white;",
  "description": "",
  "id": "as-a-user-i-want-to-change-the-background-color;;valid-user-should-be-able-to-change-background-color-to-white;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "Set SkyWhite Background button exists;",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "click on the button;",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the background color will change to sky white;",
  "keyword": "Then "
});
formatter.match({
  "location": "BackgroundColorSteps.set_SkyWhite_Background_button_exists()"
});
formatter.result({
  "duration": 105309661,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundColorSteps.click_on_the_button()"
});
formatter.result({
  "duration": 4323217581,
  "status": "passed"
});
formatter.match({
  "location": "BackgroundColorSteps.the_background_color_will_change_to_sky_white()"
});
formatter.result({
  "duration": 290508909,
  "status": "passed"
});
formatter.after({
  "duration": 2757239428,
  "status": "passed"
});
});