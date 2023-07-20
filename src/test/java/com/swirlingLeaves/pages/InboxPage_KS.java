package com.swirlingLeaves.pages;

import com.swirlingLeaves.utilities.BrowserUtils;
import com.swirlingLeaves.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class InboxPage_KS {

    public InboxPage_KS(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@data-menu='445']")
    public WebElement salesTab;

    @FindBy(xpath = "//div[.='Loading']")
    public WebElement loadingBar;

    public void clickSalesTab(){

        BrowserUtils.waitForInvisibilityOf(loadingBar);
        salesTab.click();
    }



}
