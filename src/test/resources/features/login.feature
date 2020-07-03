 @lib_100 @login
Feature: Login
  As a user,
  I should be able to login

  @librarian   @staff
  Scenario: Login as an librarian
    Given I am on the login page
    When I login as a librarian
    Then  dashboard should be displayed

@student  @staff
  Scenario: Login as a student
    Given I am on the login page
    When I login as student
    Then  dashboard should be displayed

@admin
  Scenario: Login as an admin
    Given I am on the login page
    When I login as an admin
    Then  dashboard should be displayed
    Then  other page dashboard should be displayed








  # FORMAT --> CMD+SHIFT+L (MAC)
  # FORMAT --> CTRL+SHIFT+L   (WIN)

    #But  dashboard should be displayed


#     this is a comment

