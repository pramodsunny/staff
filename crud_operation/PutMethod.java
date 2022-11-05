package crud_operation;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutMethod {
	@Test
	public void putMethod() {
	
		baseURI = "http://localhost:8080";
		JSONObject object = new JSONObject();
		object.put("id", 2);
		object.put("name","pvaan");
		object.put("email", "pavanteja1223@gmail.com");
		object.put("password","Pavan@356");
		object.put("phone", 245767364);
		
		given()
		.contentType(ContentType.JSON)
		.body(object)
		
		.when()
		 .put("http://localhost:8080/staff/2")
		 
		 .then()
		 .assertThat().statusCode(200)
		 .log().all();		 
		
		
	}

}
