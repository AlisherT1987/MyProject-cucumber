package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Seamlessly {
    public Seamlessly(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "user")
    public WebElement username;
    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement logInButton;
    @FindBy(xpath = "//nav[@class='settings-menu menu']/../div//img")
    public WebElement avatarIcon;
   @FindBy(xpath = "//img[@ src='/core/img/actions/logout.svg?v=c77e0e80']")
    public WebElement logOutButton;
    @FindBy(xpath = "//a[@href='/index.php/settings/user']")
    public WebElement settingsLabel;
    @FindBy(tagName = "h3")
    public List<WebElement> followingLabels;
    @FindBy(id = "displayname")
    public WebElement name;
    @FindBy(xpath = "//div[@class='preview-card__header']")
    public WebElement verifyName;

    @FindBy(xpath = "//span[@class='icon-federation-menu icon-phone']")
    public WebElement iconTriangle;
    @FindBy(xpath = "//a[@class='menuitem action action-v2-private permanent active']")
    public WebElement privateLabel;
    @FindBy(xpath = "//span[@class='icon-federation-menu icon-phone']")
    public WebElement iconPrivate;
    @FindBy(xpath = "//div[@id='localeexample']")
    public WebElement localTime;
    @FindBy(xpath = "//ul[@id='appmenu']//li[9]")
    public WebElement taskIcon;
    @FindBy(xpath = "//span[@title='Add List…']")
    public WebElement addToList;
    @FindBy(id = "newListInput")
    public WebElement addCheckbox;
    @FindBy(xpath = "//span[@title='School']")
    public WebElement schoolName;
    @FindBy(xpath = "//input[@class='transparent reactive']")
    public WebElement taskHomeworks;
    @FindBy(xpath = "//div[@class='title']")
    public WebElement homeworkName;


}
