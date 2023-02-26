package testsBack;

import static io.restassured.RestAssured.baseURI;

public class BaseTest {

    public static void setup(){
        baseURI = "https://api.dev.glorycoin.co/";
    }
}
