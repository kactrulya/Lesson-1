package org.example;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class PostmanTest {


    //get запрос
    @Test
    @DisplayName("get запрос")
    public void someTest(){
        given()
                .baseUri("https://postman-echo.com/get")
                .contentType(ContentType.JSON)
                .when()
                .get("https://postman-echo.com/get?foo1=bar1&foo2=bar2")
                .then().assertThat().statusCode(200).body("args.foo1", equalTo("bar1")).body("args.foo2", equalTo("bar2")).log().all();
    }


    //post запрос
    @Test
    @DisplayName("post запрос")
    public void someTest1(){
        given()
                .baseUri("https://postman-echo.com/post")
                .contentType(ContentType.JSON)
                .when()
                .post("https://postman-echo.com/post")
                .then().assertThat().statusCode(200).body("headers.x-forwarded-port", equalTo("443")).body("url", equalTo("https://postman-echo.com/post")).log().all();
    }

    //post запрос
    @Test
    @DisplayName("post запрос2")
    public void someTest2(){
        given()
                .baseUri("https://postman-echo.com/post")
                .contentType("application/x-www-form-urlencoded;charset=UTF-8")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")
                .when()
                .post("https://postman-echo.com/post")
                .then().assertThat().statusCode(200).body("form.foo1", equalTo("bar1")).body("form.foo2", equalTo("bar2")).body("url", equalTo("https://postman-echo.com/post")).log().all();
    }

    //put запрос
    @Test
    @DisplayName("put запрос")
    public void someTest3(){
        given()
                .baseUri("https://postman-echo.com/put")
                .body("This is expected to be sent back as part of response body.")
                .contentType(ContentType.JSON)
                .when()
                .put("https://postman-echo.com/put")
                .then().assertThat().statusCode(200).body("data", equalTo("This is expected to be sent back as part of response body.")).body("url", equalTo("https://postman-echo.com/put")).log().all();
    }

    //patch запрос
    @Test
    @DisplayName("patch запрос")
    public void someTest4(){
        given()
                .baseUri("https://postman-echo.com/patch")
                .body("This is expected to be sent back as part of response body.")
                .contentType(ContentType.JSON)
                .when()
                .patch("https://postman-echo.com/patch")
                .then().assertThat().statusCode(200).body("data", equalTo("This is expected to be sent back as part of response body.")).body("url", equalTo("https://postman-echo.com/patch")).log().all();
    }

    //Delete запрос
    @Test
    @DisplayName("Delete запрос")
    public void someTest5(){
        given()
                .baseUri("https://postman-echo.com/delete")
                .body("This is expected to be sent back as part of response body.")
                .contentType(ContentType.JSON)
                .when()
                .delete("https://postman-echo.com/delete")
                .then().assertThat().statusCode(200).body("url", equalTo("https://postman-echo.com/delete")).log().all();
    }

}
