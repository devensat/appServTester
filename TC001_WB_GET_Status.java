package com.wallBoardProj1.testCases;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.logging.log4j.core.util.JsonUtils;
import org.junit.Test;

public class TC001_WB_GET_Status {


    @Test
    public void Test_StatusCode_200()
    {
        System.out.println("TC001.01: Test_for_Status Code: 200");
        RestAssured.given();

        RequestSpecification httpRequest = RestAssured.given();

              httpRequest.header("CFA-WS-Client-ID", "test_wsc_cfanow_mobile").
                auth().
                oauth2("eyJhbGciOiJSUzI1NiIsImtpZCI6IlFhcXcwOUl2cXBtNGwyRHZDeTJJdzgxazFocEsyaTMyOVZhS1JMaUFOWEwifQ.eyJjZmFfYXVkIjoiT1BFUkFUT1JfQVVESUVOQ0UiLCJjZmFfZ3VpZCI6IjYxNDMyMzRhYTJlYTVjNGNiNjhhNzE3NGI2ZmIxYWQ3IiwiY2ZhX2xvY19saXN0IjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJjZmFfcGVybXMiOnsiQ0ZBTk9XX01PQklMRSI6eyJMT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiUkVTVEFVUkFOVCI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1fUEhPVE9fVVBMT0FEIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiT0JJIjp7IkRURVIiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkVYUEVOU0UiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJPUEVSIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJPUEVSQVRPUl9MT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiUEVSRiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1BVkdQQVkiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNUEFZIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTV9MT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXX0sIldBTExCT0FSRF9NT0JJTEUiOnsiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il19fSwiZW1haWwiOiJqZWZmLnN0cnlrZXJAY2ZhZnJhbmNoaXNlZS5jb20iLCJleHAiOjE1NzYwOTY0MzQsImZhbWlseV9uYW1lIjoiU3RyeWtlciIsImlhdCI6MTU3NjA5MjgzNCwiaXNzIjoiaHR0cHM6Ly9hdXRoLmlkbS10ZXN0LmNmYWRldmVsb3AuY29tIiwianRpIjoiNmNjYjhmZjMtYTE3Mi00MmI2LWEzNzAtMmVmOWQzZjdhMGRmIiwibmlja25hbWUiOiJKZWZmIiwic3ViIjoiamVmZi5zdHJ5a2VyIn0.Ml-OTOT-oAyjanthUevfUBOTLMl8zXGJedx0-q-wM2oiZpTfyHyGVr0g1xoI9wFmaIUB9b0MRmaD51w9QHCXbdNzQ7oUj2JDEPVKwdyCNs9U9c-AsVn7xzbdyIKCR9IoGhi16QpWki9bN-MwzJZmJcb6eMy9oijeXgK6r_27NL2SmPID-EUUzhF36ZFgl_pLmmNgJPo0foV_LzGTsmc2w1XsZN7LyV5cH8ePEAo0QFkvV5kPBbMfZh-4wExSROy-FKi5We75-8l1YTs0gPyUFb-LTvEHux70aeAomsz5lKaAiNadk--QXqEKHng13DHu_JNVgOhLG66LYQMYulD89Q").
        when();
                Response response = httpRequest.get("https://api.coreservice-test.cfadevelop.com/cfa-now/v1/wallboard/time-variance?locationNumber=01437");

        response.then().
                assertThat().
                statusCode(200);// 200 Success Status Code
        System.out.println("Status Code is:"+response.getStatusCode());
        System.out.println("Status Code is:"+response.getStatusLine());
    }

    @Test
    public void Test_statusCode_401() {

        System.out.println("TC001.02: Test_for_statusCode: 401");
        RestAssured.given();


                RequestSpecification httpRequest = RestAssured.given();
                httpRequest.header("CFA-WS-Client-ID", "test_wsc_cfanow_mobile").
        when();
                Response response = httpRequest.get("https://api.coreservice-test.cfadevelop.com/cfa-now/v1/wallboard/time-variance?locationNumber=01437");

        response.then().
                assertThat().
             statusCode(401);
        System.out.println("Status Code is:"+response.getStatusCode());
        System.out.println("Status Code is:"+response.getStatusLine());
    }

    @Test
    public void Test_StatusCode_400() {
        System.out.println("TC001.03: Test_for_statusCode: 400");

        RestAssured.given();

            RequestSpecification httpRequest = RestAssured.given().

         when();
                Response response = httpRequest.get("https://api.coreservice-test.cfadevelop.com/cfa-now/v1/wallboard/time-variance?locationNumber=01437");
         response.then().
                assertThat().
                statusCode(400); // 400 - Bad Request Status code
        //Unauthorized, CFA-WS-CLIENT-ID is a required header attribute
        System.out.println("Status Code is:"+response.getStatusCode());
        System.out.println("Status Code is:"+response.getStatusLine());
    }



}




