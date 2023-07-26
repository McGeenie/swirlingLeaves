@B29G31-245 @Kasim
Feature: Sales Quotations Functionality

  Agile User Story: As a POS  & sales manager,
  I should be able to get correct information on the Sales page.


  @B29G31-238
  Scenario Outline:  US07-AC01-TC01-AUTO Verify there are 6 columns to see the quotations on the Sales page when a POS Manager logs in.
    Given "<UserType>" manager is logged in and on the inbox page
    Then User clicks the "Sales" tab on the top of page and is launched to Quotations page
    And User sees actual number of columns is equal to expected number of 6 columns on the page
    Then User enters "<quotationNumber>" in search box and hits Enter on the keyboard
    Then User should see actual data displayed related to "<quotationNumber>"

    Examples:
      | UserType | quotationNumber |
      | POS      | SO801           |
      | Sales    | SO802           |






