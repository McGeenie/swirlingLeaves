Feature: Event Manager Access

  User Story: As an Event Manager, i want to access all 15 diff modules

  Scenario: Verify access to 15 Modules by Event Manager
    Given user is on the login page
    When user enters the "Event Manager" credentials
    Then user should be able to see 15 modules