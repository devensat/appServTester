package com.cfaProj1.testCases;

import io.restassured.RestAssured;
import org.junit.Test;

public class TC002_GET_tabMetrics_contactEvents_topNews {
    @Test
    public void test_APIwithDualAuthentication_ShouldBeGivenAccess() {
        RestAssured.given().
                header("CFA-WS-Client-ID", "test_wsc_cfanow_mobile").
                auth().
                oauth2("eyJhbGciOiJSUzI1NiIsImtpZCI6IlFhcXcwOUl2cXBtNGwyRHZDeTJJdzgxazFocEsyaTMyOVZhS1JMaUFOWEwifQ.eyJjZmFfYXVkIjoiT1BFUkFUT1JfQVVESUVOQ0UiLCJjZmFfZ3VpZCI6IjYxNDMyMzRhYTJlYTVjNGNiNjhhNzE3NGI2ZmIxYWQ3IiwiY2ZhX2xvY19saXN0IjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJjZmFfcGVybXMiOnsiQ0ZBSEVMUCI6eyJMT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXX0sIkNGQU5PV19NT0JJTEUiOnsiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlJFU1RBVVJBTlQiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNX1BIT1RPX1VQTE9BRCI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXX0sIkhFTFBfU0VSVklDRV9QT1JUQUwiOnsiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il19LCJPQkkiOnsiRFRFUiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiRVhQRU5TRSI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIk9QRVIiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIk9QRVJBVE9SX0xPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJQRVJGIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTUFWR1BBWSI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1QQVkiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNX0xPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiU1BPVExJR0hUX0NBUkVTIjp7IkxPR0lOIjpbIjAxNDM3Il19LCJUTUhQIjp7IkxPR0lOIjpbIjAwMTAyIl19LCJXQUxMQk9BUkRfTU9CSUxFIjp7IkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfX0sImVtYWlsIjoiamVmZi5zdHJ5a2VyQGNmYWZyYW5jaGlzZWUuY29tIiwiZXhwIjoxNTc4MzMwNTU1LCJmYW1pbHlfbmFtZSI6IlN0cnlrZXIiLCJpYXQiOjE1NzgzMjY5NTUsImlzcyI6Imh0dHBzOi8vYXV0aC5pZG0tdGVzdC5jZmFkZXZlbG9wLmNvbSIsImp0aSI6IjM0ZmMwNWI2LTUxYjMtNDIyMS1hYWY2LTVjYjNmZjY1MzExZiIsIm5pY2tuYW1lIjoiSmVmZiIsInN1YiI6ImplZmYuc3RyeWtlciJ9.lJK99lx3exa7nGEl-6tDbbkodCRD4KR6nYMw3kVE0fqFOLGIC6fg-Uro4ppTlDo4CxpAWXRWq9QIIFjXuqcn12yrfmrBoKZPoG6RX8swGuk-kiquo47Kszyo1JWFfeXcDadCaJFHUMrQz8BTN8a_iKsb2FdyyZEWaQElhCowInLNeNDrpTdIgQHT-x-SxY8SOsBS2UV0ud5jPbtCXBchqM_9wVhI3Mb_aAcjUC1WTzjrVxKGYqNnXSjHicOkx_MF5IphjjetCAQ3_b6sbnLcj4I7MuUnVFUVaGbGHeRiazVRHSAKC-NHe94bFu_JmuES8B_kQ6VwB2fwikJRcgtrjg").
                // preemptive().
                //basic("contacts-api-user", "Yq)>^GJ*FV!S`9pc").

                        when().
                get("https://api.coreservice-test.cfadevelop.com/cfa-now/home?locationNumbers=01437").


                then().
                assertThat().
                statusCode(200);// 200 Success Status Code

    }

        @Test
    public void test_401_statusCode() {
        RestAssured.given().
                header("CFA-WS-Client-ID", "test_wsc_cfanow_mobile").
                when().
                get("https://api.coreservice-test.cfadevelop.com/cfa-now/home?locationNumbers=01437").
                then().
                assertThat().
                statusCode(401); // 401 - Unauthorized Status code

    }

    private RestAssured given() {
        return null;
    }

    @Test
    public void test_400_statusCode() {
        RestAssured.given().

                when().
                get("https://api.coreservice-test.cfadevelop.com/cfa-now/home?locationNumbers=01437").
                then().
                assertThat().
                statusCode(400); // 400 - Bad Request Status code
                                //Unauthorized, CFA-WS-CLIENT-ID is a required header attribute

    }



}
