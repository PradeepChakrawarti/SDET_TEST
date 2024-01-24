#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: heroku login

  @tag1
  Scenario: Validate userName password and login functionality
    Given Open the browser Enter the URL
    And Make sure url is correct
    When Enter user name
    And Enter User password
    And Click on login
    Then User Successfully log in
    And Home page Should display
   # Examples: 
   #   | name  | value | status  |
   #   | name1 |     5 | success |
   #   | name2 |     7 | Fail    |
