package api_rest_assured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class Rest_API {
@SuppressWarnings("deprecation")
@Test
	void Test_Get() {
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println(response.asString()); 
		System.out.println(response.getBody().asString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getSessionId());
		System.out.println(response.getHeader("content-type"));
		System.out.println(response.getTime());
int statuscode=response.getStatusCode();
Assert.assertEquals(statuscode, 200);
}
}
