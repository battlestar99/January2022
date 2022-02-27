# Author: Razin Anik
# date : 2/27/2022
Feature: login for different sets of data

@data @regression @smoke
  Scenario Outline: validating test data for login
    Given user is on the login page
    When user enters username "<username>" in the login
    And user enters password "<password>" in the login
    And user clicks on the login button
    Then user can stay or login to the page "<ExpectedUrl>" based on test data

    Examples: 
      | username                | password     | ExpectedUrl                              |
      | standard_user           | secret_sauce | https://www.saucedemo.com/inventory.html |
      | locked_out_user         | secret_sauce | https://www.saucedemo.com/               |
      | problem_user            | secret_sauce | https://www.saucedemo.com/inventory.html |
      | performance_glitch_user | secret_sauce | https://www.saucedemo.com/inventory.html |
      | abc1                    | sdfasdaf     | https://www.saucedemo.com/               |
      | abc2                    | sdfasdaf     | https://www.saucedemo.com/               |
      | abc3                    | sdfasdaf     | https://www.saucedemo.com/               |
