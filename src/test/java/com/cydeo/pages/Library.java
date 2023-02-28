package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Library {
    public Library() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "inputEmail")
    public WebElement emailAddress;
    @FindBy(id = "inputPassword")
    public WebElement password;
    @FindBy(tagName = "button")
    public WebElement signInButton;

    @FindBy(xpath = "//span[.='Books']")
    public WebElement bookButton;

    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm add_book_btn']")
    public WebElement addBookButton;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement bookName;

    @FindBy(xpath = "//input[@name='author']")
    public WebElement bookAuthor;
    @FindBy(xpath = "//input[@name='isbn']")
    public WebElement bookISBN;

    @FindBy(xpath = "//input[@name='year']")
    public WebElement bookYear;
    @FindBy(css = "select#book_group_id")
    public WebElement bookCategory;

    @FindBy(id = "description")
    public WebElement bookComment;

    @FindBy(xpath = "//button[.='Save changes']")
    public WebElement saveChangesButton;


    @FindBy(xpath = "//h2[@id='user_count']")
    public WebElement userCount;
    @FindBy(xpath = "//h2[@id='book_count']")
    public WebElement bookCount;
    @FindBy(xpath = "//h2[@id='borrowed_books']")
    public WebElement borrowedBooksCount;
    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement message;
    @FindBy(xpath = "//span[.='Users']")
    public WebElement userModule;
    @FindBy(xpath = "//span[.='Dashboard']")
    public WebElement dashboardModule;
    @FindBy(xpath = "//span[.='Books']")
    public WebElement booksModule;
    @FindBy(xpath = "//span[.='Borrowing Books']")
    public WebElement borrowingBooksModule;
    @FindBy(xpath = "//select[@class='form-control select2']")
    public WebElement bookCategories;
    @FindBy(id = "user_groups")
    public WebElement userGroup;
    @FindBy(xpath = "//option[@value='null']")
    public WebElement byDefault;
    @FindBy(id = "user_status")
    public WebElement userStatus;
    @FindBy(xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    public WebElement addUserButton;
    @FindBy(name = "full_name")
    public WebElement fullName;
    @FindBy(name = "password")
    public WebElement passwordUser;

    @FindBy(name = "email")
    public WebElement emailUser;

    @FindBy(xpath = "//button[.='Save changes']")
    public WebElement saveChangesUserButton;
    @FindBy(id = "email-error")
    public WebElement warningMessage;


   @FindBy(tagName = "th")
    public List<WebElement> columns;

    @FindBy(xpath = "//th[@data-name='group_name']")
    public WebElement sortingIcon;

    @FindBy(xpath = "//td[.='Librarian']")
    public WebElement groupName;

    @FindBy(xpath = "//select[@name='tbl_books_length']")
    public WebElement recordsSelect;
@FindBy(xpath = " //label[contains(text(),'Show')]")
public WebElement bookRecords;

    @FindBy(xpath = "//td//a[@role='button']")
    public WebElement editBookButton;

    @FindBy(tagName = "h5")
    public WebElement editBookInfo;
    @FindBy(xpath = "//a[.='Log Out']")
    public WebElement logOutButton;
    @FindBy(id = "user_avatar")
    public WebElement testLibrarian;
    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement invalidMessage;
    @FindBy(id = "inputEmail-error")
    public WebElement thisFieldIsRequired;

    @FindBy(id = "user_list")
    public WebElement userDropdown;

    @FindBy(xpath = "//table[@id='borrowed_list']//th")
    public List<WebElement> studentColumns;



    public List<WebElement> selectAll(WebElement webElement){
        Select select=new Select(webElement);
        List<WebElement> list=select.getOptions();
       return list;
    }
    public WebElement selectFirst(WebElement webElement){
        Select select=new Select(webElement);
        WebElement first=select.getFirstSelectedOption();
        return first;
    }
    public String getText(List<WebElement> list){
        String text="";
        for (WebElement each : list) {
            text+=each.getText()+",";
        }
        return text.substring(0,text.length()-1);
    }




}
