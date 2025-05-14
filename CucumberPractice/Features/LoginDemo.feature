Feature: To test Login Functionality

  Scenario: Have to check if login is sucessful with valid credentials
    Given User is on login page
    When User enters username and password
    And Clicks on login button
    Then User is navigated to the home page
