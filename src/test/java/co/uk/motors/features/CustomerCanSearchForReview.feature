Feature: To Review Car Search
  As a customer
  I want the ability to search for any cars of my choice
  So that I can choose one to review


  Scenario Outline: Customer can Search for any car to review
    Given I navigate to Motors homepage
    When I select "<Make(Any)>" from any car make
    And I select "<Model(Any)>" from any car model
    And I click on VIEW REVIEW
    Then the search "<MODELREVIEW>" is displayed

    Examples:
      | Make(Any)|Model(Any)|MODELREVIEW  |
      |Bentley  |Bentayaga |  Show all   |
#     |Show all  |Show all  |£75,000      |No max       | Show all    |
#     |Show all  |Show all  |No min       |£169,950     | Show all    |
#    |Show all  |Show all  |£75,000      | £169,950    | Show all    |
#    |Bentley  |Bentayga   |£75,000      | £250,000   | Show all    |
#    |Aston Martin  |Vantage 8 |£154,950      | £169,950    | Show all    |
#    |BMW     |X6 |£40,000     | £75,000   | Show all    |
#    |Toyota  |Hilux  |£9,000     |£60,000    | Show all    |


  Scenario Outline: Error page is displayed for any car to buy search
    Given I navigate to Motors homepage
    When I enter "<PostCode>" into the search field
    And I select "<Make(Any)>" from any car make
    And I select "<Model(Any)>" from any car model
    And I select "<MinPrice(Any)>" from Min price
    And I select "<MaxPrice(Any)>" from Max price
    And I click on Search button
    Then an error page is displayed

    Examples:
      |PostCode | Make(Any)|Model(Any)|MinPrice(Any)|MaxPrice(Any)|CarLocation  |
      |OL10 3HL |Show all  |Show all  |£75,000      |£169,950     | Show all    |
#      |K1111KK |Show all  |Show all  |£75,000      |£169,950     | Show all    |

