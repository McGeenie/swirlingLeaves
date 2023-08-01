package com.swirlingLeaves.pages;

import com.swirlingLeaves.utilities.Driver;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class NewCustomerPage_ED {
    public NewCustomerPage_ED (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu-xmlid='sale.sale_menu_root']")
    public WebElement salesModule;

    @FindBy(xpath = "//a[@data-menu-xmlid='sale.res_partner_menu']/span")
    public WebElement customersButton;

    @FindBy(xpath = "//button[@accesskey='c']")
    public WebElement createButton;

    @FindBy(xpath = "//h1/input")
    public WebElement inputName;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='o_form_sheet']")
    public WebElement webForm;

    @FindBy(xpath = "/html/body/div[3]")
    public WebElement loading;


    @FindBy(xpath = "//h1/span")
    public WebElement nameDisplayed;

    @FindBy(xpath = "(//div[@class='oe_kanban_global_click o_res_partner_kanban o_kanban_record'])[1]")
    public WebElement anyCustomer;

    public void anyCustomerRand(){
        Random randomNum = new Random();
        int choseNum = randomNum.nextInt(80);
        Driver.getDriver().findElement(By.xpath("(//div[@class='oe_kanban_global_click o_res_partner_kanban o_kanban_record'])["+choseNum+"]")).click();

    }

    @FindBy(xpath = "//button[@accesskey='a']")
    public WebElement editButton;



}
