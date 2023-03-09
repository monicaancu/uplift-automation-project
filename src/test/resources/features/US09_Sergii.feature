
Feature: Users should be able to login
  #@B28G28-108
  Background: User is already in the log in page
    Given the user is on the login page
    Then the user logged in as "sales manager"

  @B28G28-106
    Scenario: Verify user a sales manager can be able to access the different modules.
      Given the user is on the main page
      Then user should see nineteen modules at the top of the page
        | Discuss         |
        | Calendar        |
        | Notes           |
        | Contacts        |
        | CRM             |
        | Sales           |
        | Website         |
        | Point of Sale   |
        | Purchases       |
        | Inventory       |
        | Repairs         |
        | Invoicing       |
        | Email Marketing |
        | Events          |
        | Employees       |
        | Leaves          |
        | Expenses        |
        | Maintenance     |
        | Dashboards      |
      And user should see the users nickname at the right top of the page

      Then user clicks on each modules options and verifies url contains part of the URL


