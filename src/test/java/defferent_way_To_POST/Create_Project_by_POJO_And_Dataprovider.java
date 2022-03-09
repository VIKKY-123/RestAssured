 package defferent_way_To_POST;

import static io.restassured.RestAssured.given;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rmg.POJOClass.POJOClass;

import io.restassured.http.ContentType;

public class Create_Project_by_POJO_And_Dataprovider {

	@Test(dataProvider = "dataprovider")
	public void create_Project_pojoAndDataprovider(String createdBy, String projectName, String status, int teamSize) {

		POJOClass pojo=new POJOClass(createdBy, projectName, status, teamSize);

		given().contentType(ContentType.JSON)
		.body(pojo).when().post("http://localhost:8084/addProject")
		.then().assertThat().statusCode(201).log().all();
	}

	@DataProvider
	public Object[][] dataprovider() {

		Object[] []  objarr= new Object[2] [4];


		objarr[0] [0]="Vikky";
		objarr[0] [1]="SDET_4.40";
		objarr[0] [2]="completed";
		objarr[0] [3]=5;

		objarr[1] [0]="Vikky";
		objarr[1] [1]="SDET_4.41";
		objarr[1] [2]="completed";
		objarr[1] [3]=9;
		
		return objarr;
	}

}
