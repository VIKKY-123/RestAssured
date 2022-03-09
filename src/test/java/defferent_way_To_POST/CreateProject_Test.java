package defferent_way_To_POST;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateProject_Test {
	
	@Test
	public void createProject_Test() {
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Sruthi R");
		jobj.put("projectName", "SDET_04.01");
		jobj.put("status", "On Going");
		jobj.put("teamSize", 9);
		
		
		given().contentType(ContentType.JSON)
		.body(jobj).post("http://localhost:8084/addProject").then().assertThat().statusCode(201).log().all();
	}

}
