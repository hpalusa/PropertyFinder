$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 1,
  "name": "Test Feature",
  "description": "Sample Feature to test test selenium",
  "id": "test-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4252038913,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Test Scenario",
  "description": "",
  "id": "test-feature;test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am Navigating to properyfinder",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "select buy",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "searching the filter",
  "keyword": "When "
});
formatter.match({
  "location": "PFSteps.Navigation_QA_page()"
});
formatter.result({
  "duration": 29756023578,
  "status": "passed"
});
formatter.match({
  "location": "PFSteps.seelctbuy()"
});
formatter.result({
  "duration": 6366284780,
  "status": "passed"
});
formatter.match({
  "location": "PFSteps.searching_filter()"
});
formatter.result({
  "duration": 12075479273,
  "status": "passed"
});
formatter.after({
  "duration": 992122254,
  "status": "passed"
});
formatter.before({
  "duration": 3446229135,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Test Scenario1",
  "description": "",
  "id": "test-feature;test-scenario1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Navigate to properyfinder1",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "search find",
  "keyword": "When "
});
formatter.match({
  "location": "PFSteps.customer_view_tab_is_active()"
});
formatter.result({
  "duration": 26312586945,
  "status": "passed"
});
formatter.match({
  "location": "PFSteps.search()"
});
formatter.result({
  "duration": 18500660821,
  "status": "passed"
});
formatter.after({
  "duration": 858141364,
  "status": "passed"
});
formatter.before({
  "duration": 3379867536,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Test Scenario2",
  "description": "",
  "id": "test-feature;test-scenario2",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "Navigate to properyfinder1",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "select first element",
  "keyword": "When "
});
formatter.match({
  "location": "PFSteps.customer_view_tab_is_active()"
});
formatter.result({
  "duration": 25246665499,
  "status": "passed"
});
formatter.match({
  "location": "PFSteps.click_search_button()"
});
formatter.result({
  "duration": 14106779061,
  "status": "passed"
});
formatter.after({
  "duration": 3046009572,
  "status": "passed"
});
});