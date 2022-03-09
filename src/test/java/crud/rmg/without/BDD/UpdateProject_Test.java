package crud.rmg.without.BDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class UpdateProject_Test {
	
	@Test
	public void updateProjectTest() {
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "VIKKY R");
		jobj.put("projectName", "SDET_005");
		jobj.put("status", "On Going");
		jobj.put("teamSize", 9);
		
		RequestSpecification reqSpe = RestAssured.given();
		
		reqSpe.contentType(ContentType.JSON);
		reqSpe.body(jobj);
		
		Response resp = reqSpe.put("http://localhost:8084/projects/TY_PROJ_802");
		
		ValidatableResponse vresp = resp.then();
		vresp.assertThat().statusCode(200);
		vresp.log().all();
		
	}

}
