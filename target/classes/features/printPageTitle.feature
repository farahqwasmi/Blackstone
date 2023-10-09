Feature: Login into the admin site and print page title

  @Farah
  Scenario: As a admin user I want to login into the admin portal
    Given The user navigate to login page
    When Enter creds
    And Click Login
    And User should see the dashboard page
    And Print page title
    Then Logout
