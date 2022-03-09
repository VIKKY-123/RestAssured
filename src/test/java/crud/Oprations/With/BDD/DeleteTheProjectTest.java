package crud.Oprations.With.BDD;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class DeleteTheProjectTest {
	
	@Test
	public void deletetheProjectTest() {
		when().delete("http://localhost:8084/projects/TY_PROJ_615")
		.then().assertThat().statusCode(204).log().all();
		
		
	}

}
