package com.wallBoardProj1.testCases;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import org.testng.Assert;

public class TC002_WB_GET_bodyValidations {
    @Test
    public void test_APIwithBdd_ShouldBeGivenAcess() {

        System.out.println("TC002.01: Test with OAuth2- Token");
    RestAssured.given();
        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.header("CFA-WS-Client-ID", "test_wsc_cfanow_mobile").
                auth().
                oauth2("eyJhbGciOiJSUzI1NiIsImtpZCI6IlFhcXcwOUl2cXBtNGwyRHZDeTJJdzgxazFocEsyaTMyOVZhS1JMaUFOWEwifQ.eyJjZmFfYXVkIjoiT1BFUkFUT1JfQVVESUVOQ0UiLCJjZmFfZ3VpZCI6IjYxNDMyMzRhYTJlYTVjNGNiNjhhNzE3NGI2ZmIxYWQ3IiwiY2ZhX2xvY19saXN0IjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJjZmFfcGVybXMiOnsiQ0ZBTk9XX01PQklMRSI6eyJMT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiUkVTVEFVUkFOVCI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1fUEhPVE9fVVBMT0FEIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiT0JJIjp7IkRURVIiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkVYUEVOU0UiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJPUEVSIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJPUEVSQVRPUl9MT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiUEVSRiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1BVkdQQVkiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNUEFZIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTV9MT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXX0sIldBTExCT0FSRF9NT0JJTEUiOnsiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il19fSwiZW1haWwiOiJqZWZmLnN0cnlrZXJAY2ZhZnJhbmNoaXNlZS5jb20iLCJleHAiOjE1NzgzMzAzNTQsImZhbWlseV9uYW1lIjoiU3RyeWtlciIsImlhdCI6MTU3ODMyNjc1NCwiaXNzIjoiaHR0cHM6Ly9hdXRoLmlkbS10ZXN0LmNmYWRldmVsb3AuY29tIiwianRpIjoiODMzYmViMmQtMDYwYy00MjRmLWI2NWMtMTYxYmFhNzVjYmU3Iiwibmlja25hbWUiOiJKZWZmIiwic3ViIjoiamVmZi5zdHJ5a2VyIn0.yDf9EA4AweZcOhbIlvcO2yYhx5ciInLCMEI1018TeK3JJBAr37yriNvufkwGvSMebzwdgd4um8eKKn3Vlz41qTHRBUc8AEl6i5eI4TQzdz0OWD3uHYzCbZnHIHnJDob98JkK06iaIQBlj6rh1JrpvMCGIkoyeShaIY2hvxgLyqnZ2Kp8ovJ5BZzQTR4khk7DhX3Qy7z6dbCHesRRr51rIUC-_xO_SWdgHk0xQDC011o6h2c35TRQqYvEAJehaulZaJ7IkbgUo1S1dRI4gMcMnYzCg1-TTpEiMEbwxcy2qqos4Fwv4udm6f__y1v7GDfhn0GaDvy62wNYiBIS9OKzGw").
                // preemptive().
    when();
            Response response = httpRequest.get("https://wallboards.foodsafety-test.cfadevelop.com/safe-daily-critical/v1/02206");
             ResponseBody body = response.getBody();
             String bodyStringValue = body.asString();

             System.out.println("Response Body  - >" + bodyStringValue);

   response.then().
        assertThat().
                statusCode(200);
        System.out.println("Status Code is:"+response.getStatusCode());
             //Assert.assertTrue(bodyStringValue.contains("variance"));
                //Assert.assertTrue(bodyStringValue.contains("employeeCount"));
            Assert.assertTrue(bodyStringValue.contains("locationNumber\": \"02206"));


    }



}


