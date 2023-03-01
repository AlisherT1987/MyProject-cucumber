@etsy @regression
Feature: Etsy Search Functionality
  @TC-1
  Scenario: Etsy Title Verification
    Then Verify title is as expected: "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone"
  @TC-2
    Scenario: Etsy Search Functionality Title Verification (without parameterization)
      When User types Wooden Spoon in the search box
      And  User clicks search button
      Then User sees Wooden Spoon is in the title
  @TC-3
  Scenario: Etsy Search Functionality Title Verification (with parameterization)
  When Customer type "Wooden spoon" in the search box
  And  User clicks search button
  Then Customer sees "Wooden spoon - Etsy" is in the title
