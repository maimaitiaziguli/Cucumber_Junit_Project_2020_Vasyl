@login
Feature: As user I want to be able to login under different roles.

  # This is my comment

  # Background - Test precondition
  # will be exacuted before every scenario in the particular feature file
Background:
  Given User is on the login page

  Scenario: Login as a sales manager.
   # Given User is on the login page(we moved this Given to Background)
    When User logs in
    Then User should see dashboard page

@parameterized_test
    Scenario: Parameterized login
     # Given User is on the login page (we moved this Given to Background)
      When User logs in as a "store manager"
      Then User should see dashboard page


@negative_login
  Scenario: Invalid password
    # Given User is on the login page (we moved this Given to Background)
    When User logs in with "storemanager85" username and " incorrect" password
    Then User verifies that "Invalid user name or password." message is displayed



