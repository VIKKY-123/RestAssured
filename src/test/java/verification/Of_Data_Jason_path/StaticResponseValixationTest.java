package verification.Of_Data_Jason_path;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StaticResponseValixationTest {
	
	@Test
	public void staticResponseValixationTest() {
		
		String expData="SDET_004.04";
		
		Response rsps = RestAssured.get("http://localhost:8084/projects");
		
		String actData = rsps.jsonPath().get("[0].projectName");
		
		Assert.assertEquals(actData, expData);
		
	
	
	}
	
	

}
