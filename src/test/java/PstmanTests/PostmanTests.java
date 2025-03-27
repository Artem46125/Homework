package PstmanTests;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static java.util.Collections.emptyMap;
import static org.hamcrest.Matchers.*;

public class PostmanTests {
    private static String Base_url = "https://postman-echo.com";

    @Test
    public void GetResponse() {
        Response response = given()
                .when()
                .get(Base_url + "/get")
                .then()
                .statusCode(200)
                .extract()
                .response();
        response.then().body("url", equalTo(Base_url + "/get"));
        response.then().body("args", is(emptyMap()));
        response.then().body("headers", is(notNullValue()));
    }

    @Test
    public void testPostRequest() {
        Response response = given()
                .when()
                .post(Base_url + "/post")
                .then()
                .statusCode(200)
                .extract()
                .response();
        response.then().body("url", equalTo(Base_url + "/post"));

    }

    @Test
    public void testPutRequest() {
        Response response = given()

                .when()
                .put(Base_url + "/put")
                .then()
                .statusCode(200)
                .extract()
                .response();

            // Проверка тела ответа
        response.then().body("url", equalTo(Base_url + "/put"));

    }

    @Test
    public void testDeleteRequest() {
        Response response = given()
                .when()
                .delete(Base_url + "/delete")
                .then()
                .statusCode(200)
                .extract()
                .response();

        response.then().body("url", equalTo(Base_url + "/delete"));
    }
}
