#Author:Hossam Mohammed
#Date :00/1/2022
#Description :I Develop Simple Cucumber Project

Feature: feature to test login functionality


  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enter username and password
    And clicks on login button
    Then user is navigated to the home page