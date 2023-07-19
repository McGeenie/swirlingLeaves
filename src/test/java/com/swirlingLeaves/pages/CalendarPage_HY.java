package com.swirlingLeaves.pages;

import com.swirlingLeaves.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage_HY {

    public CalendarPage_HY(){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(xpath = "//a[@data-action-model='ir.actions.act_window']/span[contains(text(),'Calendar')]")

    public WebElement calendarModule;

    @FindBy(xpath = "//td[@data-date='2023-07-18']")

    public WebElement timeBox;

    @FindBy(xpath = "//input[@name='name']")

    public WebElement eventSummaryInputBox;

    @FindBy(xpath = "//button[@fdprocessedid='pozty']")

    public WebElement createButton;

    @FindBy(xpath = "//div[contains(text(),'Delta1')]")

    public WebElement confirmSummary;

    @FindBy(xpath = "//td/label[@for='o_field_input_81']" )
    public WebElement popUpEventInformation;


}
