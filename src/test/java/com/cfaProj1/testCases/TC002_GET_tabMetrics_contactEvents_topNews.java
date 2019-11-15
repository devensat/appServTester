package com.cfaProj1.testCases;

import io.restassured.RestAssured;
import org.junit.Test;

public class TC002_GET_tabMetrics_contactEvents_topNews {
    @Test
    public void test_APIwithDualAuthentication_ShouldBeGivenAccess() {
        RestAssured.given().
                header("CFA-WS-Client-ID", "test_wsc_cfanow_mobile").
                auth().
                oauth2("eyJhbGciOiJSUzI1NiIsImtpZCI6IlFhcXcwOUl2cXBtNGwyRHZDeTJJdzgxazFocEsyaTMyOVZhS1JMaUFOWEwifQ.eyJjZmFfYXVkIjoiT1BFUkFUT1JfQVVESUVOQ0UiLCJjZmFfZ3VpZCI6IjYxNDMyMzRhYTJlYTVjNGNiNjhhNzE3NGI2ZmIxYWQ3IiwiY2ZhX2xvY19saXN0IjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJjZmFfcGVybXMiOnsiQ0ZBSEVMUCI6eyJMT0dJTiI6WyIwMTQzNyIsIjAyMjA2Il19LCJDRkFOT1dfTU9CSUxFIjp7IkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJSRVNUQVVSQU5UIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTV9QSE9UT19VUExPQUQiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il19LCJIRUxQX1NFUlZJQ0VfUE9SVEFMIjp7IkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiT0JJIjp7IkRURVIiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkVYUEVOU0UiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkxPR0lOIjpbIjAxNDM3IiwiMDIyMDYiXSwiT1BFUiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiT1BFUkFUT1JfTE9HSU4iOlsiMDE0MzciLCIwMjIwNiJdLCJQRVJGIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTUFWR1BBWSI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1QQVkiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNX0xPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiVE1IUCI6eyJMT0dJTiI6WyIwMDEwMiJdfSwiV0FMTEJPQVJEX01PQklMRSI6eyJMT0dJTiI6WyIwMTQzNyIsIjAyMjA2Il19fSwiZW1haWwiOiJqZWZmLnN0cnlrZXJAY2ZhZnJhbmNoaXNlZS5jb20iLCJleHAiOjE1NzM4NTcxNjMsImZhbWlseV9uYW1lIjoiU3RyeWtlciIsImlhdCI6MTU3Mzg1MzU2MywiaXNzIjoiaHR0cHM6Ly9hdXRoLmlkbS10ZXN0LmNmYWRldmVsb3AuY29tIiwianRpIjoiZmUzNjliZTktMGJiOC00MDMwLWExZDQtNzM1NWI1ODJkNTQ5Iiwibmlja25hbWUiOiJKZWZmIiwic3ViIjoiamVmZi5zdHJ5a2VyIn0.cpT6LgK9IofPF0_3mYm6fm1qQKediDkocMvJjw7xoPhdhuT_7OeMTWfc9-z0y7paTmPpsO3rO-Fu6OY_kG-LiOpVLsflDTTMUlH4nmy7E19QzD32i73pijhB29F_6mRRhlYIaGITG_9A7wwvMGD365fDKbK4K5SGlv6Eo_JQMm6YDB2REIJmBS9UXcH3NM7wCiTR5WRkDryyGwycoONAB7HSORFlHjK-L890xhwpNKFgIwMXdnybSJIn9uEGKyC-owvytddNRxe7ghgo7fYTpoTa2t0MIOPopqF8gTojWlMqb-XY5NFPg0r2fxcaRJITCU4KrXkb7bPL6cVMU9La-w").
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
