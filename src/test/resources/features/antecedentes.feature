#Autor: Jaime Torres

  @UHBackground
  Feature: Register a new user on the page product store and make a purchase by adding products to the cart
    I as a client want to enter the page to register and make a purchase

    Background:
      Given That Jaime enters the page product store

    @CaseRegisterBackground
    Scenario: Register on the page PRODUCT STORE
      When Register with credentials

      @CaseLoginBackground
      Scenario: Login on the page PRODUCT STORE
        Then Login with your registration credentials
        Then Verify that Sign up successful

        @CaseMakePurchase
        Scenario: make a purchase on the page PRODUCT STORE
          When Login with your registration credentials
          Then Select cell phones, laptops, monitors and add the products to the cart
          Then Place an order and buy the products