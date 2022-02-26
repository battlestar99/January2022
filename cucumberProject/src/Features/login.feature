Feature: login

  Scenario: successful login with valid credentials
    Given user is on the login page
    When user enters valid password
    And user enters valid username
    And user clicks on the login button
    Then user should be in the product page
    
    
   Scenario: unsuccessful login with invalid credentials
   
		Given user is on the login page
    When user enters invalid username
    And user enters invalid password
    And user clicks on the login button
    Then user should stay in the login page