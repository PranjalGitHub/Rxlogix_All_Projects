package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class GetData {
	
	@Test
	public void testResponseCode() {
		int statuscode = get("https://reqres.in/api/users?page=2").getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);
	}
@Test
public void testResponse() {
	String data = get("https://reqres.in/api/users?page=2").asString();
	if(data.contains("Lindsay"))
	Assert.assertTrue(true);
	else Assert.assertTrue(false);
}
@Test
public void testTime() {
	long time = get("https://reqres.in/api/users?page=2").getTimeIn(TimeUnit.SECONDS);
	if(time < 1)
		Assert.assertTrue(true);
		else 
			Assert.assertTrue(false);
}
}