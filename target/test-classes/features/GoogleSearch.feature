@practice @regression
Feature: Google search functionality
  Scenario: As user should be able search "apple" in a Google
    Given  the user go to "https://www.google.com"
    And the user search for  "apple" in checkbox
    Then verify title is a expected "apple - Google Search"
