 Feature: user is able to fetch all the data from database

  Scenario: user wants to retrive the data from database
    When user is able to retrive the id by using an api is "http://localhost:8080/staff"
    Then user validate the status code of the id is (200)