package defferent_way_To_POST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.HashMap;

public class Create_Project_Using_HashMap {
	
	@Test
	public void create_Project_Using_HashMap() {
		
		HashMap hp=new HashMap();
		hp.put("createdBy", "Sruthi R");
		hp.put("projectName", "SDET_04.02");
		hp.put("status", "On Going");
		hp.put("teamSize", 9);
		
		given().contentType(ContentType.JSON).body(hp).post("http://localhost:8084/addProject")
		.then().assertThat().statusCode(201).log().all();
	}

}
