Feature: Log In 
Scenario: Successful Login with Valid Credentials
	Given the user is at the login screen
	When the user enters a valid username and password
	And the user clicks on the sign in button
	Then the user will successfully log in
