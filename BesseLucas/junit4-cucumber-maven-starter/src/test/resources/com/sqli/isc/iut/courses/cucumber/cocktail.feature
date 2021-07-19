#Author: Alicia Battikha

Feature: Cocktail Ordering
  As Mr Pignon, I want to offer a drink to Mr Leblanc 


   Scenario: create order
    Given Mr Pignon wants to buy a drink
    When an order is declared for Mr Leblanc
    Then there is no cocktail in the order

