package com.Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class OAuth_Test {
	
	@Test
	public void oAuth_Test() {
		
		Response rsps = given().formParam("client_id", "vikky")
		.formParam("client_secret", "542c336d0e01c2f1599f5de7817d23ca")
		.formParam("grant_type", "client_credentials")
		.formParam("redirect_uri", "https://example.com")
		.when().post("http://coop.apps.symfonycasts.com/token");
		
		rsps.prettyPrint();
		String token = rsps.jsonPath().get("access_token");
		System.out.println(token);
		
		given().pathParam("USER_ID", 2851)
		.auth().oauth2(token)
		.when().post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-collect")
		.then()
		.log()
		.all();
		
	}

}
