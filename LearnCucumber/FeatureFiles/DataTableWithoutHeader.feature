@DataDriven
Feature: This is to test OrangeHRM login with DataTable and no header
Scenario: Verify the HRM Login process with DataTable and no header
    Given User open the login page
    When user enter the below valid credentials
    |Admin |admin123|
    Then enter the login button