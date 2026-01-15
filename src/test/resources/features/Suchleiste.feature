Feature: Suchleiste funktionality

  Scenario: user searches for a product successfully
    Given user logs in with email "blagojaan@yahoo.com" and password "Test12345678@"
    When user klick auf Such Feld
    And user schreibt "BIO" in Such Feld
    And user klick auf erste Option
    Then Verifiziert dass der Benutzer zur Produkt Detailseite gelandet ist