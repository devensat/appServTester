package com.cfaProj1.testCases;

import io.restassured.RestAssured;
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
                oauth2("eyJhbGciOiJSUzI1NiIsImtpZCI6IlFhcXcwOUl2cXBtNGwyRHZDeTJJdzgxazFocEsyaTMyOVZhS1JMaUFOWEwifQ.eyJjZmFfYXVkIjoiT1BFUkFUT1JfQVVESUVOQ0UiLCJjZmFfZ3VpZCI6IjYxNDMyMzRhYTJlYTVjNGNiNjhhNzE3NGI2ZmIxYWQ3IiwiY2ZhX2xvY19saXN0IjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJjZmFfcGVybXMiOnsiQ0ZBSEVMUCI6eyJMT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXX0sIkNGQU5PV19NT0JJTEUiOnsiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlJFU1RBVVJBTlQiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNX1BIT1RPX1VQTE9BRCI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXX0sIkhFTFBfU0VSVklDRV9QT1JUQUwiOnsiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il19LCJPQkkiOnsiRFRFUiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiRVhQRU5TRSI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIk9QRVIiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIk9QRVJBVE9SX0xPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJQRVJGIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTUFWR1BBWSI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1QQVkiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNX0xPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiU1BPVExJR0hUIjp7IkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiU1BPVExJR0hUX0NBUkVTIjp7IkxPR0lOIjpbIjAxNDM3Il19LCJUTUhQIjp7IkxPR0lOIjpbIjAwMTAyIl19LCJXQUxMQk9BUkRfTU9CSUxFIjp7IkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfX0sImVtYWlsIjoiamVmZi5zdHJ5a2VyQGNmYWZyYW5jaGlzZWUuY29tIiwiZXhwIjoxNTgyMTMxNjgzLCJmYW1pbHlfbmFtZSI6IlN0cnlrZXIiLCJpYXQiOjE1ODIxMjgwODMsImlzcyI6Imh0dHBzOi8vYXV0aC5pZG0tdGVzdC5jZmFkZXZlbG9wLmNvbSIsImp0aSI6IjBiYTRhMGIzLTYxYmUtNGUwNS1iOThjLTM5MmU1MDE2NDk2OSIsIm5pY2tuYW1lIjoiSmVmZiIsInN1YiI6ImplZmYuc3RyeWtlciJ9.ox6R2tGXq2FBho5cP5phcEteb_00LWzirmXJOaDuByd1JrGn9lcAdCm0n4OCQ9_rJhByiTbRm8qdPyTZNRmyhwMoeialYR31QJjkh7vWu_pD1_VhCB6UofjZh2vYNE1SRyu3Na3zDGC6BCYI1Y30_dgixXzdl4LdXOhFYVEI7UpTAVk7LyPvLfTlqloAFzR9U7cl5VQ9mRF0-NqsoldCGhoe7BEkFr6X3n-L4nE0K6W3YZwmOfmIBiLkeIHT5Eb9bet1dejt4TBCYITk1iq7pyftXumdXma8MdPAX4cNZpOXf0eRx-VBjzmLGZK2KOXUDpTHmJIcSM5a6ZnFFqbkGA").
                // preemptive().
         when();
                Response response = httpRequest.get("https://api.coreservice-test.cfadevelop.com/cfa-now/home?locationNumbers=01437");
                ResponseBody body = response.getBody();
                String bodyStringValue = body.asString();
            System.out.println(("Status Code is :"+response.getStatusCode()));
            System.out.println(("Status Code is :"+response.getStatusLine()));
            System.out.println("Response Body  - >" + bodyStringValue);

        response.then();

            Assert.assertTrue(bodyStringValue.contains("locationNumber"));
    }

    private RestAssured given(){
            return null;
        }



}



