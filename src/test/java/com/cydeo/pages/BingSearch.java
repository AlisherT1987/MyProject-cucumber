package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BingSearch {
    public BingSearch(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "sb_form_q")
    public WebElement bing;
}
