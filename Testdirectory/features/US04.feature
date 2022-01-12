#Author: johan and jad
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

#Sample Feature Definition Template
@tag
Feature: Gerer nouvelle fonctionnalite d'un dieu
  En tant que dieu
  Je veux pouvoir être humain
  Afin que je puisse adopter un animal

  @tag1
  Scenario: gerer adoption pour un dieu
    Given godAttributes
    When god a une personne en lui
    Then god peut adpoter un animal


