package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wikipedia {
    public Wikipedia(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "searchInput")
    public WebElement searchBox;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement searchButton;
    @FindBy(tagName = "h1")
    public WebElement header;
    @FindBy(xpath = "//img[@alt='Steve Jobs Headshot 2010-CROP (cropped 2).jpg']")
    public WebElement imageHeader;

}
