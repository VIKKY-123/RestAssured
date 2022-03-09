package com.RMGYantra.Pathparameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class PathParameters {
	
	
	@Test
	public void pathParameters()
	
	{
		given().pathParam("projectId", "TY_PROJ_806")
		.when().get("http://localhost:8084/projects/{projectId}").then().log().all();
		
		
//		given().pathParam("projectname", "RMGYantra")
//		.when().get("http://localhost:8084/projects/{projectname}").then().log().all();
	}
	
	

}
