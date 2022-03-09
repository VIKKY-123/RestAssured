package com.RMGYantra.Pathparameters;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GitHubParameters {
	
	@Test
	public void gitHubParameters() {
		
		given()
		.pathParams("username", "VIKKY-123")
		.queryParam("sort", "created")
		.when().get("https://api.github.com/users/{username}/repos")
		.then().log().all();
		
	}

}
