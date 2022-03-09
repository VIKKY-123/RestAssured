package com.RMGYantra.END_END_TEST;

import static io.restassured.RestAssured.given;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.crm.RMGYantra.GenericUtil.BaseAPI_Class;
import com.crm.RMGYantra.GenericUtil.EndPoints;
import com.crm.RMGYantra.GenericUtil.JavaUtility;
import com.rmg.POJOClass.POJOClass;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Task_001test extends BaseAPI_Class implements EndPoints {

	

	
	

	@Test
	public void create_project() throws SQLException  {

		//Create the Projecet

		POJOClass pojo=new POJOClass("DIVYA_001", "Sdet_"+JavaUtility.RandomNumber(),"completed",8);



		Response rsps = given().contentType(ContentType.JSON)
				.body(pojo).when().post("http://localhost:8084/addProject");
				String proId=rsps.jsonPath().get("projectId");
		System.out.println(proId);

		//Upadte the Project
		POJOClass pjo=new POJOClass("DIVYA_0222", "TYSS_"+JavaUtility.RandomNumber(),"completed",8);

		given().contentType(ContentType.JSON).body(pjo).when()
		.pathParam("projectId",proId).put("http://localhost:8084/projects/{projectId}");
	

		//Validation of project


		Response reps1 =given().pathParam( "projectId",proId).when().get("http://localhost:8084/projects/{projectId}");
		String jsonpath=reps1.jsonPath().get("projectId");
		
		

			//verify the Data Base
	
		ResultSet result = dutil.ExecuteQuery("select * from project;");

		while(result.next())
		{
			String actualData = result.getString(1);
			if(actualData.equals(jsonpath)) {
				System.out.println(jsonpath +" is present");
				break;
			}

		}

	}
}




