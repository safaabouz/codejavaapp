Feature: User logout

Scenario: User logs out
	Given that the User is logged in
	When the User logs out
	Then the User is not logged in