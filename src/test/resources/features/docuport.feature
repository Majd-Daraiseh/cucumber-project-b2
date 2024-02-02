Feature: Validate left navigator items of Docuport for 4 user

  @Test1
  Scenario Outline: Login to Docuport and validate the left navigator items

    Given user is on Docuport login page

    Then user is on the home page of Docuport "<Role>"

    Then  validate left navigator items of Docuport for all "<Role>"
     |client    | Home | Received docs | My uploads | Invitations | 1099 Form  | Reconciliations|            |                |               |                |
     |employee  | Home | Received docs | My uploads | Clients     | Users      | Bookkeeping    | 1099 Form  | Reconciliations|               |                |
     |supervisor| Home | Received docs | My uploads | Clients     | Users      | Leads          | Bookkeeping| 1099 Form      |Reconciliations|                |
     |advisor   | Home | Received docs | My uploads | Clients     |Invitations |  Users         | Leads      | Bookkeeping    |1099 Form      | Reconciliations|
    Examples:
      |Role      |
      |client    |
      |employee  |
      |supervisor|
      |advisor   |



