package com.swirlingLeaves.step_definitions;

import com.swirlingLeaves.pages.InboxPage_DW;
import com.swirlingLeaves.pages.LoginPage;
import com.swirlingLeaves.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class US14_InventoryManager_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    InboxPage_DW inboxPageDW = new InboxPage_DW();

    @Given("User is logged in as an Inventory manager")
    public void user_is_logged_in_as_an_inventory_manager() {
        loginPage.login(ConfigurationReader.getProperty("inventory_manager_email"), ConfigurationReader.getProperty("inventory_manager_password"));
    }
    @When("User is taken to their inbox page")
    public void user_is_taken_to_their_inbox_page() {
    }
    @When("User should have access to {int} modules")
    public void user_should_have_access_to_modules(Integer int1) {
        inboxPageDW.checkModules(16);
    }
}
