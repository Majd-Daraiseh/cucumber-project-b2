Feature: Docuport Login Logout Feature

  Background:
    Given user is on Docuport login page

  @client
  Scenario: Login as a client
    When user enters username for client
    And user enters password for client
    And user clicks login button
    And user clicks on continue button
    Then user should see the home page for client
    And user clicks on Batch1 Group3 button
    And user clicks on log out button
    Then user should see the home page

  @employee
  Scenario: Login as an employee
    When user enters username for employee
    And user enters password for employee
    And user clicks login button
    Then user should see the home page for employee
    And user clicks on Batch1 Group3 button
    And user clicks on log out button
    Then user should see the home page

  @advisor
  Scenario: Login as an advisor
    When user enters username for advisor
    And user enters password for advisor
    And user clicks login button
    Then user should see the home page for advisor
    And user clicks on Batch1 Group3 button
    And user clicks on log out button
    Then user should see the home page

  @supervisor
  Scenario: Login as an supervisor
    When user enters username for supervisor
    And user enters password for supervisor
    And user clicks login button
    Then user should see the home page for supervisor
    And user clicks on Batch1 Group3 button
    And user clicks on log out button
    Then user should see the home page

  @dataTableMap
    Scenario: Login as a client map practice
      When user enters credentials
      |username|b1g3_client@gmail.com|
      |password|Group3|
      Then user should see the home page for client








