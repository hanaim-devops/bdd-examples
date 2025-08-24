Feature: De schepBal functie
  # De GlazenBol heeft de methode schepBal die een bal uit de glazen bol haalt.

  Scenario: Schep een bal uit de glazen bol met 1 bal
    Given een glazenbol met een capaciteit van 1
    When een bal geschept wordt
    Then zou het balnummer 1 moeten zijn
