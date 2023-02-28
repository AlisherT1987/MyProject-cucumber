@project @smoke
Feature:Library Functionality

  @B28G1-18 @librarian @wip
  Scenario: As a librarian, I should be able to add books to the app.
    When librarian push addBook button
    And fill out all proper information
    Then librarian should see confirmation message

  @B28G1-09 @librarian
  Scenario: As a user, I should be able to access to the main page.
    Then librarians can get 3 modules from the homepage: Dashboard, Users, Books

  @B28G1-09 @student
  Scenario: As a user, I should be able to access to the main page.
    Then students can get 2 modules from the homepage: Books, Borrowing Books

  @B28G1-10 @librarian
  Scenario: As a librarian, I should be able to to get the correct user and book information
    Then Verify on dashboard there are 215 users
    Then Verify on dashboard there are 1375 books
    Then Verify on dashboard there are 86 Borrowed books

  @B28G1-11 @librarian
  Scenario: As a user, I should be able to see the book records on the Books page.
    When user open Books page
    Then Verify that the book records are listed in the Books page.
    Then By default, the app shows 10 records.
    Then Verify the records dropdown has 7 options:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |
  @B28G1-11 @student
  Scenario: As a user, I should be able to see the book records on the Books page.
    When user open Books page
    Then Verify that the book records are listed in the Books page.
    Then By default, the app shows 10 records.
    Then Verify the records dropdown has 7 options:
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |

  @B28G1-12 @librarian
  Scenario: As a user, I should be able to get different book categories.
    When user open Books page
    And  user open dropdown  Book Categories
    Then user should be able get 21 book categories
  @B28G1-13 @student
    Scenario: As a student, I should be able to get borrowed book report from the Borrowing Books page.
    When get Borrowing Books page
    And open dropdown Users
    Then Verify the students can search other students and get their brow book reports.
    Then Verify the report contains 6 columns, as shown in the design.

  @B28G1-14 @librarian
  Scenario: As a librarian, I want to get user group categories.
    When librarian open Users page
    And librarian open dropdown User Group
    Then librarians should be able get 3 categories on the User Group:ALL,Librarian,Students
    Then librarians should be able get ALL by default option

  @B28G1-15 @librarian
  Scenario: As a librarian, I want to filter the user status.
    When librarian open Users page
    And open dropdown Status
    Then Should be able get 2 status:ACTIVE,INACTIVE

  @B28G1-16 @librarian
  Scenario: As a librarian, I should be able to get users list in the User page.
    When librarian open Users page
    Then  Verify the list of users contains 6 columns
    When librarian  clicking the Group sorting icon
    Then After clicking the sorting icon,the user list is displayed by Librarian

  @B28G1-17 @librarian
  Scenario: As a librarian, I should be able to add users to the app
    When librarian open Users page
    And push +Add User button
    And fill out all the field with the proper information
    Then Get confirmation message: "The user has been created"
    When librarians to enter the existing email
    Then Get a warning  message

  @B28G1-19 @librarian
Scenario: As a librarian, I should be able to edit the books information.
    When user open Books page
    And click the “Edit Book” button
    Then "Edit Book Information" :should be displayed on top of the pop up window.
    Then "The book has been updated." :confirmation message should be displayed.
  @B28G1-20
    Scenario: As a librarian, I should be able to login.
    Given librarian should be able open library login page
    When librarian type valid credentials
    And  push Sign In button
    Then Verify the users can login with valid credentials.
    Then Verify the “Sorry, wrong email or password” warning message should be displayed when user attempt to login with invalid credentials.
    Then Verify “this field is required” warning message is displayed when user attempt to login without any credentials.
