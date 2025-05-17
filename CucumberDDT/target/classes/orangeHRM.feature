Feature: Implementing Login using DDT
  For learning I am using Excel to take data from

  @valid
  Scenario: Using valid data to login
    Given I am on login page
    When I enter username
    And I enter password
    When I click login button
    Then I am on dashboard page

  @invalid
  Scenario: Using invalid data to login
    Given I am on the login page
    When I enter invalid username
    And I enter invalid password
    When I click the login button
    Then I verify the login error
