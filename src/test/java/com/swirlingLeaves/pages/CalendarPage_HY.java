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

    @FindBy(xpath = "//div[@class='form-group']/input")

    public WebElement eventSummaryInputBox;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")

    public WebElement createButton;

    @FindBy(xpath = "//li[contains(text(),'Meetings')]")

    public WebElement calendarPageHeader;

    @FindBy(xpath = "//a[@class='fc-day-grid-event fc-h-event fc-event fc-start fc-end fc-draggable fc-resizable o_calendar_color_6']")

    public WebElement eventOnTimeBox;

    @FindBy(xpath = "//h4[contains(text(),'Open: ')]" )
    public WebElement popUpEventInformation;


}
