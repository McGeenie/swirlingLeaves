Feature: Access the main modules as a POS Manager

  Scenario: Verify access to 22 Modules by POS Manager
    Given user is on the login page
    When user enters the POS Manager credentials
    Then user should be able to see following modules
      | Discuss       |
      | Calendar      |
      | Notes         |
      | Contacts      |
      | CRM           |
      | Sales         |
      | Website       |
      | Point of Sale |
      | Purchases     |
      | Inventory     |
      | Manufacturing |
      | Repairs       |
      | Project       |
      | Events        |
      | Surveys       |
      | Employees     |
      | Attendances   |
      | Leaves        |
      | Expenses      |
      | Maintenance   |
      | Fleet         |
      | Dashboards    |
