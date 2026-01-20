Feature: Navigationleiste test

  Scenario: Navigationleiste ist angezeigt
    Given  user logs in with email "blagojaan@yahoo.com" and password "Test12345678@"
    When user klick auf Delikatessen Seite
    Then verify that the Navigationleiste is displayed