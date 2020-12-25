package SDET;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostData {

	
	@Test
	void getdata()
	{
		RestAssured.baseURI = "https://reqres.in/api";
		
		RequestSpecification httprequest = RestAssured.given();
		
		JSONObject payload = new JSONObject();
		payload.put("name", "morpheus");
		payload.put("job", "leader");
		
		httprequest.header("Content-type","application/json");
		
		httprequest.body(payload.toJSONString());
		Response response = httprequest.request(Method.POST,"/users");
		
		
		String responsebody = response.getBody().asString();
		
		System.out.println(responsebody);
		Assert.assertEquals(response.getStatusCode(),200);
		String statusline = response.getStatusLine();
			
	
}
}