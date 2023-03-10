@B28G28-86 @Regression
Feature: Default

	#As a user, I want to access to access documentation page 
  @B28G28-84 @Annie
  Scenario: US06-AC01-TC01-As a user, I want to access the documentation page
    Given SalesManager enters login credentials
    Given I click my username and access the menu
    And I click the documentation option
    Then It will display the Odoo Documentation page



  @B28G28-91 @Annie
  Scenario: US06-AC02-TC01-As a user, I should see four main document topics are listed
    Given I am on documentation page
    Then I should see four main topics listed
      |User Docs|
      |Install and Maintain|
      |Developer|
      |Contribute|