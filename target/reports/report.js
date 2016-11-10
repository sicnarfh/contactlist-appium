$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactDetails.feature");
formatter.feature({
  "id": "",
  "description": "As a user\nI would like to see my contact\u0027s detail\nSo that I can see information about them",
  "name": "",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": ";view-contact\u0027s-name-in-detail-page",
  "description": "",
  "name": "View Contact\u0027s name in detail page",
  "keyword": "Scenario",
  "line": 6,
  "type": "scenario"
});
formatter.step({
  "name": "I have opened the app",
  "keyword": "Given ",
  "line": 7
});
formatter.step({
  "name": "I view a contact\u0027s detail",
  "keyword": "When ",
  "line": 8
});
formatter.step({
  "name": "I can see their name",
  "keyword": "Then ",
  "line": 9
});
formatter.match({
  "location": "ContactSummaryStepdef.i_have_opened_the_app()"
});
formatter.result({
  "duration": 165174000,
  "status": "passed"
});
formatter.match({
  "location": "ContactSummaryStepdef.i_view_a_contacts_detail()"
});
formatter.result({
  "duration": 73196602000,
  "status": "passed"
});
formatter.match({
  "location": "ContactDetailsStepdef.i_can_see_their_name()"
});
formatter.result({
  "duration": 4040325000,
  "status": "passed"
});
});