package crud.rmg.without.BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteProjectTest {
	
	@Test
	public void deleteprojectTest() {
		
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_202");
		ValidatableResponse vresp = resp.then();
		vresp.assertThat().statusCode(204);
		vresp.log().all();
		
	}

}
