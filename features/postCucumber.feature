Feature: user is able update  data in the database by using post method

Scenario: user wants to post data into database
Given user want to pass  the data into database
When User want to pass data by using URI is " http://localhost:8080/staff"
Then User want to  validate status-line "HTTP/1.1 200"
And User want to validate status code 200
