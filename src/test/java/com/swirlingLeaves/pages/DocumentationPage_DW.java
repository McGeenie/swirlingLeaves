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

    @FindBy (xpath ="//h2//a[@href='applications.html']" )
    public WebElement userDocsHeader;

    @FindBy (xpath = "//h2//a[@href='administration.html']")
    public WebElement installAndMaintainHeader;

    @FindBy (xpath = "//h2//a[@href='developer.html']" )
    public WebElement developerHeader;

    @FindBy (xpath = "//h2//a[@href='contributing.html']")
    public WebElement contributingHeader;
}
