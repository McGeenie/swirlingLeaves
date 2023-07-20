
Feature: Default

  Agile Story : US04 As a Posmanager, I should be able to create events on my calendar from "Calendar" module

  Scenario: Verify user is directed to the "Calendar" page succesfully

    Given User is logged in as a POS manager
    Given User clicks on "calendarModule"
    When User is on "Meetings" page

  Scenario: Verify user can create events on time boxes

    When User is logged in as a POS manager
    Then User clicks on "Calendar" module
    Then User clicks on "TimeBox" to enter event information
    Then User enters the event information in to the "Summary" input box
    And User clicks "Create" button on pop-up


  Scenario: Verify user can see event details when clicking the event on the calendar

    Given User is logged in as a POS manager
    When User clicks on "Calendar" module

    When User clicks on the event summary
    Then User should see the event information pop-up
