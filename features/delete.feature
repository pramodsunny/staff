 Feature: user is able to delete  staff data from database

  Scenario: user wants to delete the data from database
    When user is able to delete the id by using an api is "http://localhost:8080/staff?id=15"
    Then user is validate the status code of the staff id is (200)