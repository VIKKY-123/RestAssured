package com.RMGYantra.ReqChaining;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RequestChaining {
	
	@Test
	public void requestChaining() {
	
	Response rsps = RestAssured.get("http://localhost:8084/projects");
	
	String proId = rsps.jsonPath().get("[2].projectId");
	
	System.out.println(proId);
	
	given().pathParam("proid", proId).when().delete("http://localhost:8084/projects/{proid}")
	.then().assertThat().statusCode(204).log().all();
	
	
	
	}
	

}
