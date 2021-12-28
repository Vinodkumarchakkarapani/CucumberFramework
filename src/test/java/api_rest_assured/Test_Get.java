package api_rest_assured;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Test_Get {
@Test
	public void rest_get() {
	given()
			/*
			 * .header("Content_Type","application/json"). param(parameterName,
			 * parameterValues)
			 */
	
	.get("https://reqres.in/api/users?page=2").then().statusCode(200)
	.body("data.id[1]", equalTo(8)).body("data.first_name", hasItems("Michael","Lindsay"));
	//.log().all();
}
}
