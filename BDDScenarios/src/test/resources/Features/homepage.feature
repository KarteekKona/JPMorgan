Feature: This feature is to test J. P. Morgan home page
  
  			In this feature we test J.P. Morgan Homepage where we open first link from  
  google search results.

  Background: Open the browser before executing scenarios
    Given Browser is open

  @SmokeTest @LogoValidation
  Scenario Outline: Validate J. P. Morgan logo is displayed on homepage
    Given user is on google search page
    When user enters <text> in Search Box and hits enter
    And user clicks the first result returned by google
    Then check J. P. Morgan logo availability in the homepage

    Examples: 
      | text         |
      | J. P. Morgan |
      | JP Morgan    |
