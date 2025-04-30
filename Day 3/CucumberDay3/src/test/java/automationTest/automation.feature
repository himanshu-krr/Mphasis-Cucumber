Feature: Register feature in Automation Exercise Website
@tag1
  Scenario Outline: Register in Automation Exercise Website
 		Given I am on Register Page
    When I enter the <name>
    And I give the <email>
    Then I verify the <status>

    Examples:  
      | name     | email              | status  |
      | HK | hahahaha@gmail.com | Fail |
      | HKRA   | hkra@gmail.com   | Sucess    |
