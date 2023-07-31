Feature: Login to saucedemo application
  Background:
    Given User is on saucedemo application login page
  Scenario: Successful Login
    When user enter the correct username
    And user enter the correct password
    And user click on the login button
    Then user should be logged in successfully and be taken to inventory page

  Scenario: Unsuccessful Login
    When user enter the incorrect username
    And user enter the incorrect password
    And user click on the login button
    Then user should not be logged in and error message should show