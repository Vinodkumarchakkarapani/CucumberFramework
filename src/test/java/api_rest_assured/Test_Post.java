package api_rest_assured;

import java.util.HashMap;
import java.util.Map;

import org.bson.json.JsonObject;
import org.json.simple.JSONObject;
//import org.bson.json.JsonObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
//import com.google.gson.JsonObject;

//import io.cucumber.messages.internal.com.google.gson.JsonObject;

//import com.google.gson.JsonObject;

public class Test_Post {

	//@Test
	public void test_post() {
		// Map<String, Object> map=new HashMap<String, Object>();
		/*
		 * map.put("name", "Raghav"); map.put("Job","Teacher"); System.out.println(map);
		 */
	
	JSONObject request=new JSONObject(); 
	request.put("name", "Vinod");
	request.put("Job","Professor");
	
	
	
	System.out.println(request);
	System.out.println(request.toJSONString());
	
	given().header("Content_Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
	.body(request.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201);
	}
	//@Test
	public void test_put() {
		
	
	JSONObject request=new JSONObject(); 
	request.put("name", "Raghav");
	request.put("Job","Teacher");
	
	
	
	System.out.println(request);
	System.out.println(request.toJSONString());
	
	given().header("Content_Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
	.body(request.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();
	}
	//@Test
	public void test_patch() {
		
		
		JSONObject request=new JSONObject(); 
		request.put("name", "Raghav");
		request.put("Job","Teacher");
		
		
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().header("Content_Type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(request.toJSONString()).when().patch("https://reqres.in/api/users/2").then().statusCode(200).log().all();
		}
	@Test
public void test_Delete() {
		
		
		when().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
		}
}
