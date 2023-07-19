package com.swirlingLeaves.pages;

import com.swirlingLeaves.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DocumentationPage_DW {
    public DocumentationPage_DW(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//section[@class='o_content_fw_banner']")
    public WebElement mainHeader;

}
