Feature: This is to test OrangeHRM login with parameters
Scenario: Verify the HRM Login process with parameters
    Given User should be on login page
    When user enter the valid "Admin" and "admin123"
    Then click the login button