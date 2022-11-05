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

public class PostLogin {
	 RequestSpecification res ;
	  Response sun ;
	  ValidatableResponse validate;
	
	@Given("user is able to provide the data by id")
	public void user_is_able_to_provide_the_data_by_id() {
	    JSONObject obj = new JSONObject();
	    obj.put("email","abhi9876@gmail.com");
	    obj.put("password","Sh10");
	    
	           res = RestAssured.given();
	           res.body(obj);
	           res.contentType(ContentType.JSON);
	}

	@When("user provoids the data by using uri is {string}")
	public void user_provoids_the_data_by_using_uri_is(String strin) {
	                sun = res.post(strin);
	}

	@Then("users validates the status code is \\({int})")
	public void users_validates_the_status_code_is(Integer int1) {
		     validate = sun.then();
		     validate.assertThat().statusCode(int1).log().all();
	     
	}

}
