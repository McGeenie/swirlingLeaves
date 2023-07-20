package com.swirlingLeaves.step_definitions;

import com.swirlingLeaves.pages.InboxPage_KS;
import com.swirlingLeaves.pages.LoginPage;
import com.swirlingLeaves.pages.QuotationsPage_KS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class US07_StepDefs_KS {

    LoginPage loginPage = new LoginPage();
    InboxPage_KS inboxPage_ks = new InboxPage_KS();
    QuotationsPage_KS quotationsPage_ks = new QuotationsPage_KS();

    @Given("POS Manager is logged in and on the inbox page")
    public void pos_manager_is_logged_in_and_on_the_inbox_page() {

        loginPage.posManagerLogin();

    }
    @Given("Sales Manager is logged in and on the inbox page")
    public void salesManagerIsLoggedInAndOnTheInboxPage() {

        loginPage.salesManagerLogin();

    }
    @Then("User clicks the Sales tab on the top of page and is launched to Quotations page")
    public void userClicksTheSalesTabOnTheTopOfPageAndIsLaunchedToQuotationsPage() {

        inboxPage_ks.clickSalesTab();

    }
    @And("User sees actual number of columns is equal to expected number of {int} columns on the page")
    public void userSeesActualNumberOfColumnsIsEqualToExpectedNumberOfColumnsOnThePage(int expectedNumber) {

        Assert.assertTrue(quotationsPage_ks.actualNumberOfColumns() == expectedNumber);

    }
    @Then("User enters {string} in search box and hits Enter on the keyboard")
    public void userEntersInSearchBoxAndHitsEnterOnTheKeyboard(String quotationNumber) {

        quotationsPage_ks.searchQuotations(quotationNumber);

    }
    @Then("User should see actual data displayed related to {string}")
    public void userShouldSeeActualDataDisplayedRelatedTo(String quotationNumber) {

        Assert.assertTrue(quotationsPage_ks.tableRowContaining(quotationNumber).isDisplayed());
    }
}

