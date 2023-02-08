@All
Feature: OrangeHRM

  Scenario: Validation of OrangeHRM login with valid credentials
    Given user is on the login page screen
    When user enters the credentials "Admin" and "admin123"
    Then user is able to see the username at top right corner
    When user licks on the logout button
    Then he is able to see login screen again