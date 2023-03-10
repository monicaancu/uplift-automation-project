@B28G28-71
Feature: Default

  @B28G28-97 @Ana @Regression
  Scenario: US04-AC01-TC01-As an Inventory manager, I should be able to access the main modules.
    Given inventory manager is logged in
    Then inventory manager should see the following modules at the top of the main page
      | Discuss       |
      | Calendar      |
      | Notes         |
      | Contacts      |
      | Website       |
      | Inventory     |
      | Manufacturing |
      | Repairs       |
      | Invoicing     |
      | Employees     |
      | Leaves        |
      | Expenses      |
      | Lunch         |
      | Maintenance   |
      | Dashboards    |

  @Regression
  Scenario: US04-AC01-TC02-As an Inventory manager, I should be able to access the main modules.
    Given inventory manager is logged in
    Then inventory manager should access the main modules