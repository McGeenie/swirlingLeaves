@B29G31-260 @Kasim
Feature: Point of Sale Orders Functionality

  Agile User Story:US09 As a Point of Sales manager (POS),
  I should be able to view product orders.


  @B29G31-258
  Scenario: US09-AC01-TC01AUTO Verify the POS Manager can view the orders on the Orders page and then can check the "Order Ref" box and see that all the order boxes are checked.
    Given "POS Manager" is logged in and on the inbox page
    Then User clicks Point of Sale tab at top of page and is launched to Point of Sale page
    Then User clicks Orders tab, under Dashboard Orders, and is launched to Orders page
    Then User clicks on Order Ref checkbox
    Then User should see that all the order checkboxes are checked
    Then User clicks on Action button dropdown menu
    Then User should see the three options "Import","Export", and "Delete" displayed in the dropdown menu


