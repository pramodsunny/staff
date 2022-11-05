package crud_operation;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteMethod {
	@Test
	
        public void deleteMethod() {
		
		baseURI = "http://localhost:8080";
		when()
		.delete("http://localhost:8080/staff?id=7")
		
		.then()
		.assertThat().statusCode(404)
		.log().all()
;		
		
        }	
		
		
		
		
	}


