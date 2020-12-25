package getRequest;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class GetRequestBDD {

	@Test
	public void getRequest() {
		// TODO Auto-generated method stub
		
		given()
		.when()
				.get("https://reqres.in/api/users")
		.then()
		.statusCode(200)
		.statusLine("ss")
		.
		
		
		
		
		
	}

}
