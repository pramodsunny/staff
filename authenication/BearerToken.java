package authenication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
public class BearerToken {

	@Test
	
	public void bearerToken()
	{
		baseURI = "https://api.github.com";
		
		JSONObject object = new JSONObject();
		object.put("name","staff");
		
		given().auth().oauth2("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")
		.body(object).contentType(ContentType.JSON)
		.when().post("/user/repos")
		.then().log().all();
		
	}
	
}
