$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Aravind_2/eclipse-workspace/cucumberhybridframework/src/test/resources/Features/Testcase.Feature");
formatter.feature({
  "line": 2,
  "name": "orangeHrm Website",
  "description": "",
  "id": "orangehrm-website",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@orangeHRM"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "validaye the login functionality",
  "description": "",
  "id": "orangehrm-website;validaye-the-login-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tc_01_Login"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click the login button",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "orangehrm-website;validaye-the-login-functionality;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "orangehrm-website;validaye-the-login-functionality;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 12,
      "id": "orangehrm-website;validaye-the-login-functionality;;2"
    },
    {
      "cells": [
        "admin",
        "Admin1234"
      ],
      "line": 13,
      "id": "orangehrm-website;validaye-the-login-functionality;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "validaye the login functionality",
  "description": "",
  "id": "orangehrm-website;validaye-the-login-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tc_01_Login"
    },
    {
      "line": 1,
      "name": "@orangeHRM"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter the \"Admin\" and \"admin123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "orangeHRMLoginStep.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 6362440744,
  "status": "passed"
});
formatter.match({
  "location": "orangeHRMLoginStep.login_page_is_opened()"
});
formatter.result({
  "duration": 1005011364,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 11
    },
    {
      "val": "admin123",
      "offset": 23
    }
  ],
  "location": "orangeHRMLoginStep.enter_the_and(String,String)"
});
formatter.result({
  "duration": 1273427679,
  "status": "passed"
});
formatter.match({
  "location": "orangeHRMLoginStep.click_the_login_button()"
});
formatter.result({
  "duration": 19189,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "validaye the login functionality",
  "description": "",
  "id": "orangehrm-website;validaye-the-login-functionality;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@tc_01_Login"
    },
    {
      "line": 1,
      "name": "@orangeHRM"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "launch the browser and enter the url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "login page is opened",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "enter the \"admin\" and \"Admin1234\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "orangeHRMLoginStep.launch_the_browser_and_enter_the_url()"
});
formatter.result({
  "duration": 4722123230,
  "status": "passed"
});
formatter.match({
  "location": "orangeHRMLoginStep.login_page_is_opened()"
});
formatter.result({
  "duration": 956208803,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 11
    },
    {
      "val": "Admin1234",
      "offset": 23
    }
  ],
  "location": "orangeHRMLoginStep.enter_the_and(String,String)"
});
formatter.result({
  "duration": 958675661,
  "status": "passed"
});
formatter.match({
  "location": "orangeHRMLoginStep.click_the_login_button()"
});
formatter.result({
  "duration": 161096,
  "status": "passed"
});
});