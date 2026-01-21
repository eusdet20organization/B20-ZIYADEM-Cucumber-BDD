Feature: Navigationleiste test

  Scenario: Navigationleiste ist angezeigt
    Given  user logs in with email "blagojaan@yahoo.com" and password "Test12345678@"
    When user klick auf Delikatessen Seite
    Then verify that the Navigationleiste is displayed

    Scenario: Navigationleiste Dropdown Menüs
      Given  user logs in with email "blagojaan@yahoo.com" and password "Test12345678@"
      When klick auf Therapeutische Produkte der Bienengruppe von Kategorie Honigsorten
      Then Verifiziert dass Therapeutische Produkte der Bienengruppe angezeigt sind
