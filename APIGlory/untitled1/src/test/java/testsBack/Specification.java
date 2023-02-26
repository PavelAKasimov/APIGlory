package testsBack;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;


public class Specification extends BaseTest{


    public static RequestSpecification requestSpecification (){
        return new RequestSpecBuilder()
                .setBaseUri("https://api.dev.glorycoin.co/v1/")
                .setContentType(ContentType.JSON)
                .build();
    }
public static ResponseSpecification responseSpecification200(){
        return new ResponseSpecBuilder()
                .expectStatusCode(200)
                .build();
    }

    public static ResponseSpecification responseSpecification400 (){
        return new ResponseSpecBuilder()
                .expectStatusCode(400)
                .build();
    }
    public static void installSpecification (RequestSpecification request, ResponseSpecification response){
        RestAssured.requestSpecification = request;
        RestAssured.responseSpecification = response;
    }

}
