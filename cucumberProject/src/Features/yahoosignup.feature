Feature: yahoo sign up

@smoke
  Scenario: creating a new yahoo account
    Given user is on the yahoo sign up page
    When user enters firstname
    And user enters lastname
