package crud_operation;
import static org.hamcrest.Matchers.equalTo;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PostMethod {
	
	@Test
	public void postMethod()
	{
		JSONObject object=new JSONObject();
		object.put("name", "abijith");	
        object.put("id", 88);
        object.put("email", "abi234@gmail.com");	
        object.put("owner_id", "125");
        object.put("password", "Sh10");	
        object.put("phone", "9875422776");
        
        
        
        given()
        .contentType(ContentType.JSON)
        .body(object)
         
         .when()
         .post("http://localhost:8080/staff")
         
         .then()
         .assertThat().statusCode(200).body("data.email",equalTo("abi234@gmail.com"))
         
         .log().all();
      
	}

}
