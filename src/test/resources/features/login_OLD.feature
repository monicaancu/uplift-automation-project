#@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @login
  Scenario: Verify login with different user types
    #Given the user logged in as "inventory manager"
    #values for this string:
      # pos manager
      # crm manager
      # sales manager,
      # inventory manager
      # expenses manager

  #this Given step below is a duplicate step.
  #Use the one above or this one but not both.
    Given the user logged in with username as "salesmanager99@info.com" and password as "salesmanager"








