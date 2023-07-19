package com.swirlingLeaves.pages;

import com.swirlingLeaves.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InboxPage_DW {

    public InboxPage_DW(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void checkModules(int numberOfModules){
        List<WebElement> modules = Driver.getDriver().findElements(By.xpath("//li[@style=\"display: block;\"]"));
        Assert.assertEquals(modules.size(),numberOfModules);
        System.out.println(modules.size());
    }

    @FindBy (xpath = "//span[@class='oe_topbar_name']")
    public WebElement userProfileButton;

    @FindBy (xpath = "//a[@data-menu='documentation']")
    public WebElement dropdownMenuDocumentationOption;

}
