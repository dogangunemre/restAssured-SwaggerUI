package pet;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DELETE {

    @Test
    public void deletePetTest() {

        RestAssured.baseURI = "https://petstore.swagger.io";

        RequestSpecification httpRequest = RestAssured.given();

        httpRequest.header("Content-Type", "application/json").header("accept", "application/json");

        Response response = httpRequest.delete("/v2/pet/1");

        System.out.println(response);
        System.out.println("Response status code is " + response.getStatusCode());

    }
}