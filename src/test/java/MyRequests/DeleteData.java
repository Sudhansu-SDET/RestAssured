package MyRequests;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DeleteData {

	@Test
	public void deleteTestData() {
	
		RequestSpecification request = RestAssured.given();
//
		//
		Response response  = request.delete("https://reqres.in/api/users/2");
		Assert.assertEquals(response.getStatusCode(), 204);
		
	}
	
	
	
}
