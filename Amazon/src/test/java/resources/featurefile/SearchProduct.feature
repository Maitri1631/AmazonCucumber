Feature: Search Product
  Scenario: User should search product successfully
    Given I am on home page
    And I click on All menu
    And I click on Electronics,computer & office
    And I click on All Electronics
    And I search Product "Computer"
    Then I see product list