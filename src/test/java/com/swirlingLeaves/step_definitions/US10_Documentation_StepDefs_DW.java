package com.swirlingLeaves.step_definitions;

import com.swirlingLeaves.pages.DocumentationPage_DW;
import com.swirlingLeaves.pages.InboxPage_DW;
import com.swirlingLeaves.pages.LoginPage;
import com.swirlingLeaves.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US10_Documentation_StepDefs_DW {
    LoginPage loginPage = new LoginPage();
    InboxPage_DW inboxPageDW = new InboxPage_DW();
    DocumentationPage_DW documentationPage_dw = new DocumentationPage_DW();

    @Given("User is logged in to the website")
    public void user_is_logged_in_to_the_website() {
        loginPage.login(ConfigurationReader.getProperty("inventory_manager_email"), ConfigurationReader.getProperty("inventory_manager_password"));
    }
    @When("User clicks on their user profile in the top right corner")
    public void user_clicks_on_their_user_profile_in_the_top_right_corner() {
        inboxPageDW.userProfileButton.click();
    }
    @When("User selects Documentation option from the dropdown menu")
    public void user_selects_documentation_option_from_the_dropdown_menu() {
        inboxPageDW.dropdownMenuDocumentationOption.click();
    }
    @Then("User is taken to the Documentation page")
    public void user_is_taken_to_the_documentation_page() {
    }
    @Then("User sees the main header read Odoo Documentation")
    public void user_sees_the_main_header_read_odoo_documentation() {
        Assert.assertTrue(documentationPage_dw.mainHeader.isDisplayed());
    }
}
