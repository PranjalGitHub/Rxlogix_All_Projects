package getRequest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class GetSDET {

	@Test
	
	void getrespone() {
		// TODO Auto-generated method stub

		RestAssured.baseURI="https://reqres.in/api/users";
		RequestSpecification httprequest = RestAssured.given();
		
		Response response = httprequest.request(Method.GET,"/2");
		
		String ResponseBody = response.getBody().asString();
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 200);
		
		System.out.println(ResponseBody);
		
				
		
		
		
		
		
	}

}
