@flipkart
Feature: Flipkart Search Functionality
    Scenario: User should able to get Wire Headphones page
  Given  Go to: "https://www.flipkart.com/"
  When user find Wire Headphones and click it
  Then Verify user on Wire Headphones page
    Scenario: User should be able locate t-shirts on the search box
      Given  Go to: "https://www.flipkart.com/"
      When click on the search box
      And choose t-shirts on search list
      Then Verify user on "T Shirts" page
