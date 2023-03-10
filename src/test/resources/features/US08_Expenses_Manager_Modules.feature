Feature: as Expenses Manager has access the different modules.

  @B28G28-82 @Regression
  Scenario: US08_AC01_TC01_As an Expenses manager, I should be able to access to the different modules.
    Given the user logged in as "expenses manager"
    Then Expenses manager should able to see 12 modules