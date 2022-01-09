#Author: johan and jad
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

#Sample Feature Definition Template
@tag
Feature: G�rer associations
En tant que dieu
Je veux avoir une arme 
Afin que je sois le seul a pouvoir l"\\"avoir

  @tag1
  Scenario Outline: g�rer association entre un dieux et une arme
  	Given <god> et <weapon>
    When attribution de <weapon> � <god>
    Then <weapon> est associ� � <god> si <god> ne poss�de pas d�j� une arme et si <weapon> ne poss�de pas d�j� de propri�taire

    Examples: 
      | god   | weapon_god | weapon  | god.weapon_god  | exception |
      | god1  |    null    |  axe    |      axe        |   false   |
      | god2  |    spear   |  axe    |      spear      |   true    |
      | god3  |    null    |  axe    |      null       |   true    |

  

