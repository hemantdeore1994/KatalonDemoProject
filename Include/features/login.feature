Feature: Test Login functionality

  Scenario: check login functionality with valid credential
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user should be on home page
