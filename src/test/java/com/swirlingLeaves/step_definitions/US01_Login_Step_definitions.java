package com.swirlingLeaves.step_definitions;

import com.swirlingLeaves.pages.InboxPage;
import com.swirlingLeaves.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US01_Login_Step_definitions {

    LoginPage loginPage = new LoginPage();
    InboxPage inboxPage = new InboxPage();
    @When("user enters {string} username and {string} password")
    public void user_enters_username_and_password(String username, String password) {
        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(password);
    }
    @Then("user clicks on the Log in button")
    public void user_clicks_on_the_log_in_button() {
        loginPage.submit.click();
    }
    @Then("user should gain access to their inbox")
    public void user_should_gain_access_to_their_inbox() {
        Assert.assertTrue(inboxPage.InboxTag.isDisplayed());
    }


     @When("user enters wrong {string} username and correct {string} password")
    public void user_enters_wrong_username_and_correct_password(String Username, String Password) {
        loginPage.login(Username,Password);
    }
    @Then("user should see the following error message {string}")
    public void user_should_see_the_following_error_message(String string) {
        Assert.assertTrue(loginPage.wrongLoginPasswordMessage.isDisplayed());
    }


    @When("user enters different {string} username and {string} password")
    public void user_enters_different_username_and_password(String Username, String Password) {
        loginPage.login(Username,Password);
    }
    @Then("user should see the following message {string}")
    public void user_should_see_the_following_message(String string) {

    }

}
