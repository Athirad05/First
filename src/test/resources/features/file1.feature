Feature: Casual dress to checkout
  Scenario: Casual to checkout
    Given The user is on the Homepage
    When The User click the dress option
    Then the user click the casual dress option
    And the user click the pinted dress
    And the user click and to trolly and proceed to checkout
    Then the user delet the selected dress from cart
