Feature: User trys to add an already selected product one more time to their wish list
  @vad
  Scenario: user can not to add already selected product to Wishlist one more time
    Given user logs in with email "vadimdok1@gmail.com" and password "NewPassw0rd!23"

    When user goes back to the Oils category
    And user choose San Martino Olive Oil one more time
    And user clicks on the Add to Wishlist icon one more time
    Then verify that the San Martino Olive is not added to the Wishlist one more time