package com.swirlingLeaves.pages;

import com.swirlingLeaves.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InboxPage_NM {
    public InboxPage_NM(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "oe_menu_text")
    public WebElement module;
}
