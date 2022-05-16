#Autor: John Villamil

@Stories1
Feature: Start Sharp
  As a user, I want to create an Business Units and then create a meeting
  Background:
    Given than James wants to create an Business Units and then create a meeting
    And he go to login with his credentials
      |username   |password  |
      |admin      |serenity  |

  Scenario Outline: Create a Business Units
    And he go to the section Business Units
    When he go to the section Business Units on the Star Sharp platform he will create a new Unit  filling all fields
    |name_unit    |parent_unit   |
    |<name_unit>  |<parent_unit> |
    Then he see the new Business Unit on the tree

    Examples:
      |name_unit   |parent_unit     |
      |UnidadJohnV |Administration  |

