Feature: Documentation Page features
  User Story: As a user, I want to access the documentation page.
@fenny1
  Scenario: Verify the “Odoo Documentation” message is displayed in a new window.
    Given User is logged in to the website
    When User clicks on their user profile in the top right corner
    When User selects Documentation option from the dropdown menu
    Then User is taken to the Documentation page
    And User sees the main header read Odoo Documentation