package verification.Of_Data_Jason_path;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class DynamicResponseValidationTest {

	@Test
	public void dynamicResponseValidationTest() {

		String expData="SDET_4.40";

		Response rsps = RestAssured.get("http://localhost:8084/projects");
		
		List<String> allprojects=rsps.jsonPath().get("projectName");
		
		for(String project:allprojects) {
			
			if(project.equals(expData)) {
				System.out.println("Data is Present");
				break;
			}
		}
	}

}
