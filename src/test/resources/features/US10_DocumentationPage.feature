Feature: Documentation Page features
  User Story: As a user, I want to access the documentation page.
  @B29G31-239
  Scenario: Verify the “Odoo Documentation” message is displayed in a new window.
    Given User is logged in to the website
    When User clicks on their user profile in the top right corner
    When User selects Documentation option from the dropdown menu
    Then User is taken to the Documentation page
    And User sees the main header read Odoo Documentation
  @B29G31-241
  Scenario: Verify there are 4 main document topics listed.
    Given User is logged in to the website
    When User clicks on their user profile in the top right corner
    When User selects Documentation option from the dropdown menu
    Then User is taken to the Documentation page
    And User sees 4 main document topics listed on the page