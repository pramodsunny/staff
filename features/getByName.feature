 Feature: user is able to fetch all the data from database by using Staff Name
@getbyname
  Scenario: user wants to retrive the data from database by using Staff Name
    When user want to retrive data by using an api is "http://localhost:8080/staff/name/Shraddha"
    Then user validate the status code id  is (200)