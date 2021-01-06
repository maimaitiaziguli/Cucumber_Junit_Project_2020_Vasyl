Feature: As user , I want to be able to create new cars

  @add_car
  Scenario: 1. Add some cars
    Given User is on the login page
    And User logs in as a "store manager"
    And User navigates to "Fleet" and "Vehicles"
    And User clicks on create car button
    When User adds new vehicles information
    |License Plate|SDET|
    |Model Year   |2021|


