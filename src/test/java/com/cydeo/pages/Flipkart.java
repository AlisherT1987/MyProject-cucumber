package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart {
    public Flipkart(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//img[@alt='Electronics']")
    public WebElement electronics;
    @FindBy(xpath = "//button[@class='_2KpZ6l _2doB4z']")
    public WebElement loginButton;
    @FindBy(xpath = "//a[contains(@href,'Wired%2BHeadphones')]")
    public WebElement audio;
    @FindBy(xpath = "//input[@title='Search for products, brands and more']")
    public WebElement searchBox;
@FindBy(xpath = "//a[contains(@href,'t+shirts')]")
    public WebElement tShirts;



}
