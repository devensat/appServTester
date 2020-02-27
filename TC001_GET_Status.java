package com.cfaProj1.testCases;

import io.restassured.RestAssured;
import org.junit.Test;


    public class TC001_GET_Status {

        @Test
        public void test_APIwithBasicAuthentication_ShouldBeGivenAccess() {

            System.out.println("TC001.01: Test with Simple Auth");
            RestAssured.given().
                    header("CFA-WS-Client-ID", "test_wsc_cfanow_mobile").
                    auth().
                    preemptive().
                    basic("contacts-api-user", "Yq)>^GJ*FV!S`9pc").

                    when().
                    get("https://api.coreservice-test.cfadevelop.com/contacts-api/v1/contact-event?userId=bailey.littrell1&locationNumbers=02206&processDate=2019-11-11").

                    then().
                    assertThat().
                    statusCode(200);// 200 Success Status Code



        }

        @Test
        public void test_statusCode() {
            given().
                    when().
                    get("https://api.coreservice-test.cfadevelop.com/contacts-api/v1/contact-event?userId=bailey.littrell1&locationNumbers=02206&processDate=2019-11-07").
                    then().
                    assertThat().
                    statusCode(401); // 401 - Unauthorized Status code

        }

        private RestAssured given() {
            return null;
        }




    }



