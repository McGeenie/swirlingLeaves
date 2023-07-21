Feature: Creation of new customer functionality
  Agile story: As a sales manager, I should be able to create a new customer from the Sales module


  Scenario: Verify Sales Manager can create a new customer
    Given user is logged in as a sales manager in the log in page
    Then user should click on the sales module
    And user should click on the customers module
    And user should click on the create button
    Then user should enter the name "Galileo" on the input box name
    Then user should click the save button
    And user should see the name "Galileo" displayed

  @US05_wip
  Scenario: Verify Sales Manager can edit all the box
    Given user is logged in as a sales manager in the log in page
    Then user should click on the sales module
    And user should click on the customers module
    And user should click on any customer name
    Then user should click on the edit button and all the box will be editable







