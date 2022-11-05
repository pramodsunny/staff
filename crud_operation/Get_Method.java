package crud_operation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class Get_Method {

	@Test
	public void getMethod()
	{
		 baseURI = "http://localhost:8080";
		 when()
		 .get("/staff")
		 
		 .then()
		 .assertThat().statusCode(200)
		 .log().all();
	}
}
