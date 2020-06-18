Feature:


  Scenario: hgh kjhgghgjh
Given I access Users page as a librarian
And I click on Add User
And I save new user information with random email
And I click on Add User
When I try to add new with the same email
Then Add User dialog should still be open