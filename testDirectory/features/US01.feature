#Author: johan and jad
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

#Sample Feature Definition Template
Feature: Creation des Dieux
  En tant que Dieu
  Je veux avoir un propre nom de divinite et une caracteristique
  Afin de pouvoir me presenter

  Scenario Outline: instancier un dieu
    Given name et feature
    When instanciation
    Then creation du dieu avec name et feature

    Examples:
      | name  | feature | status  |
      | Hades | death   | success |


  Scenario Outline: presentation du dieu
    Given un dieu
    When dieu se presente
    Then il retourne une phrase contenant son name et son feature

    Examples:
      | dieu      | name  | feature | sentence                   |
      | GreekGod1 | Hades | death   | "I am Hades, god of death" |