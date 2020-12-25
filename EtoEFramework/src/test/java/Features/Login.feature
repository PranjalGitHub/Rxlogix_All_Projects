Feature: Login to application 

Scenario Outline: Positive test validating login
Given Initialize the browser with chrome
And Navigate to "http://qaclickacademy.com"
And Click on login link to navigate to login page
When User enters <username> and <password> and logs in
Then Verify that user is successfully logged in
And Close all the browsers

Examples:
|username	|password	|
|test1		|12345		|
|test2		|4321		|