Feature:Add a car for rent on the Let the car work page

  @add-car
  Scenario: Add a car for rent with valid data
    Given User launches ChromeBrowser
    And User opens ilcarro Home Page
  When User click on  Log in link
    And  User enters valid data
    And  User clicks on Yalla button
    And User clicks on Let the car work link
    And User enters all needed data
    And User uploads car photos
    And User submits the form
    Then User verifies success message is displayed
   And User quites browser


