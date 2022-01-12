#Author: johan and jad
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

#Sample Feature Definition Template
@tag
Feature: Gerer nouvelle fonctionnalite d'une personne
  En tant que personne
  Je veux pouvoir croire en un dieu
  Afin que je puisse être associé à ce dieu

  Scenario: gerer croyance d'une personne
    Given person god
    When person croit en god
    Then person est associe a god

  Scenario: changement de croyance
    Given person god
    When person croit plus en god
    Then person est associe a aucun dieu



