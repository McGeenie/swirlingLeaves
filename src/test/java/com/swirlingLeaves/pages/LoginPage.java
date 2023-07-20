package com.swirlingLeaves.pages;

import com.swirlingLeaves.utilities.ConfigurationReader;
import com.swirlingLeaves.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="login")
    public WebElement userName;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement submit;

    @FindBy(xpath = "//p[@class='alert alert-danger']")
    public WebElement wrongLoginPasswordMessage;


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

    public void posManagerLogin(){
        userName.sendKeys(ConfigurationReader.getProperty("pos_manager_email"));
        password.sendKeys(ConfigurationReader.getProperty("pos_manager_password"));
        submit.click();
    }
    public void salesManagerLogin(){

        userName.sendKeys(ConfigurationReader.getProperty("sales_manager_email"));
        password.sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
        submit.click();
    }

    @FindBy(xpath= "//input[@required='required']")
    public WebElement pleaseFillOutThisFieldErrorMessage;
    public void errorMessagePFOTF(){
        boolean errorMessageDisplayed;
        if(pleaseFillOutThisFieldErrorMessage.isEnabled() && (userName.getText().isEmpty() || password.getText().isEmpty())){
            errorMessageDisplayed = true;
        }else{
            errorMessageDisplayed = false;
        }
    }

}
