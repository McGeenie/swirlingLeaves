package com.swirlingLeaves.step_definitions;

import com.swirlingLeaves.pages.InboxPage_YC;
import com.swirlingLeaves.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class US06_StepDefs_YC {

    InboxPage_YC inboxPage_yc = new InboxPage_YC();

    @Then("User clicks the inventory button")
    public void user_clicks_the_inventory_button() {

        inboxPage_yc.inventoryTab.click();
    }

    @Then("User clicks the products button")
    public void user_clicks_the_products_button() {

        inboxPage_yc.productsTab.click();
    }

    @Then("User clicks the create button")
    public void userClicksTheCreateButton() {

        inboxPage_yc.createButton.click();
    }
    @Then("User goes to product name box and clicks then write product name {string} fill in the box")
    public void userGoesToProductNameBoxAndClicksThenWriteProductNameFillInTheBox(String name) {
       BrowserUtils.waitForVisibility(inboxPage_yc.itemName, 2);

        inboxPage_yc.itemName.sendKeys(name);
    }

    @Then("User clicks the save button")
    public void userClicksTheSaveButton() {

        inboxPage_yc.saveButton.click();
    }

    @Then("User clicks the products button and sees the new item displayed on the page")
    public void userClicksTheProductsButtonAndSeesTheNewItemDisplayedOnThePage(String name) {

        inboxPage_yc.nameDisplayed.isDisplayed();
        Assert.assertEquals(name,inboxPage_yc.nameDisplayed.getText());

    }

    @Then("User clicks any product button")
    public void userClicksAnyProductButton() {

        inboxPage_yc.anyProduct.click();
            BrowserUtils.sleep(2);

    }

    @Then("User clicks the edit button and changes product price")
    public void userClicksTheEditButtonAndChangesProductPrice() {

        BrowserUtils.sleep(5);
        inboxPage_yc.editButton.click();

    }

    @Then("User clicks save button")
    public void userClicksSaveButton() {

        inboxPage_yc.editedProduct.click();

    }


}