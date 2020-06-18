Feature: Page navigation links
  # login as librarian
  # click on the users link
  # verify page Users

  # login as librarian
  # click on the Books link
  # verify page Books
Background:
  Given I am on the login page
  And I login as a librarian


  @db
  Scenario: go to users page
    When I click on "Users" link
    Then "user" page should be displayed


  Scenario: Go to books page
    When I click on "Books" link
    Then "Books" page should be displayed


  Scenario: Go to dashboard page
    And I click on "Books" link
    When I click on "Dashboard" link
    Then "Dashboard" page should be displayed