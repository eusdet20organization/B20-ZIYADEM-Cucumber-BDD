Feature: Passwortänderung
@wip
  Scenario: user changes password
    Given user logs in with email "vadimdok1@gmail.com" and password "jTa5]zp}En->Ef!"
    When user clicks on the Profil icon
    And user clicks on the account details
    And user writes in the field current password his current password "jTa5]zp}En->Ef!"
    And user writes in the field new password his new password "NewPassw0rd!23"
    And user writes in the field confirm new password his new password "NewPassw0rd!23"
    And user clicks on the Save Changes button
    Then verify that the password change confirmation is displayed