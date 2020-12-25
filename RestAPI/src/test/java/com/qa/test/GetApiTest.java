package com.qa.test;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.client.RestClient;

public class GetApiTest extends TestBase{
	public GetApiTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}


	TestBase testbase;
	String serviceurl;
	String apiurl;
	String url;
	RestClient restclient;
	CloseableHttpResponse closeablehttpresponse;
	@BeforeMethod	
	public void setup() throws IOException {
		
		TestBase testbase = new TestBase();
		 serviceurl = prop.getProperty("URL");
		 apiurl = prop.getProperty("serviceurl");
		 url = serviceurl+apiurl;
	
	}
	
	
	@Test
	public void getApiTest() throws ClientProtocolException, IOException {
		
		restclient = new RestClient();
		closeablehttpresponse = restclient.get(url);
		//a.Status code
		int statuscode = closeablehttpresponse.getStatusLine().getStatusCode();
		System.out.println("Status code----->"+statuscode);
		
		Assert.assertEquals(statuscode, "200", "Status code is not 200");
		
		//b. JSON String
		String responseString = EntityUtils.toString(closeablehttpresponse.getEntity(),"UTF-8");
		JSONObject responseJson = new JSONObject(responseString);
		System.out.println("Response JSON from API"+responseJson);
		
		//c. All headers
		Header[] headersArray = closeablehttpresponse.getAllHeaders();
		
		
		HashMap<String, String> allHeaders = new HashMap<String, String>();
		
		
		for (Header header :headersArray) {
			allHeaders.put(header.getName(), header.getValue());
	}
	
	
	

}
