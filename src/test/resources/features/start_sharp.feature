#Autor: John Villamil

@Stories1
Feature: Start Sharp
  As a user, I want to create an Business Units and then create a meeting
  Background:
    Given than James wants to create an Business Units and then create a meeting
    And he go to login with his credentials
      |username   |password  |
      |admin      |serenity  |

  @Scenario1
  Scenario Outline: Create a Business Units
    And he go to the section Business Units
    When he is on the Star Sharp platform he will create a new Unit  filling all fields
    |name_unit    |parent_unit   |
    |<name_unit>  |<parent_unit> |
    Then he see the new <name_unit> on the tree

    Examples:
      |name_unit   |parent_unit     |
      |UnidadJohnV |Administration  |
#      |UnidadJohnV |NOEXITE         |

  @Scenario2
  Scenario Outline: Cretate a new Meeting
    And now he go to the section Meeting
    When he will to create a new Meeting
      |name_meeting    |type_meeting   |number_meeting   |start_date    |end_date    |location   |unit   |organized_by   |reporter   |attendee_list   |
      |<name_meeting>  |<type_meeting> |<number_meeting> |<start_date>  |<end_date>  |<location> |<unit> |<organized_by> |<reporter> |<attendee_list> |
    Then he can see the new <name_meeting> on the tree
    Examples:
      |name_meeting |type_meeting |number_meeting |start_date |end_date   |location |unit        |organized_by |reporter     |attendee_list |
      |MeetingJohnV |Strategy     |00056763335422 |05/16/2022 |05/16/2022 |On Site  |UnidadJohnV |Adam Edwards |Allison Bell |Alexis Lopez |