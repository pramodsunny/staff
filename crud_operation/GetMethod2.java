package crud_operation;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetMethod2 {

	@Test
	
	public void getMethod2() {
		
		 baseURI = "http://localhost:8080";
		 when()
		 .get("/staff/2")
		 
		 .then()
		 .assertThat().statusCode(200)
		 .log().all();
	}
}
