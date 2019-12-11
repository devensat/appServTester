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
                oauth2("eyJhbGciOiJSUzI1NiIsImtpZCI6IlFhcXcwOUl2cXBtNGwyRHZDeTJJdzgxazFocEsyaTMyOVZhS1JMaUFOWEwifQ.eyJjZmFfYXVkIjoiT1BFUkFUT1JfQVVESUVOQ0UiLCJjZmFfZ3VpZCI6IjYxNDMyMzRhYTJlYTVjNGNiNjhhNzE3NGI2ZmIxYWQ3IiwiY2ZhX2xvY19saXN0IjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJjZmFfcGVybXMiOnsiQ0ZBTk9XX01PQklMRSI6eyJMT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiUkVTVEFVUkFOVCI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1fUEhPVE9fVVBMT0FEIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiT0JJIjp7IkRURVIiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkVYUEVOU0UiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJPUEVSIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJPUEVSQVRPUl9MT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiUEVSRiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1BVkdQQVkiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNUEFZIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTV9MT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXX0sIldBTExCT0FSRF9NT0JJTEUiOnsiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il19fSwiZW1haWwiOiJqZWZmLnN0cnlrZXJAY2ZhZnJhbmNoaXNlZS5jb20iLCJleHAiOjE1NzYwOTY0MzQsImZhbWlseV9uYW1lIjoiU3RyeWtlciIsImlhdCI6MTU3NjA5MjgzNCwiaXNzIjoiaHR0cHM6Ly9hdXRoLmlkbS10ZXN0LmNmYWRldmVsb3AuY29tIiwianRpIjoiNmNjYjhmZjMtYTE3Mi00MmI2LWEzNzAtMmVmOWQzZjdhMGRmIiwibmlja25hbWUiOiJKZWZmIiwic3ViIjoiamVmZi5zdHJ5a2VyIn0.Ml-OTOT-oAyjanthUevfUBOTLMl8zXGJedx0-q-wM2oiZpTfyHyGVr0g1xoI9wFmaIUB9b0MRmaD51w9QHCXbdNzQ7oUj2JDEPVKwdyCNs9U9c-AsVn7xzbdyIKCR9IoGhi16QpWki9bN-MwzJZmJcb6eMy9oijeXgK6r_27NL2SmPID-EUUzhF36ZFgl_pLmmNgJPo0foV_LzGTsmc2w1XsZN7LyV5cH8ePEAo0QFkvV5kPBbMfZh-4wExSROy-FKi5We75-8l1YTs0gPyUFb-LTvEHux70aeAomsz5lKaAiNadk--QXqEKHng13DHu_JNVgOhLG66LYQMYulD89Q").
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


