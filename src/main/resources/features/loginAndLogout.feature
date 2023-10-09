Feature: Login into the admin site

  @Farah
  Scenario: As a admin user I want to login into the admin portal
    Given The user navigate to login page
    When Enter creds
    And Click Login
    And User should see the dashboard page
    Then Logout