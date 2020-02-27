package com.wallBoardProj1.testCases;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import org.testng.Assert;


public class TC003_WB_GET_tipsAndAlerts {

    //private final Logger logger = Logger.getAnonymousLogger();

    @Test
    public void test_foodSafetyAPI_tip() {

        RestAssured.given();
        System.out.println("TC003.01: Test foodsafety API - verify businessCategory");
            RequestSpecification httpRequest = RestAssured.given();
            httpRequest.header("CFA-WS-Client-ID", "test_wsc_cfanow_mobile")
                    .auth()
                    .oauth2("eyJhbGciOiJSUzI1NiIsImtpZCI6IlFhcXcwOUl2cXBtNGwyRHZDeTJJdzgxazFocEsyaTMyOVZhS1JMaUFOWEwifQ.eyJjZmFfYXVkIjoiT1BFUkFUT1JfQVVESUVOQ0UiLCJjZmFfZ3VpZCI6IjYxNDMyMzRhYTJlYTVjNGNiNjhhNzE3NGI2ZmIxYWQ3IiwiY2ZhX2xvY19saXN0IjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJjZmFfcGVybXMiOnsiQ0ZBTk9XX01PQklMRSI6eyJMT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiUkVTVEFVUkFOVCI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1fUEhPVE9fVVBMT0FEIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiT0JJIjp7IkRURVIiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkVYUEVOU0UiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJPUEVSIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJPUEVSQVRPUl9MT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiUEVSRiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1BVkdQQVkiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNUEFZIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTV9MT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXX0sIldBTExCT0FSRF9NT0JJTEUiOnsiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il19fSwiZW1haWwiOiJqZWZmLnN0cnlrZXJAY2ZhZnJhbmNoaXNlZS5jb20iLCJleHAiOjE1ODA0OTkzNDAsImZhbWlseV9uYW1lIjoiU3RyeWtlciIsImlhdCI6MTU4MDQ5NTc0MCwiaXNzIjoiaHR0cHM6Ly9hdXRoLmlkbS10ZXN0LmNmYWRldmVsb3AuY29tIiwianRpIjoiNmNlNDVmYjMtYzc3MC00NzNkLWJkYmEtMjAwMDllNjBlZWRlIiwibmlja25hbWUiOiJKZWZmIiwic3ViIjoiamVmZi5zdHJ5a2VyIn0.xlkA1JB1cJZZqNzKu00fjao_PUpKf4PSqwANKFr0YJa1uIRiDmnbeFQz5d_VqUtZ3svratyG-zkUCie6p6M8-VS4PRXtKZRteZM3emOnJajXtIfMyykqtYuxkLikF64CF0LgsE91lUmxtvZiPBzrcOJqEeo-MJyi2hMb0AwnEzhYW1u5_9ydLaqrHH7vvNicWFWNJoRunLusxo31WYOYpIMexl0Q342t5e3xWcsAtHCRTrk7D1Xm-Pqy9RI_dHIAn_EVN735svsRevb8pKrfafY4HzCqzg2krAaXFcAchLx3O-MOjqPQb407XCnxwqd0ZSRs0Av_5v7Wsl__JlQRTw").

         when();
            Response response = httpRequest.get("https://wallboard-api.coreservice-test.cfadevelop.com/v1/tips/02206?categories=tip");
            ResponseBody body = response.getBody();
            String bodyStringValue = body.asString();
        System.out.println(("Status Code is: "+response.getStatusCode()));
        System.out.println(("Status Line is: "+response.getStatusLine()));
        System.out.println(("Header is: "+response.getHeaders()));


        response.then().
        assertThat().
                statusCode(200);
        Assert.
                assertNotNull(bodyStringValue);
        Assert.assertTrue(bodyStringValue.contains("businessCategory\":\"foo"));
        Assert.assertTrue(bodyStringValue.contains("\"informationCategory\":\"ti"));

        System.out.println("Response Body - >: "+bodyStringValue);




    }
}
