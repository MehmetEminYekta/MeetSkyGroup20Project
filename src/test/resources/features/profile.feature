Feature:As a user, I should be able to change profile info
	@hiltas	@MEET-122
	Scenario: User display profile info
		Given the user login with valid credentials
		When the user click on "Settings"
		Then user should see profile info