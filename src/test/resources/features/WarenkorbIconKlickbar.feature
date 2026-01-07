Feature: Warenkorb Icon ist klickbar

  Scenario: user logs in with own email
    Given user logs in with email "blagojaan@yahoo.com" and password "Test12345678@"
    When user clicks on the Warenkorb icon
    Then verify the Warenkorb page is displayed