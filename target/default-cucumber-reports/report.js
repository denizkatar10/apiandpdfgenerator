$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\CountryApi.feature");
formatter.feature({
  "name": "Read countries",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CountryReader"
    }
  ]
});
formatter.scenarioOutline({
  "name": "create a country",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CreateCountry"
    }
  ]
});
formatter.step({
  "name": "user sets the response using api end point \"https://www.gmibank.com/api/tp-countries\" and creates country using \"\u003cidJson\u003e\" and \"\u003cnameJson\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "name": "create country",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "idJson",
        "nameJson"
      ]
    },
    {
      "cells": [
        "name",
        "France"
      ]
    }
  ]
});
formatter.scenario({
  "name": "create a country",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@CountryReader"
    },
    {
      "name": "@CreateCountry"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user sets the response using api end point \"https://www.gmibank.com/api/tp-countries\" and creates country using \"name\" and \"France\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CountryApiSteps.user_sets_the_response_using_api_end_point_and_creates_country_using_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});