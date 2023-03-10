@regression
Feature: Default

  @B28G28-101
  Scenario: US03-AC1-TC01 Verify the POS managers access to 22 modules.
    Given  I am already on login page with giving URL.
    And I already logged in as a POS manager.
    Then I am able to see all modules as a POS manager.
    Then I am able to access all  modules as a POS manager.