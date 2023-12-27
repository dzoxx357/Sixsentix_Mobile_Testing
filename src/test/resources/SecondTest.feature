Feature: Buy product
  Scenario: User should buy product
    Given The user is on login page
    When The user enters valid credentials
    And The user select one product
    And User add that product to the cart
    And User should finish shoping and pay product
    Then The use successfully bought product