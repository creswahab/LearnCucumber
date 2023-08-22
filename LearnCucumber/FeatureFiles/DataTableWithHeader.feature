@DataDriven
Feature: This is to test OrangeHRM login with DataTable and header
Scenario: Verify the HRM Login process with DataTable and header
    Given You are on login page
    When user entered the below valid credentials
    |username | password |
    |Admin |admin123|
    Then click the login