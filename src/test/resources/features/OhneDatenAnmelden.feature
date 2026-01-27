Feature: User Login without Data

  Scenario: user logs in with own email
    Given user logs in with email "" and password ""
    Then verify that appropriate error messages are displayed for missing email and password
