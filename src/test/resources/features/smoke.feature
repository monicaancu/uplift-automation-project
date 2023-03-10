@smoke
Feature: Smoke

    Scenario: POS Manager access 22 modules.
    Given  I am already on login page with giving URL.
    And I already logged in as a POS manager.
    Then I am able to see all modules as a POS manager.

    Scenario: POS Manager access sales page.
      Given POS Manager is logged in
      Given POS Manager is on the Point of Sales page

    Scenario: Sales Manager access documentation page.
        Given SalesManager enters login credentials
        Given I click my username and access the menu
        And I click the documentation option

  Scenario: Able to login as a CRM Manager
    Given that the Events CRM Manager is logged in

    Scenario: Able to login as a Expense Manager
      Given the user logged in as "expenses manager"

      Scenario: Able to login a Sales Manager
        Given the user is on the login page
        Then the user logged in as "sales manager"

