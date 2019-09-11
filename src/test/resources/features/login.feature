Feature: Login
  Scenario: Login as registered user
    Given I go the login page
    When I fill the login form with "email" and "password"
    Then Username should appear in the profile

