package pet;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

public class GET {

    @Test
    public void getPetTest() {
        RestAssured.baseURI = "https://petstore.swagger.io";

        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "v2/pet/1");

        int statusCode = response.getStatusCode();
        System.out.println("Response status code is " + statusCode);

        Headers header = response.getHeaders();
        System.out.println("Headers of the response body are " + header);

        ResponseBody body = response.getBody();
        body.prettyPrint();
        System.out.println("Response Body is " + body.asString());

    }

    @Test
    public void getFindByStatusTest1() {
        RestAssured.baseURI = "https://petstore.swagger.io";

        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "v2/pet/findByStatus?status=sold");

        int statusCode = response.getStatusCode();
        System.out.println("Response status code is " + statusCode);

        Headers header = response.getHeaders();
        System.out.println("Headers of the response body are " + header);

        ResponseBody body = response.getBody();
        body.prettyPrint();
        System.out.println("Response Body is " + body.asString());

    }

    @Test
    public void getFindByStatusTest2() {
        RestAssured.baseURI = "https://petstore.swagger.io";

        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "v2/pet/findByStatus?status=pending");

        int statusCode = response.getStatusCode();
        System.out.println("Response status code is " + statusCode);

        Headers header = response.getHeaders();
        System.out.println("Headers of the response body are " + header);

        ResponseBody body = response.getBody();
        body.prettyPrint();
        System.out.println("Response Body is " + body.asString());

    }

    @Test
    public void getFindByStatusTest3() {
        RestAssured.baseURI = "https://petstore.swagger.io";

        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "v2/pet/findByStatus?status=available");

        int statusCode = response.getStatusCode();
        System.out.println("Response status code is " + statusCode);

        Headers header = response.getHeaders();
        System.out.println("Headers of the response body are " + header);

        ResponseBody body = response.getBody();
        body.prettyPrint();
        System.out.println("Response Body is " + body.asString());

    }

}