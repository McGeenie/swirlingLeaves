@B29G31-198
Feature: Default

	
	@B29G31-197
	Scenario: Verify Sales manager can select all the repair orders by clicking the top checkbox.
		Scenario: Repairs feature as a Sales Manager
		    Given User is logged in as a Sales manager
		    When User clicks to the "Repairs" option from the Menu
		    And User is directed to a page with "Repair Orders - Odoo" title
		    Then User should be able to click to the Repair Reference checkbox
		    And User should be able to see tha all the checkboxes on the page are selected	

	
	@B29G31-196
	Scenario: Verify POS manager can select all the repair orders by clicking the top checkbox.
		Scenario: Repairs feature as a POS Manager
		    Given User is logged in as a POS manager
		    When User clicks to the "Repairs" option from the Menu
		    And User is directed to a page with "Repair Orders - Odoo" title
		    Then User should be able to click to the Repair Reference checkbox
		    And User should be able to see tha all the checkboxes on the page are selected