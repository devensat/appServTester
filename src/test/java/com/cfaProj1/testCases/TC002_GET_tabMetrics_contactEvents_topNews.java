package com.cfaProj1.testCases;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.internal.RestAssuredResponseOptionsGroovyImpl;

import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

public class TC002_GET_tabMetrics_contactEvents_topNews {
    @Test
    public void test_APIwithDualAuthentication_ShouldBeGivenAccess() {
        RestAssured.given().
                header("CFA-WS-Client-ID", "test_wsc_cfanow_mobile").
                auth().
                oauth2("eyJhbGciOiJSUzI1NiIsImtpZCI6IlFhcXcwOUl2cXBtNGwyRHZDeTJJdzgxazFocEsyaTMyOVZhS1JMaUFOWEwifQ.eyJjZmFfYXVkIjoiT1BFUkFUT1JfQVVESUVOQ0UiLCJjZmFfZ3VpZCI6IjYxNDMyMzRhYTJlYTVjNGNiNjhhNzE3NGI2ZmIxYWQ3IiwiY2ZhX2xvY19saXN0IjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJjZmFfcGVybXMiOnsiQ0ZBSEVMUCI6eyJMT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXX0sIkNGQU5PV19NT0JJTEUiOnsiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlJFU1RBVVJBTlQiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNX1BIT1RPX1VQTE9BRCI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXX0sIkhFTFBfU0VSVklDRV9QT1JUQUwiOnsiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il19LCJPQkkiOnsiRFRFUiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiRVhQRU5TRSI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIk9QRVIiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIk9QRVJBVE9SX0xPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJQRVJGIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTUFWR1BBWSI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1QQVkiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNX0xPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiU1BPVExJR0hUX0NBUkVTIjp7IkxPR0lOIjpbIjAxNDM3Il19LCJUTUhQIjp7IkxPR0lOIjpbIjAwMTAyIl19LCJXQUxMQk9BUkRfTU9CSUxFIjp7IkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfX0sImVtYWlsIjoiamVmZi5zdHJ5a2VyQGNmYWZyYW5jaGlzZWUuY29tIiwiZXhwIjoxNTc1OTEzNzU4LCJmYW1pbHlfbmFtZSI6IlN0cnlrZXIiLCJpYXQiOjE1NzU5MTAxNTgsImlzcyI6Imh0dHBzOi8vYXV0aC5pZG0tdGVzdC5jZmFkZXZlbG9wLmNvbSIsImp0aSI6Ijc2NGQyZjQwLTg3YjYtNGU2Yy04YTMyLTliYjgzMGU4N2ZiMSIsIm5pY2tuYW1lIjoiSmVmZiIsInN1YiI6ImplZmYuc3RyeWtlciJ9.0TPs6UG-516nIOAjhc9BgJDgdWjAw7W3ZrU824gGhI9P1cyUQGWfGXLl32d_8-6TKbKD4VH7j5yo3KojyO93WJpSmM-j7LnlGppGRg5vMvMwo9yUWnjbqSDN7oxJKij8CtcaVVRjRWM0VXqFzUK2V8Dfzh8g04E_dWgfh5Vssdu9FL8dZSPnB9Dri8E2iZiW_QopEOmARdGVZlFtqMBRO3ddgHBR93qxTLB9By_h32-kq6JEMQJVKz427N1nbH0n7JuZrV1HqcbhL-koT-Z506bvg0quZz_X4rzadd6Kh_xz971lbfbEZgqt6vwyEr6-74UFQ5I_A8cf4pLlJqnbCQ").
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
