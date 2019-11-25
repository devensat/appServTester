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
                httpRequest.header("Authorization", "Bearer eyJhbGciOiJSUzI1NiIsImtpZCI6IlFhcXcwOUl2cXBtNGwyRHZDeTJJdzgxazFocEsyaTMyOVZhS1JMaUFOWEwifQ.eyJjZmFfYXVkIjoiT1BFUkFUT1JfQVVESUVOQ0UiLCJjZmFfZ3VpZCI6IjYxNDMyMzRhYTJlYTVjNGNiNjhhNzE3NGI2ZmIxYWQ3IiwiY2ZhX2xvY19saXN0IjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJjZmFfcGVybXMiOnsiQ0ZBSEVMUCI6eyJMT0dJTiI6WyIwMTQzNyIsIjAyMjA2Il19LCJDRkFOT1dfTU9CSUxFIjp7IkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJSRVNUQVVSQU5UIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTV9QSE9UT19VUExPQUQiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il19LCJIRUxQX1NFUlZJQ0VfUE9SVEFMIjp7IkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiT0JJIjp7IkRURVIiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkVYUEVOU0UiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkxPR0lOIjpbIjAxNDM3IiwiMDIyMDYiXSwiT1BFUiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiT1BFUkFUT1JfTE9HSU4iOlsiMDE0MzciLCIwMjIwNiJdLCJQRVJGIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTUFWR1BBWSI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1QQVkiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNX0xPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiVE1IUCI6eyJMT0dJTiI6WyIwMDEwMiJdfSwiV0FMTEJPQVJEX01PQklMRSI6eyJMT0dJTiI6WyIwMTQzNyIsIjAyMjA2Il19fSwiZW1haWwiOiJqZWZmLnN0cnlrZXJAY2ZhZnJhbmNoaXNlZS5jb20iLCJleHAiOjE1NzQ0NTkxNzMsImZhbWlseV9uYW1lIjoiU3RyeWtlciIsImlhdCI6MTU3NDQ1NTU3MywiaXNzIjoiaHR0cHM6Ly9hdXRoLmlkbS10ZXN0LmNmYWRldmVsb3AuY29tIiwianRpIjoiOTdmNzM3YWYtYWUxNy00YjNhLWI4NzItY2E4ZDlkZjBhMDY3Iiwibmlja25hbWUiOiJKZWZmIiwic3ViIjoiamVmZi5zdHJ5a2VyIn0.MJ9RT4CMywoni_3ZKbtapRKFvgrvL-0PDpgkorGs69SyC7Ik-wRNhz0h4s2NXjk8Kt46pnNU0ekXxw8Z615LXk9v0dM2x0NAwagJk1rHpJSYkQZ8Jy3jH2FjtZzFkNw-UBxZCwVQLYmM6XdA9UIBaWFoBtAOmZmRXWJcgo0MUMQ07sbneeAkMRJQ6nXGOepsqD7PQ0skh93ZQMorEZ4ekjL8CVqR0O1xQKh4or1sBShTWjxUZ2k6NtLAPQxrjI0cNvC5f6Pv9t0G549zBv8Xt6RaSdszkBkH2_lTtKL94Eoas_TiF4-ngREg5SXAGn4zRHq04N2nayutRpZW2RjPjg");

                Response response= httpRequest.get("https://api.coreservice-test.cfadevelop.com/cfa-now/home?locationNumbers=01437");
                ResponseBody body = response.getBody();
                String bodyStringValue = body.asString();
        Assert.assertTrue(bodyStringValue.contains("locationNumber"));
    }
}