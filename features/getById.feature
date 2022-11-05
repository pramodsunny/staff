 Feature: user is able to fetch all the data from database by using ID
 
  Scenario: user wants to retrive the data from database by using ID
    When user want to retrive the id by using an api is "http://localhost:8080/staff/2"
    Then user validate the status code od id  is (200)