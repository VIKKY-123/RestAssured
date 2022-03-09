package hamcrestValidation;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class ValidateHamcrestTest {

	@Test
	public void validateHamcrestTest() {
		
		when().get("http://localhost:8084/projects")
		.then().assertThat().time(Matchers.lessThan(3000L), TimeUnit.MILLISECONDS)
		.assertThat().body("[1].projectName", Matchers.equalTo("SDET_-2050792609")).log().all();
	}
	
	
	
}
