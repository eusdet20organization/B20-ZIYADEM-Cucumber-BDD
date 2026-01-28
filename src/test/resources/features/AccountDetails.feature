@SDF
  Feature: Account Details Update

Scenario: Update Account Details

Given user logs in with email "cankirili_18@hotmail.de" and password "Eurotech.Test123"
  Then der Benutzer klickt auf meine Konto details
  Then der Benutzer wird zur meine Konto Seite weitergeleitet
    Then der Benutzer aktualisiert die Kontodetails mit Vorname und Nachname "Süreyya" und "Durak"
    Then der Benutzer speichert die aktualisierten Kontodetails
    Then eine Bestätigungsmeldung wird angezeigt, die besagt, dass die Kontodetails erfolgreich aktualisiert wurden




