Feature: login functionality

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

  Scenario: check login with invalid username and valid password credentials
    Given user is on login page
    When user enter invalid username and valid password
    And click on login button
    Then error message is displayed with - please enter valid username

  Scenario: check login with valid username and invalid password credentials
    Given user is on login page
    When user enter valid username and invalid password
    And click on login button
    Then error message is displayed with - please enter valid password

