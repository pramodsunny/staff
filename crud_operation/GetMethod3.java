package crud_operation;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

public class GetMethod3 {
	
	@Test
	public void getMethod3() {
		
		 baseURI = "http://localhost:8080";
		 when()
		 .get("/staff/name/pavan")
		 
		 .then()
		 .assertThat().statusCode(200)
		 .log().all();
	}

}
