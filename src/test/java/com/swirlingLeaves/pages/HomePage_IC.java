package com.swirlingLeaves.pages;

import com.swirlingLeaves.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage_IC {

    public HomePage_IC(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//li[@style='display: block;']")
    public List<WebElement> menuOptions;

    public void clickToFromTheMenu(String menuOption) {
        for (WebElement each : menuOptions) {
            if (each.getText().equals(menuOption)) {
                each.click();
                break;
            }
        }
    }


}
