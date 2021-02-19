Feature: As a user, I should be able to create a new contact and add the contact into a group under Contacts module
  @wip 	@MEET-134
  Scenario: Display all groups list under Contacts module
    Given the user login with valid credentials
    When the user click on "Contacts"
    Then the user should see contact list