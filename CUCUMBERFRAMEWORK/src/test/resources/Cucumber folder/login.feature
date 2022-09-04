Feature: feature to test login functionality

  Scenario: login is successful with valid credentials
    Given user is on login page
    When user enter valid credentials
    And click on login button
    Then user is redirected to home page
