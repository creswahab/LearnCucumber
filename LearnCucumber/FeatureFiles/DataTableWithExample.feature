@DataDriven
Feature: This is to test OrangeHRM login with DataTable Example
Scenario Outline:: Verify the HRM Login process with DataTable Example
    Given You open login page
    When user provid the valid "<UserName>" and "<Password>"
    And perform the login
    Then User is navigated to Homepage
  Examples: 
   	|UserName | Password |
    |Admin |admin123|
    |Admin |admin456|