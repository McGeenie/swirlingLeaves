package com.swirlingLeaves.step_definitions;

import com.swirlingLeaves.pages.InboxPage_NM;
import com.swirlingLeaves.pages.LoginPage;
import com.swirlingLeaves.utilities.BrowserUtils;
import com.swirlingLeaves.utilities.ConfigurationReader;
import com.swirlingLeaves.utilities.Driver;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class US16_ExpensesManager_StepDefs_NM {
    LoginPage loginPage = new LoginPage();
    InboxPage_NM inboxPageNm = new InboxPage_NM();

    @Given("User is logged in as an Expenses manager")
    public void user_is_logged_in_as_an_expenses_manager() {
        loginPage.login(ConfigurationReader.getProperty("expenses_manager_email"), ConfigurationReader.getProperty("expenses_manager_password"));
    }

    @Given("User should have access to {int} different modules")
    public void user_should_have_access_to_different_modules(Integer int1) {

        List<WebElement> modules = Driver.getDriver().findElements(By.className("oe_menu_text"));
        for (WebElement each : modules) {
            Assert.assertTrue(each.isEnabled());
            BrowserUtils.highlight(each); //Looks nice but slows test

        }
    }
}
