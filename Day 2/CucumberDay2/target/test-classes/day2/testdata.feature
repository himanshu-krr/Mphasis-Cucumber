@tag1
  Feature: Display data
  Scenario Outline: Trying the Data Driven
    Given I am in login page
    When I check for the <name>
    And I check the1 <value>

    Examples: 
      | name  | value |
      | name1 |     5 |
      | name2 |     7 |
