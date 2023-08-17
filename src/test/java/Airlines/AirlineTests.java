package Airlines;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AirlineTests {

@Test
    public void createAirline(){

    RestAssured.given().log().all()
            .baseUri("https://reqres.in/api/users")
            .contentType(ContentType.JSON)
            .body("{\n" +
                    "    \"name\": \"morpheus\",\n" +
                    "    \"job\": \"leader\"\n" +
                    "}")
            .post();


    }
}
