package com.swirlingLeaves.pages;

import com.swirlingLeaves.utilities.BrowserUtils;
import com.swirlingLeaves.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PointOfSalePage_KS extends BasePage {

    public PointOfSalePage_KS(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//div[@class='o_loading']")
    public WebElement loadingBar;

    @FindBy(xpath = "//a[@data-menu='489']")
    public WebElement ordersTab;

    public void clickOrdersTab(){

        BrowserUtils.waitForInvisibilityOf(loadingBar);
        ordersTab.click();
    }
}
