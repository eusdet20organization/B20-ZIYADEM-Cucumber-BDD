Feature: Warenkorb Icon ist klickbar

  Scenario: user logs in with own email
    Given user logs in with email "blagojaan@yahoo.com" and password "Test12345678@"
    When user clicks on the Warenkorb icon
    Then verify the Warenkorb page is displayed

    Scenario: nach hovering über Warenkorb Icon, Inchalt ist sichbar
      Given user logs in with email "blagojaan@yahoo.com" and password "Test12345678@"
      When hoveringr over auf Delikatessen und click on the Olivensorten
      And click on the fourth Prodact
      And uaer clicks on the In Warenkorb Button
      And user hovers over the Warenkorb icon
      Then verifiziert, dass Warenkorb Inhalt sicbar ist
