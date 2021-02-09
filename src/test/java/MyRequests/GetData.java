package MyRequests;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class GetData {

	@Test
	public void getResponseCode() {
	
//		Response resp = get("https://reqres.in/api/unknown/2");// response body is returned
//		int statusCode = resp.getStatusCode();
		
		int statusCode  = get("https://reqres.in/api/unknown/2").getStatusCode();
		
		System.out.println("Status code is " + statusCode);
		Assert.assertEquals(statusCode, 200);

	
	}
	
	@Test
	public void getResponseBody() {
//	
//		Response resp = get("https://reqres.in/api/unknown/2");
//		
//		String fullBodyData = resp.asString();
	
		String fullBodyData = get("https://reqres.in/api/unknown/2").asString();
		
		System.out.println("Full body data is " + fullBodyData);
		

	}
	
}
