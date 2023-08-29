Feature: Demo login functionality

  Scenario: check login with valid credentials
    Given user is on login page
    When user enter valid username and password
    And click on login button
    Then user is navigated to home page

  Scenario: check login with invalid credentials
    Given user is on login page
    When user enter invalid username and password
    And click on login button
    Then error message is displayed with - Invalid credentials
