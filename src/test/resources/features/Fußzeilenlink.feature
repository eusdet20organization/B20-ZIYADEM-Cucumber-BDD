Feature: Fußzeilenlink
@sdm
  Scenario: der Benutzer loggt sich ein

  Given user logs in with email "cankirili_18@hotmail.de" and password "Eurotech.Test123"

    Then der Benutzer klickt auf den FußzeilenButton Unternehmensinformationen
    Then der Benutzer wird zur Unternehmensinformationen-Seite weitergeleitet
    Then der Benutzer klickt auf den Fußzeilenlink Nutzungsbedingungen
    Then der Benutzer wird zur Nutzungsbedingungen-Seite weitergeleitet
    Then der Benutzer klickt auf den Fußzeilenlink Datenschutzrichtlinie
    Then der Benutzer wird zur Datenschutzrichtlinie-Seite weitergeleitet
    Then der Benutzer klickt auf den Fußzeilenlink Versand- und Rückgabeinformationen
    Then der Benutzer wird zur Versand- und Rückgabeinformationen-Seite weitergeleitet
    Then der Benutzer klickt auf den Fußzeilenlink Stornierung und Rückerstattung
    Then der Benutzer wird zur Stornierung und Rückerstattung-Seite weitergeleitet
    Then der Benutzer klickt auf den Fußzeilenlink Kommunikationspräferenzen
    Then der Benutzer wird zur Kommunikationspräferenzen-Seite weitergeleitet
