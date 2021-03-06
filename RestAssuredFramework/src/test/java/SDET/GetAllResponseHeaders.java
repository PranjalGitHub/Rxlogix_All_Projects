package SDET;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllResponseHeaders {

	
	@Test
	void getdata()
	{
		RestAssured.baseURI = "https://reqres.in/api/unknown";
		
		RequestSpecification httprequest = RestAssured.given();
		
		Response response = httprequest.request(Method.GET, "/2");
		
		String responsebody = response.getBody().asString();
		
		Headers allheader = response.headers();
		
		for( Header header:allheader)
			System.out.println(header.getName()+" ---->  "+header.getValue());
		
}
}