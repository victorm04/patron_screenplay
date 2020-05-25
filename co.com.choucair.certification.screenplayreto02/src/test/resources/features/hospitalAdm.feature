#Author Victor Rodriguez
@stories
Feature: Medical date management
  As a patient, I want to ask for a medical date by using the hospital administration system

  @scenario1
  Scenario: Doctor registration
    Given than Carlos need to register a new doctor
    When he fill the doctor registry form in the app
      | name    | lastname | phone      | docType     | docNumber |
      | Carlos  | Perez    | 1122334455 | Pasaportes  | 1111111   |
    Then he verify that the screen show the mesage Datos guardados correctamente.

  @scenario2
  Scenario: Patient registration
    Given than Carlos add a new patient
    When he fill the patient registry form in the app
      | name    | lastname | phone      | docType     | docNumber | prepaid |
      | Carlos  | Perez    | 1122334455 | Pasaportes  | 1111112   | si      |
    Then he verify that the screen show the mesage Datos guardados correctamente.

  @scenario3
  Scenario: Date registration
    Given than Carlos want to make a new date
    When he fill the date registry form in the app
      | date      | patientID | doctorID | observations                  |
      | 15/5/2020 | 1111112   | 1111111  | cita agendada automaticamente |
    Then he verify that the screen show the mesage Datos guardados correctamente.