package com.cfaProj1.testCases;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class TC004_BodyValidationwithBDD {
    @Test
    public void test_APIwithBdd_ShouldBeGivenAcess() {
        RestAssured.given();
                RequestSpecification httpRequest = RestAssured.given();
                httpRequest.header("CFA-WS-Client-ID", "test_wsc_cfanow_mobile").
                auth().
                oauth2("eyJhbGciOiJSUzI1NiIsImtpZCI6IlFhcXcwOUl2cXBtNGwyRHZDeTJJdzgxazFocEsyaTMyOVZhS1JMaUFOWEwifQ.eyJjZmFfYXVkIjoiT1BFUkFUT1JfQVVESUVOQ0UiLCJjZmFfZ3VpZCI6IjYxNDMyMzRhYTJlYTVjNGNiNjhhNzE3NGI2ZmIxYWQ3IiwiY2ZhX2xvY19saXN0IjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJjZmFfcGVybXMiOnsiQ0ZBSEVMUCI6eyJMT0dJTiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXX0sIkNGQU5PV19NT0JJTEUiOnsiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlJFU1RBVVJBTlQiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNX1BIT1RPX1VQTE9BRCI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXX0sIkhFTFBfU0VSVklDRV9QT1JUQUwiOnsiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il19LCJPQkkiOnsiRFRFUiI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiRVhQRU5TRSI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiTE9HSU4iOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIk9QRVIiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIk9QRVJBVE9SX0xPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJQRVJGIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdLCJUTUFWR1BBWSI6WyIwMDEwMiIsIjAxNDM3IiwiMDIyMDYiXSwiVE1QQVkiOlsiMDAxMDIiLCIwMTQzNyIsIjAyMjA2Il0sIlRNX0xPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfSwiU1BPVExJR0hUX0NBUkVTIjp7IkxPR0lOIjpbIjAxNDM3Il19LCJUTUhQIjp7IkxPR0lOIjpbIjAwMTAyIl19LCJXQUxMQk9BUkRfTU9CSUxFIjp7IkxPR0lOIjpbIjAwMTAyIiwiMDE0MzciLCIwMjIwNiJdfX0sImVtYWlsIjoiamVmZi5zdHJ5a2VyQGNmYWZyYW5jaGlzZWUuY29tIiwiZXhwIjoxNTc1OTIwMDYyLCJmYW1pbHlfbmFtZSI6IlN0cnlrZXIiLCJpYXQiOjE1NzU5MTY0NjIsImlzcyI6Imh0dHBzOi8vYXV0aC5pZG0tdGVzdC5jZmFkZXZlbG9wLmNvbSIsImp0aSI6IjUxY2VjNWU2LTYyMDUtNGJlMy04ZDFmLTNhMDcyYmEzMzZiNCIsIm5pY2tuYW1lIjoiSmVmZiIsInN1YiI6ImplZmYuc3RyeWtlciJ9.kZz5AA34Itq_X9TRSlL73UW1CSFi69k4zPFqBu8yCNPp1GU0DJgZ8g6tVLfZUpld4w5VJ11l9IUqh_e6TEhNmGRB64Kh7NabS1FuEj-t7B0qCbImD-E16I150XlsimJ8gMjVIRYv9cWEThvbmsCRUnoiGZ2lJ7iJUp16h_i_Vg-H6dgtr_eHR9ACb-W1Oe-S9MHFLqZzsllq9qJ5jX_0yvF9rwPbBWorxiP7I_kcIR0StewH-hKYiw2B4HjOA-ULrhv4n547wfS5lgHe6_GRX613tAlTg1fJZ-yoZOo_5FyAXfZG6mw3-ggdNptKS7jcss1X1pwlNRhqtZXhprwKUQ").
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



