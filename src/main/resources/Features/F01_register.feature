
Feature: testing register functionality
  #positive scenario
  @smoke
  Scenario Outline: User able to register with valid data
    Given User is on homepage
    When User click on regiter link
    And User select gender type male
    And User enter fist name "<fistName>"
    And User enter last name "<lastName>"
    And User Select Day "<day>"
    And User Select Month "<month>"
    And User Select year "<year>"
    And User enter emaail "<email>"
    And User enter password "<password>"
    And User enter confirmPassword "<conPassword>"
    And User click on register button
    Then User register successfully with new account
    Examples:
      | fistName | lastName | day | month | year | email | password | conPassword |
       |aa        |aaaaa     |1    |1      |1991  |aa1s@gmail.com|123456|123456      |
