@Wikipedia
Feature: Homepage Search

  Scenario Outline: Search with Some Text
    Given User navigate to the Wikipedia "<URL>"
    When User enter "<Text>"
    And User click the Search button
    Then User should be on "<Text>" Page

    Examples: 
      | Text                     |URL                          |
      | IBM                      |https://www.wikipedia.org    |
      | TCS                      |https://www.wikipedia.org    |
      
      
