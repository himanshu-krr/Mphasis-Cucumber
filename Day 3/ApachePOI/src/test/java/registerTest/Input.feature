@tag
Feature: Register feature in DemoGurus99 Application
  I want to register in DemoGurus99 Application
 
  @tag1
  Scenario: Register with personal details of user in DemoGurus99 Application
    Given I am in the register page of DemoGurus99 Application
    When I enter the firstname
    When I enter the postalcode
    When I select the country based on my data
    When I enter the username
    When I enter the password and confirm it
    And I click on submit
    Then I have registered into this application