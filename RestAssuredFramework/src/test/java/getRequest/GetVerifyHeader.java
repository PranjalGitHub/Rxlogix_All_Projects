package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class GetVerifyHeader {

	@Test
	
	void getrespone() {
		// TODO Auto-generated method stub

		RestAssured.baseURI="https://reqres.in/api/unknown";
		RequestSpecification httprequest = RestAssured.given();
		
		Response response = httprequest.request(Method.GET,"/2");
		
		String contenttype = response.header("Content-Type");
		
		Assert.assertEquals(contenttype, "application/json; charset=utf-8");
		
	}

}
