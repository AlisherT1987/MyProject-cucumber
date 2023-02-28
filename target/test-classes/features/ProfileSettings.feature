@SEAMLES
Feature: Profile Settings Functionality



 @SEAMLES-435 @smoke
  Scenario: User can see at least following titles inside personal info under Full name/Email/Phone Number
    And the user clicks settings label
    Then the user should see following labels
      | Full name       |
      | Email           |
      | Phone number    |
      | Address         |
      | Website         |
      | Twitter         |
      | Language        |
      | Locale          |
      | Profile picture |

 @SEAMLES-436
   Scenario: User can change "Full name" info under Profile Settings page
     And the user clicks settings label
     And the user enters the name "Adam"
     Then the user should be able to see the "Adam"

  @SEAMLES-437
  Scenario: User can make "Phone number" info as private under Profile Settings page
    And the user clicks settings label
    And the user clicks the phone icon-triangle
    And the user clicks the private label
    Then the user should see the private is selected

  @SEAMLES-438
  Scenario: User can see the current local time under the Local dropdown
    And the user clicks settings label
    Then the user should see the localtime in page


  @SEAMLES-439
  Scenario: create list
    When user can click task icon
    And Click Add to list
    And Enter "School" task and click save
    Then User cans see left drop down menu "School" appear in the School list
    @SEAMLES-440
  Scenario: Add to task
    When user can click task icon
    And Click Add to list
    And Enter "School" task and click save
    And Enter your task "Homeworks"
    Then User can see created task "Homeworks" in the School list




