@B29G31-248
Feature: Default


@B29G31-247
  Scenario: US13_AC1: Verify access to 22 Modules by POS Manager
    Given user is on the login page
    When user enters the "POS Manager" credentials
    Then user should be able to see 22 modules