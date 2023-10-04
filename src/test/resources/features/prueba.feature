#Autor: Jaime Torres

  @UserHistory
Feature: Register a new user on the page PRODUCT STORE and make a purchase by adding products to the cart
    I as a client want to enter the page to register and make a purchase

  @CaseRegister
Scenario: Register on the page PRODUCT STORE
    Given That Jaime enters the page product store
    When Register with credentials
    Then Login with your registration credentials
    Then Verify that Sign up successful

    @CasePurchase
    Scenario: make a purchase on the page PRODUCT STORE
      Given That Jaime enters the page product store
      When Login with your registration credentials
      Then Select cell phones, laptops, monitors and add the products to the cart
      Then Place an order and buy the products