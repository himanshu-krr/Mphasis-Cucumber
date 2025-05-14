@tag
Feature: Feature to test login funcionality
  
  @tag1
  Scenario: Check login is sucessful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
