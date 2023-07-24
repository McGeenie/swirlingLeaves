package com.swirlingLeaves.pages;


import com.swirlingLeaves.utilities.BrowserUtils;
import com.swirlingLeaves.utilities.ConfigurationReader;
import com.swirlingLeaves.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public abstract class BasePage {

    protected WebElement userNameInputBox = Driver.getDriver().findElement(By.id("login"));
    protected WebElement passwordInputBox = Driver.getDriver().findElement(By.id("password"));
    protected WebElement submitButton = Driver.getDriver().findElement(By.xpath("//button[.='Log in']"));

    public void login(String userType) {

        switch (userType) {

            case "POS":
                userNameInputBox.sendKeys(ConfigurationReader.getProperty("pos_manager_email"));
                passwordInputBox.sendKeys(ConfigurationReader.getProperty("pos_manager_password"));
                submitButton.click();
                break;
            case "Sales":
                userNameInputBox.sendKeys(ConfigurationReader.getProperty("sales_manager_email"));
                passwordInputBox.sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
                submitButton.click();
                break;
            case "CRM":
                userNameInputBox.sendKeys(ConfigurationReader.getProperty("crm_manager_email"));
                passwordInputBox.sendKeys(ConfigurationReader.getProperty("crm_manager_password"));
                submitButton.click();
                break;
            case "Inventory":
                userNameInputBox.sendKeys(ConfigurationReader.getProperty("inventory_manager_email"));
                passwordInputBox.sendKeys(ConfigurationReader.getProperty("inventory_manager_password"));
                submitButton.click();
                break;
            case "Expense":
                userNameInputBox.sendKeys(ConfigurationReader.getProperty("expenses_manager_email"));
                passwordInputBox.sendKeys(ConfigurationReader.getProperty("expenses_manager_password"));
                submitButton.click();
                break;
        }

    }

    public static void clickNavBarHeaderTab(String tabName) {

        WebElement loadingBar = Driver.getDriver().findElement(By.xpath("//div[.='Loading']"));

        BrowserUtils.waitForInvisibilityOf(loadingBar);

        Driver.getDriver().findElement(By.xpath("//li[@style='display: block;']/a/span[contains(text(),'" + tabName + "')]")).click();

    }


}
