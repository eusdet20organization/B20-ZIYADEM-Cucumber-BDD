Feature: Registrierung

  Scenario: Registrierung mit bereits existierter Email
    Given der Benutzer befindet sich auf der Registrierungsseite
    When der Benutzer registriert sich mit einer bereits existierenden Email
    Then wird eine Fehlermeldung angezeigt, die besagt, dass die Email bereits existiert