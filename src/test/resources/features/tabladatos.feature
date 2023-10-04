#Autor: Jaime Torres

  @UHDataTable
  Feature: Verify correct login on the page product store and make a purchase by adding prod<ucts to the cart
    I as a client want to enter the page to register and make a purchase

    @CaseDataDriven
    Scenario Outline: Verify correct login
    Given That Jaime enters the page product store
    When Login with <user> and <password>
      Examples:
        | user    | password   |
        | Userr1  | 123456     |
        | Userr2  | 123456     |
        | Userr3  | 123456     |
        | Userr4  | 123456     |