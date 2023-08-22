@loginProcess
Feature: This is to test OrangeHRM login
@valid
Scenario: Verify HRM Login process Valid Credentials
    Given User is on login page
    When Enter the username and password
    Then press the login button
@invalid
Scenario: Verify HRM Login process Invalid Credentials
    Given User is on login page
    When Enter the username and password
    Then press the login button