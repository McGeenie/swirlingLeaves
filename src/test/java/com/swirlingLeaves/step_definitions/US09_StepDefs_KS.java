package com.swirlingLeaves.step_definitions;

import com.swirlingLeaves.pages.InboxPage_KS;
import com.swirlingLeaves.pages.LoginPage;
import com.swirlingLeaves.pages.OrdersPage_KS;
import com.swirlingLeaves.pages.PointOfSalePage_KS;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US09_StepDefs_KS {

    InboxPage_KS inboxPage_ks = new InboxPage_KS();
    PointOfSalePage_KS pointOfSalePage_ks = new PointOfSalePage_KS();
    OrdersPage_KS ordersPage_kc = new OrdersPage_KS();

    LoginPage loginPage = new LoginPage();

    @Given("{string} is logged in and on the inbox page")
    public void isLoggedInAndOnTheInboxPage(String userType) {

        loginPage.login(userType);
    }

    @Then("User clicks Point of Sale tab at top of page and is launched to Point of Sale page")
    public void user_clicks_point_of_sale_tab_at_top_of_page_and_is_launched_to_point_of_sale_page() {

        inboxPage_ks.clickPointOfSaleTab();

    }

    @Then("User clicks Orders tab, under Dashboard Orders, and is launched to Orders page")
    public void userClicksOrdersTabUnderDashboardOrdersAndIsLaunchedToOrdersPage() {

        pointOfSalePage_ks.clickOrdersTab();

    }

    @Then("User clicks on Order Ref checkbox")
    public void userClicksOnOrderRefCheckbox() {

        ordersPage_kc.orderRefCheckBox.click();
    }

    @Then("User should see that all the order checkboxes are checked")
    public void userShouldSeeThatAllTheOrderCheckboxesAreChecked() {

       Assert.assertTrue(ordersPage_kc.allOrdersChecked());

    }

    @Then("User clicks on Action button dropdown menu")
    public void userClicksOnActionButtonDropdownMenu() {

        ordersPage_kc.actionDropdownButton.click();
    }

    @Then("User should see the three options {string},{string}, and {string} displayed in the dropdown menu")
    public void userShouldSeeTheThreeOptionsAndDisplayedInTheDropdownMenu(String wordImport, String wordExport, String wordDelete) {

        Assert.assertTrue(ordersPage_kc.actionDropDownContains(wordDelete, wordExport));
    }

}
