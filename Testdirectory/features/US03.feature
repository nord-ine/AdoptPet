#Author: johan and jad
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.

#Sample Feature Definition Template
@tag
<<<<<<< HEAD
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
=======
Feature: Gerer associations
  En tant que dieu
  Je veux avoir une arme
  Afin que je sois le seul a pouvoir l"\\"avoir

  @tag1
  Scenario Outline: gerer association entre un dieux et une arme
    Given god1 god2 weapon
    When attribution de weapon a god1
    Then weapon est associe a god1
    Then weapon peut pas etre associe a god2
    Then new weapon peut pas etre associe a god1

    Examples:
      | god  | weapon_god | weapon | god.weapon_god | exception |
      | god1 | null       | axe    | axe            | false     |
      | god2 | null       | axe    | null           | true      |
      | god1 | axe        | spear  | axe            | true      |
>>>>>>> 5170708b623db346bcdc1a9343fce7cea67162bb

  

