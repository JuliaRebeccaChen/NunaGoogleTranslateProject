#Author: JRC
@test
Feature: Google Translate translation function validaton

  Background: 
    Given user navigates to Google Tranlate main page

  Scenario Outline: Translate from source language to result language
    When user selects "<source language>" from the drop-down menu on the left
    And user selects "<result language>" from the drop-down menu on the right
    And user enters the "<source text>" in the input field on the left
    Then I validate the "<result text>" in the right field is correct
    #Scenario: Verify swap languages button function
    When user clicks swap languages button
    Then I verify the text in the source textarea equals the initial "<result text>"
    And I verify the text in the result textarea equals the initial "<source text>"
    #Scenario: Verify keyboard input function
    When user clears the input field
    And user clicks Select Input Tool button and selects Screen Keyboard
    And user enters "<keyboard input>"
    Then I verify the translated result text

    Examples: 
      | souce language | result language | source text | result text | keyboard input |
      | German         | Spanish         | Demokratien | Democracias | Hi!            |
      | German         | Spanish         | Zug         | tren        | Hi!            |
      | German         | Spanish         | Zeit        | tiempo      | Hi!            |
      | German         | Spanish         | Bier        | cerveza     | Hi!            |
      | German         | Spanish         | Hund        | perro       | Hi!            |
      | German         | Spanish         | Katz        | gata        | Hi!            |
