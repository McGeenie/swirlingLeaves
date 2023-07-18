package com.swirlingLeaves.step_definitions;

import com.swirlingLeaves.pages.HomePage_IC;
import com.swirlingLeaves.pages.LoginPage;
import com.swirlingLeaves.pages.RepairsPage_IC;
import com.swirlingLeaves.utilities.BrowserUtils;
import com.swirlingLeaves.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US12_Repairs_StepDefs_IC {

    LoginPage loginPage = new LoginPage();
    HomePage_IC homePageIc = new HomePage_IC();
    RepairsPage_IC repairsPageIc = new RepairsPage_IC();

    @Given("User is logged in as a Sales manager")
    public void user_is_logged_in_as_a_sales_manager() {
        loginPage.login(ConfigurationReader.getProperty("sales_manager_email"), ConfigurationReader.getProperty("sales_manager_password"));
    }
    @When("User clicks to the {string} option from the Menu")
    public void user_clicks_to_the_option_from_the_menu(String repairs) {
        homePageIc.clickToFromTheMenu(repairs);
    }
    @When("User is directed to a page with {string} title")
    public void user_is_directed_to_a_page_with_title(String title) {
        BrowserUtils.waitForTitleContains(title);
    }
    @Then("User should be able to click to the Repair Reference checkbox")
    public void user_should_be_able_to_click_to_the_repair_reference_checkbox() {
        repairsPageIc.repairReferenceCheckbox.click();
    }
    @Then("User should be able to see tha all the checkboxes on the page are selected")
    public void user_should_be_able_to_see_tha_all_the_checkboxes_on_the_page_are_selected() {
        Assert.assertTrue(repairsPageIc.verifyCheckboxIsSelected());
    }
    @Given("User is logged in as a POS manager")
    public void user_is_logged_in_as_a_pos_manager() {
        loginPage.login(ConfigurationReader.getProperty("pos_manager_email"), ConfigurationReader.getProperty("pos_manager_password"));
    }



}
