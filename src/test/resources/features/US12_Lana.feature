@B28G28-88 @regression
Feature: Default


  @B28G28-83 @wip
  Scenario Outline: US12-AC01-TC01-As POS and eventCRM manager, I should be able to Login with valid credentials.
    Given I am on the login page
    When I login using "<email>" and "<password>"
    Then account holder name should be "<name>"

    @POSManager
    Examples:
      | email                 | password   | name         |
      | posmanager55@info.com | posmanager | posmanager55 |
      | posmanager67@info.com | posmanager | posmanager67 |
      | posmanager89@info.com | posmanager | posmanager89 |

    @eventCRMManager
    Examples:
      | email                       | password         | name               |
      | eventscrmmanager55@info.com | eventscrmmanager | eventscrmmanager55 |
      | eventscrmmanager67@info.com | eventscrmmanager | eventscrmmanager67 |
      | eventscrmmanager89@info.com | eventscrmmanager | eventscrmmanager89 |




