package com.swirlingLeaves.step_definitions;

import com.swirlingLeaves.pages.LoginPage;
import com.swirlingLeaves.pages.MainModulesPage_MH;
import com.swirlingLeaves.utilities.BrowserUtils;
import com.swirlingLeaves.utilities.ConfigurationReader;
import com.swirlingLeaves.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US13_MainModules_StepDefs_MH {

    LoginPage loginPage = new LoginPage();
    MainModulesPage_MH mainModulesMh = new MainModulesPage_MH();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enters the {string} credentials")
    public void userEntersTheCredentials(String login) {
        loginPage.login(ConfigurationReader.getProperty("pos_manager_email"),
                ConfigurationReader.getProperty("pos_manager_password"));
        BrowserUtils.sleep(1);
    }

    @Then("user should be able to see {int} modules")
    public void userShouldBeAbleToSeeModules(int expectedModuleSize) {
        int actualModuleSize = mainModulesMh.MainModules.size();
        Assert.assertEquals(expectedModuleSize,actualModuleSize);
        System.out.println("actualModuleSize = " + actualModuleSize);

    }
}