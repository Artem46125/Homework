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
        String requestData = "{\"test\": \"value\"}";
        Response response = given()
                .header("Content-Type", "text/plain")
                .body(requestData)
                .when()
                .post(Base_url + "/post")
                .then()
                .statusCode(200)
                .extract()
                .response();
        response.then().body("url", equalTo(Base_url + "/post"));
        response.then().body("data", equalTo(requestData));
        response.then().body("files", is(emptyMap()));
        response.then().body("form", is(emptyMap()));
        response.then().body("args", is(emptyMap()));
        response.then().body("headers", is(notNullValue()));
    }
    @Test
    public void testPutRequest() {
        String requestData = "This is expected to be sent back as part of response body.";
        Response response = given()
                .header("Content-Type", "text/plain")
                .body(requestData)
                .when()
                .put(Base_url + "/put")
                .then()
                .statusCode(200)
                .extract()
                .response();
        response.then().body("url", equalTo(Base_url + "/put"));
        response.then().body("data", equalTo(requestData));
        response.then().body("args", is(emptyMap()));
        response.then().body("files", is(emptyMap()));
        response.then().body("form", is(emptyMap()));
        response.then().body("headers", is(notNullValue()));
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
        response.then().body("args", is(emptyMap()));
        response.then().body("files", is(emptyMap()));
        response.then().body("form", is(emptyMap()));
        response.then().body("headers", is(notNullValue()));
    }
    @Test
    public void testPatchRequest() {
        String requestData = "This is expected to be sent back as part of response body.";
        Response response = given()
                .body(requestData)
                .when()
                .patch(Base_url + "/patch")
                .then()
                .statusCode(200)
                .extract()
                .response();
        response.then().body("url", equalTo(Base_url + "/patch"));
        response.then().body("args", is(emptyMap()));
        response.then().body("files", is(emptyMap()));
        response.then().body("form", is(emptyMap()));
        response.then().body("headers", is(notNullValue()));
        response.then().body("data", equalTo(requestData));
    }
}