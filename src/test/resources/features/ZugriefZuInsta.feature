Feature: Instagram Icon is clickable

  Scenario: user logs in with own email
    Given user logs in with email "vadimdok1@gmail.com" and password "jTa5]zp}En->Ef!"
    When user clicks on the Instagram icon
    Then verify that Instagram page is opened