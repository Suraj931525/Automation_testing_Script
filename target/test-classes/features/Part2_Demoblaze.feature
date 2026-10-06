@Part2
Feature: Demoblaze Product Purchase and Checkout

  Scenario: User selects product, completes purchase order, and logs out
    Given User selects a product and adds to cart
    When User navigates to cart and fills order details
    Then User completes purchase and logs out