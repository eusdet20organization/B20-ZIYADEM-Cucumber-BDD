Feature: Wishlist Icon is clickable
  Scenario: user can add product to Wishlist
    Given user logs in with email "vadimdok1@gmail.com" and password "NewPassw0rd!23"
    When user selects the category Oils
    And user choose San Martino Olive Oil
    And user clicks on the Add to Wishlist icon
    And user clicks on the Wishlist icon and goes to the Wishlist page
    Then verify that the San Martino Olive was added at Wishlist page