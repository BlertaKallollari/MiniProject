Feature: CommercialFeature


  Scenario Outline: Register functionality
    Given Browser is open in CommercialPage
    And You click login Button and  click register Button
    And you select gender <gender>
    And you enter <firstname> in firstName Field and lastName Field <lastname>
    And you select "14" as birthDay
    And you select "April" as birthMonth
    And you select "1996" as birthYear
    And you enter <email> in email Field and companyName Field <company>
    And you enter <password> in password Field and confirmPass Field <password>
    When You click registerAccount Button
    And verify Result is displayed
    Then log Out Button click
    And Close the browser

    Examples:
      | firstname  | lastname      | email                        | password  |  gender |  company     |
      | Blerta     | Kallollari    | kallollariblerta@gmail.com   | blerta123 |    F    |  Lufthansa   |





  Scenario Outline: Login functionality
    Given Browser is open in CommercialPage
    And Click in LoginButton and enter email <email> and password <password>
    When We verify loginPage
    Then Log out button should exist
    And Close the browser

    Examples:
      | email                       | password  |
      | kallollariblerta@gmail.com  | blerta123 |





  Scenario Outline: MyAccount Functionality
    Given Browser is open in CommercialPage
    And Click in LoginButton and enter <email> and password <password>
    And Click to MyAccount Button and check the title
    And Verify gender <gender>
    And Verify selected birthDay <14>, selected birthMonth <April> and selected birthYear <1996>
    And Verify firstName <firstname>, lastName <lastname> and email <email>
    And Verify companyName <company>
    Then Click Log out Button
    And Close the browser

    Examples:
      | firstname  | lastname      | email                         | password  |  gender |  company     |
      | Blerta     | Kallollari    | kallollariblerta@gmail.com    | blerta123 |    F    |  Lufthansa   |





  Scenario Outline: Dashboard Functionality
    Given Browser is open in CommercialPage
    And Click in LoginButton and enter <email> and password <password>
    And Hover ComputerMenu and click Notebook
    And Check title of web page, display size "9" and check items displayed of webpage "6"
    And Check the memory "16 GB"
    And Check item displayed "1" and uncheck memory "16 GB"
    And Check items displayed of webpage "6"
    And Add Item to wishList "2" and "3"
    And Add Item to shoppingCart "4", "5" and "6"
    And Check Qty cart "3" and Qty wishList "2"
    And Close the browser

    Examples:
      | email                        | password  |
      | kallollariblerta@gmail.com   | blerta123 |





  Scenario Outline: ShoppingCart Functionality
    Given Browser is open in CommercialPage
    When Click in LoginButton and enter <email> and password <password>
    And Hover ShoppingCart Menu and verify GoToCart button
    And Check the title of the web page
    And Verify if the buttons are displayed
    And Check the subTotal price of items
    And Close the browser

    Examples:
      | email                         | password  |
      | kallollariblerta@gmail.com    | blerta123 |





    Scenario Outline: EmptyShoppingCart Functionality
      Given Browser is open in CommercialPage
      When Click in LoginButton and enter <email> and password <password>
      And Remove items from ShoppingCart
      Then Click log out Button
      And Close the browser

      Examples:
        | email                        | password  |
        | kallollariblerta@gmail.com   | blerta123 |

