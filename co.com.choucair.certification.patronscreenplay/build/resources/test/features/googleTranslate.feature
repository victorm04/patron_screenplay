#Author: Victor Rodriguez
Feature: Practica DataDriven
    Como un usuario
    Quiero ingresar a google translator
    A traducir palabras entre diferentes idiomas

  @traducir
  Scenario: Traducir de ingles a español
    Given que Victor quiere usar el traductor de google
    When el traduce una palabra de ingles a español
      | origen | destino | palabrai |
      | inglés | español |table     |
    Then el deberia ver la palabra traducida del idiona origen al idioma destino
      | palabrae |
      | mesa     |