package MyRequests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutData {

	@Test
	public void puttestData() {
	
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		
		JSONObject json = new JSONObject();
		json.put("name","spdel");
		
		request.body(json.toJSONString());
		
		Response response  = request.put("https://reqres.in/api/users/2");
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertTrue(response.getBody().asString().contains("spdel"),"name mismatch");
	}
	
	
	
}
