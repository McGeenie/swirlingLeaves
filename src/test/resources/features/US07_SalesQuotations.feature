@Kasim
Feature: Sales Quotations Functionality

  Agile User Story: As a POS  & sales manager,
  I should be able to get correct information on the Sales page.


  Scenario: Verify there are 6 columns to see the quotations on the Sales page
  when a POS Manager logs in.

    Given POS Manager is logged in and on the inbox page
    Then User clicks the Sales tab on the top of page and is launched to Quotations page
    And User sees actual number of columns is equal to expected number of 6 columns on the page


  Scenario: Verify there are 6 columns to see the quotations on the Sales page
  when a Sales Manager logs in.

    Given Sales Manager is logged in and on the inbox page
    Then User clicks the Sales tab on the top of page and is launched to Quotations page
    And User sees actual number of columns is equal to expected number of 6 columns on the page


  Scenario Outline: Verify POS Manager can see the correct result on the list when searching
  with Quotation Number data.

    Given POS Manager is logged in and on the inbox page
    Then User clicks the Sales tab on the top of page and is launched to Quotations page
    Then User enters "<quotationNumber>" in search box and hits Enter on the keyboard
    Then User should see actual data displayed related to "<quotationNumber>"
    Examples:
      | quotationNumber |
      | SO801           |

  Scenario Outline: Verify Sales Manager can see the correct result on the list when searching
  with Quotation Number data.

    Given Sales Manager is logged in and on the inbox page
    Then User clicks the Sales tab on the top of page and is launched to Quotations page
    Then User enters "<quotationNumber>" in search box and hits Enter on the keyboard
    Then User should see actual data displayed related to "<quotationNumber>"
    Examples:
      | quotationNumber |
      | SO802           |

