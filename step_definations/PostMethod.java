package step_definations;

import org.json.simple.JSONObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;


public class PostMethod {
		
	RequestSpecification req;
	Response res;
	ValidatableResponse validate;
	
	@Given("user want to pass  the data into database")
	public void user_want_to_pass_the_data_into_database() {
	    
		JSONObject object= new  JSONObject();
		 object.put("id",1);
		 object.put( "name","mandara");
		 object.put( "email","mandara123@gmail.com");
		 object.put("password","mandy123");
		 object.put( "phone", "9404171422");
		 
		          req = RestAssured.given(); //  RequestSpecification req //
		         req.body(object);
		         req.contentType(ContentType.JSON);
	}

	@When("User want to pass data by using URI is {string}")
	public void user_want_to_pass_data_by_using_uri_is(String url) {
	    res = req.post(url);
	}

	@Then("User want to  validate status-line {string}")
	public void user_want_to_validate_status_line(String string) {
	    validate = res.then();
	}

	@Then("User want to validate status code {int}")
	public void user_want_to_validate_status_code(Integer code) {
	   validate.assertThat().statusCode(code);
	}
}
