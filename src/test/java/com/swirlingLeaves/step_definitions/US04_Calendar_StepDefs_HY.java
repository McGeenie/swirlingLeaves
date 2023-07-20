package com.swirlingLeaves.step_definitions;

import com.swirlingLeaves.pages.CalendarPage_HY;
import com.swirlingLeaves.utilities.BrowserUtils;
import com.swirlingLeaves.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class US04_Calendar_StepDefs_HY {

    CalendarPage_HY calender = new CalendarPage_HY();


    @Given("User clicks on {string}")
    public void userClicksOn(String string) {


        BrowserUtils.sleep(2);

        calender.calendarModule.click();

    }




    @When("User is on {string} page")
    public void user_is_on_page(String string) {

        BrowserUtils.sleep(1);
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = String.valueOf(Driver.getDriver().getTitle().contains(string));

        Assert.assertEquals(actualTitle,expectedTitle);
    }


    @Then("User clicks on {string} to enter event information")
    public void user_clicks_on_to_enter_event_information(String string) {

        BrowserUtils.sleep(1);

        calender.timeBox.click();

    }

    @Then("User enters the event information in to the {string} input box")
    public void user_enters_the_event_information_in_to_the_input_box(String string) {

        BrowserUtils.sleep(1);

        String createEventWindowHandle = Driver.getDriver().getWindowHandle();

        Driver.getDriver().switchTo().window(createEventWindowHandle);

        calender.eventSummaryInputBox.sendKeys("Delta1");


    }
    @Then("User clicks {string} button on pop-up")
    public void user_clicks_button_on_pop_up(String string) {

        calender.createButton.click();

    }

    @When("User clicks on the event summary")
    public void user_clicks_on_the_event_summary() {

        calender.eventOnTimeBox.click();

       String popUp = Driver.getDriver().getWindowHandle();

       Driver.getDriver().switchTo().window(popUp);

    }
    @Then("User should see the event information pop-up")
    public void user_should_see_the_event_information_pop_up() {

        BrowserUtils.sleep(1);

        calender.popUpEventInformation.isDisplayed();

    }



}
