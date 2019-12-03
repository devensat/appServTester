package com.cfaProj1.testCases;
import io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.config.LogConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matchers;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;

import java.io.PrintStream;


    public class TC001_GET_Status {

        @Test
        public void test_APIwithBasicAuthentication_ShouldBeGivenAccess() {


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



