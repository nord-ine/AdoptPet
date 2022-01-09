Feature: give name to pet
  as a person I want to give my adopted pet a name
  Scenario: give name to my pet
    Given  my new pet
    When I give a name to the pet
    Then its name is equal to the given name