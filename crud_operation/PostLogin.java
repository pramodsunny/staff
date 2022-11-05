package crud_operation;
import static org.hamcrest.Matchers.containsString;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostLogin {
	 
	@Test
	public void postLogin()
	{
	
		JSONObject object = new JSONObject();
		object.put("id",75);		
	    object.put("mail","abijith@gmail.com");
		object.put("password", "jiju");
		
		
		 given()
	        .contentType(ContentType.JSON)
	        .body(object)
	         
	        .when()
	        .post("/staff/login")
		
	        .then()
	        .assertThat().statusCode(200)
	        .log().all();
	        
		
		
		
	}

}
