Feature: Menge Erhöhen

  Scenario: user logs in with own email
    Given user logs in with email "blagojaan@yahoo.com" and password "Test12345678@"
    When hoveringr over auf Delikatessen und click on the Olivensorten
    And click on the fourth Prodact
    And uaer clicks on the In Warenkorb Button
    And user clicks on the Warenkorb Icon
    And user increases the quantity on two
    And user clicks on the Aktualisieren Button
    Then Verify that the product quantity is increased in the shopping cart.
