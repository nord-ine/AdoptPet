#Author: johan and jad
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

#Sample Feature Definition Template
@tag
Feature: Creation des armes
En tant que arme
<<<<<<< HEAD
Je veux avoir un propre nom et peut-�tre un propri�taire
=======
Je veux avoir un propre nom et peut-etre un proprietaire
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
Afin que un seul dieu puisse m"\\"utiliser

  @tag1
  Scenario Outline: instancier une arme
<<<<<<< HEAD
  	Given <name> 
    When instanciation 
    Then cr�ation de arme avec <name>
=======
  	Given name
    When instanciation arme
    Then creation arme avec name
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb
    
    Examples: 
      | name          | status  |
      | eternal spear | success |

