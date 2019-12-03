package com.cfaProj1.testCases;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import org.testng.Assert;

public class TC004_BodyValidationwithBDD {
    @Test
    public void test_APIwithBdd_ShouldBeGivenAcess() {
        RestAssured.given();
                RequestSpecification httpRequest = RestAssured.given();
                httpRequest.header("CFA-WS-Client-ID", "test_wsc_cfanow_mobile").
                auth().
                oauth2("eyJhbGciOiJSUzI1NiIsImtpZCI6IlFhcXcwOUl2cXBtNGwyRHZDeTJJdzgxazFocEsyaTMyOVZhS1JMaUFOWEwifQ.eyJjZmFfYXVkIjoiT1BFUkFUT1JfQVVESUVOQ0UiLCJjZmFfZ3VpZCI6IjYxNDMyMzRhYTJlYTVjNGNiNjhhNzE3NGI2ZmIxYWQ3IiwiY2ZhX2xvY19saXN0IjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJjZmFfcGVybXMiOnsiQ0ZBSEVMUCI6eyJMT0dJTiI6WyIwMTQzNyIsIjAyMjA2Il19LCJDRkFOT1dfTU9CSUxFIjp7IkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJSRVNUQVVSQU5UIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTV9QSE9UT19VUExPQUQiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il19LCJIRUxQX1NFUlZJQ0VfUE9SVEFMIjp7IkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiT0JJIjp7IkRURVIiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkVYUEVOU0UiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIkxPR0lOIjpbIjAxNDM3IiwiMDIyMDYiXSwiT1BFUiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiT1BFUkFUT1JfTE9HSU4iOlsiMDE0MzciLCIwMjIwNiJdLCJQRVJGIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTUFWR1BBWSI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1QQVkiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNX0xPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiVE1IUCI6eyJMT0dJTiI6WyIwMDEwMiJdfSwiV0FMTEJPQVJEX01PQklMRSI6eyJMT0dJTiI6WyIwMTQzNyIsIjAyMjA2Il19fSwiZW1haWwiOiJqZWZmLnN0cnlrZXJAY2ZhZnJhbmNoaXNlZS5jb20iLCJleHAiOjE1NzU0MTE1OTUsImZhbWlseV9uYW1lIjoiU3RyeWtlciIsImlhdCI6MTU3NTQwNzk5NSwiaXNzIjoiaHR0cHM6Ly9hdXRoLmlkbS10ZXN0LmNmYWRldmVsb3AuY29tIiwianRpIjoiMDRlMjE4NjgtMmVjNS00ZGU5LWFjZGQtM2FlMjMzMDMyNDE3Iiwibmlja25hbWUiOiJKZWZmIiwic3ViIjoiamVmZi5zdHJ5a2VyIn0.X187P7humeXIIsz2Y3_Lhp7GRXzhx4zEE8Ri7KCprG5CALGaNOifzgs_peTD_osfjuQQwyFQvFgJlT7f3XwD3z2-veSBFy7F0EPwoUEOt0w1TuduqXLMf7GhZWqfNIzcQLeo2XpOqx6pv4RrcKPJ4lATW-ehls8Bf5g1jepxXcDhayPE86qqilhcGo62Wioguz9pAQ4uyJ-TeoBZlLNRyIDmVEKid4R8BNh7lz-JAUxqzKviupIrNUG9G9-58vzmr06nfrOBGgDZY05IMq7RYYrw_3eOvtYahaF0ZNDkkgQvQj8FXibkuk35yMm3eXpoE5U8omr1XVjOsDTJiFLWPA").
                // preemptive().
         when();
                Response response = httpRequest.get("https://api.coreservice-test.cfadevelop.com/cfa-now/home?locationNumbers=01437");
        ResponseBody body = response.getBody();
        String bodyStringValue = body.asString();
        System.out.println("Response Body  - >" + bodyStringValue);
        response.then();
        Assert.assertTrue(bodyStringValue.contains("locationNumber"));
    }

    private RestAssured given(){
            return null;
        }
    }

