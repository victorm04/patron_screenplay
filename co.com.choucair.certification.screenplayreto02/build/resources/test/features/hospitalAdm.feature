#Author Victor Rodriguez
@stories
Feature: Medical date management
  As a patient, I want to ask for a medical date by using the hospital administration system

  @scenario01
  Scenario: Doctor registration
    Given than Carlos need to register a new doctor
    When he fill the registry form in the app
    Then he verify that the screen show the mesage Datos guardados correctamente