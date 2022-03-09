package com.Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class BearerTocken {
	
	@Test
	public void bearerTocke() {
		
		given().auth().oauth2("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")
		.when().get("https://api.github.com/user/repos")
		.then().assertThat().statusCode(200).log().all();
	}

}
