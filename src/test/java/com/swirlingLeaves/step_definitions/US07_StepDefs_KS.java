package com.swirlingLeaves.step_definitions;

import com.swirlingLeaves.pages.BasePage;
import com.swirlingLeaves.pages.QuotationsPage_KS;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;



public class US07_StepDefs_KS extends BasePage {

    QuotationsPage_KS quotationsPage_ks = new QuotationsPage_KS();

    @Given("{string} manager is logged in and on the inbox page")
    public void managerIsLoggedInAndOnTheInboxPage(String userType) {

        login(userType);

    }
    @Then("User clicks the {string} tab on the top of page and is launched to Quotations page")
    public void userClicksTheTabOnTheTopOfPageAndIsLaunchedToQuotationsPage(String sales) {

        clickNavBarHeaderTab(sales);
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

