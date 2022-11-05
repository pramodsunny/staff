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

public class PutById {
	
	RequestSpecification req;
	
	@Given("user is able to update the data into database")
	public void user_is_able_to_update_the_data_into_database() {
	    
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

	@When("user is able to update the data by using URI is {string}")
	public void user_is_able_to_update_the_data_by_using_uri_is(String string) {
	    
	}

	@Then("User is able to validate the statusline {string}")
	public void user_is_able_to_validate_the_statusline(String string) {
	    
	}

	@Then("users validates the statuscode is {int}")
	public void users_validates_the_statuscode_is(Integer int1) {
	    
	}
}
