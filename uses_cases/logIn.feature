Feature: logIn

Scenario: Successfuly log in

Given that username is available 
And passowrd is correct
Then login succeeds

Scenario: Wrong Password

Given that username is correct
And passowrd is not correct
Then login fails wrong password

Scenario: Wrong username

Given that username is not correct
And passowrd is correct
Then login fails no user

Scenario: Wrong username and Wrong password

Given that username is not correct
And passowrd not is correct
Then login fails
