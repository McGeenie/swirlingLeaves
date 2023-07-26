package com.swirlingLeaves.pages;

import com.swirlingLeaves.utilities.BrowserUtils;
import com.swirlingLeaves.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class QuotationsPage_KS extends BasePage{

    public QuotationsPage_KS() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBox;

    @FindBy(xpath = "//li[.='Quotations']")
    public WebElement quotationText;


    public int actualNumberOfColumns() {



        List<WebElement> allColumns = Driver.getDriver().findElements(By.xpath("//tr/th[@class='o_column_sortable']"));

        return allColumns.size();
    }

    public void searchQuotations(String quotationNumber) {

        BrowserUtils.waitForVisibility(quotationText, 10);
        searchBox.sendKeys(quotationNumber + Keys.ENTER);

    }

    public WebElement tableRowContaining
            (String quotationNumber) {


        WebElement result = Driver.getDriver().findElement(By.xpath("//td[.='" + quotationNumber + "']"));

        return result;

    }


}


