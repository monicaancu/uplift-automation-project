@B28G28-90 @regression
Feature: Default

	#Verify the POS managers can view the order list on the Point of Sale page, after checking the Order reference, all the orders should be checked.
  @B28G28-85 @monica
  Scenario: US05-AC1-TC01 Verify POS managers can view and select all orders
    Given POS Manager is logged in
    Given POS Manager is on the Point of Sales page
    Given POS Manager clicks Orders link on the left side nav bar
    #Then POS Manager should see all orders
    Then POS Manager should be able to select all orders by clicking the Order Ref checkbox

	#When POS Manager selects all orders on Point of Sales > Orders page, he/she should see an Action dropdown menu with three options: Import, Export, Delete
  @B28G28-89 @monica
  Scenario: US05-AC2-TC01 Verify that the "Actions" menu has three options
    Given POS Manager is logged in
    When POS Manager selects all orders on Point of Sales > Orders page
    Then POS Manager should see below options
      |Import|
      |Export|
      |Delete|