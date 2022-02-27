#Author : razin anik
#date: 02/27/2022
Feature: product add and remove from cart

  Scenario: user can add or remove product from cart
    Given user is on the login page
    When user enters valid password
    And user enters valid username
    And user clicks on the login button
    Then user should be in the product page
    When user add a product to the cart
    Then user should see the remove option enabled
    When user click remove option
    Then user should see the add option to cart is enabled 
    
    
