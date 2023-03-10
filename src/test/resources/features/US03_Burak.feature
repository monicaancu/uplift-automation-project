#@B28G28-102
@Regression
Feature: Default

	#h3. {color:#de350b}+_*User Story- US03 :*_+{color}
	#
	#{color:#172b4d}*As a POS manager, I should be able to access to the main modules.*{color}
	#h3. {color:#de350b}+_*AC 1 :*_+{color}
	#
	#*Verify the POS managers access to 22 modules.*
  @B28G28-101
  Scenario: US03-AC1-TC01 Verify the POS managers access to 22 modules.
Feature: As a POS manager, I should be able to access to the main modules.

  @Burak
  Scenario: US03-AC01-TC01 Verify the POS managers access to 22 modules.
    Given  I am already on login page with giving URL.
    And I already logged in as a POS manager.
    Then I am able to see all modules as a POS manager.
    Then I am able to access all  modules as a POS manager.