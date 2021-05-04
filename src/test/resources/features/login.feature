# Author: Sachin Kasar
# Cucumber BDD Framework for Login functionality wuth report

@TestLoginFeature
Feature: feature to test login functionality

@TestLoginScenario
  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enter username and password
    And clicks on login button
    Then user is navigate to the home page
    
