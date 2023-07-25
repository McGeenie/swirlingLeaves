package com.swirlingLeaves.pages;

import com.swirlingLeaves.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class InboxPage_KS extends BasePage{

    public InboxPage_KS(){
        PageFactory.initElements(Driver.getDriver(),this);
    }



}
