package testsBack;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import utils.*;

import java.util.HashMap;

import static io.restassured.RestAssured.*;

public class userAuth extends BaseTest {

    HashMap<String, String> simpleData = new HashMap<>();
    DataGenerate dataGenerate = new DataGenerate();
    BodyUsers bodyUsers = new BodyUsers();
    String authToken;
    String loginToken;


    UserDataPojoFirst userDataPojoAuth1 = new UserDataPojoFirst(dataGenerate.getRandomEmail(), dataGenerate.getPasswordR(), "EUR", "https://mvnrepository.com/artifact/org.codehaus.groovy/groovy/3.0.14", "https://mvnrepository.com/artifact/org.codehaus.groovy/groovy/3.0.14", 3);
    UserDataPojoFirst userDataPojoLogin = new UserDataPojoFirst(userDataPojoAuth1.getLogin(), userDataPojoAuth1.getPassword());
    UserDataPojoFirst userDataPojoChangeEmail = new UserDataPojoFirst(userDataPojoLogin.getNewEmail(), userDataPojoAuth1.getPassword());
    UserDataChangePassword userDataChangePassword = new UserDataChangePassword(userDataPojoLogin.getPassword(), dataGenerate.getPasswordR());
    UserDataEditUser userDataEditUser = new UserDataEditUser(UserDataEditUser.generateRandomName(), UserDataEditUser.generateRandomBirthday());


    @Test(priority = 1)
    public void metGet() {
        Specification.installSpecification(Specification.requestSpecification(), Specification.responseSpecification200());
        given()
                .when()
                .get("games/categories")
                .then()
                .log()
                .all()
                .assertThat();
    }

    @Test(priority = 2)
    public void auth() {
        System.out.println("Starting auth() method...");
        ValidatableResponse response;
        Specification.installSpecification(Specification.requestSpecification(), Specification.responseSpecification200());
        response = RestAssured.given()
                .body(userDataPojoAuth1)
                .when()
                .post("auth/register/")
                .then()
                .log()
                .all()
                .assertThat();
        String token = response.extract().jsonPath().getString("authToken");
        dataGenerate.data.put("token", token);
        authToken = token;
        System.out.println("auth() method completed successfully.");


    }

    @Test(priority = 3)
    public void login() {
        Specification.installSpecification(Specification.requestSpecification(), Specification.responseSpecification200());
        System.out.println("Starting login() method...");
        ValidatableResponse response;
        response = RestAssured.given()
                .body(userDataPojoLogin)
                .when()
                .post("auth/login/")
                .then()
                .log()
                .all()
                .assertThat();
        String tokenLogin = response.extract().jsonPath().getString("authToken");
        loginToken = tokenLogin;
        System.out.println("login() method completed successfully.");

    }

    @Test(priority = 4)
    public void changeEmail() {
        Specification.installSpecification(Specification.requestSpecification(), Specification.responseSpecification200());
        given()
                .auth().oauth2("Bearer" + dataGenerate.data.get("token"))
                .header("Authorization", "Bearer " + dataGenerate.data.get("token"))
                .body(userDataPojoChangeEmail)
                .when()
                .patch("auth/email/change/")
                .then()
                .log()
                .all()
                .assertThat();
    }

    @Ignore
    @Test(priority = 5)
    public void sendEmailUserLink() {
        UserDataSentLink userDataPojoSecond = new UserDataSentLink(userDataPojoLogin.getLogin(), "https://example.com/reset-password");
        given()
                .body(userDataPojoSecond)
                .when()
                .post("auth/password/email/")
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);

    }

    @Test(priority = 6)
    public void changePassword() {
        given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + loginToken)
                .body(userDataChangePassword)
                .when()
                .patch("auth/password/change/")
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);

    }

    @Test(priority = 7)
    public void editUser() {
       // testsBack.Specification.installSpecification(testsBack.Specification.requestSpecificationToken(), testsBack.Specification.responseSpecification400());
        given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer " + authToken)
                .body(userDataEditUser)
                .when()
                .post("users/profile/edit")
                .then()
                .log()
                .all()
                .assertThat()
                .statusCode(200);
    }


    public String getLoginToken() {
        return loginToken;
    }
}
