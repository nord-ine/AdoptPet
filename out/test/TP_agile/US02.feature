#Author: johan and jad
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

#Sample Feature Definition Template
@tag
Feature: Creation des armes
En tant que arme
Je veux avoir un propre nom et peut-etre un proprietaire
Afin que un seul dieu puisse m"\\"utiliser

  @tag1
  Scenario Outline: instancier une arme
  	Given name
    When instanciation 
    Then creation arme avec name
    
    Examples: 
      | name          | status  |
      | eternal spear | success |

