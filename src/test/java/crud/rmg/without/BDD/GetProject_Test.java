package crud.rmg.without.BDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetProject_Test {
	
	@Test
	
	public void getProjects_Test() {
		
		
		Response resp = RestAssured.get("http://localhost:8084/projects");
		//System.out.println(resp.asString());
		resp.prettyPrint();
		System.out.println(resp.getStatusCode());
		
		ValidatableResponse vresp = resp.then();
		
		
		
		vresp.assertThat().statusCode(200);
		
		vresp.log().all();
		
		
		
		
		
		
		
	}
	
	
	

}
