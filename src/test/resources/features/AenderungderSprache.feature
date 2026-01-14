Feature: Aenderung der Sprache
@vad
  Scenario: user changes language at the Website
    Given user logs in with email "vadimdok1@gmail.com" and password "NewPassw0rd!23"
    When user clicks on the Language icon
    And user selects "Deutsch" from the language dropdown
    Then verify that the website language is changed to German