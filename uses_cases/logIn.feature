Feature: logIn feature

  # The first example has two steps
Scenario: User can login
	Given I have the following users in my clinic by list
	  | user12 | 12admina| 3    |
	  | uu2020 | gge123yy| 3    |
	  | 1111   | wefr5563| 2    |
	  | 2364   | qwerthhb| 2    |
	  | 1      | admin   | 1    |	
	And that the user is not logged in
	And the id is "user12" and password is "12admina"
	Then the admin login succeeds
	And the admin is logged in

Scenario: User has the wrong password
	Given I have the following users in my clinic by list
	  | user12 | 12admina| 3    |
	  | uu2020 | gge123yy| 3    |
	  | 1111   | wefr5563| 2    |
	  | 2364   | qwerthhb| 2    |
	  | 1      | admin   | 1    |	
	And that the user is not logged in
	And the id is "1o0100" and password is "12ad34"
	Then the user login fails
	And the user is not logged in
		
Scenario: User can login
	Given I have the following users in my clinic by list
	  | user12 | 12admina| 3    |
	  | uu2020 | gge123yy| 3    |
	  | 1111   | wefr5563| 2    |
	  | 2364   | qwerthhb| 2    |
	  | 1      | admin   | 1    |		
	And that the user is not logged in
	And the id is "1" and password is "admin"
	Then the admin login succeeds
	And the admin is logged in

Scenario: User can login
	Given I have the following users in my clinic by list
	  | user12 | 12admina| 3    |
	  | uu2020 | gge123yy| 3    |
	  | 1111   | wefr5563| 2    |
	  | 2364   | qwerthhb| 2    |
	  | 1      | admin   | 1    |		
	And that the user is not logged in
	And the id is "2364" and password is "qwerthhb"
	Then the admin login succeeds
	And the admin is logged in
	