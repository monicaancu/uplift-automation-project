Feature: As a POS manager, I should be able to access to the main modules.

  @Burak @wip
  Scenario: US03-AC01-TC01 Verify the POS managers access to 22 modules.
    Given  I am already on login page with giving URL.
    And I already logged in as a POS manager.
    Then I am able to see all modules as a POS manager.
    Then I am able to access all  modules as a POS manager.