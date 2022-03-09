package crud.Oprations.With.BDD;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateProjectTest {
	
	@Test
	public void updateProjectTest() {
		
		JSONObject jobj=new JSONObject();
		jobj.put("createdBy", "Vikky R");
		jobj.put("projectName", "SDET_04.003");
		jobj.put("status", "On Going");
		jobj.put("teamSize", 9);
		
		given().contentType(ContentType.JSON).body(jobj)
		.put("http://localhost:8084/projects/TY_PROJ_804")
		.then().assertThat().statusCode(200).log().all();
		
	}

}
