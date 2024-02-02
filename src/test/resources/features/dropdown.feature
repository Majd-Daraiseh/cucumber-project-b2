Feature: Drop down example

  @Test11
  Scenario: Check dropdown is not empty
    Given User is on "https://the-internet.herokuapp.com/dropdown"
    When User locates the dropdown.
    And User gets all options
    Then Dropdown is not empty

    @Test12
    Scenario: Check dropdown is not empty
      Given User is on "https://the-internet.herokuapp.com/dropdown"
      When User locates the dropdown.
      And User gets all options
      Then validate that the dropdown has all the options
      |Please select an option|
      |Option 1 |
      |Option 2 |

