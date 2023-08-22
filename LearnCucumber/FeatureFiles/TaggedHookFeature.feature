@TaggedHooks
Feature: This is to test tagged hooks concept

@First
Scenario: This is First Scenario
    Given This is First Step
    When This is Second Step
    Then This is Third Step
    
@Second
Scenario: This is Second Scenario
    Given This is First Step
    When This is Second Step
    Then This is Third Step
    
@Third
Scenario: This is Third Scenario
    Given This is First Step
    When This is Second Step
    Then This is Third Step