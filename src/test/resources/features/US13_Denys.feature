@B28G28-80 @Regression
Feature: Verifying that login name displayed on right corner of the screen

  @B28G28-93
  Scenario: US13-AC01-TC01 Verify that name of expenses manager displayed on the screen
    Given ExpensesManager enters login credentials
    Then ExpenceManager login name should be visible



  @B28G28-94
  Scenario: US13-AC01-TC02 Verify that log in name of sales manager displayed on the screen
    Given SalesManager enters login credentials
    Then SalesManager login name should be visible



