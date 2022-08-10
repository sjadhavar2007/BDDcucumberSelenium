$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "TC02-CreateEditRole-Permission Management Feature Tiers And Business Roles",
  "description": "",
  "id": "tc02-createeditrole-permission-management-feature-tiers-and-business-roles",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "login the admin portal",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user launches the admin portal",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.openChromeBrowser()"
});
formatter.result({
  "duration": 5547196600,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Permission management page should have 2 options 1. Feature Tiers 2. Business Roles",
  "description": "",
  "id": "tc02-createeditrole-permission-management-feature-tiers-and-business-roles;permission-management-page-should-have-2-options-1.-feature-tiers-2.-business-roles",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "user enters valid Email and Password for Reseller",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on Remember me and sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user should login successfully and navigate to home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user should be able to see the Permissions Management text in the page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user clicks on the Permissions Management text",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user should be able to see the Permissions Management page displayed",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user should be able to see Feature Tiers and Business Roles clickable option",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.enterEmailAddAndPassword()"
});
formatter.result({
  "duration": 415693300,
  "status": "passed"
});
formatter.match({
  "location": "Login.clickSignIn()"
});
formatter.result({
  "duration": 7032066800,
  "status": "passed"
});
formatter.match({
  "location": "Login.homePage()"
});
formatter.result({
  "duration": 40239600,
  "status": "passed"
});
formatter.match({
  "location": "Login.viewPermissionsManagementPage()"
});
formatter.result({
  "duration": 1390742200,
  "status": "passed"
});
formatter.match({
  "location": "Login.clickPermissionsManagementText()"
});
formatter.result({
  "duration": 72842600,
  "status": "passed"
});
formatter.match({
  "location": "Login.clickPermissionsManagementPage()"
});
formatter.result({
  "duration": 102656400,
  "status": "passed"
});
formatter.match({
  "location": "Login.last()"
});
formatter.result({
  "duration": 900944500,
  "status": "passed"
});
});