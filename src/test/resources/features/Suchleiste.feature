Feature: Suchleiste funktionality

  Scenario: user searches for a product successfully
    Given user logs in with email "blagojaan@yahoo.com" and password "Test12345678@"
    When user klick auf Such Feld
    And user schreibt "BIO" in Such Feld
    And user klick auf erste Option
    Then Verifiziert dass der Benutzer zur Produkt Detailseite gelandet ist

    Scenario: "Product not found" is displayed
      Given user logs in with email "blagojaan@yahoo.com" and password "Test12345678@"
      When user klick auf Such Feld
      And user schreibt "Saft" in Such Feld
      Then Verifiziert dass die Meldung Produkt nicht gefunden angezeigt wird

  Scenario: Suchergebnisse sind in Dropdown-Liste angezeigt
    Given user logs in with email "blagojaan@yahoo.com" and password "Test12345678@"
    When user klick auf Such Feld
    And user schreibt "Honig" in Such Feld
    Then Verifiziert dass die Suchergebnisse in der Dropdown-Liste angezeigt

    Scenario: Nach Enter drücken der Benutzer ist auf Webseite von Produkt
      Given user logs in with email "blagojaan@yahoo.com" and password "Test12345678@"
      When user klick auf Such Feld
      And user schreibt "BIO" in Such Feld
      Then Verifiziert dass der Benutzer auf Produkt Webseite gelandet ist
