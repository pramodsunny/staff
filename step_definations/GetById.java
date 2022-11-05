package step_definations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetById {
	Response res ;
	ValidatableResponse val ;
	
	@When("user want to retrive the id by using an api is {string}")
	public void user_want_to_retrive_the_id_by_using_an_api_is(String url) {
		res = RestAssured.get(url);  
	}

	@Then("user validate the status code od id  is \\({int})")
	public void user_validate_the_status_code_od_id_is(Integer int1) {
		 val = res.then();
		  val.assertThat().statusCode(int1).log()
	.all(); 
	}


	
}
