package com.Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class Basic_Auth {
	
	@Test
	public void basic_auth() {
		
		given().auth().basic("rmgyantra", "rmgy@9999")
		.when().get("http://localhost:8084/login")
		.then().assertThat().statusCode(202).log().all();
	}

}
