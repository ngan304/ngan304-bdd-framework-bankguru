$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("bankGuru.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    }
  ],
  "line": 2,
  "name": "01_Register",
  "description": "",
  "id": "01-register",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Register",
  "description": "",
  "id": "01-register;register",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag_01_register"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Open register page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Input Email textbox",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Click Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Get User and Password infor",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Close Page",
  "keyword": "And "
});
formatter.match({
  "location": "RegisterStep.openRegisterPage()"
});
formatter.result({
  "duration": 19639886500,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.inputEmailTextbox()"
});
formatter.result({
  "duration": 1251223900,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.clickSubmitButton()"
});
formatter.result({
  "duration": 1927707800,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.getUserAndPasswordInfor()"
});
formatter.result({
  "duration": 250338700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterStep.closePage()"
});
formatter.result({
  "duration": 1207390200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 12,
  "name": "New Customer can be created",
  "description": "",
  "id": "01-register;new-customer-can-be-created",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@new_customer"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Go to Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Submit valid info on login form",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Open New Customer Page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Input Name textbox with \"\u003cName\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Select female for Genger",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Input DoB textbox with \"\u003cDateOfBirth\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Input Address textbox with \"\u003cAddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Input City textbox with \"\u003cCity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Input State textbox with \"\u003cState\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Input Pin textbox with \"\u003cPin\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Input Mobile textbox with \"\u003cMobile\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Input to Email textbox",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Input Password textbox with \"\u003cPassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click Submit button to create new Customer",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Verify showing sucessfull message",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Get CustomerID",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Click on New Account link",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Input CustomerID",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Input Initial deposit",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Click Submit to create New accout",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Verify create account successfull",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Open Deposit Page",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "Input Account No text box",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Input Amount textbox",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Input Description textbox",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Click on Submit button to deposit",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Verify depoist successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Close page",
  "keyword": "When "
});
formatter.examples({
  "line": 42,
  "name": "New Customer infor",
  "description": "",
  "id": "01-register;new-customer-can-be-created;new-customer-infor",
  "rows": [
    {
      "cells": [
        "Name",
        "DateOfBirth",
        "Address",
        "City",
        "State",
        "Pin",
        "Mobile",
        "Password"
      ],
      "line": 43,
      "id": "01-register;new-customer-can-be-created;new-customer-infor;1"
    },
    {
      "cells": [
        "Home",
        "2022-07-13",
        "Linh Trung",
        "Ho Chi Min",
        "Thao Dien",
        "123456",
        "0342335612",
        "Password#123"
      ],
      "line": 44,
      "id": "01-register;new-customer-can-be-created;new-customer-infor;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 44,
  "name": "New Customer can be created",
  "description": "",
  "id": "01-register;new-customer-can-be-created;new-customer-infor;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 11,
      "name": "@new_customer"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Go to Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "Submit valid info on login form",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "Open New Customer Page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Input Name textbox with \"Home\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Select female for Genger",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Input DoB textbox with \"2022-07-13\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "Input Address textbox with \"Linh Trung\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Input City textbox with \"Ho Chi Min\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "Input State textbox with \"Thao Dien\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Input Pin textbox with \"123456\"",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Input Mobile textbox with \"0342335612\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "Input to Email textbox",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "Input Password textbox with \"Password#123\"",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "Click Submit button to create new Customer",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "Verify showing sucessfull message",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "Get CustomerID",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Click on New Account link",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "Input CustomerID",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "Input Initial deposit",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "Click Submit to create New accout",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "Verify create account successfull",
  "keyword": "Then "
});
formatter.step({
  "line": 34,
  "name": "Open Deposit Page",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "Input Account No text box",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "Input Amount textbox",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "Input Description textbox",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "Click on Submit button to deposit",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "Verify depoist successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "Close page",
  "keyword": "When "
});
formatter.match({
  "location": "CreateNewCustmerSteps.goToLoginPage()"
});
formatter.result({
  "duration": 10516330700,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.submitValidInfoOnLoginForm()"
});
formatter.result({
  "duration": 3974160000,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.openNewCustomerPage()"
});
formatter.result({
  "duration": 5148435600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Home",
      "offset": 25
    }
  ],
  "location": "CreateNewCustmerSteps.inputNameTextboxWith(String)"
});
formatter.result({
  "duration": 139502000,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.selectFemaleForGenger()"
});
formatter.result({
  "duration": 286203000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2022-07-13",
      "offset": 24
    }
  ],
  "location": "CreateNewCustmerSteps.inputDoBTextboxWith(String)"
});
formatter.result({
  "duration": 117601300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Linh Trung",
      "offset": 28
    }
  ],
  "location": "CreateNewCustmerSteps.inputAddressTextboxWith(String)"
});
formatter.result({
  "duration": 143197700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ho Chi Min",
      "offset": 25
    }
  ],
  "location": "CreateNewCustmerSteps.inputCityTextboxWith(String)"
});
formatter.result({
  "duration": 158866900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thao Dien",
      "offset": 26
    }
  ],
  "location": "CreateNewCustmerSteps.inputStateTextboxWith(String)"
});
formatter.result({
  "duration": 107544600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 24
    }
  ],
  "location": "CreateNewCustmerSteps.inputPinTextboxWith(String)"
});
formatter.result({
  "duration": 90013600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0342335612",
      "offset": 27
    }
  ],
  "location": "CreateNewCustmerSteps.inputMobileTextboxWith(String)"
});
formatter.result({
  "duration": 109659400,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.inputToEmailTextbox()"
});
formatter.result({
  "duration": 257182800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password#123",
      "offset": 29
    }
  ],
  "location": "CreateNewCustmerSteps.inputPasswordTextboxWith(String)"
});
formatter.result({
  "duration": 124331000,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.clickSubmitButtonToCreateNewCustomer()"
});
formatter.result({
  "duration": 2009196800,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.verifyShowingSucessfullMessage()"
});
formatter.result({
  "duration": 161468500,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.getCustomerID()"
});
formatter.result({
  "duration": 79964900,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.clickOnNewAccountLink()"
});
formatter.result({
  "duration": 727440800,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.inputCustomerID()"
});
formatter.result({
  "duration": 126540800,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.inputInitialDeposit()"
});
formatter.result({
  "duration": 134669700,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.clickSubmitToCreateNewAccout()"
});
formatter.result({
  "duration": 2239683200,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.verifyCreateAccountSuccessfull()"
});
formatter.result({
  "duration": 104768400,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.openDepositPage()"
});
formatter.result({
  "duration": 1020540700,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.inputAccountNoTextBox()"
});
formatter.result({
  "duration": 192127800,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.inputAmountTextbox()"
});
formatter.result({
  "duration": 139406500,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.inputDescriptionTextbox()"
});
formatter.result({
  "duration": 150065100,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.clickOnSubmitButtonToDeposit()"
});
formatter.result({
  "duration": 698950000,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.verifyDepoistSuccessfully()"
});
formatter.result({
  "duration": 27700,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewCustmerSteps.closePage()"
});
formatter.result({
  "duration": 1066579000,
  "status": "passed"
});
});