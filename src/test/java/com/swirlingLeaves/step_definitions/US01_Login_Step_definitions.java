package com.swirlingLeaves.step_definitions;

import com.swirlingLeaves.pages.InboxPage_GS;
import com.swirlingLeaves.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;

public class US01_Login_Step_definitions {

    LoginPage loginPage = new LoginPage();
    InboxPage_GS inboxPage_gs = new InboxPage_GS();
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
        Assert.assertTrue(inboxPage_gs.inboxTag.isDisplayed());
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
        loginPage.errorMessagePFOTF();
        }

    @Then("user presses the ENTER key")
    public void user_Presses_The_ENTER_Key() {
        loginPage.submit.sendKeys(Keys.ENTER);
    }
}
