package com.Authentication;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Preemptive_disgistive_Auth_test {
	
	@Test
	public void pre_Test() {
		
//		given().auth().preemptive()
//		.basic("rmgyantra", "rmgy@9999")
//		.when().get("http://localhost:8084/login")
//		.then()
//		.assertThat()
//		.statusCode(202)
//		.and()
//		.contentType(ContentType.JSON).log().all();
//		
		
		given().auth().preemptive().basic("rmgyantra", "rmgy@9999").when().get("http://localhost:8084/projects").then().assertThat().statusCode(200);
	}
	
	
	@Test
	public void disg_test() {
		given().auth().digest("rmgyantra", "rmgy@9999")
		.when().get("http://localhost:8084/login")
		.then()
		.assertThat()
		.statusCode(202)
		.and()
		.contentType(ContentType.JSON).log().all();
	}

}
