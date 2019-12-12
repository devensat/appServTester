package com.wallBoardProj1.testCases;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
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
                oauth2("eyJhbGciOiJSUzI1NiIsImtpZCI6IlFhcXcwOUl2cXBtNGwyRHZDeTJJdzgxazFocEsyaTMyOVZhS1JMaUFOWEwifQ.eyJjZmFfYXVkIjoiT1BFUkFUT1JfQVVESUVOQ0UiLCJjZmFfZ3VpZCI6IjYxNDMyMzRhYTJlYTVjNGNiNjhhNzE3NGI2ZmIxYWQ3IiwiY2ZhX2xvY19saXN0IjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJjZmFfcGVybXMiOnsiQ0ZBTk9XX01PQklMRSI6eyJMT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiUkVTVEFVUkFOVCI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1fUEhPVE9fVVBMT0FEIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiT0JJIjp7IkRURVIiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkVYUEVOU0UiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJPUEVSIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJPUEVSQVRPUl9MT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiUEVSRiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1BVkdQQVkiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNUEFZIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTV9MT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXX0sIldBTExCT0FSRF9NT0JJTEUiOnsiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il19fSwiZW1haWwiOiJqZWZmLnN0cnlrZXJAY2ZhZnJhbmNoaXNlZS5jb20iLCJleHAiOjE1NzYxODg0MzAsImZhbWlseV9uYW1lIjoiU3RyeWtlciIsImlhdCI6MTU3NjE4NDgzMCwiaXNzIjoiaHR0cHM6Ly9hdXRoLmlkbS10ZXN0LmNmYWRldmVsb3AuY29tIiwianRpIjoiNWYwNjg4ZTQtNjU0Ni00NDY3LThkNmUtOTAzMDVkNDkyYjU1Iiwibmlja25hbWUiOiJKZWZmIiwic3ViIjoiamVmZi5zdHJ5a2VyIn0.ArnfY3FBUf_1rhGNEIuB06Y8yxPZL0PRwWzUYUzbNoPKrA8LNX4YowCgsYWwFOU23vxpcwRDOlmJ1H8cqUkTvK5a21OHC9ZsCG5bSQjajnnMuSn1ugqWE7mKJDNF3i9eRIK3qXaJIXOxAb6iMx2je5CpqjeSVXgfDbu04bkfK7s3oKbvqyUewNWwjnfL5A1ufUbsLW-Bl8EuEcv5_LppkdAuLLbc76e9AUEutp_2BtvJQ4RRqLHFdkdL_xUo4bq4URbR8KtYCQ2w15jwSNUyHc8zIXT8KGqZ73YktgTcS4kGwKHCbqt8cPhoS9FMRcqDJ5hLYvFkDJJaa5UkdHyp8g").
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




