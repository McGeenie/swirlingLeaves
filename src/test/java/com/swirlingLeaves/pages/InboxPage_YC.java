package com.swirlingLeaves.pages;

import com.swirlingLeaves.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class InboxPage_YC {

    public InboxPage_YC(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu-xmlid='stock.menu_stock_root']")

    public WebElement inventoryTab;

    @FindBy(xpath = "//a[@data-menu-xmlid='stock.menu_product_variant_config_stock']")

    public WebElement productsTab;

    @FindBy(xpath = "//button[@accesskey='c']")

    public WebElement createButton;

    @FindBy(xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")

    public WebElement ProductName;

    @FindBy(xpath = "//input[@placeholder='Product Name']")

    public WebElement itemName;

    @FindBy(xpath = "//button[@accesskey='s']")

    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='oe_kanban_details']")

    public WebElement nameDisplayed;

    @FindBy(xpath = "//body[@class='o_web_client']")

    public WebElement proPage;

    @FindBy(xpath = "//div[@class='oe_kanban_details'][1]")

    public WebElement anyProduct;

    public void anyproductRamdom(){

        Random random = new Random();
        int choseNumber = random.nextInt(80);
        Driver.getDriver().findElement(By.xpath("//div[@class='oe_kanban_details'])["+choseNumber+"]")).click();
    }

    @FindBy(xpath = "//button[@accesskey='a']")

    public WebElement editButton;


    @FindBy(xpath = "//button[@accesskey='s']")

    public WebElement editedProduct;










}
