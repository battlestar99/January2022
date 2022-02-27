# Author: Razin Anik
#Date: 02/26/2022
Feature: End-to-End testing for product purchase

@regression
  Scenario: successfull login with valid credentials
    Given user is on the login page
    When user enters valid password
    And user enters valid username
    And user clicks on the login button
    Then user should be in the product page
    When user add product to the cart
    Then user should get the product to the cart
    And user should be able to go to checkout page
    And user should be able to click on checkout
    When user enters first name
    And user enters last name
    And user enters zip code
    Then user should click on the continue button
    And user should be final checkout page
    When user clicks on finish
    Then user should see successful order message
