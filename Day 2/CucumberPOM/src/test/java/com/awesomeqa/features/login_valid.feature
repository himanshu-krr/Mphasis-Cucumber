@validLogin
Feature: Login feature of AwesomeQA application
  I want to login to AwesomeQA using valid credentials.

  Scenario: Login with valid credentials
    Given I am in login page of AwesomeQA application
    When I enter the username
    When I enter the password
    And I click on login button
    Then I am in my account details page
