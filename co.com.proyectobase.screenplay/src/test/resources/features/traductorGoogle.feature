#Author: your.email@your.domain.com
@Regresion
Feature: Como un usuario
  Quiero ingresar a Google Translator
  A traducir palabras entre diferentes lenguajes

  @traducir
  Scenario: Traducir de ingles a Español
    Given Que rafa quiere usar el traductor de google
    When el traduce la palabra table del ingles al espanol
    Then el deberia ver la palabra mesa en la pantalla

 