$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "login validatation",
  "description": "",
  "id": "login-validatation",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 4241491400,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "successful login with valid credentials",
  "description": "",
  "id": "login-validatation;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "user enters valid password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters valid username",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should be in the product page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_enters_valid_password()"
});
formatter.result({
  "duration": 116707000,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enters_valid_username()"
});
formatter.result({
  "duration": 79395200,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 107795600,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_in_the_product_page()"
});
formatter.result({
  "duration": 27843300,
  "status": "passed"
});
formatter.after({
  "duration": 864852900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3492913300,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "unsuccessful login with invalid credentials",
  "description": "",
  "id": "login-validatation;unsuccessful-login-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user enters invalid username",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "user enters invalid password",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user should stay in the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_enters_invalid_username()"
});
formatter.result({
  "duration": 115761500,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enters_invalid_password()"
});
formatter.result({
  "duration": 73166600,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 65692600,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_stay_in_the_login_page()"
});
formatter.result({
  "duration": 6354500,
  "status": "passed"
});
formatter.after({
  "duration": 904257000,
  "status": "passed"
});
formatter.uri("logindata.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Author: Razin Anik"
    },
    {
      "line": 2,
      "value": "# date : 2/27/2022"
    }
  ],
  "line": 3,
  "name": "login for different sets of data",
  "description": "",
  "id": "login-for-different-sets-of-data",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 6,
  "name": "validating test data for login",
  "description": "",
  "id": "login-for-different-sets-of-data;validating-test-data-for-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@data"
    },
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters username \"\u003cusername\u003e\" in the login",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters password \"\u003cpassword\u003e\" in the login",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user can stay or login to the page \"\u003cExpectedUrl\u003e\" based on test data",
  "keyword": "Then "
});
formatter.examples({
  "line": 13,
  "name": "",
  "description": "",
  "id": "login-for-different-sets-of-data;validating-test-data-for-login;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "ExpectedUrl"
      ],
      "line": 14,
      "id": "login-for-different-sets-of-data;validating-test-data-for-login;;1"
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce",
        "https://www.saucedemo.com/inventory.html"
      ],
      "line": 15,
      "id": "login-for-different-sets-of-data;validating-test-data-for-login;;2"
    },
    {
      "cells": [
        "locked_out_user",
        "secret_sauce",
        "https://www.saucedemo.com/"
      ],
      "line": 16,
      "id": "login-for-different-sets-of-data;validating-test-data-for-login;;3"
    },
    {
      "cells": [
        "problem_user",
        "secret_sauce",
        "https://www.saucedemo.com/inventory.html"
      ],
      "line": 17,
      "id": "login-for-different-sets-of-data;validating-test-data-for-login;;4"
    },
    {
      "cells": [
        "performance_glitch_user",
        "secret_sauce",
        "https://www.saucedemo.com/inventory.html"
      ],
      "line": 18,
      "id": "login-for-different-sets-of-data;validating-test-data-for-login;;5"
    },
    {
      "cells": [
        "abc1",
        "sdfasdaf",
        "https://www.saucedemo.com/"
      ],
      "line": 19,
      "id": "login-for-different-sets-of-data;validating-test-data-for-login;;6"
    },
    {
      "cells": [
        "abc2",
        "sdfasdaf",
        "https://www.saucedemo.com/"
      ],
      "line": 20,
      "id": "login-for-different-sets-of-data;validating-test-data-for-login;;7"
    },
    {
      "cells": [
        "abc3",
        "sdfasdaf",
        "https://www.saucedemo.com/"
      ],
      "line": 21,
      "id": "login-for-different-sets-of-data;validating-test-data-for-login;;8"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 15,
  "name": "validating test data for login",
  "description": "",
  "id": "login-for-different-sets-of-data;validating-test-data-for-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@regression"
    },
    {
      "line": 5,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters username \"standard_user\" in the login",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters password \"secret_sauce\" in the login",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user can stay or login to the page \"https://www.saucedemo.com/inventory.html\" based on test data",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3479348700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_username_in_the_login(String)"
});
formatter.result({
  "duration": 109987300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_password_in_the_login(String)"
});
formatter.result({
  "duration": 97313300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 120962400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/inventory.html",
      "offset": 36
    }
  ],
  "location": "stepDef.user_can_stay_or_login_to_the_page_based_on_test_data(String)"
});
formatter.result({
  "duration": 22694000,
  "status": "passed"
});
formatter.after({
  "duration": 791699200,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "validating test data for login",
  "description": "",
  "id": "login-for-different-sets-of-data;validating-test-data-for-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@regression"
    },
    {
      "line": 5,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters username \"locked_out_user\" in the login",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters password \"secret_sauce\" in the login",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user can stay or login to the page \"https://www.saucedemo.com/\" based on test data",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3530557800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "locked_out_user",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_username_in_the_login(String)"
});
formatter.result({
  "duration": 107787600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_password_in_the_login(String)"
});
formatter.result({
  "duration": 88130500,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 60844700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 36
    }
  ],
  "location": "stepDef.user_can_stay_or_login_to_the_page_based_on_test_data(String)"
});
formatter.result({
  "duration": 9308400,
  "status": "passed"
});
formatter.after({
  "duration": 872856100,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "validating test data for login",
  "description": "",
  "id": "login-for-different-sets-of-data;validating-test-data-for-login;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@regression"
    },
    {
      "line": 5,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters username \"problem_user\" in the login",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters password \"secret_sauce\" in the login",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user can stay or login to the page \"https://www.saucedemo.com/inventory.html\" based on test data",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3480910800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "problem_user",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_username_in_the_login(String)"
});
formatter.result({
  "duration": 108232400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_password_in_the_login(String)"
});
formatter.result({
  "duration": 80731500,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 126288400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/inventory.html",
      "offset": 36
    }
  ],
  "location": "stepDef.user_can_stay_or_login_to_the_page_based_on_test_data(String)"
});
formatter.result({
  "duration": 16670100,
  "status": "passed"
});
formatter.after({
  "duration": 839374800,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "validating test data for login",
  "description": "",
  "id": "login-for-different-sets-of-data;validating-test-data-for-login;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@regression"
    },
    {
      "line": 5,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters username \"performance_glitch_user\" in the login",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters password \"secret_sauce\" in the login",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user can stay or login to the page \"https://www.saucedemo.com/inventory.html\" based on test data",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3454809800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "performance_glitch_user",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_username_in_the_login(String)"
});
formatter.result({
  "duration": 139180800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "secret_sauce",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_password_in_the_login(String)"
});
formatter.result({
  "duration": 76520100,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 5105676100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/inventory.html",
      "offset": 36
    }
  ],
  "location": "stepDef.user_can_stay_or_login_to_the_page_based_on_test_data(String)"
});
formatter.result({
  "duration": 25938400,
  "status": "passed"
});
formatter.after({
  "duration": 833282000,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "validating test data for login",
  "description": "",
  "id": "login-for-different-sets-of-data;validating-test-data-for-login;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@regression"
    },
    {
      "line": 5,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters username \"abc1\" in the login",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters password \"sdfasdaf\" in the login",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user can stay or login to the page \"https://www.saucedemo.com/\" based on test data",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3470125200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc1",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_username_in_the_login(String)"
});
formatter.result({
  "duration": 103756300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sdfasdaf",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_password_in_the_login(String)"
});
formatter.result({
  "duration": 71539500,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 63784500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 36
    }
  ],
  "location": "stepDef.user_can_stay_or_login_to_the_page_based_on_test_data(String)"
});
formatter.result({
  "duration": 16567600,
  "status": "passed"
});
formatter.after({
  "duration": 823719800,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "validating test data for login",
  "description": "",
  "id": "login-for-different-sets-of-data;validating-test-data-for-login;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@regression"
    },
    {
      "line": 5,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters username \"abc2\" in the login",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters password \"sdfasdaf\" in the login",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user can stay or login to the page \"https://www.saucedemo.com/\" based on test data",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3487818100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc2",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_username_in_the_login(String)"
});
formatter.result({
  "duration": 103313000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sdfasdaf",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_password_in_the_login(String)"
});
formatter.result({
  "duration": 63178900,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 66612700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 36
    }
  ],
  "location": "stepDef.user_can_stay_or_login_to_the_page_based_on_test_data(String)"
});
formatter.result({
  "duration": 13515500,
  "status": "passed"
});
formatter.after({
  "duration": 776025800,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "validating test data for login",
  "description": "",
  "id": "login-for-different-sets-of-data;validating-test-data-for-login;;8",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@regression"
    },
    {
      "line": 5,
      "name": "@data"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters username \"abc3\" in the login",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters password \"sdfasdaf\" in the login",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user can stay or login to the page \"https://www.saucedemo.com/\" based on test data",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3490755700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc3",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_username_in_the_login(String)"
});
formatter.result({
  "duration": 111532200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sdfasdaf",
      "offset": 22
    }
  ],
  "location": "stepDef.user_enters_password_in_the_login(String)"
});
formatter.result({
  "duration": 79137900,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 65654300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 36
    }
  ],
  "location": "stepDef.user_can_stay_or_login_to_the_page_based_on_test_data(String)"
});
formatter.result({
  "duration": 10615300,
  "status": "passed"
});
formatter.after({
  "duration": 823208500,
  "status": "passed"
});
formatter.uri("web.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Author: Razin Anik"
    },
    {
      "line": 2,
      "value": "#Date: 02/26/2022"
    }
  ],
  "line": 3,
  "name": "End-to-End testing for product purchase",
  "description": "",
  "id": "end-to-end-testing-for-product-purchase",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "successfull login with valid credentials",
  "description": "",
  "id": "end-to-end-testing-for-product-purchase;successfull-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enters valid password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters valid username",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should be in the product page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user add product to the cart",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user should get the product to the cart",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user should be able to go to checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user should be able to click on checkout",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user enters first name",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user enters last name",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user enters zip code",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user should click on the continue button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user should be final checkout page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user clicks on finish",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "user should see successful order message",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDef.user_is_on_the_login_page()"
});
formatter.result({
  "duration": 3490322200,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enters_valid_password()"
});
formatter.result({
  "duration": 122910200,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enters_valid_username()"
});
formatter.result({
  "duration": 91974700,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_the_login_button()"
});
formatter.result({
  "duration": 112774400,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_in_the_product_page()"
});
formatter.result({
  "duration": 106813900,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_add_product_to_the_cart()"
});
formatter.result({
  "duration": 90531300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_get_the_product_to_the_cart()"
});
formatter.result({
  "duration": 112179900,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_able_to_go_to_checkout_page()"
});
formatter.result({
  "duration": 17820500,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_able_to_click_on_checkout()"
});
formatter.result({
  "duration": 1109530800,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enters_first_name()"
});
formatter.result({
  "duration": 82967700,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enters_last_name()"
});
formatter.result({
  "duration": 75470900,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_enters_zip_code()"
});
formatter.result({
  "duration": 69331400,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_click_on_the_continue_button()"
});
formatter.result({
  "duration": 105720000,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_be_final_checkout_page()"
});
formatter.result({
  "duration": 20021800,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_clicks_on_finish()"
});
formatter.result({
  "duration": 58956300,
  "status": "passed"
});
formatter.match({
  "location": "stepDef.user_should_see_successful_order_message()"
});
formatter.result({
  "duration": 19095200,
  "status": "passed"
});
formatter.after({
  "duration": 806078900,
  "status": "passed"
});
});