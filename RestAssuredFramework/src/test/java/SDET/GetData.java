package SDET;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetData {

	
	@Test
	void getdata()
	{
		RestAssured.baseURI = "https://reqres.in/api/users";
		
		RequestSpecification httprequest = RestAssured.given();
		
		Response response = httprequest.request(Method.GET,"/2");
		
		
		String responsebody = response.getBody().asString();
		
		System.out.println(responsebody);
		Assert.assertEquals(response.getStatusCode(),200);
		String statusline = response.getStatusLine();
		
		
		
		
		
		
	
}
}