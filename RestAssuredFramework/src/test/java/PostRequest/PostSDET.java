package PostRequest;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class PostSDET {

	@Test
	
	void getrespone() {
		// TODO Auto-generated method stub

		RestAssured.baseURI="https://reqres.in/api";
		RequestSpecification httprequest = RestAssured.given();
		
		JSONObject requestparam = new JSONObject();
		
		requestparam.put("email", "eve.holt@reqres.in");
		requestparam.put("password", "pistol");
		
		httprequest.header("Content-type","application/json");
		
		httprequest.body(requestparam.toJSONString());	
		
		Response response = httprequest.request(Method.POST,"/register");
		
		String id = response.jsonPath().get("id");
		
		String ResponseBody = response.getBody().asString();
		
		int statuscode = response.getStatusCode();
		
		Assert.assertEquals(statuscode, 201);
		Assert.assertEquals(id, 4);
		
		System.out.println(ResponseBody);
		
		
	}

}
