package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoqa {
    public Demoqa(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//div[@class='card mt-4 top-card']")
    public WebElement elements;
    @FindBy(xpath = "//span[.='Buttons']")
    public WebElement buttons;
    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickButtons;
    @FindBy(id = "doubleClickMessage")
    public WebElement message;
    @FindBy(id = "rightClickBtn")
    public WebElement rightClickButtons;
    @FindBy(id = "rightClickMessage")
    public WebElement message2;
    @FindBy(xpath = "//button[.='Click Me']")
    public WebElement ClickButton;
    @FindBy(id = "dynamicClickMessage")
    public WebElement message3;
    @FindBy(xpath = "//span[.='Links']")
    public WebElement LinkButton;
    @FindBy(id = "linkResponse")
    public WebElement linkMessage;



}
