package PostRequest;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class PostData {

	@SuppressWarnings("unchecked")
	@Test
	public void test1() {
		RequestSpecification request = RestAssured.given();
		
		request.header("Content-Type", "applicatiion/json");
		
		
		
		JSONObject json = new JSONObject();
		json.put("id", "25");
		json.put("title", "Selenium WebDriver");
		json.put("author", "Learn Automation");
		
		request.body(json.toJSONString());
		
	Response response =request.post("http://localhost:3000/posts");
	int code = response.getStatusCode();
	Assert.assertEquals(code, 201);
	
	
	}


	
}
