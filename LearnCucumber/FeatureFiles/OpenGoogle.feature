Feature: This is to test Google search
Scenario: Verify Google is seaerch
    Given User is opening Google page
    When type the search term
    And  press the enter key
    Then Result should be displayed