
Feature: Add New Product feature

  Agile User Story: US06 As a PosManager, I should be able to add new products to inventory.

  @Yeliz
  Scenario:Verify user can create a new product by filling only the Product Name input box and after clicking the save button, the information of the customer which the user entered should be displayed.
    Given User is logged in as a POS manager
    Then User clicks the inventory button
    Then User clicks the products button
    Then User clicks the create button
    Then User goes to product name box and clicks then write product name "Bubba" fill in the box
    Then User clicks the save button
    Then User clicks the products button and sees the new item displayed on the page

  Scenario: Verify when clicking any product and then clicking the edit button all the boxes entered information can be editable again.
    Given User is logged in as a POS manager
    Then User clicks the inventory button
    Then User clicks the products button
    Then User clicks any product button
    Then User clicks the edit button and changes product price
    Then User clicks save button
