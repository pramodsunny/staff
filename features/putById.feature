 Feature: user is able login into staff administrator	 by using put method
 
# @Execute
Scenario: user wants to update data into databse
Given user is able to update the data into database
When user is able to update the data by using URI is "http://localhost:8080/staff/3"
Then User is able to validate the statusline "HTTP/1.1 200"
And users validates the statuscode is 200
 