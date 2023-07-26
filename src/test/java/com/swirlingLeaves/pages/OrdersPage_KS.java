package com.swirlingLeaves.pages;

import com.swirlingLeaves.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class OrdersPage_KS extends BasePage {

    public OrdersPage_KS() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//th[@class='o_list_record_selector']")
    public WebElement orderRefCheckBox;

    @FindBy(xpath = "//button[contains(text(),\"Action\")]")
    public WebElement actionDropdownButton;


    public boolean allOrdersChecked() {
        List<WebElement> orders = Driver.getDriver().findElements(By.xpath("//td/div/input[@type='checkbox']"));

        for (WebElement eachOrder : orders) {

            if (!eachOrder.isSelected()) {
                return false;
            }
        }
        return true;
    }

    public boolean actionDropDownContains(String str1, String str2) {

        List<WebElement> actionElements = Driver.getDriver().findElements(By.xpath("(//ul[@class='dropdown-menu'])[4]"));

        String result = "";

        for (WebElement actionElement : actionElements) {

            result += actionElement.getText() + " ";
        }

        if (!result.contains(str1) || !result.contains(str2)) {

            return false;
        }
        return true;

    }

    public boolean actionDropDownContains(String str1, String str2, String str3) {

        List<WebElement> actionElements = Driver.getDriver().findElements(By.xpath("(//ul[@class='dropdown-menu'])[4]"));

        String result = "";

        for (WebElement actionElement : actionElements) {

            result += actionElement.getText() + " ";
        }

        if (!result.contains(str1) || !result.contains(str2) || !result.contains(str3)) {

            return false;
        }
        return true;

    }

}
