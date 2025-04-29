@invalidLogin
Feature: Invalid login feature of AwesomeQA application
  I want to attempt login with invalid credentials and see error message.

  Scenario: Login with invalid credentials
    Given I am in loginn page of AwesomeQA application
    When I enter invalid username
    When I enter invalid password
    And I click on loginn button
    Then Error message is displayed
