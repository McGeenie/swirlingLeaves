package com.swirlingLeaves.pages;


import com.swirlingLeaves.utilities.BrowserUtils;
import com.swirlingLeaves.utilities.ConfigurationReader;
import com.swirlingLeaves.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public abstract class BasePage {


    public static void clickNavBarHeaderTab(String tabName) {

        WebElement loadingBar = Driver.getDriver().findElement(By.xpath("//div[.='Loading']"));

        BrowserUtils.waitForInvisibilityOf(loadingBar);

        Driver.getDriver().findElement(By.xpath("//li[@style='display: block;']/a/span[contains(text(),'" + tabName + "')]")).click();

    }


}
