package crud.Oprations.With.BDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetProjectsTest {
	
	@Test
	public void getProjectTest() {
		
		when().get("http://localhost:8084/projects")
		.then().assertThat().statusCode(200).log().all();
	}

}
