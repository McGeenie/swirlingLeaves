@B29G31-245
Feature: Sales Quotations Functionality

  Agile User Story: As a POS  & sales manager,
  I should be able to get correct information on the Sales page.


  @B29G31-238
  Scenario:  US07-AC01-TC01-AUTO Verify there are 6 columns to see the quotations on the Sales page when a POS Manager logs in.
    Given POS Manager is logged in and on the inbox page
    Then User clicks the Sales tab on the top of page and is launched to Quotations page
    And User sees actual number of columns is equal to expected number of 6 columns on the page


  @B29G31-240
  Scenario:  US07-AC01-TC02-AUTO Verify there are 6 columns to see the quotations on the Sales page when a Sales Manager logs in.
    Given Sales Manager is logged in and on the inbox page
    Then User clicks the Sales tab on the top of page and is launched to Quotations page
    And User sees actual number of columns is equal to expected number of 6 columns on the page


  @B29G31-243
  Scenario Outline: US07-AC02-TC03-AUTO Verify POS Manager can see the correct result on the list when searching with Quotation Number data.
    Given POS Manager is logged in and on the inbox page
    Then User clicks the Sales tab on the top of page and is launched to Quotations page
    Then User enters "<quotationNumber>" in search box and hits Enter on the keyboard
    Then User should see actual data displayed related to "<quotationNumber>"
    Examples:
      | quotationNumber |
      | SO801           |


  @B29G31-244
  Scenario Outline: US07-AC02-TC04-AUTO Verify Sales Manager can see the correct result on the list when searching with Quotation Number data.
    Given Sales Manager is logged in and on the inbox page
    Then User clicks the Sales tab on the top of page and is launched to Quotations page
    Then User enters "<quotationNumber>" in search box and hits Enter on the keyboard
    Then User should see actual data displayed related to "<quotationNumber>"
    Examples:
      | quotationNumber |
      | SO802           |