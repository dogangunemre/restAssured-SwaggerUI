package pet;

import org.junit.jupiter.api.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POST {

    @Test
    public void postPetTest() {
        RestAssured.baseURI = "https://petstore.swagger.io";

        String request = "{\n" +
                "  \"id\": 0,\n" +
                "  \"category\": {\n" +
                "    \"id\": 0,\n" +
                "    \"name\": \"string\"\n" +
                "  },\n" +
                "  \"name\": \"doggie\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 0,\n" +
                "      \"name\": \"string\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";

        RequestSpecification httpRequest = RestAssured.given();

        httpRequest.header("Content-Type","application/json");

        Response response = httpRequest.body(request).post("/v2/pet");

        int statusCode = response.getStatusCode();
        System.out.println("Response status code is "+statusCode);

    }

    @Test
    public void postPetTest1() {
        RestAssured.baseURI = "https://petstore.swagger.io";

        RequestSpecification httpRequest = RestAssured.given();

        httpRequest.header("Content-Type","application/json");

        Response response = httpRequest.post("/v2/pet/1");

        int statusCode = response.getStatusCode();
        System.out.println("Response status code is "+statusCode);

    }

}