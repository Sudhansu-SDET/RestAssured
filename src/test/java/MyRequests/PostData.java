package MyRequests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostData {

	@Test
	public void posttestData() {
	
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type","application/json");
		
		JSONObject json = new JSONObject();
		json.put("name","sudhansu");
		json.put("job","abcde");
		
		request.body(json.toJSONString());
		
		Response response  = request.post("https://reqres.in/api/users");
		Assert.assertEquals(response.getStatusCode(), 201);
	}
	
	
	
}
