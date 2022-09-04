Feature: Feature to test login functionality.
@Smoke
  Scenario Outline: All user should be able to login with valid credentials.
    Given Browser is open
    When User land on login page
    And Enter <username> and <password>
    And Click on Login button
    Then User should be redirected to HOME page.

    Examples: 
      | username |  | password |
      | sachin   |  |    12345 |
      | raghav   |  |    12345 |
