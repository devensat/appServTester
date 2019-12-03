package com.cfaProj1.testCases;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import org.testng.Assert;

public class TC003_GET_BodyValidation {
    @Test
    public void test_APIwithDualAuthentication__GetBodyInfo() {
        RequestSpecification httpRequest = RestAssured.given();

                httpRequest.header("CFA-WS-Client-ID", "test_wsc_cfanow_mobile");
                httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IlFhcXcwOUl2cXBtNGwyRHZDeTJJdzgxazFocEsyaTMyOVZhS1JMaUFOWEwifQ.eyJjZmFfYXVkIjoiT1BFUkFUT1JfQVVESUVOQ0UiLCJjZmFfZ3VpZCI6IjYxNDMyMzRhYTJlYTVjNGNiNjhhNzE3NGI2ZmIxYWQ3IiwiY2ZhX2xvY19saXN0IjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJjZmFfcGVybXMiOnsiQ0ZBSEVMUCI6eyJMT0dJTiI6WyIwMTQzNyIsIjAyMjA2Il19LCJDRkFOT1dfTU9CSUxFIjp7IkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJSRVNUQVVSQU5UIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTV9QSE9UT19VUExPQUQiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il19LCJIRUxQX1NFUlZJQ0VfUE9SVEFMIjp7IkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiT0JJIjp7IkRURVIiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkVYUEVOU0UiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkxPR0lOIjpbIjAxNDM3IiwiMDIyMDYiXSwiT1BFUiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiT1BFUkFUT1JfTE9HSU4iOlsiMDE0MzciLCIwMjIwNiJdLCJQRVJGIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTUFWR1BBWSI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1QQVkiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNX0xPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiVE1IUCI6eyJMT0dJTiI6WyIwMDEwMiJdfSwiV0FMTEJPQVJEX01PQklMRSI6eyJMT0dJTiI6WyIwMTQzNyIsIjAyMjA2Il19fSwiZW1haWwiOiJqZWZmLnN0cnlrZXJAY2ZhZnJhbmNoaXNlZS5jb20iLCJleHAiOjE1NzUzOTM1MTIsImZhbWlseV9uYW1lIjoiU3RyeWtlciIsImlhdCI6MTU3NTM4OTkxMiwiaXNzIjoiaHR0cHM6Ly9hdXRoLmlkbS10ZXN0LmNmYWRldmVsb3AuY29tIiwianRpIjoiMTBjYTJjMzItYzU4NC00YzQ1LWE4MzYtNGI4ZDEwN2YzYTM2Iiwibmlja25hbWUiOiJKZWZmIiwic3ViIjoiamVmZi5zdHJ5a2VyIn0.CKYJh1uayzMEkckSxBWrEoh-as5GDcmHSwF55ugRbsTMiCQdnmlXj7xG_fXNcUdFkGh4SPRRWiTCQCaDAstc30SXPli7xPE_0-a-qoVBy9bETOb8FDDxpp5Y1MpRLwTTgaC1pJnOsBEc1aIIfjERW48k90bw9IYvSu2agrpDMctrGrmncsI4tpGFUhL5k5DYAz-z0KHTjiele9fww5x5ct16YfmAumP5VDIOhKoX-BrCC1Naon5h1dXUWXrqcXJhrkC2ropwZHBQtiGdKm0KjpIFHulq6lv1z76IQ1vjXvENBpZpG680HTcwnIhHzK5g2zOVGECUVlQ3P2esWRdMZg");

                Response response= httpRequest.get("https://api.coreservice-test.cfadevelop.com/cfa-now/home?locationNumbers=01437");
                ResponseBody body = response.getBody();
                String bodyStringValue = body.asString();
        System.out.println("Response Body  - >" + bodyStringValue);
        Assert.assertTrue(bodyStringValue.contains("locationNumber"));
    }
}
