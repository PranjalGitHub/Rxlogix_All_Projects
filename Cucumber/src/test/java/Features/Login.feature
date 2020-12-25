Feature: Application login


Scenario: Home page default login
Given User is on netbanking landing page
When User login with username and password
Then Home page is populated
And Cards are displayed