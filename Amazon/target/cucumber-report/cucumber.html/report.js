$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SearchProduct.feature");
formatter.feature({
  "line": 1,
  "name": "Search Product",
  "description": "",
  "id": "search-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7992724500,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "User should search product successfully",
  "description": "",
  "id": "search-product;user-should-search-product-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I click on All menu",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "I click on Electronics,computer \u0026 office",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I click on All Electronics",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I search Product \"Computer\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I see product list",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchproductSteps.iAmOnHomePage()"
});
formatter.result({
  "duration": 136694500,
  "status": "passed"
});
formatter.match({
  "location": "SearchproductSteps.iClickOnAllMenu()"
});
formatter.result({
  "duration": 2454108300,
  "status": "passed"
});
formatter.match({
  "location": "SearchproductSteps.iClickOnElectronicsComputerOffice()"
});
formatter.result({
  "duration": 79705000,
  "status": "passed"
});
formatter.match({
  "location": "SearchproductSteps.iClickOnAllElectronics()"
});
formatter.result({
  "duration": 1353361000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Computer",
      "offset": 18
    }
  ],
  "location": "SearchproductSteps.iSearchProduct(String)"
});
formatter.result({
  "duration": 123540300,
  "status": "passed"
});
formatter.match({
  "location": "SearchproductSteps.iSeeProductList()"
});
formatter.result({
  "duration": 1539739700,
  "status": "passed"
});
formatter.after({
  "duration": 680132500,
  "status": "passed"
});
});