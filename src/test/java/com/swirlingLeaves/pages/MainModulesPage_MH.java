package com.swirlingLeaves.pages;

import com.swirlingLeaves.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MainModulesPage_MH {

    public MainModulesPage_MH(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "")
    public List<WebElement> MainModules;




}
