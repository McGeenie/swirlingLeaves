package com.swirlingLeaves.step_definitions;

import com.swirlingLeaves.pages.LoginPage;
import com.swirlingLeaves.pages.NewCustomerPage_ED;
import com.swirlingLeaves.utilities.BrowserUtils;
import com.swirlingLeaves.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US05_StepDefinitions_ED {
    LoginPage loginPage = new LoginPage();
    NewCustomerPage_ED newCustomerPageEd = new NewCustomerPage_ED();

    @Given("user is logged in as a sales manager in the log in page")
    public void userIsLoggedInAsASalesManagerInTheLogInPage() {
        loginPage.login(ConfigurationReader.getProperty("sales_manager_email"), ConfigurationReader.getProperty("sales_manager_password"));
        BrowserUtils.sleep(2);
    }

    @Then("user should click on the sales module")
    public void user_should_click_on_the_sales_module() {
        newCustomerPageEd.salesModule.click();
    }

    @Then("user should click on the customers module")
    public void userShouldClickOnTheCustomersModule() {
        newCustomerPageEd.customersButton.click();
    }

    @Then("user should click on the create button")
    public void user_should_click_on_the_create_button() {
        //BrowserUtils.waitForInvisibilityOf(newCustomerPageEd.loading);
        BrowserUtils.sleep(5);
        //BrowserUtils.waitForVisibility(newCustomerPageEd.createButton,10);
        newCustomerPageEd.createButton.click();


    }

    @Then("user should enter the name {string} on the input box name")
    public void userShouldEnterTheNameOnTheInputBoxName(String name) {
        BrowserUtils.waitForVisibility(newCustomerPageEd.webForm,10);
        newCustomerPageEd.inputName.sendKeys(name);

    }

    @Then("user should click the save button")
    public void userShouldClickTheSaveButton() {
        newCustomerPageEd.saveButton.click();

    }


    @And("user should see the name {string} displayed")
    public void userShouldSeeTheNameDisplayed(String name) {
        newCustomerPageEd.nameDisplayed.isDisplayed();
            Assert.assertEquals(name,newCustomerPageEd.nameDisplayed.getText());
    }

    @And("user should click on any customer name")
    public void userShouldClickOnAnyCustomerName() {

        newCustomerPageEd.anyCustomerRand();
        BrowserUtils.sleep(5);
        //newCustomerPageEd.anyCustomer.

    }

    @Then("user should click on the edit button and all the box will be editable")
    public void userShouldClickOnTheEditButtonAndAllTheBoxWillBeEditable() {
        BrowserUtils.sleep(5);
        newCustomerPageEd.editButton.click();
    }

}



