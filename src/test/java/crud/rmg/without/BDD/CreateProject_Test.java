package crud.rmg.without.BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CreateProject_Test {
	
	@Test
	public void createProject_Test() {
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Sruthi R");
		jobj.put("projectName", "SDET_004");
		jobj.put("status", "On Going");
		jobj.put("teamSize", 9);
		
		RequestSpecification reqSpe = RestAssured.given();
		
		reqSpe.contentType(ContentType.JSON);
		reqSpe.body(jobj);
		
		Response resp = reqSpe.post("http://localhost:8084/addProject");
		
		ValidatableResponse vresp = resp.then();
		vresp.assertThat().statusCode(201);
		vresp.log().all();
		
		
	}

}
