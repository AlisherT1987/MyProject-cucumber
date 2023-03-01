package com.cydeo.step_definitions;

import com.cydeo.pages.Library;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LibrarianStepDefinition {
    Library library=new Library();
    Faker faker=new Faker();
    @Given("librarian is on the login page of the library application")
    public void librarianIsOnTheLoginPageOfTheLibraryApplication() {
Assert.assertEquals("Library",Driver.getDriver().getTitle());
    }

    @When("librarian push addBook button")
    public void librarianPushAddBookButton() throws InterruptedException {
        library.bookButton.click();
        Thread.sleep(2);
        library.addBookButton.click();
        Thread.sleep(2);

    }

    @And("fill out all proper information")
    public void fillOutAllProperInformation() throws InterruptedException {
        library.bookName.sendKeys("Future SDET");
        Thread.sleep(2);
        library.bookAuthor.sendKeys("Alisher T.");
        Thread.sleep(2);
        library.bookISBN.sendKeys("1");
        Thread.sleep(2);
        library.bookYear.sendKeys("2023");
        Thread.sleep(2);
        Select list=new Select(library.bookCategory);
        Thread.sleep(2);
        list.selectByValue("6");
        Thread.sleep(2);
        library.bookComment.sendKeys("No Pain No Gain");
        Thread.sleep(2);
        library.saveChangesButton.click();
        Thread.sleep(2);
    }

    @Then("librarian should see confirmation message")
    public void librarianShouldSeeConfirmationMessage() throws InterruptedException {
        Assert.assertTrue(library.message.isDisplayed());


    }

    @Then("librarians can get 3 modules from the homepage: Dashboard, Users, Books")
    public void librariansCanGetModulesFromTheHomepageDashboardUsersBooks() {
        Assert.assertTrue(library.userModule.isDisplayed());
        Assert.assertTrue(library.dashboardModule.isDisplayed());
        Assert.assertTrue(library.booksModule.isDisplayed());

    }



    @Then("students can get 2 modules from the homepage: Books, Borrowing Books")
    public void studentsCanGetModulesFromTheHomepageBooksBorrowingBooks() {
        Assert.assertTrue(library.booksModule.isDisplayed());
        Assert.assertTrue(library.borrowingBooksModule.isDisplayed());
    }


    @Then("Verify on dashboard there are 219 users")
    public void verifyOnDashboardThereAreUsers() {
        BrowserUtils.sleep(4);
       Assert.assertTrue(library.userCount.isDisplayed());

    }

    @Then("Verify on dashboard there are 1378 books")
    public void verifyOnDashboardThereAreBooks() {
        Assert.assertTrue(library.bookCount.isDisplayed());
    }

    @Then("Verify on dashboard there are 85 Borrowed books")
    public void verifyOnDashboardThereAreBorrowedBooks() {
        Assert.assertTrue(library.borrowedBooksCount.isDisplayed());

    }
    @When("user open Books page")
    public void userOpenBooksPage() {
        BrowserUtils.sleep(2);
        library.booksModule.click();
    }
    @Then("Verify that the book records are listed in the Books page.")
    public void verifyThatTheBookRecordsAreListedInTheBooksPage() {
        BrowserUtils.sleep(2);
        Assert.assertTrue(library.bookRecords.isDisplayed());
    }

    @Then("By default, the app shows {int} records.")
    public void byDefaultTheAppShowsRecords(int num) {
        BrowserUtils.sleep(4);
        int actual=Integer.parseInt(library.selectFirst(library.recordsSelect).getText());
        Assert.assertEquals(num,actual);
    }
    @Then("Verify the records dropdown has {int} options:")
    public void verify_the_records_dropdown_has_options(int num,List<String> options) {
        int actual=library.selectAll(library.recordsSelect).size();
        Assert.assertEquals(num,actual);
        List<String> list=new ArrayList<>();

        for (int i = 0; i < actual; i++) {
          list.add(library.selectAll(library.recordsSelect).get(i).getText());
        }
      Assert.assertEquals(options,list);

    }




    @And("user open dropdown  Book Categories")
    public void userOpenDropdownBookCategories() {
        BrowserUtils.sleep(2);
        library.bookCategories.click();

    }

    @Then("user should be able get {int} book categories")
    public void userShouldBeAbleGetBookCategories(int int4) {
       // Actions action=new Actions(Driver.getDriver());
        Select select=new Select(library.bookCategories);
        List<WebElement> list1=select.getOptions();
       Assert.assertEquals(int4,list1.size());

    }
    @When("get Borrowing Books page")
    public void get_borrowing_books_page() {
      library.borrowingBooksModule.click();
      BrowserUtils.sleep(3);
    }
    @When("open dropdown Users")
    public void open_dropdown_users() {
        System.out.println(library.getText(library.selectAll(library.userDropdown)));
    }
    @Then("Verify the students can search other students and get their brow book reports.")
    public void verify_the_students_can_search_other_students_and_get_their_brow_book_reports() {
        Assert.assertEquals(1, library.selectAll(library.userDropdown).size());
    }
    @Then("Verify the report contains {int} columns, as shown in the design.")
    public void verify_the_report_contains_columns_as_shown_in_the_design(int num) {

        Assert.assertEquals(num,library.studentColumns.size());

    }

    @When("librarian open Users page")
    public void librarianOpenUsersPage() {
        BrowserUtils.sleep(2);
        library.userModule.click();
    }

    @And("librarian open dropdown User Group")
    public void librarianOpenDropdownUserGroup() {
        BrowserUtils.sleep(2);
        library.userGroup.click();


    }

    @Then("librarians should be able get {int} categories on the User Group:{word}")
    public void librariansShouldBeAbleGetCategoriesOnTheUserPageAllLibrarianStudent(int int1,String word) {
     /*   Select select=new Select(library.userGroup);
        List<WebElement> listW=select.getOptions();
        String word2="";
        for (WebElement each : listW) {
            word2+=each.getText()+",";
        }
        System.out.println(listW.size());
        BrowserUtils.sleep(2);
Assert.assertEquals(int1,listW.size());
        Assert.assertEquals(word,word2.substring(0,word2.length()-1))

      */

        Assert.assertEquals(word, library.getText(library.selectAll(library.userGroup)));


    }
    @Then("librarians should be able get {word} by default option")
    public void librariansShouldBeAbleGetALLByDefaultOption(String word) {
        Assert.assertEquals(word,library.byDefault.getText());
    }


    @And("open dropdown Status")
    public void openDropdownStatus() {
        BrowserUtils.sleep(3);
        library.userStatus.click();
    }

    @Then("Should be able get {int} status:ACTIVE,INACTIVE")
    public void shouldBeAbleGetStatusACTIVEINACTIVE(int int1) {
      /*  Select select=new Select(library.userStatus);
        List<WebElement> listW=select.getOptions();
        for (WebElement each : listW) {
            System.out.print(each.getText()+",");
        }
        System.out.println(listW.size());
        BrowserUtils.sleep(2);
        Assert.assertEquals(int1,listW.size());
       */
        int actual=library.selectAll(library.userStatus).size();
        Assert.assertEquals(int1,actual);

    }

    @Then("Verify the list of users contains {int} columns")
    public void verifyTheListOfUsersContainsColumns(int int1) {
        Assert.assertEquals(int1,library.columns.size());
    }

    @When("librarian  clicking the Group sorting icon")
    public void librarianClickingTheGroupSortingIcon() {

        BrowserUtils.sleep(2);
        library.sortingIcon.click();
        BrowserUtils.sleep(2);
        library.sortingIcon.click();
        BrowserUtils.sleep(2);
        library.sortingIcon.click();

    }
    @Then("After clicking the sorting icon,the user list is displayed by {word}")
    public void afterClickingTheSortingIconTheUserListIsDisplayedByLibrarian(String word) {

        Assert.assertEquals(word,library.groupName.getText());
    }



    @And("push +Add User button")
    public void pushAddUserButton() {
        BrowserUtils.sleep(2);
        library.addUserButton.click();



    }

    @And("fill out all the field with the proper information")
    public void fillOutAllTheFieldWithTheProperInformation() {
        BrowserUtils.sleep(2);
        library.fullName.sendKeys("Ali");
        BrowserUtils.sleep(2);
        library.passwordUser.sendKeys("1234567");
        BrowserUtils.sleep(2);
        library.emailUser.sendKeys("user77@gmail.com");
        BrowserUtils.sleep(2);
        library.saveChangesUserButton.click();

    }

    @Then("Get confirmation message: {string}")
    public void getConfirmationMessage(String string) {
        Assert.assertTrue(library.message.isDisplayed());


    }

    @When("librarians to enter the existing email")
    public void librariansToEnterTheExistingEmail() {
        BrowserUtils.sleep(2);
        library.addUserButton.click();
        BrowserUtils.sleep(2);
        library.fullName.sendKeys("Ali");
        BrowserUtils.sleep(2);
        library.passwordUser.sendKeys("1234567");
        BrowserUtils.sleep(2);
        library.emailUser.sendKeys("user77@gmail.com");
        BrowserUtils.sleep(2);
        library.saveChangesButton.click();
        BrowserUtils.sleep(2);
    }

    @Then("Get a warning  message")
    public void getAWarningMessage() {
        Assert.assertTrue(library.warningMessage.isDisplayed());
    }


    @When("click the “Edit Book” button")
    public void click_the_edit_book_button() {
        library.editBookButton.click();

    }
    @Then("{string} :should be displayed on top of the pop up window.")
    public void shouldBeDisplayedOnTopOfThePopUpWindow(String str) {
        BrowserUtils.sleep(2);
        Assert.assertTrue(library.editBookInfo.isDisplayed());
        Assert.assertEquals(str,library.editBookInfo.getText());
    }

    @Then("{string} :confirmation message should be displayed.")
    public void confirmationMessageShouldBeDisplayed(String str) {
        library.saveChangesButton.click();
        Assert.assertTrue(library.message.isDisplayed());
        Assert.assertEquals(str,library.message.getText());
    }

    @Given("librarian should be able open library login page")
    public void librarian_should_be_able_open_library_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
    }
    @When("librarian type valid credentials")
    public void librarian_type_valid_credentials() throws InterruptedException {
        Thread.sleep(2);
        library.emailAddress.sendKeys(ConfigurationReader.getProperty("username2"));
        Thread.sleep(2);
        library.password.sendKeys(ConfigurationReader.getProperty("password"));
    }
    @When("push Sign In button")
    public void push_sign_in_button() throws InterruptedException {
        BrowserUtils.sleep(3);
        library.signInButton.click();
    }
    @Then("Verify the users can login with valid credentials.")
    public void verify_the_users_can_login_with_valid_credentials() {

        BrowserUtils.sleep(2);
        library.testLibrarian.click();
        library.logOutButton.click();


    }
    @Then("Verify the “Sorry, wrong email or password” warning message should be displayed when user attempt to login with invalid credentials.")
    public void verify_the_sorry_wrong_email_or_password_warning_message_should_be_displayed_when_user_attempt_to_login_with_invalid_credentials() {
        BrowserUtils.sleep(2);
        library.emailAddress.sendKeys("user@gmail.com");
        BrowserUtils.sleep(2);
        library.password.sendKeys("12345");
        BrowserUtils.sleep(2);
        library.signInButton.click();
        Assert.assertTrue(library.invalidMessage.isDisplayed());
    }
    @Then("Verify “this field is required” warning message is displayed when user attempt to login without any credentials.")
    public void verify_this_field_is_required_warning_message_is_displayed_when_user_attempt_to_login_without_any_credentials() {
        Driver.getDriver().navigate().refresh();
        BrowserUtils.sleep(3);
        library.signInButton.click();
        BrowserUtils.sleep(3);
        Assert.assertTrue(library.thisFieldIsRequired.isDisplayed());
    }

}
