package defferent_way_To_POST;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

import java.io.File;

public class Create_Project_using_JSONFile {
	
	@Test
	public void create_Project_using_JSONFile() {
		File f= new File("./ProjectData.json");
		
		given().contentType(ContentType.JSON).body(f).post("http://localhost:8084/addProject")
		.then().assertThat().statusCode(201).log().all();
	}

}
