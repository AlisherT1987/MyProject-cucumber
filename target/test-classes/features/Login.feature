@regression
Feature: Login Functionality
  Scenario: login
  Given Go to: "https://web-table-2.cydeo.com/login"
  When Enter username: Test
  And  Enter password: Tester
  Then Verify URL: should end with “orders”