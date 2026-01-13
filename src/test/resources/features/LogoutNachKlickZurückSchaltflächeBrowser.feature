Feature: Logout nach klick Zurück Schaltfläche des Browser
@baz
  Scenario: user logs sich nicht aus
    Given user logs in with email "blagojaan@yahoo.com" and password "Test12345678@"
    When user klick auf Zurück Schaltfläche des Browser
    Then verify that the user is still logged in
