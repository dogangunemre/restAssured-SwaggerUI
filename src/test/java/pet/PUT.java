package pet;

import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PUT {

    @Test
    public void putPetTest() {
        RestAssured.baseURI = "https://petstore.swagger.io";

        String request = "\n" +
                "  \"id\": 1,\n" +
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

        httpRequest.header("Content-Type", "application/json").header("accept", "application/json");

        Response response = httpRequest.body(request).put("/v2/pet");

        System.out.println(response);
        System.out.println("Response status code is " + response.getStatusCode());

    }

}

