package authenication;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
public class BasicAuth {

@Test

public void basicAuth()
{
	baseURI = "https://github.com/";
	
	given().auth().basic("pramodsunny","Sss@1432")
	.when().get("/login")
	.then().log().all();
	
}
	
}
