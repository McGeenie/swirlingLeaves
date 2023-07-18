package com.swirlingLeaves.pages;

import com.swirlingLeaves.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RepairsPage_IC {

    public RepairsPage_IC(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//th[@class='o_list_record_selector']")
    public WebElement repairReferenceCheckbox;

    @FindBy(xpath = "//td[@class='o_list_record_selector']//input")
    public List<WebElement> allCheckboxes;



    public boolean verifyCheckboxIsSelected() {
        for (WebElement each : allCheckboxes) {
            if (!each.isSelected()){
                return false;
            }
        }
        return true;
    }






}
