#@B28G28-71
@Regression
Feature: Default

  @B28G28-96 @Ana
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

  @B28G28-99
  @Regression
  Scenario: US04-AC01-TC02-As an Inventory manager, I should be able to access the main modules.
    Given inventory manager is logged in
    Then inventory manager should access the main modules