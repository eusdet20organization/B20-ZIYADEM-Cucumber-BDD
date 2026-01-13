Feature: Logout Functionality

  Scenario: user logs out successfully
    Given user logs in with email "blagojaan@yahoo.com" and password "Test12345678@"
    When Hoveringr over  auf Mein Konto Icon und klick melde
    When klick auf Text Bestätigen und Abmelden
    Then verify that the user is logged out successfully

  Scenario: user logs sich nicht aus
    Given user logs in with email "blagojaan@yahoo.com" and password "Test12345678@"
    When user klick auf Zurück Schaltfläche des Browser
    Then verify that the user is still logged in