@practice
Feature: Bing search
  Scenario: I should be able search word "orange" in a Bing
    Given go to "https://www.bing.com"
    And search for  "orange" in checkbox
    Then verify title is "orange – Search"