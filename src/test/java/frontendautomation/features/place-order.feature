Feature: place order

  Scenario: add Items to cart
    Given I am on the demo web shop
    And I am logged in
    When I Navigate to desktops
    And I add product to cart
    Then the item is added to your cart
    When I click the checkout button
    Then checkout page is open
    When I enter the billing address
    And I select in store pickup
    And I enter Shipping address
    And I enter Shipping method
    And I enter Payment method
    And I enter Payment information
    And I place the order
    Then the order is processed successfully
