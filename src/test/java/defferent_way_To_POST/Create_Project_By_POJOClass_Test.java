package defferent_way_To_POST;

import static  io.restassured.RestAssured.*;

import java.util.Random;

import org.testng.annotations.Test;

//import com.rmg.POJOClass.POJOClass;

import io.restassured.http.ContentType;

public class Create_Project_By_POJOClass_Test {
	
	@Test
	public void create_Project_By_POJOClass_Test() {
		
		Random random=new Random();
		int randomint = random.nextInt();
		
//		POJOClass pojo=new POJOClass("R Vikky Nanda", "SDET_"+randomint, "completed", 8);
		
	//	given().contentType(ContentType.JSON)
//		.body(pojo).when().post("http://localhost:8084/addProject")
	//	.then().assertThat().statusCode(201).log().all();
	}

}
