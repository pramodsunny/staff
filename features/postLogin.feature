 Feature: user is able login into staff administrator	 by using post method

Scenario: user wants to login into staff administrator the by using post method
Given user is able to provide the data by id
When user provoids the data by using uri is "http://localhost:8080/staff/login"
Then users validates the status code is (200)
 