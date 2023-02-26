package testsBack;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class Get extends BaseTest {

    @Test

    public void getTest (){
        given()
                .contentType(ContentType.JSON)
                .when()
                .get("localization")
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);






    }
}
