@wip
Feature: Default

  Agile Story : US04 As a Posmanager, I should be able to create events on my calendar from "Calendar" module

  Scenario: Verify user is directed to the "Calendar" page succesfully

    Given User clicks on "Calendar" module
    When User is on "Calendar" page

    Scenario: Verify user can create events on time boxes

    When User is on the "Calendar" page
    Then User clicks on "TimeBox" to enter event information
    And User should see the "Create" pop-up
    Then User enters the event information in to the "Summary" input box
    And User clicks "Create" button on pop-up
    Then User sees the event information on calendar

  Scenario: Verify user can see event details when clicking the event on the calendar

    When User clicks on the event summary
    Then User should see the event information pop-up
