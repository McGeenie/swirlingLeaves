Feature: Inventory Manager features
  User Story: As an Inventory manager, I should be able to access the main modules.

  Scenario: Confirm Inventory managers have 16 modules accessible at login
    Given User is logged in as an Inventory manager
    When User is taken to their inbox page
    And User should have access to 16 modules
