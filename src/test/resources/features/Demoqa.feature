@regression
Feature:Verifying buttons feature of the application
  @demoqa
  Scenario: Check different button actions
    Given Navigate to buttons page
    When  Double click on button
    Then  Verify textA :'You have done a double click' should be visible
    And   Right-click on button
    Then  Verify textB :"You have done a right click" should be visible
    And   Click Me button
    Then  Verify textC :"You have done a dynamic click" should be visible
  @demoqa
  Scenario Outline:Getting different responses by different links
    Given Get to links page
    When the user clicks to "<link>"
    Then the message contains "<statusCode>""<statusText>"
    Examples:
      | link         | statusCode | statusText        |
      | Created      | 201        | Created           |
      | No Content   | 204        | No Content        |
      | Moved        | 301        | Moved Permanently |
      | Bad Request  | 400        | Bad Request       |
      | Unauthorized | 401        | Unauthorized      |
      | Forbidden    | 403        | Forbidden         |
      | Not Found    | 404        | Not Found         |